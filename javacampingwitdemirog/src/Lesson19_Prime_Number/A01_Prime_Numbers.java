package Lesson19_Prime_Number;

public class A01_Prime_Numbers {
    public static void main(String[] args) {
        int number = 53;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }


    }
}
