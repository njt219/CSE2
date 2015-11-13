import java.util.Scanner;
public class arrayAverage{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What size would you like the array to be?");
        int arraySize = scan.nextInt();
        int[] anArray;
        anArray = new int[arraySize];
        for(int i = 0; i<arraySize; i++){
            anArray[i] = (int)(Math.random()*100);
            System.out.println("Array at "+i+" = " + anArray[i]);
        }

        int sum = 0;
        for(int k = 0; k<arraySize; k++){
            sum = sum + anArray[k];
        }

        System.out.println("Sum =" + sum);
        int avg = sum/arraySize;
        System.out.println("The average is " + (avg));
        System.out.print("The numbers equal or greater than the average are");
        for(int j = 0; j < arraySize; j++){
            if(anArray[j] >= avg){
                System.out.print(" "+anArray[j]+" ");
            }
        }
    }

}