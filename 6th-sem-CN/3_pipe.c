#include <stdio.h> 
#include <fcntl.h> 
#include <string.h> 
#include <stdlib.h> 
#include <unistd.h> 
 
int main() { 
    char s1[512], s2[512]; 
    int fd1, fd2[2], n, p, fd; 
    fd1 = open(“a1.txt”, O_RDONLY); 
    n = read(fd1, s1, 512); 
    pipe(fd2); 
    p = fork(); 
    if (p == -1) { 
        printf("Fork Unsuccessful"); 
        exit(1); 
    } else if (p == 0) { 
        printf("In Child Now...\n"); 
        close(fd2[1]); 
        n = read(fd2[0], s2, 512); 
        printf("Received Data = %s\n", s2); 
        fd = open("S1.txt", O_WRONLY | O_CREAT, 0644); 
        write(fd, s2, n); 
    } 
    else { 
        printf("In Parent Now...\n"); 
        close(fd2[0]); 
        write(fd2[1], s1, n); 
    } 
} 
