import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Question 1 (Print the role)
        System.out.println("Please enter your role");
        String role = input.nextLine();

        if(role.equalsIgnoreCase("admin")){
            System.out.println("Welcome admin");}
        else if (role.equalsIgnoreCase("superuser")) {
            System.out.println("Welcome superuser");}
        else System.out.println("Welcome user");
//*****************************************************************
        //Question 2 (Find greatest number)

        System.out.println("Please enter first number");
        int num1 = input.nextInt();
        System.out.println("Please enter second number");
        int num2 = input.nextInt();
        System.out.println("Please enter third number");
        int num3 = input.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("Greatest number is: "+num1);
        } else if (num2>num1&& num2>num3) {
            System.out.println("Greatest number is: "+num2);
        }else System.out.println("Greatest number is: "+num3);

//*****************************************************************
        //Question 3 (Generate random day)

        int min = 1;
        int max = 7;
        int randomNumber = (int) (Math.random() * (max - min + 1)) + min;

        switch (randomNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }

   //*****************************************************************
  // Question 4 (Score)
            System.out.println("Please enter your score");
        int score = input.nextInt();


         if(score>=90 && score<= 100){
             System.out.println("A");
         } else if (score>= 80 && score<=89) {
             System.out.println("B");
         } else if (score >=70 && score<=79 ) {
             System.out.println("C");
         }else if( score>= 60 && score<= 69) {System.out.println("D");}
         else if (score>= 0 && score<= 59) {System.out.println("F");}
          else System.out.println("Please enter correct GPA");



        //*****************************************************************
        //Question 5 (Categorize age)
        System.out.println("Please enter age");
        int age = input.nextInt();

        if(age<13){
            System.out.println("You are an child");
        } else if (age>=13 && age <= 19) {
            System.out.println("You are an teenager");
        }else System.out.println("You are an adult");




    }
        }





