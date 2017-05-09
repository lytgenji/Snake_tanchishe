package com.example.dell.jasondemo;


public class DateBean {
    private String Course_address;
    private String Course_name;

    public String getCourse_address() {
        return Course_address;
    }

    public void setCourse_address(String Course_address) {
        this.Course_address = Course_address;
    }

    public String getCourse_name() {
        return Course_name;
    }

    public void setCourse_name(String Course_name) {
        this.Course_name = Course_name;
    }

    @Override
    public String toString() {
        return "DataBean{" +
                "Course_address='" + Course_address + '\'' +
                ", Course_name='" + Course_name + '\'' +
                '}';
    }
}
