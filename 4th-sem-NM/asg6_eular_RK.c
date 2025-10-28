#include <stdio.h>

// Function: dy/dx = f(x, y)
float f(float x, float y) {
    return x*y;  // You can change this function
}

// Euler's Method
void euler(float x0, float y0, float h, float xn) {
    float x = x0, y = y0;

    printf("\nEuler Method Steps:\n");
    while (x < xn) {
        y = y + h * f(x, y);
        x = x + h;
        printf("x = %.2f, y = %.4f\n", x, y);
    }

    printf("Final value at x = %.2f is y = %.4f\n", x, y);
}

// Runge-Kutta 4th Order Method
void rungeKutta(float x0, float y0, float h, float xn) {
    float k1, k2, k3, k4;
    float x = x0, y = y0;

    printf("\nRunge-Kutta Method Steps:\n");
    while (x < xn) {
        k1 = h * f(x, y);
        k2 = h * f(x + h / 2, y + k1 / 2);
        k3 = h * f(x + h / 2, y + k2 / 2);
        k4 = h * f(x + h, y + k3);

        y = y + (k1 + 2 * k2 + 2 * k3 + k4) / 6;
        x = x + h;

        printf("x = %.2f, y = %.4f\n", x, y);
    }

    printf("Final value at x = %.2f is y = %.4f\n", x, y);
}

int main() {
    int choice;
    float x0, y0, h, xn;

    printf("Enter initial x (x0): ");
    scanf("%f", &x0);
    printf("Enter initial y (y0): ");
    scanf("%f", &y0);
    printf("Enter step size (h): ");
    scanf("%f", &h);
    printf("Enter value of x at which y is required (xn): ");
    scanf("%f", &xn);

    printf("\n--- Choose Method ---\n");
    printf("1. Euler Method\n");
    printf("2. Runge-Kutta Method\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    switch (choice) {
        case 1:
            euler(x0, y0, h, xn);
            break;
        case 2:
            rungeKutta(x0, y0, h, xn);
            break;
        default:
            printf("Invalid choice!\n");
    }

    return 0;
}

