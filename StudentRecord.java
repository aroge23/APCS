package com.company;

public class StudentRecord {
    double gpa, height, weight;
    String momName, dadName, addy, bloodType, status, name;
    int idN;

    public String getStatus() {
        return status;
    }
    public void setStatus(String newStatus) {
        status = newStatus;
    }

    public String getMomName() {
        return momName;
    }
    private void setMomName(String newMomName) {
        momName = newMomName;
    }

    public String getDadName() {
        return dadName;
    }
    private void setDadName(String newDadName) {
        dadName = newDadName;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double newGpa) {
        gpa = newGpa;
    }


}
