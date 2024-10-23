import java.util.Scanner;

class java{
  public static void main (String args[])
  {
    Scanner scan = new Scanner (System.in);
    String name = scan.nextLine();
    int age = scan.nextInt();
    System.out.println("My Name Is "+name);
    System.out.print("My Age Is "+age);
  }
}