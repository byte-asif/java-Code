import java.io.*;
    public class WordCount {
        public static int countWords(String str) {
            if (str == null || str.isEmpty())
            { return 0;}
            String[] words = str.split(" ");
            return words.length;
        }
        public static void main(String args[])
        {
            String str = " as iff rktk e";
            System.out.println("No of words : " +
                    countWords(str));
        }
    }

