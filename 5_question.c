#include <stdio.h>

int checkPrime(int n)
{
    int j, flag = 1;
    for (j = 2; j <= n / 2; ++j)
    {
        if (n % j == 0)
        {
            flag = 0;
            break;
        }
    }
    return flag;
}

int main()
{
    int n1, n2, flag,i ;
    printf("Enter the two positive integers:");
    scanf("%d %d", &n1, &n2);
    printf("The Prime numbers between %d and %d are:", n1, n2);
    for (i = n1 + 1; i < n2; ++i) 
    {

        flag = checkPrime(i);

        if (flag == 1)
            printf("%d ", i);
    }
    return 0;
}
