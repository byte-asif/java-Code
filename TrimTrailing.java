public class TrimTrailing {
    public static void main(String[] args) {
        String str = "   Hello, World!   ";
        String strippedStr = str.stripTrailing();
        System.out.println(strippedStr);
    }
}

