import java.util.Scanner;

public class delete_words
{
    public static void main(String args[])
    {
        String str1, str2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any String : ");
        str1 = scan.nextLine();

        System.out.print("Word to Delete from String [ " +str1+" ]: ");
        str2 = scan.nextLine();

        System.out.print("Deleting all '" + str2 + "' from '" + str1 + "'------->\n");
        str1=str1.replaceFirst(str2, "");
//        str1 = str1.replaceAll(str2, "");


        System.out.println("\nAfter Deletion, Reqd. String is : [ "+str1+" ]");


    }
}