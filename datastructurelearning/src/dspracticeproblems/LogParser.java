package dspracticeproblems;

import java.util.*;

public class LogParser {

    private List<LogEntry> logEntryList;

    public LogParser(List<String> logList) {
        this.logEntryList = parseData(logList);
    }

    private List<LogEntry> parseData(List<String> logList) {
        List<LogEntry> logEntryList = new ArrayList<>();
        for (String log : logList) {
            Map<String, String> dateMap = splitData(log);
            logEntryList.add(new LogEntry(dateMap.get("ip"), Double.valueOf(dateMap.get("PageLoadTime"))));
        }
        return logEntryList;
    }

    private Map<String, String> splitData(String data) {
        Map<String, String> dateMap = new HashMap<>();
        String[] splitData = data.split("~\\$~|\\$#\\$");
        for (String split : splitData) {
            String[] splitData2 = split.split("#\\$#");
            if (splitData2.length == 2) {
                dateMap.put(splitData2[0].trim(), splitData2[1].trim());
            }
        }
        return dateMap;
    }

    public void uniqueIp() {
        System.out.println("1. Unique number of IP addresses: " + logEntryList.stream().map(LogEntry::getIp).distinct().toList().size());
    }

    public void findAverage() {
        Map<String, List<Double>> ipToPageLoadTimes = new TreeMap<>();
        for (LogEntry logEntry : logEntryList) {
            ipToPageLoadTimes.computeIfAbsent(logEntry.getIp(), k -> new ArrayList<>()).add(logEntry.getPageLoadTime());
        }
        ipToPageLoadTimes.forEach((key, value) -> {
            System.out.println(key + ": " + calculateAverage(value));
        });
    }

    private double calculateAverage(List<Double> pageLoadTimes) {
//        return pageLoadTimes.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        double sum = pageLoadTimes.stream().mapToDouble(Double::doubleValue).sum();
        return sum / pageLoadTimes.size();
    }


    public List<LogEntry> getLogEntryList() {
        return logEntryList;
    }

    public void setLogEntryList(List<LogEntry> logEntryList) {
        this.logEntryList = logEntryList;
    }
}
