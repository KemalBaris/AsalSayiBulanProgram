import java.util.Scanner;
public class Main {
    public static void asal(int a,int i){

        if (i == a) {
            System.out.print(a + " asal sayıdır! ");
            return;
        } else if (a%i == 0) {
            System.out.print(a + " asal sayı değildir! " );
            return;
        }
       asal(a,i+1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Lütfen bir sayı giriniz : ");
        a = input.nextInt();
        asal(a,2);

    }
}