// Method: isEven(int n)

import java.util.Scanner;

public class checkeven {
    public static boolean isEven(int n){
        return n%2==0;
    }
    public static void print(int n){
        if(isEven(n)){
            System.out.println("The number "+n+" is even.");
        }
        else{
            System.out.println("The number "+n+" is not even.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        print(n);

        sc.close();
    }
}