import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your Age : ");
      int age = sc.nextInt();
      String eligible = (age >= 18)?"You can vote":"you cannot vote";
      System.out.println(eligible);
    }
}
