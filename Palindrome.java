public class Palindrome {
        public static boolean isPalindrome(String str)
        {

            StringBuilder rev = new StringBuilder(str);
            boolean ans = false;
//            for (int i = str.length() - 1; i >= 0; i--) {
//                rev = rev + str.charAt(i);

//            }

            StringBuilder rever = rev.reverse();
            if (rev.equals(rever)) {
                ans = true;
            }
            return ans;
        }
        public static void main(String[] args)
        {
            String str = "geeg";
            str = str.toLowerCase();
            boolean A = isPalindrome(str);
            System.out.println(A);

        }
    }
