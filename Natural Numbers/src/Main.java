import java.util.Scanner;
class Favourite
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Input a number :");
        int n = num.nextInt();
        if ( n >=1 )
        {
            System.out.println("The number is a Natural number");

        }

        else
        {
            System.out.println("The number is not a Natural number");
        }

    }
}