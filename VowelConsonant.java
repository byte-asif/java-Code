import java.util.Scanner;
public class VowelConsonant {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Words");
        String sentence;
        int Vowel=0;
        int Consonant=0;
        sentence= sc.nextLine();
        char ch;
        sentence=sentence.toLowerCase();
        for(int i=0; i<sentence.length();i++){
            ch=sentence.charAt(i);
            if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                Vowel++;
            } else if (ch>='b'&& ch<='z') {
                Consonant++;
            }
        }
        System.out.println("Number of vowel is: "+ Vowel);
        System.out.println("Number of Consonant is: "+Consonant);
    }
}
