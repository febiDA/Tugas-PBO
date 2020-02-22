package com.PBO;

public class Balok extends PersegiPanjang {
    private double t;

    @Override
    public double luas(double p, double l) {
        return super.luas(p, l)*getT();
    }

    public void setT(double t){
        this.t = t;
    }

    public double getT() {
        return t;
    }
}
