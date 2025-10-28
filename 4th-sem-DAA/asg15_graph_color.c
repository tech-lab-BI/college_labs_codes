#include <stdio.h>

int x[10], n, m;
int g[10][10];
int found = 0;  // Flag to check if at least one solution exists

// Display color assignments
void display() {
	int i;
    found = 1;
    printf("Solution: ");
    for (i = 1; i <= n; i++) {
        printf("%d ", x[i]);
    }
    printf("\n");
}

// Function to get the next valid color for vertex k
void NextValue(int k) {
    int j;
    while (1) {
        x[k] = (x[k] + 1) % (m + 1);
        if (x[k] == 0)
            return; // No color available

        for (j = 1; j <= n; j++) {
            if (g[k][j] && x[k] == x[j])
                break;
        }
        if (j == n + 1) // No conflict
            return;
    }
}

// Main coloring function using backtracking
void mcolor(int k) {
    while (1) {
        NextValue(k);
        if (x[k] == 0)
            return;
        if (k == n)
            display();
        else
            mcolor(k + 1);
    }
}

int main() {
    int i, j;

    printf("Enter number of vertices: ");
    scanf("%d", &n);

    printf("Enter number of colors: ");
    scanf("%d", &m);

    printf("Enter adjacency matrix:\n");
    for (i = 1; i <= n; i++) {
        for (j = 1; j <= n; j++) {
            scanf("%d", &g[i][j]);
        }
    }

    for (i = 1; i <= n; i++) {
        x[i] = 0; // Initialize color array
    }

    printf("\nColoring solutions:\n");
    mcolor(1);

    if (!found) {
        printf("No solution possible with %d colors.\n", m);
    }

    return 0;
}

