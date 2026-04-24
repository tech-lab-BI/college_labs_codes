#include <stdio.h> 
#include <string.h> 
#include <sys/socket.h> 
#include <sys/types.h> 
#include <netinet/in.h> 
#include <arpa/inet.h> 
#include <unistd.h> 
#include <time.h> 
#define SERVER_IP "127.0.0.1" 
#define SERVER_PORT 6540 
void main() { 
    struct sockaddr_in client, server; 
    int sd, clen = sizeof(client); 
    char msg[512], str[512] = "Invalid request"; 
    char *ptr; 
    time_t ti; 
    bzero((char *)&server, sizeof(server)); 
    server.sin_family = AF_INET; 
    server.sin_addr.s_addr = inet_addr(SERVER_IP); 
    server.sin_port = htons(SERVER_PORT); 
    sd = socket(AF_INET, SOCK_DGRAM, 0); 
    bind(sd, (struct sockaddr *)&server, sizeof(server)); 
    while (1) { 
        do { 
            memset(msg, 0x0, 512); 
            recvfrom(sd, msg, 512, 0, (struct sockaddr *)&client, &clen); 
            if (!strcmp(msg, "time")) { 
                ti = time(NULL); 
                ptr = ctime(&ti); 
                sendto(sd, ptr, strlen(ptr) + 1, 0, (struct sockaddr *)&client, clen); 
            } else 
                sendto(sd, str, strlen(str) + 1, 0, (struct sockaddr *)&client, clen); 
        } while (strcmp(msg, "stop")); 
    } 
} 
