import java.util.Scanner;
public class NumberOfStringDigitSp {
    public static void main(String[] args){
        String Value;
        char ch;
        int num=0;
        int al=0;
        int sp=0;
        int space=0;
        System.out.println("Enter your word: ");
        Scanner sc= new Scanner(System.in);
        Value = sc.nextLine();
        for (int i=0; i<Value.length();i++){
            ch= Value.charAt(i);
            if (ch>='a'&&ch<='z' || ch>='A'&& ch>='Z'){
                al++;
            } else if (ch>='0' && ch<='9') {
                num++;}
            else if ( ch== ' ') {

                space++;
            }
            else
            {
                sp++;
            }
        }
        System.out.println(" The total number of alphabet is: "+al);
        System.out.println("The Total number of special charecter is: "+sp);
        System.out.println("The Total number of Number is: "+num);
    }
}
