#include <stdio.h>

#define MAX 10

// Function to calculate factorial
int fact(int n) {
    int i,f = 1;
    for (i = 2; i <= n; i++)
        f *= i;
    return f;
}

// Function to print the difference table
void printDiffTable(float diff[MAX][MAX], int n) {
	int i,j;
    printf("\nDifference Table:\n");
    for (i = 0; i < n; i++) {
        printf("%.2f\t", diff[i][0]);
        for (j = 1; j < n - i; j++){
            printf("%.2f\t", diff[i][j]);
        }
        printf("\n");
    }
}

int main() {
    int n, i, j;
    float x[MAX], y[MAX], diff[MAX][MAX];
    float h, value, u, result,term;

    printf("Enter number of data points: ");
    scanf("%d", &n);

    printf("Enter x y values:\n");
    for (i = 0; i < n; i++) {
        scanf("%f %f", &x[i], &y[i]);
        diff[i][0] = y[i]; // first column of difference table is y
    }

    // Create forward difference table
    for (j = 1; j < n; j++) {
        for (i = 0; i < n - j; i++) {
            diff[i][j] = diff[i+1][j-1] - diff[i][j-1];
        }
    }

    // Print difference table
    printDiffTable(diff, n);

    printf("\nEnter value of x to interpolate: ");
    scanf("%f", &value);

	h = x[1] - x[0];
	u = ((value-x[n-1])/h);
	result = y[n-1];
	for(i=1;i<n;i++){
		term = 1;
		for(j=0;j<i;j++){
			term *= (u+j);
		}
		result += (term*diff[n-i-1][i])/fact(i);
	}

    printf("Interpolated value at x = %.2f is %.4f\n", value, result);

    return 0;
}
/*
2 12
4 10
6 9
8 14
at 6.5
*/
