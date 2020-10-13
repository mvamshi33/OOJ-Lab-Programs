#include<stdio.h>
#include<math.h>
int main()
{
  float num1, num2, result;
  int op, i, j, result_char;
  i=0;
  while(1)
{
  printf("\n The operation to perform:- \n");
  printf("Addition: press 1\n");
  printf("Subtraction: press 2\n");
  printf("Multiplication: press 3\n");
  printf("Division: press 4\n");
  printf("Greater than: press 5\n");
  printf("Greater than or equal to: press 6\n");
  printf("Less than: press 7\n");
  printf("Less than or equal to: press 8\n");
  printf("Power: press 9\n");	
  printf("Square root: press 10\n");
  printf("Exit: press 0\n");
  printf("Enter your response:");
  scanf("%d",&op);
  if (op==0)
{
  printf("\n Thank you for using calculator.\n");
  printf("Exiting...");
  break;
}
 else if(op==10)
{
 printf("\n Enter the number:");
 scanf("%f",&num1);
 result=sqrt(num1);
 printf("Result=%f", result);
 continue;
}
 printf("\n Enter the first number=");
 scanf("%f",&num1);
 printf("Enter the second number=");
 scanf("%f",&num2);
 switch (op)
{
 case 1:
 result=num1+num2;
 break;
 case 2:
 result=num1-num2;
 break;
 case 3:
 result=num1*num2;
 break;
 case 4:
 result=num1/num2;
 break;
 case 5:
 result=num1>num2;
 break;
 case 6:
 result=num1>=num2;
 break;
 case 7:
 result_char=num2>num1;
 break;
 case 8:
 result_char=num2<=num1;
 break;
 case 9:
 result=pow(num1,num2);
 break;
 if(op>=5 && op<=8)
{
 if(result_char==0)
{
 printf("Result is False\n");
}
 else
{
 printf("Result=%f", result);
}
}
return 0;
}
