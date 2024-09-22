public class ReplaceFirst {
    public static void main(String[] args) {
        String myString = "I love pizza. I eat pizza every day. I make my own pizza.";
        String substring = "pizza";
        String replacement = "donut";
        String replacedString = myString.replaceFirst(substring, replacement);
        System.out.println("Original string: " + myString );
        System.out.println("Replaced string: " + replacedString);
    }
}
