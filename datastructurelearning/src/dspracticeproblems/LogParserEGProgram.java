package dspracticeproblems;

import java.util.*;

public class LogParserEGProgram {

    List<LogEntry> logEntryList = new ArrayList<>();

    public LogParserEGProgram(List<String> logs) {
        this.logEntryList = parseData(logs);
    }

    public List<LogEntry> parseData(List<String> logs) {
        List<LogEntry> logEntryList1 = new ArrayList<>();
        logs.forEach(log->{
            Map<String, String> dateMap = Split(log);
            logEntryList1.add(new LogEntry(dateMap.get("ip"), Double.valueOf(dateMap.get("PageLoadTime"))));
        });
        return logEntryList1;
    }

    public Map<String, String> Split(String str) {
        Map<String, String> dateMap = new HashMap<>();
        String[] splitData = str.split("~\\$~|\\$#\\$");
        for (String split : splitData) {
            String[] splitData2 = split.split("#\\$#");
            if (splitData2.length == 2) {
                dateMap.put(splitData2[0].trim(), splitData2[1].trim());
            }
        }
        return dateMap;
    }

    public void printLog() {
        this.logEntryList.forEach(System.out::println);
    }

    public void uniqueIpList() {
        System.out.println("Unique IP List"+this.logEntryList.stream().map(LogEntry::getIp).distinct().toList().size());
    }


    public void uniquePageLoadAverageTimeList() {
        Map<String, List<Double>> map = new TreeMap<>();
//        map = this.logEntryList.stream().collect(Collectors.groupingBy(LogEntry::getIp,Collectors.mapping(LogEntry::getPageLoadTime,Collectors.toList())));
        for(LogEntry logEntry : this.logEntryList) {
            map.computeIfAbsent(logEntry.getIp(), k -> new ArrayList<>()).add(logEntry.getPageLoadTime());
        }

        for(Map.Entry<String, List<Double>> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"-"+calculateAverage(entry.getValue()));
        }



    }

    public Double calculateAverage(List<Double> doubleList) {
        return doubleList.stream().mapToDouble(Double::doubleValue).average().stream().findAny().orElse(0.0);
    }

}
