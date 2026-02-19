// max(int a, int b)

import java.util.Scanner;
public class Max{
    public static int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int result=max(n1,n2);
        System.out.println("Maximum number among: "+n1+" and "+n2+ " is: "+result);
    }
}