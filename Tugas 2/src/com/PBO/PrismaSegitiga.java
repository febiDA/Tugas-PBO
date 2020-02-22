package com.PBO;

public class PrismaSegitiga extends Segitiga {
    private double t;

    @Override
    public double luas(double a, double t) {
        return super.luas(a, t) * getT();
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
}
