package com.PBO;

import java.lang.Math;

public class Segitiga extends BangunDatar {
    @Override
    public double luas(double a, double t) {
        double hasil = (a * t)/2;
        return hasil;
    }

    @Override
    public double keliling(double a, double t) {
        double s = Math.hypot(a,t);
        double hasil = a + t + s;
        return hasil;
    }

    public float keliling(float a) {
        float hasil = a + a + a;
        return hasil;
    }

    public float keliling(float a, float s) {
        float hasil = a + s + s;
        return hasil;
    }
}