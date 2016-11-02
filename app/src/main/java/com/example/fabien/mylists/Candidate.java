package com.example.fabien.mylists;

/**
 * Created by Fabien on 01/11/2016.
 */

public class Candidate {

    private String name;
    private String detail;
    private int photo;

    public Candidate(String name, String detail, int photo)
    {
        this.name=name;
        this.detail=detail;
        this.photo=photo;
    }

    public String getName() {
        return name;
    }
    public String getDetail() {
        return detail;
    }
    public int getPhoto() {
        return photo;
    }

    @Override
    public String toString() {
        return detail;
    }
}
