import java.util.Scanner;

public class HelloWorld
{
  private static Scanner in = new Scanner(System.in);

  public static void main(String[] args)
  {
    System.out.println("Hello World!");
    System.out.println("( ͡° ͜ʖ ͡°)");
    System.out.print("What's your name? > ");
    String name = in.nextLine();
    System.out.println("Goodbye, " + name + "!");
  }
}
