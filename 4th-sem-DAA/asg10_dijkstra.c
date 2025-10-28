#include <stdio.h>
#define INF 99999
#define MAX 10

int graph[MAX][MAX], dist[MAX], visited[MAX];
int n;

// Step-by-step Dijkstra's function
void dijkstra(int start) {
    int i, j, u, min;

    // Step 1: Initialize distances and visited
    for (i = 0; i < n; i++) {
        dist[i] = INF;     // Set all distances to INF
        visited[i] = 0;    // Mark all nodes as unvisited
    }
    dist[start] = 0;        // Distance to source is 0

    printf("\nStep-wise Execution:\n");

    // Step 2: Loop to find shortest path to all vertices
    for (i = 0; i < n - 1; i++) {
        // Step 3: Select the unvisited node with minimum distance
        min = INF;
        u = -1;

        for (j = 0; j < n; j++) {
            if (!visited[j] && dist[j] < min) {
                min = dist[j];
                u = j;
            }
        }

        if (u == -1) break;  // No reachable unvisited nodes

        visited[u] = 1;  // Mark as visited

        // Print current status
        printf("Visited: %d\n", u);
        printf("Updated distances:\n");

        // Step 4: Update distances of neighbors
        for (j = 0; j < n; j++) {
            if (!visited[j] && graph[u][j] != INF && dist[u] + graph[u][j] < dist[j]) {
                dist[j] = dist[u] + graph[u][j];
            }
            printf("To %d: %d\n", j, dist[j] == INF ? -1 : dist[j]);
        }

        printf("-------------------\n");
    }

    // Step 5: Print final distances
    printf("\nFinal shortest distances from vertex %d:\n", start);
    for (i = 0; i < n; i++) {
        if (dist[i] != INF)
            printf("To vertex %d = %d\n", i, dist[i]);
        else
            printf("To vertex %d = Unreachable\n", i);
    }
}

int main() {
    int i, j, start;

    printf("Enter number of vertices: ");
    scanf("%d", &n);

    printf("Enter adjacency matrix (0 for no edge):\n");
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            scanf("%d", &graph[i][j]);
            if (graph[i][j] == 0 && i != j)
                graph[i][j] = INF;
        }
    }

    printf("Enter starting vertex (0 to %d): ", n - 1);
    scanf("%d", &start);

    dijkstra(start);

    return 0;
}
