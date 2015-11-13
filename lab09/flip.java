//Nicholas Tulp 
//CSE002 - lab09
//Write a method that uses random numbers to simulate a flip coin
//October 22,2015 

import java.util.Scanner;
import java.util.Random; 

public class flip{
    public static int flip(int a){
    Random rand = new Random();
    int tailSum = 0;
    int headSum = 0;
        for(int i=1; i<=a; i++){
            int random = rand.nextInt(2);
                if(random == 0){
                    tailSum++;
                }else if(random == 1){
                    headSum++;
                }
        }
        System.out.println("Tails =  " + tailSum + ".");
        System.out.println("Heads = " + headSum + ".");
        return 1;
    }
    public static void flip2(){
    Random rand = new Random();
        int random = rand.nextInt(2);
            if(random == 0){
                System.out.println("Tail " + random + ".");
            }else if(random == 1){
                System.out.println("Head " + random + ".");
            }
    }
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int z = 1;
    int k = 1;
        while(z == k){
            System.out.println("Enter a number between 0 - 100");
            int q = scan.nextInt();
        if(q == 0){
            flip2();
        }else if(q > 100){
            System.exit(-1);
        }else{
        flip(q);
        }
        }

    }

}