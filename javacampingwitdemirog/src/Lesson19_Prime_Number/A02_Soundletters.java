package Lesson19_Prime_Number;

public class A02_Soundletters {
    public static void main(String[] args) {
        char letter = 'A';
        String soundedLetters = "A,I,O,U";
        String thinSoundedLetters = "E,i,u,o";
        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin sesli Harf");
                break;
            default:
                System.out.println("Ince sesli harf");

        }

    }
}
