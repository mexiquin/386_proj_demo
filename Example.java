class Example
{
    public static int calcSum(int num1, int num2)
    {
        return num1 + num2;
    }

    public static boolean isEven(int number)
    {
        if(number % 2 == 0)
        {
            return true;
        }

        return false;
    }

    public static void main(String[] argv)
    {
        int num1 = 234;
        int num2 = 186;

        System.out.printf("Input nums: %d, %d\n\n", num1, num2);

        int summed = calcSum(num1, num2);

        System.out.printf("%d\n", summed);

        if(isEven(summed))
        {
            System.out.printf("%d is Even!\n", summed);
        } else{
            System.out.printf("%d is Odd!\n", summed);
        }

    }
}