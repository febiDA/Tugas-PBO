package com.PBO;

public class PersegiPanjang extends BangunDatar {
    @Override
    public double luas(double p, double l) {
        double hasil = p * l;
        return hasil;
    }

    @Override
    public double keliling(double p, double l) {
        double hasil = 2 *(p + l);
        return hasil;
    }
}
