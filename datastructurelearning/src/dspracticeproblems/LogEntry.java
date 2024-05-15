package dspracticeproblems;

public class LogEntry {

    private String ip;

    private Double pageLoadTime;

    public LogEntry(String ip, Double pageLoadTime) {
        this.ip = ip;
        this.pageLoadTime = pageLoadTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Double getPageLoadTime() {
        return pageLoadTime;
    }

    public void setPageLoadTime(Double pageLoadTime) {
        this.pageLoadTime = pageLoadTime;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "ip='" + ip + '\'' +
                ", pageLoadTime=" + pageLoadTime +
                '}';
    }
}
