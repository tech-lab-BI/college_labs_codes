#include <sys/types.h> 
#include <netinet/in.h> 
#include <arpa/inet.h> 
#include <unistd.h> 
#define CLIENT_IP "127.0.0.1" 
#define CLIENT_PORT 6542 
#define SERVER_IP "127.0.0.1" 
#define SERVER_PORT 6555 
void main() { 
    struct sockaddr_in client, server; 
    int sd, n, i, j, count = 0; 
    char msg[512], msg1[512], ack[512]; 
    bzero((char *)&server, sizeof(server)); 
    server.sin_family = AF_INET; 
    server.sin_addr.s_addr = inet_addr(SERVER_IP); 
    server.sin_port = htons(SERVER_PORT); 
    bzero((char *)&client, sizeof(client)); 
    client.sin_family = AF_INET; 
    client.sin_addr.s_addr = inet_addr(CLIENT_IP); 
    client.sin_port = htons(CLIENT_PORT); 
    sd = socket(AF_INET, SOCK_STREAM, 0); 
    connect(sd, (struct sockaddr *)&server, sizeof(server)); 
    do { 
        printf("Enter a Message: "); 
        scanf("%s", msg); 
        printf("Enter Window Size: "); 
        scanf("%d", &n); 
        j = 0; 
        for (i = 0; i < strlen(msg); i++) { 
            if (j < n) { 
                msg1[j++] = msg[i]; 
            } 
            if (j == n || i == strlen(msg) - 1){ 
                msg1[j] = '\0'; 
                send(sd, msg1, strlen(msg1) + 1, 0); 
                memset(ack, 0x0, 512); 
                recv(sd, ack, 512, 0); 
                printf("%s%d\n", ack, count++); 
                j = 0; 
            } 
        } 
    } while (strcmp(msg, "stop")); 
    close(sd); 
} 
