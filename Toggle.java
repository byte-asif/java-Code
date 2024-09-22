import java.util.Scanner;
public class Toggle {
    public static void main(String[] args)
    {
        System.out.println("Enter in a sentence:");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        System.out.println("All uppercase:" + sentence.toUpperCase());
        System.out.println("All lowercase:" + sentence.toLowerCase());
        System.out.println("Converted String:" + toggleString(sentence));
        input.close();
    }

    public static String toggleString(String sentence) {
    StringBuilder toggled = new StringBuilder(sentence.length());
    for (char letter : sentence.toCharArray()) {
        if(Character.isUpperCase(letter)) {
            letter = Character.toLowerCase(letter);
        } else if(Character.isLowerCase(letter)) {
            letter = Character.toUpperCase(letter);
        }

        toggled.append(letter);

    }
    return toggled.toString();
}
}
