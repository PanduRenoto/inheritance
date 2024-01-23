package inheritance;

import java.util.Scanner;

public class persegi extends bangunDatar{
    float sisi;
    
    @Override
    public void inputData() {
        super.inputData();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi: ");
        sisi = input.nextFloat();
    }
    
    @Override
    float luas() {
        float luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
        return keliling;
    }
}
