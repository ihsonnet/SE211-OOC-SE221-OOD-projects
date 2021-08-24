package com.storage;

public class Report {
    private String reporId;
    private int id;

    public Report(String reporId, int id) {
        this.reporId = reporId;
        this.id = id;
    }

    public Report() {
    }

    public String getReporId() {
        return reporId;
    }

    public int getId() {
        return id;
    }

    public void setReporId(String reporId) {
        this.reporId = reporId;
    }

    public void setId(int id) {
        this.id = id;
    }
}
