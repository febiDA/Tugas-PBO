package com.PBO;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) {
        int pilih, pilihan, pilihan2;
        double p, l, t, a, tv, tp, tpris, tls;
        char kembali;
        char ulang, ulang2;

        Scanner inputUser = new Scanner(System.in);

        do {
                System.out.println("=====MENU====");
                System.out.println("1. Persegi Panjang");
                System.out.println("2. Segitiga Siku-siku");
                System.out.print("Pilih : ");
                pilih = inputUser.nextInt();
                switch (pilih) {
                case 1 :
                    System.out.print("\nMasukkan panjang = ");
                    p = inputUser.nextDouble();
                    System.out.print("Masukkan lebar = ");
                    l = inputUser.nextDouble();
                    PersegiPanjang hitungPersegiPanjang = new PersegiPanjang();
                    System.out.println("LUAS PERSEGI PANJANG");
                    System.out.println("====================");
                    System.out.println("Luas Persegi panjang = "+hitungPersegiPanjang.luas(p,l));
                    System.out.println("KELILING PERSEGI PANJANG");
                    System.out.println("====================");
                    System.out.println("Keliling Persegi Panjang = " + hitungPersegiPanjang.keliling(p,l));
                    do {
                        System.out.println("\nVOLUME BANGUN RUANG");
                        System.out.println("===================");
                        System.out.println("1. Balok");
                        System.out.println("2. Limas Persegi Pajang");
                        System.out.print("Pillihan : ");
                        pilihan = inputUser.nextInt();
                        switch (pilihan) {
                            case 1 :
                                System.out.print("Tinggi Balok = ");
                                tv = inputUser.nextDouble();
                                Balok hitungBalok = new Balok();
                                hitungBalok.setT(tv);
                                System.out.println("Volum Balok = " + hitungBalok.luas(p,l));
                                break;
                            case 2 :
                                System.out.print("Tinggi Limas = ");
                                tp = inputUser.nextDouble();
                                LimasPersegiPanjang hitungPrisma = new LimasPersegiPanjang();
                                hitungPrisma.setT(tp);
                                System.out.println("Volum Limas = " + hitungPrisma.luas(p,l));
                                break;
                            default:
                                System.out.println("Error");
                                return;
                        }
                        System.out.print("\nhitung Bangun ruang (y/n) ?");
                        ulang = inputUser.next().charAt(0);
                    }while (ulang == 'y');
                    break;
                case 2 :
                    System.out.print("\nMasukkan alas = ");
                    a = inputUser.nextDouble();
                    System.out.print("Masukkan tinggi = ");
                    t = inputUser.nextDouble();
                    Segitiga hitungSegitiga = new Segitiga();
                    System.out.println("LUAS SEGITIGA");
                    System.out.println("=============");
                    System.out.println("Luas Segitiga = "+hitungSegitiga.luas(a,t));
                    Segitiga kelilingSegitiga = new Segitiga();
                    float hasilKeliling = kelilingSegitiga.keliling((float) a);
                    float hasilKelilingKaki = kelilingSegitiga.keliling((float)a, (float) t);
                    System.out.println("KELILING SEGITIGA");
                    System.out.println("=============");
                    System.out.println("Keliling Segitiga siku-siku = " + hitungSegitiga.keliling(a,t));
                    System.out.println("Keliling Segitiga sama sisi = " + hasilKeliling);
                    System.out.println("Keliling Segitiga sama kaki = " + hasilKelilingKaki);

                    do {
                        System.out.println("\n");
                        System.out.println("VOLUME BANGUN RUANG");
                        System.out.println("===================");
                        System.out.println("1. Prisma Segitiga");
                        System.out.println("2. Limas Segitiga");
                        System.out.print("Pillihan : ");
                        pilihan2 = inputUser.nextInt();
                        switch (pilihan2) {
                            case 1 :
                                System.out.print("Tinggi Prisma = ");
                                tpris = inputUser.nextDouble();
                                PrismaSegitiga hitungPrisma = new PrismaSegitiga();
                                hitungPrisma.setT(tpris);
                                System.out.println("Volum Prisma Segitiga = " + hitungPrisma.luas(a,t));
                                break;
                            case 2 :
                                System.out.print("Tinggi Limas Segitiga= ");
                                tls = inputUser.nextDouble();
                                LimasSegitiga hitungLimasSegitiga = new LimasSegitiga();
                                hitungLimasSegitiga.setT(tls);
                                System.out.println("Volum Limas = " + hitungLimasSegitiga.luas(a,t));
                                break;
                            default:
                                System.out.println("Error");
                                return;
                        }
                        System.out.print("\nhitung Bangun ruang (y/n) ?");
                        ulang2 = inputUser.next().charAt(0);
                    }while (ulang2 == 'y');
                    break;

                default:
                    System.out.println("error");
                    return;
            }
            System.out.print("\nkembali ke menu (y/n) ?");
            kembali = inputUser.next().charAt(0);
        }while (kembali == 'y');
    }
}
