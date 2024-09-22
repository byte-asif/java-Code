import java.util.Scanner;
public class Revers {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your sentence");
        String Sentence = sc.nextLine();
        StringBuilder rev = new StringBuilder(Sentence);
        System.out.println(rev.reverse());

    }
}
