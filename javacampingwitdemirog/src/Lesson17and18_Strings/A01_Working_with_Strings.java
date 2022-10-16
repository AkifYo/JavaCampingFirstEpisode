package Lesson17and18_Strings;

public class A01_Working_with_Strings {
    public static void main(String[] args) {
        String message = "Today the weather is wonderful.";
        System.out.println("Total letters: " + message.length());
        System.out.println("5. character is: " + message.charAt(4));
        System.out.println(message.concat("Yuuuuppy"));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("y"));
        char[] characters=new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("e"));

    }
}
