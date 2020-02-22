package com.PBO;

public class LimasSegitiga extends Segitiga {
    private double t;

    @Override
    public double luas(double a, double t) {
        return super.luas(a, t) * getT() * 1/3;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
}