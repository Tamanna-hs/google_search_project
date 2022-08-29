#include <stdio.h>
 #include <stdlib.h>
 #include <unistd.h>
 int main(){

     //before calling the fork(), I let the main process to access a variable, x
    int x = 100;
    printf("This is a C program (pid:%d)\n", (int)getpid());
    printf("Value of the variable before calling fork is %d\n", x);
    int y = fork();
    if (y < 0)
    {
        // if fork fails; exit`
        fprintf(stderr, "fork failed\n");
        exit(1);
    }
    else if (y == 0)
    {
        // child process
        printf("This is child (pid:%d)\n", (int)getpid());
        printf("Value of the variable in child is %d\n", x);
        // Changed the value of x in child 
        x = 500;
        printf("The changed value of the variable in child is %d\n", x);
    }
    else
    {
        // parent process
        printf("This is the parent of %d (pid:%d)\n", y, (int)getpid());
        printf("Value of the variable in parent  is %d\n", x);
        // Changing the value of y in parent
        x = 900;
        printf("The changed value of the variable in parent is %d\n", x);
    }
    return 0;
 }