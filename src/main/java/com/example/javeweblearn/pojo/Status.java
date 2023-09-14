package com.example.javeweblearn.pojo;

public class Status {
    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Status() {
    }

    public Status(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Status{" +
                "status=" + status +
                '}';
    }
}
