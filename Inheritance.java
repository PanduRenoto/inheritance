package inheritance;

import java.util.Scanner;

public class Inheritance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Halooo");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Segitiga");
        System.out.print("Mau ngitung apa? ");
        
        int pilih = input.nextInt();
        
        bangunDatar BangunDatar = new bangunDatar();
        
        switch(pilih) {
            case 1:
            persegi Persegi = new persegi();
            Persegi.inputData();
            Persegi.luas();
            Persegi.keliling();
            break;
            
            case 2:
            lingkaran Lingkaran = new lingkaran();
            Lingkaran.inputData();
            Lingkaran.luas();
            Lingkaran.keliling();
            break;
            
            case 3:
            persegiPanjang PersegiPanjang = new persegiPanjang();
            PersegiPanjang.inputData();
            PersegiPanjang.inputData();
            PersegiPanjang.luas();
            PersegiPanjang.keliling();
            break;
            
            case 4:
            segitiga mSegitiga = new segitiga();
            mSegitiga.inputData();
            mSegitiga.inputData();
            mSegitiga.luas();
            mSegitiga.keliling();
            break;
            
            default: System.out.println("Salah ygy");
        }
    }   
}
