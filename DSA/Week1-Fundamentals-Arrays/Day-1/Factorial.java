//factorial(int n)
import java.util.Scanner;
public class Factorial{
    public static long fact(int n){
        long result=1;
        // for (int i=1;i<=n;i++){
        //     result*=i;
        // }
        
        int i=1;
        while(i<=n){
            result*=i;
            i++;
        }
        return result;
        
    }
    public static void print(int n){
        System.out.println("Factorial of "+n+" is: "+fact(n));
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Factorial is not defined for negative numbers");
        }
        else
        print(n);
        sc.close();
    }
}