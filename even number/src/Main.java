import java.util.Scanner;
class Even
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Input a number :");
        int n = num.nextInt();
        if (n % 2 == 0)
        {
            System.out.println("The number is even");

        }
        else
        {
            System.out.println("The number is not even");
        }

    }


}