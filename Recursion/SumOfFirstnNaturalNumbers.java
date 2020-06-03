import java.util.Scanner;

//find sum of first n natural numbers using recursion

public class SumOfFirstnNaturalNumbers
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        sum=findSum(n);
        System.out.println("Sum of first "+n+" natural numbers is :"+sum);
    }
    public static int findSum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+findSum(n-1);
        }
    }
}
