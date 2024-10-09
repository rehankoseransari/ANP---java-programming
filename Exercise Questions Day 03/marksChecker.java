import java.util.Scanner;
class marksChecker{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks of physics : ");
        int phy = sc.nextInt();
        System.out.println("Enter your marks of chemistry : ");
        int chem = sc.nextInt();
        System.out.println("Enter your marks of Maths : ");
        int maths = sc.nextInt();

        int total_percent = (phy+chem+maths)/3;

        String result = (phy>=33 && chem>=33 && maths>=33)?"congratulation you are pass you scored"+total_percent+ " %":"Sorry you are fail with total "+total_percent+ " %";

        System.out.println(result);
    }
}