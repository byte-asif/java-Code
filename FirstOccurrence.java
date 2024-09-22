public class FirstOccurrence {
    public static int findInStr(String s1, char c){
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == c)
                return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        String str = "GeeksforGeeks A computer science portal for geeks ";
        char word = 'p';
        if(findInStr(str,word)!=-1){
        System.out.println(findInStr(str, word));}
    }
}
