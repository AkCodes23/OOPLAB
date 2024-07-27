import java.util.Scanner;
class Q3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int odd;
        odd=0;
        System.out.println("Enter the No. of Numbers:");
            int a = s.nextInt();
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                System.out.println(i);
                ++odd;}}

     System.out.println("Odd numbers:"+ odd);}

    }
