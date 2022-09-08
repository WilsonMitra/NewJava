import java.util.Scanner;
class Octal
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Input the number :");
        int n = num.nextInt();
        for (int i=1;i<=n;i++)

            for (int j=1;j<=n/2;j++)

        if(i%j==0)

        {
            System.out.println(i);

        }

    }
}