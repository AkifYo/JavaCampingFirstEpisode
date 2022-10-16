package Lesson17and18_Strings;

public class A02_WorkingWithStrings {
    public static void main(String[] args) {
        String message = "Today the weather is wonderful.";
        System.out.println(message.replace(" ","-"));
        //replace method help us to replace a characther with another.
        //substring method; we can use this method to take the characters for example between two index.
        System.out.println(message.substring(6,9));
        // the other method we can use is the split method. with this method we can split the string
        // text word by word.

        for (String word:message.split(" ")) {
            System.out.println(word);
            }
        // lowercase method help us to make each of letter of f the string lower
        System.out.println(message.toLowerCase());
        // to upper case make it versus
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}
