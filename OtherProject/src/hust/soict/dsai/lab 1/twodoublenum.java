import java.util.Scanner;
public class twodoublenum {
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("num1:");
      String strNum1= scanner.nextLine();
      System.out.println("num2:");
      String strNum2= scanner.nextLine();
      double num1= Double.parseDouble(strNum1);
      double num2= Double.parseDouble(strNum2);
      double sum = num1 + num2;
      double diff = num1 - num2;
      double product = num1*num2;
      System.out.println("sum:"+ sum);
      System.out.println("diff:"+diff);
      System.out.println("product:"+product);
      if(num2 != 0){
          double quotient = num1 / num2;
          System.out.println("quotient:"+ quotient);
        }else{System.out.println("can't find quotient of these two numbers");}
      scanner.close();
    }
}
