#include<stdlib.h>
#include<conio.h>
#include<stdio.h>

void main()
{
   float see,cie,total;
    char grade;
    
    printf("enter your CIE marks out of 50: ");
    scanf("%f",&cie);
    printf("enter your SEE marks out of 100: ");
    scanf("%f",&see);
    total = (cie)+ (see/2);
    printf("Your total marks are : %f\n",total);
    
    if(total>=85)
    grade = 'S';
    else if(total>=75)
    grade = 'A';
     else if(total>=60)
    grade = 'B';
     else if(total>=50)
    grade = 'C';
     else if(total>=40)
    grade = 'D';
    else
    grade = 'F';
    
    printf("Your grade is : %c\n",grade);
    
}
