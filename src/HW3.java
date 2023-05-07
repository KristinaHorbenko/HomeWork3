import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class HW3 {
    int numbers[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

    public void calOddNumbers() {
        for (int i = 0; i <= 99; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void FactorialFor() {
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial = " + factorial);
        System.out.println();
    }

    public void FactorialWhile() {
        int n = 5;
        int factorial = 1;
        int i = 1;
        while (i <= n) {

            factorial = factorial * i;
            i++;
        }

        System.out.println("Factorial = " + factorial);
        System.out.println();
    }

    public void calOddNumbersWhile() {
        int a = 1;
        while (a <= 99) {
            System.out.println(a + " ");

            a += 2;
        }
        System.out.println();
    }

    public void OddNumbersDoWhile() {
        int i = 1;
        do {
            System.out.print(i + " ");
            i+=2;
        } while (i <= 99);
        System.out.println();
    }

    public void FactorialDoWhile () {
        int n = 5;
        int factorial = 1;
        int i = 1;
        do
        {
            factorial = factorial * i;
            i++;
        }

        while(i <= n);
        System.out.println("factorial = " + factorial);
        System.out.println();

    }
    public void pow () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter, first number x: ");
        int x = scanner.nextInt();

        System.out.println("Enter, second number n: ");
        int n = scanner.nextInt();
        BigInteger bigInteger  = new BigInteger(String.valueOf(x));
        System.out.println("x^n = " + bigInteger.pow(n).intValue());
         System.out.println();

    }
    public void Numbers() {
        for (int i = 0; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.print(i * (-1) + " ");
            }
        }
        System.out.println();

    }

    public void multiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter, first number to multiply: ");
        int x = scanner.nextInt();

        System.out.println("Enter, second number to multiply: ");
        int n = scanner.nextInt();
        while (n <= 10) {
            System.out.println(x + " x " + n + " = " + n * x);
            n++;
        }
        System.out.println();
    }

    public void Array() {
        StringBuilder stringbuilder = new StringBuilder();

        for (int i = 0; i < numbers.length - 1; i++) {
            stringbuilder.append(numbers[i]).append(", ");
        }
        stringbuilder.append(numbers[numbers.length - 1]);
        String result = stringbuilder.toString();
        System.out.print(result);
        System.out.println();
    }
    public  void minArray() {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println(min);
        System.out.println();
    }
    public  void maxArray() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(max);

    }
    public  void permutationNumbers () {
        int max = numbers[0];
        int min = numbers[0];
        int maxInd = 0;
        int minInd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max > numbers[i]) {
                maxInd = i;
                max = numbers[i];
            }
            if (min < numbers[i]) {
                minInd = i;
                min = numbers[i];
            }
        }

        int temp = numbers[minInd];
        numbers[minInd] = numbers[maxInd];
        numbers[maxInd] = temp;
        Arrays.stream(numbers).forEach(e-> System.out.print(e + " "));
        System.out.println();

    }
}























