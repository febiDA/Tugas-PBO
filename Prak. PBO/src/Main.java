import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama;
        int nilaiTertinggi, nilaiTerendah;
        float ratarata, total = 0;
        int [] nilai = new int[5];

        Scanner inputUser = new Scanner(System.in);
        System.out.println("=====INPUT");
        System.out.print("Nama : ");
        nama = inputUser.nextLine();

        for (int i = 0; i < nilai.length; i++){
            System.out.print("Nilai ke-" + (i+1) + " : ");
            nilai[i] = inputUser.nextInt();
            total+=nilai[i];
        }

        nilaiTertinggi = nilai[0];
        nilaiTerendah = nilai[0];
        ratarata = total/5;

        System.out.println("\n=====OUTPUT");
        System.out.println("Nama : " + nama);
        for (int i = 0; i < nilai.length; i++){
            if (nilaiTertinggi < nilai[i]){
                    nilaiTertinggi = nilai[i];
            } else if (nilaiTerendah > nilai[i]){
                nilaiTerendah = nilai[i];
            }
        }
        System.out.println("Nilai Tertinggi   : " + nilaiTertinggi);
        System.out.println("Nilai Terendah    : " + nilaiTerendah);
        System.out.println("Rata - rata nilai : " + ratarata);
    }
}