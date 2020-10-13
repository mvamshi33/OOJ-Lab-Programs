#include <stdio.h>
#include <math.h>
#include <stdlib.h>
int main() {
    int s=4;
    float a,v,r,h;
    while(s)
    {
    printf("Enter the choice of shape:\n");
    printf("01.Cylinder\n02.Cone\n03.Sphere\n0.Exit\n");
    scanf("%d",&s);
    switch(s)
    {
        case 01:printf("Enter the radius:\n");
               scanf("%f",&r);
               printf("Enter the height:\n");
               scanf("%f",&h);
               a=(2*3.14*r*h)+(2*3.14*r*r);
               v=(3.14*r*r*h);
               printf("Area: %f\nVolume: %f\n",a,v);
               break;
        case 02:printf("Enter the radius:\n");
               scanf("%f",&r);
               printf("Enter the height:\n");
               scanf("%f",&h);
               a=(3.14*r)*(r+sqrt((h*h)+(r*r)));
               v=(3.14*r*r*h)/3.0;
               printf("Area: %f\nVolume: %f\n",a,v);
               break;
        case 03:printf("Enter the radius:\n");
               scanf("%f",&r);
               a=4*3.14*r*r;
               v=(4*3.14*r*r*r)/3.0;
               printf("Area: %f\nVolume: %f\n",a,v);
               break;
        case 0:printf("Exit\n");
               exit(0);
        default:printf("Invalid choice\n");
               
    }
    }
    return 0;
}
