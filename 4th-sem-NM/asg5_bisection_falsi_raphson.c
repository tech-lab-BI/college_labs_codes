#include <stdio.h>
#include <math.h>
#define EPS 0.0001

// Function to be solved
float f(float x) {
    return x * x * x - 3*x - 5;
}

// Derivative for Newton-Raphson
float df(float x) {
    return 3 * x * x - 3;
}

// Bisection Method
void bisection(float a, float b) {
    float c;
    if (f(a) * f(b) >= 0) {
        printf("Invalid interval: f(a) and f(b) must have opposite signs.\n");
        return;
    }
    do {
        c = (a + b) / 2;
        if (f(c) == 0.0) break;
        else if (f(c) * f(a) < 0) b = c;
        else a = c;
    } while (fabs(f(c)) > EPS);

    printf("Root by Bisection: %.4f\n", c);
}

// Regula Falsi Method
void regulaFalsi(float a, float b) {
    float c;
    if (f(a) * f(b) >= 0) {
        printf("Invalid interval: f(a) and f(b) must have opposite signs.\n");
        return;
    }
    do {
        c = (a * f(b) - b * f(a)) / (f(b) - f(a));
        if (f(c) == 0.0) break;
        else if (f(c) * f(a) < 0) b = c;
        else a = c;
    } while (fabs(f(c)) > EPS);

    printf("Root by Regula Falsi: %.4f\n", c);
}

// Newton-Raphson Method
void newtonRaphson(float x0) {
    float x1;
    int iteration = 0;
    do {
        x1 = x0 - f(x0) / df(x0);
        if (fabs(x1 - x0) < EPS) break;
        x0 = x1;
        iteration++;
    } while (iteration < 100);

    printf("Root by Newton-Raphson: %.4f\n", x1);
}

int main() {
    int choice;
    float a, b, x0;

    do {
        printf("\n--- Root Finding Methods ---\n");
        printf("1. Bisection Method\n");
        printf("2. Regula Falsi Method\n");
        printf("3. Newton-Raphson Method\n");
        printf("0. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter interval a and b: ");
                scanf("%f %f", &a, &b);
                bisection(a, b);
                break;
            case 2:
                printf("Enter interval a and b: ");
                scanf("%f %f", &a, &b);
                regulaFalsi(a, b);
                break;
            case 3:
                printf("Enter initial guess x0: ");
                scanf("%f", &x0);
                newtonRaphson(x0);
                break;
            case 0:
                printf("Exiting...\n");
                break;
            default:
                printf("Invalid choice.\n");
        }
    } while (choice != 0);

    return 0;
}

