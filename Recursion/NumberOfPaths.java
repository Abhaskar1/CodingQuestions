import java.util.Scanner;

//find the number of paths through which we can reach from top left cell to bottom right cell
//we are allowed to move in verticle,horizontal and diagonal directions
public class NumberOfPaths
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long result=findAllPaths(n,m);
        System.out.println("No of Paths are :"+result);
    }
    private static int findAllPaths(int n,int m){
        //if there is only one row or one column,we can only have 1 path
        if(n==1|| m==1){
            return 1;
        }
        //findAllPaths(n-1,m) accounts for verticle movement
        //findAllPaths(n,m-1) accounts for horizontal movement
        //findAllPaths(n-1,m) accounts for diagonal movement

        return findAllPaths(n-1,m)+findAllPaths(n,m-1)+findAllPaths(n-1,m-1);
    }
}
