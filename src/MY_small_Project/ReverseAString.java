package MY_small_Project;
import java.util.Scanner;
public class ReverseAString {

    //java ----avaJ
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");//cat
        String str = scan.nextLine();

        String result = "";
        for(int i = str.length()-1;  i >=0 ; i--){
            result += str.charAt(i);
        }
   //     System.out.println(reverse);

    }

}

