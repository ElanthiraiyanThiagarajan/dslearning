package dspracticeproblems;

public class LogEntry {

    private String ipAddress;
    private double pageLoadTime;

    public LogEntry(String ipAddress, double pageLoadTime) {
        this.ipAddress = ipAddress;
        this.pageLoadTime = pageLoadTime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public double getPageLoadTime() {
        return pageLoadTime;
    }
    
}
