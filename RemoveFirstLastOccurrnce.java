public class RemoveFirstLastOccurrnce {
        static String removeOcc(String s, char ch)
        {
            for (int i = 0; i < s.length(); i++)
            {
                if (s.charAt(i) == ch)
                {
                    s = s.substring(0, i) +
                            s.substring(i + 1);
                    break;}
            }
            for (int i = s.length() - 1; i > -1; i--)
            {
                if (s.charAt(i) == ch)
                {
                    s = s.substring(0, i) +
                            s.substring(i + 1);
                    break;
                }}
            return s;
        }
        public static void main(String[] args)
        {
            String s = "hello world";
            char ch = 'l';
            System.out.print(removeOcc(s, ch));
        }
    }


