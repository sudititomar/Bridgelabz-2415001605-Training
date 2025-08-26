import java.util.Scanner;
class divisibleby5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++)
        {
            if (i % 5 == 0)
            {
                System.out.println("It is divisible by 5");
            }
        }
    }
}