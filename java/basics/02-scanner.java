import java.util.Scanner;

class java{
  public static void main (String args[])
  {
    Scanner scan = new Scanner (System.in);
    String name = scan.nextLine();
    int age = scan.nextInt();
    scan.nextLine();
    String address = scan.nextLine();
    System.out.println("My Name Is "+name);
    System.out.println("My Age Is "+age);
    System.out.print("My Address Is "+address);
  }
}