#include <stdio.h> 
#include <string.h> 
#include <sys/socket.h> 
#include <sys/types.h> 
#include <netinet/in.h> 
#include <arpa/inet.h> 
#include <unistd.h> 
#define CLIENT_IP "127.0.0.1" 
#define CLIENT_PORT 6541 
#define SERVER_IP "127.0.0.1" 
#define SERVER_PORT 6540 
void main() { 
    struct sockaddr_in client, server; 
    int sd, slen = sizeof(server); 
    char msg[512], str[512]; 
    bzero((char *)&server, sizeof(server)); 
    server.sin_family = AF_INET; 
    server.sin_addr.s_addr = inet_addr(SERVER_IP); 
    server.sin_port = htons(SERVER_PORT); 
    bzero((char *)&client, sizeof(client)); 
    client.sin_family = AF_INET; 
    client.sin_addr.s_addr = inet_addr(CLIENT_IP); 
    client.sin_port = htons(CLIENT_PORT); 
 
    sd = socket(AF_INET, SOCK_DGRAM, 0); 
    bind(sd, (struct sockaddr *)&client, sizeof(client)); 
    do { 
        printf("Enter a massage: "); 
        scanf("%s", str); 
        sendto(sd, str, strlen(str) + 1, 0, (struct sockaddr *)&server, sizeof(server)); 
        memset(msg, 0x0, 512); 
        recvfrom(sd, msg, 512, 0, (struct sockaddr *)&server, &slen); 
        printf("\nEchoed massage : %s\n", msg); 
 
    } while (strcmp(str, "stop")); 
    close(sd); 
} 
