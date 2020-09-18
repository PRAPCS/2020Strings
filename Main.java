import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    String name;
    int nameLength;
    String halfName;
    String name2;

    // String input from a user
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name? ");
    name = input.nextLine();

    System.out.println("Hello " + name);

    // retruns the number of characters including spaces
    nameLength = name.length();
    System.out.println("The length is " + nameLength);

    // Starts at index 0 and ends but not including nameLength/2
    halfName = name.substring(0, nameLength / 2);
    System.out.println(halfName);

    // Starts at index 1 and goes for the rest of the string
    name2 = name.substring(1);
    System.out.println(name2);

    // replace all the u's with a's in the string
    name = name.replace("u", "a");
    System.out.println(name);

    // change the string to all uppercase characters
    name = name.toUpperCase();
    System.out.println(name);

  }
}