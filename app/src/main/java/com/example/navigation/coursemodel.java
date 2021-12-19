package com.example.navigation;

public class coursemodel {
    private String Services;
    private int imgid;

    public  coursemodel(String course_name, int imgid) {
        this.Services = course_name;
        this.imgid = imgid;
    }

    public String getCourse_name() {
        return Services;
    }

    public void setCourse_name(String course_name) {
        this.Services = course_name;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
