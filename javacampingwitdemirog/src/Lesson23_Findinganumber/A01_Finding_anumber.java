package Lesson23_Findinganumber;

public class A01_Finding_anumber {
    public static void main(String[] args) {
        int[] numbers= new int[]{1,2,5,7,9,11};
        int needToBeSearchednumber=7;
        boolean isThere= false;
        for (int search:numbers) {
            if (search==needToBeSearchednumber){
                isThere=true;

                break;
            }
            }
            if (isThere==true){
                System.out.println("You just found the number: "+needToBeSearchednumber);
            }
            else {
                System.out.println("You should search more to find the number");


        }
    }

}
