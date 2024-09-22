import java.util.Scanner;

public class Delete_first_Occurrence {

    public static void main(String [] args) {


        String sencence = "this is asif rahman";
        System.out.println("String: "+sencence);
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your Charecter");
       String c= sc.next();

        sencence=sencence.replaceFirst( c, "");
        System.out.println("New Sentence: "+sencence);


    }

}
