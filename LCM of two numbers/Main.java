#include<stdio.h>

  //Type your code here#include <stdio.h>
int main()
{
    int n1, n2, i,lcm, gcd;
   // printf("Enter two integers: ");
    scanf("%d\t %d", &n1, &n2);
    for(i=1; i <= n1 && i <= n2; ++i)
    {
        // Checks if i is factor of both integers
        if(n1%i==0 && n2%i==0)
            gcd = i;
    }
  lcm=n1*n2/gcd;
  printf("%d",lcm);
  //  printf("G%d",gcd);
    return 0;
}
 