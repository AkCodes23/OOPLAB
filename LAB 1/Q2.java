import java.util.Scanner;
class Q2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int even,odd,zero,pos,neg;
        even=0;
        odd=0;
        zero=0;
        pos=0;
        neg=0;
        System.out.println("Enter the No. of Numbers:");
            int Num = s.nextInt();
        for(int i=1;i<=Num;i++){
            System.out.println("Enter the Number:");
            int N = s.nextInt();
            if(N%2==0 && N!=0){++even;}
            if(N==0){++zero;}
            if(N%2!=0){++odd;}
            if(N>0){++pos;}
            if(N<0){++neg;}
        }
        System.out.println("Even numbers:"+ even);
        System.out.println("Odd numbers:"+ odd);
        System.out.println("Zero numbers:"+ zero);
        System.out.println("Positive numbers:"+ pos);
        System.out.println("Negitive numbers:"+ neg);
    }
}
