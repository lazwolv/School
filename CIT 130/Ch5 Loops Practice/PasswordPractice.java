import java.util.Scanner;

public class PasswordPractice{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String password;
    int attempts = 0;
    while (attempts < 3){
    System.out.print("enter the password: ");
    password = input.nextLine();
      if ( password.equalsIgnoreCase("java") ){
        int count = 0;
        while (count < 5){
        System.out.println((count + 1) + ": Welcome to Java");
        count++;
        }// while count < 5
      }// if
      else{
        System.out.println("access denied");
      }// else
      attempts++;
    }// while
    input.close();
  }// main
}// class