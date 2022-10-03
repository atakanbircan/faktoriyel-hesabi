import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, faktoriyel=1;
        Scanner input= new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        x=input.nextInt();
        for (int i=1;i<=x;i++){
            faktoriyel=faktoriyel*i;
        }
        System.out.println(x+"! = "+faktoriyel);
    }
}