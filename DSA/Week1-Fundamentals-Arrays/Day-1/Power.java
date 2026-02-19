//power(int base,int power)
import java.util.Scanner;
public class Power{
    public static double pow(int base,int exp){
        // if(base==0&&exp>0){
        //     System.out.println("Negative power of 0 is undefined.");
        //     return 0;
        // }
        float result=1;
        if(exp<0){
            for(int i=exp;i<=-1;i++){
                result*=base;
            }
            return 1/result;
        }
        
        else{
            for(int i=1;i<=exp;i++){
            result*=base;
        }
        return result;
        }
    }
    public static void print(int base,int power){
        System.out.println("Result: "+pow(base, power));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int b=sc.nextInt();
        System.out.print("Enter power: ");
        int p=sc.nextInt();
        print(b,p);
    }
}