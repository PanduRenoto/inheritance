package inheritance;

import java.util.Scanner;

public class segitiga extends bangunDatar{
    float alas;
    float tinggi;
    
    @Override
    public void inputData() {
        super.inputData();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan alas: ");
        alas = input.nextFloat();
        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextFloat();
    }
    
    @Override
    float luas() {
        float luas = 1/2 * (alas * tinggi);
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }
}
