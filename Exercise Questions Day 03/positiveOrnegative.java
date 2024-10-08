import java.util.Scanner;
class positiveOrnegative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();

        String result = (num > 0)?num+" is positive":(num<0)?num+" is negative":num+" number is zero";

        System.out.println(result);
    }
}