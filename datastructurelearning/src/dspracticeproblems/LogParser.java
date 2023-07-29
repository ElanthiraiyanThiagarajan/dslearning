package dspracticeproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LogParser {

    private List<LogEntry> logEntries;

    public LogParser(List<String> rawData) {
        this.logEntries = parseData(rawData);
    }

    private List<LogEntry> parseData(List<String> rawData) {
        List<LogEntry> entries = new ArrayList<>();
        for (String data : rawData) {
            Map<String, String> keyValuePairs = parseKeyValuePairs(data);
            String ipAddress = keyValuePairs.get("ip");
            double pageLoadTime = Double.parseDouble(keyValuePairs.get("PageLoadTime"));
            entries.add(new LogEntry(ipAddress, pageLoadTime));
        }
        return entries;
    }

    private Map<String, String> parseKeyValuePairs(String data) {
        Map<String, String> keyValuePairs = new HashMap<>();
        String[] pairs = data.split("\\$#\\$|~\\$~");
        for (String pair : pairs) {
            if (pair.contains("ip") || pair.contains("PageLoadTime")) {
                String[] keyValue = pair.split("#\\$#", 2);
                if (keyValue.length == 2) {
                    String key = keyValue[0].trim();
                    String value = keyValue[1].trim();
                    keyValuePairs.put(key, value);
                }
            }

        }
        return keyValuePairs;
    }

    public void printUniqueIPAddresses() {
        Set<String> uniqueIPs = new TreeSet<>();
        for (LogEntry entry : logEntries) {
            uniqueIPs.add(entry.getIpAddress());
        }
        System.out.println("1. Unique number of IP addresses: " + uniqueIPs.size());
    }

    public void printAveragePageLoadTimeByIP() {
        Map<String, List<Double>> ipToPageLoadTimes = new TreeMap<>();
        for (LogEntry entry : logEntries) {
            ipToPageLoadTimes.computeIfAbsent(entry.getIpAddress(), k -> new ArrayList<>())
                    .add(entry.getPageLoadTime());
        }

        System.out.println("2. Average page load time (grouped by IP address):");
        for (Map.Entry<String, List<Double>> entry : ipToPageLoadTimes.entrySet()) {
            String ipAddress = entry.getKey();
            List<Double> pageLoadTimes = entry.getValue();
            double average = calculateAverage(pageLoadTimes);
            System.out.println(ipAddress + ": " + average);
        }
    }

    private double calculateAverage(List<Double> values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

}
