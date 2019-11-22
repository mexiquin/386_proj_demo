/*
Main entrypoint
*/

#include "example.h"

int main(int argc, char* argv[])
{
    int num1 = 234;
    int num2 = 186;

    printf("Input nums: %d, %d\n\n", num1, num2);

    int summed = calcSum(num1, num2);

    printf("%d\n", summed);

    if(isEven(summed))
    {
        printf("%d is Even!\n", summed);
    } else{
        printf("%d is Odd!\n", summed);
    }

    return EXIT_SUCCESS;
    
}