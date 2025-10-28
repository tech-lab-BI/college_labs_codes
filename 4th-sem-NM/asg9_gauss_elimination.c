#include <stdio.h>
#include <stdlib.h>

// Function to perform Gauss Elimination and solve the system of linear equations
int main() {
    int n, i, j, k;
    float **a, *x, *temp, ratio;

    // Step 1: Input the number of equations (n)
    printf("Enter the number of equations: ");
    scanf("%d", &n);

    // Step 2: Dynamically allocate memory for augmented matrix (a) and solution vector (x)
    a = (float **)malloc((n) * sizeof(float *));   // Allocating memory for 'n' rows
    for(i = 0; i < n; i++) {
        a[i] = (float *)malloc((n + 1) * sizeof(float));  // Allocating memory for 'n+1' columns (n variables + 1 for the right-hand side)
    }
    x = (float *)malloc(n * sizeof(float));   // Solution vector
    temp = (float *)malloc((n + 1) * sizeof(float));   // Temporary array for row swapping

    // Step 3: Input the augmented matrix (n x n+1 matrix)
    printf("Enter the augmented matrix (with 'n' equations and 'n' variables + right-hand side values):\n");
    for(i = 0; i < n; i++) {
        for(j = 0; j < n + 1; j++) {
            scanf("%f", &a[i][j]);
        }
    }

    // Step 4: Gauss Elimination (Forward Elimination)
    for(k = 0; k < n - 1; k++) {
        // Step 4.1: Make the pivot element non-zero (if it's zero, swap rows)
        if(a[k][k] == 0.0) {
            for(i = k + 1; i < n; i++) {
                if(a[i][k] != 0.0) {
                    // Row swapping
                    for(j = 0; j < n + 1; j++) {
                        temp[j] = a[k][j];
                        a[k][j] = a[i][j];
                        a[i][j] = temp[j];
                    }
                    break;
                }
            }
        }

        // Step 4.2: Perform elimination for the rows below the pivot
        for(i = k + 1; i < n; i++) {
            ratio = a[i][k] / a[k][k];  // Calculate the ratio for elimination
            for(j = 0; j < n + 1; j++) {
                a[i][j] = a[i][j] - ratio * a[k][j];  // Eliminate variable in row i
            }
        }
    }

    // Step 5: Back Substitution
    // Now, the matrix is upper triangular. We solve for the unknowns (x values)
    for(i = n - 1; i >= 0; i--) {
        x[i] = a[i][n];  // Start with the last element
        for(j = i + 1; j < n; j++) {
            x[i] = x[i] - a[i][j] * x[j];  // Subtract the known solutions
        }
        x[i] = x[i] / a[i][i];  // Solve for the current unknown
    }

    // Step 6: Output the solution
    printf("\nSolution:\n");
    for(i = 0; i < n; i++) {
        printf("x[%d] = %.3f\n", i + 1, x[i]);  // Print the value of each variable
    }

    // Step 7: Free dynamically allocated memory
    for(i = 0; i < n; i++) {
        free(a[i]);  // Free memory for each row
    }
    free(a);  // Free memory for the augmented matrix
    free(x);  // Free memory for the solution vector
    free(temp);  // Free memory for the temporary array

    return 0;
}

