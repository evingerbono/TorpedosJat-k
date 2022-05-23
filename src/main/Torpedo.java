
package main;

import java.util.Random;
import java.util.Scanner;

public class Torpedo {

    public static void main(String[] args) {
      
      new Torpedo().Lovesek();
    }
    
    public static void Lovesek(){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        
        int[] hely= new int [3];
        
        int min=1;
        int max=5;
        hely[0]= rnd.nextInt(max-min+1)+min;
        hely[1]=hely[0]+1;
        hely[2]=hely[0]+2;
        for (int i = 0; i < 3; i++) {
            System.out.println(hely[i]);
        }
        int talalat=0;
        int lovesszam=0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Kérem adjon meg egy számot(1-7):");
            int loves = sc.nextInt();
            if (loves==hely[0] || loves==hely[1] || loves==hely[2]) {
             System.out.println("Talált.");
             talalat++;
          }else{
             System.out.println("Nem talált.");
         }
            lovesszam++;
            if (talalat==3) {
                System.out.println("Talált süllyedt");
                System.out.println("A kövések száma: "+lovesszam);
                i=7;
            }
        }
    }
    
}
