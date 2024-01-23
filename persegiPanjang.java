package inheritance;

import java.util.Scanner;

public class persegiPanjang extends bangunDatar{
    float panjang;
    float lebar;
    
    @Override
    public void inputData() {
        super.inputData();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        panjang = input.nextFloat();
        System.out.print("Masukkan lebar: ");
        lebar = input.nextFloat();
    }
    
    @Override
    float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang:" + luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float kll = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang: " + kll);
        return kll;
    }
}
