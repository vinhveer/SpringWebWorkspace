package Test;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class AoCode {
    static Scanner input=new Scanner(System.in);
    public static boolean prime(int n){
        if(n<2)
            return false;
        for(int i=2;i<=sqrt(n);i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=input.nextInt();
        float res=0;
        int count=0;
        int [] a=new int [n];
        for(int i=0;i<n;i++) {
            a[i] = input.nextInt();
        }
        for(int i=0;i<n;i++){
            if (prime(a[i])) {
                count++;
                res += a[i];
            }
        }
        System.out.printf("%.2f",res);
    }
}