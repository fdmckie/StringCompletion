import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        String name;
        String breed;
        int age;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Greetings. What is your pet's name? " );
        name = keyboard.next();
        keyboard.nextLine();


        System.out.print( "What kind of animal is " + name + "? " );
        breed = keyboard.next();
        keyboard.nextLine();

        System.out.print( "How old is " + name + "? ");
        age = keyboard.nextInt();
        keyboard.nextLine();


        System.out.println( name + " is your " + breed + " and it is " + age );
    }
}
