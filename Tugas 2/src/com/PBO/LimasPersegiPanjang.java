package com.PBO;

public class LimasPersegiPanjang extends PersegiPanjang {
    private double t;

    @Override
    public double luas(double p, double l) {
        return super.luas(p, l) * getT() * 2/3;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
}
