import java.util.Scanner;

//calculate a^b using recursion

public class CalcPower
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long num=sc.nextInt();
        long pow=sc.nextInt();
        long result=calcPower(num,pow);
        System.out.println(+num+"^"+pow+" is :"+result);
    }
    private static long calcPower(long num,long pow){
        if(pow==0){
            return 1;
        }
        if(num==0){
            return 0;
        }
        return num*calcPower(num,pow-1);

    }
}
