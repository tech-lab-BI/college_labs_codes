#include <stdio.h>
#include<stdlib.h>
#include <math.h>

int main() {
    int i, n, totalFreq = 0;
    float *lower, *upper, *freq, *mid;
    float mean = 0, median = 0, mode = 0, sd = 0;

    printf("Enter number of class intervals: ");
    scanf("%d", &n);
	lower = (float*)malloc(n*sizeof(float));
	upper = (float*)malloc(n*sizeof(float));
	freq = (float*)malloc(n*sizeof(float));
	mid = (float*)malloc(n*sizeof(float));

    printf("Enter Lower Limit, Upper Limit and Frequency:\n");
    for (i = 0; i < n; i++) {
        scanf("%f %f %f", &lower[i], &upper[i], &freq[i]);
        mid[i] = (lower[i] + upper[i]) / 2.0;
        totalFreq += freq[i];
    }




    // Mean
    float fx_sum = 0;
    for (i = 0; i < n; i++) {
        fx_sum += mid[i] * freq[i];
    }
    mean = fx_sum / totalFreq;




    // Standard Deviation
    float var_sum = 0;
    for (i = 0; i < n; i++) {
        var_sum += freq[i] * pow(mid[i] - mean, 2);
    }
    sd = sqrt(var_sum / totalFreq);




    // Median
    float *cumFreq = (float*)malloc(n*sizeof(float));
    cumFreq[0] = freq[0];
    for (i = 1; i < n; i++) {
        cumFreq[i] = cumFreq[i - 1] + freq[i];
    }
    float Nby2 = totalFreq / 2.0;
    for (i = 0; i < n; i++) {
        if (cumFreq[i] >= Nby2) {//for only 1st true condition
            float L = lower[i];
            float f = freq[i];
            float F = (i == 0) ? 0 : cumFreq[i - 1];
            float h = upper[i] - lower[i];
            median = L + ((Nby2 - F) / f) * h;
            break;
        }
    }




    // Mode
    int maxFreq,modalClass = 0;
    maxFreq = freq[0];
    modalClass = 0;
    for (i = 1; i < n; i++) {//find highest frequency
        if (maxFreq < freq[i]) {
            maxFreq = freq[i];
            modalClass = i;
        }
    }
    float L = lower[modalClass];
    float f1 = freq[modalClass];
    float f0 = freq[modalClass - 1];
    float f2 = freq[modalClass + 1];
    float h = upper[modalClass] - lower[modalClass];
    mode = L + ((f1 - f0) / (2*f1-f0-f2)) * h;

    // Output
    printf("\nGrouped Data Results:\n");
    printf("Mean = %.2f\n", mean);
//    printf("Median = %.2f\n", median);
    printf("Mode = %.2f\n", mode);
    printf("Standard Deviation = %.2f\n", sd);

    return 0;
}
/*
200 220 7
220 240 15
240 260 20
260 280 6
280 300 6
300 320 4
320 340 2
*/
