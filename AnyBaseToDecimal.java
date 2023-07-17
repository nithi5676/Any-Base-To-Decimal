package anyBaseToDecimal;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" enter the number: ");
        int number = scanner.nextInt();
        System.out.print(" enter the Base number: ");
        int base = scanner.nextInt();
        scanner.close();
        int count = 0, temp = 0;
        int result = 0;
        while (number > 0) {
            temp = number % 10;
            number /= 10;
            result += (temp * (Math.pow(base, count)));
            count++;
        }
        System.out.println(result);
    }
}
