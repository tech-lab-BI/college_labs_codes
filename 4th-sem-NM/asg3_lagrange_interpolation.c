#include <stdio.h>

int main() {
    int n, i, j;
    float x[10], y[10], value, result = 0, term;

    printf("Enter number of data points: ");
    scanf("%d", &n);

    printf("Enter x y values:\n");
    for (i = 0; i < n; i++) {
        scanf("%f %f", &x[i], &y[i]);
    }

    printf("Enter value to interpolate: ");
    scanf("%f", &value);

    for (i = 0; i < n; i++) {
        term = y[i];
        for (j = 0; j < n; j++) {
            if (j != i)
                term *= (value - x[j]) / (x[i] - x[j]);
        }
        result += term;
    }

    printf("Interpolated value at x = %.2f is %.4f\n", value, result);

    return 0;
}
/*
1 2
2 4
3 8
4 6
7 128
*/
