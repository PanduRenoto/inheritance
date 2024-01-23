package inheritance;

import java.util.Scanner;

public class lingkaran extends bangunDatar{
    float r;
    
    @Override
    public void inputData() {
        super.inputData();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan r: ");
        r = input.nextFloat();
    }
    
    @Override
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran: " + luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran: " + keliling);
        return keliling;
    }
}
