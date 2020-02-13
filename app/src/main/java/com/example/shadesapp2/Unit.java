package com.example.shadesapp2;

import android.media.Image;

public class Unit {
    private String name;
    private int imageID;

    public Unit(String name, int imageID) {
        this.name = name;
        this.imageID = imageID;
    }
    public Unit(String name) {
        this.name = name;
        this.imageID = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
