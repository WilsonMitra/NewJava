import java.util.Scanner;
class Favourite
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Input first number :");
        int n1 = num.nextInt();
        System.out.println("Input second number :");
        int n2 = num.nextInt();
        for (int i=n1;i<=n2;i++)
        {
            System.out.println(i);

        }

    }
}