import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rub = scan.nextInt();
        System.out.printf("%d рублей это %.2f USD или %.2f EUR", rub,  rub / 91.2653, rub / 100.7421);
    }
}