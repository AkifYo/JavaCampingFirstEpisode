package Lesson15and16_reCap_Demo;

public class A01_Recap {
    public static void main(String[] args) {
        double[] myList = {1.2, 6.3, 4.5, 5.6};
        double total = 0;
        double max = myList[0];

        for (double numbers : myList) {
            if (max < numbers) {
                max = numbers;
            }

            total = total + numbers;
            System.out.println(total);
        }
        System.out.println("Toplam sayi:" + total);
        System.out.println("En buyuk:" + max);
    }
}
