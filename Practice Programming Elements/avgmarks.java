import java.util.Scanner;

class avgmarks
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int a,b,c;
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       int totalmarks=a+b+c;
       float avg=totalmarks/3;
       System.out.println("Sam average mark in PCM is: "+avg);
    }
}