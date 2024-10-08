import java.util.Scanner;
class bonusCalculation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Experience in Years : ");
        int exp = sc.nextInt();
        System.out.print("Enter your Current Salary : ");
        int salary = sc.nextInt();

        int bonus = (exp > 20)? ((salary*20)/100) :  ((salary*10)/100);
        int newSalary = salary+bonus;
        System.out.println("You get a bonus of : Rs "+bonus);
        System.out.println("Your new Salary is : Rs "+newSalary);
    }
}