public class RemoveAllOccurrence {
        public static String removechar(String word, char ch)
        {
            StringBuilder s = new StringBuilder(word);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ch) {
                    s.deleteCharAt(i);
                    i--;
                }
            }
            return s.toString();
        }
        public static void main(String[] args)
        {
            String word = "geeksforgeeks";
            char ch = 'e';
            System.out.println(removechar(word, ch));
        }
    }

