// add(int a, int b)

import java.util.Scanner;

public class Add {
    public static int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2=sc.nextInt();
        int sum=add(n1,n2);
        System.out.println("Sum of "+n1+" and "+n2+" is: " + sum);
        sc.close();
    }
}