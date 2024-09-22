import java.util.Arrays;
import java.util.Collections;
public class ReverseWord {
    public static void main(String[] args)
        {
            String text
                    = "i like this program very much";
            String str[] = text.split(" ");
            Collections.reverse(Arrays.asList(str));
            System.out.println(String.join(" ", str));
        }
    }

