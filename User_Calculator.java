import java.util.Scanner;

        public class User_Calculator {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                double result;
                System.out.println("Enter number:");
                int num1 = Integer.parseInt(input.nextLine());


                System.out.println("Enter the operator:");
                String operator=  input.next();



                System.out.println("Enter another number :");
                int num2 = input.nextInt();


                User_Calculator calc =new User_Calculator();
                result=calc.Operators(num1,operator,num2);
                System.out.println("result"+" "+ result);

            }


            public double Operators(int num1, String operator, int num2) {

                double result =0.0;

                if (operator.equals("divide")) {
                    result =  (double) num1 / num2;
                    if(num2==0){
                        System.out.println("you cant divide any number by zero");
                    }

                } else if (operator.equals("multiplication")) {
                    result = num1 * num2;

                } else if (operator.equals("addition")) {
                    result = num1 + num2;
                } else if (operator.equals("subtraction")) {
                    result = num1 - num2;

                }


                return result;
            }


}

