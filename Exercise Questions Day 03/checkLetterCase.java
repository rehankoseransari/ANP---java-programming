import java.util.Scanner;
public class checkLetterCase {
    public static void main(String[] args) {
        System.out.print("Enter any character : ");
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        int check = ch.charAt(0);
        
        /*Acoording to ASCII code table A - Z is from 65 - 90 and a-z is from 97-122 */

        String answer = (check >= 65 && check<=90)? ch+" is in uppercase ":(check >= 97 && check<=122)?ch+" is in lowercase":ch+" is not a character";
        System.out.println(answer);
    }
}
