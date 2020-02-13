package com.example.shadesapp2;

import android.content.Context;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class UnitDatabase {
    private List<Unit> units;
    public UnitDatabase() {
        units = new ArrayList<>();
        Unit zealot = new Unit("Zealot",R.drawable.zealot);
        units.add(zealot);
    }

    public List<Unit> getUnits() {
        return units;
    }

}
