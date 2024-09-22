public class LastOccurrrence {
    static int findLastIndex(String str, Character x)
        {
            int index = -1;
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) == x)
                    index = i;
            return index;
        }
        public static void main(String[] args)
        {
            String str = "geeksforgeeks";
            Character x = 'e';
            int index = findLastIndex(str, x);
            if (index == -1)
                System.out.println("Character not found");
            else
                System.out.println("Last index is " + index);
        }
    }

