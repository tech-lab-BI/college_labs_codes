#include<stdio.h>
#include<stdlib.h>
#include<math.h>

float **a;//x y x2 x3 xy
float A,B,sx=0,sy=0,sx2=0,sx3=0,sxy=0;

void sl(int n){
	int i;
	
	a = (float**)malloc(n*sizeof(float*));
	for(i=0;i<n;i++){
		a[i] = (float*)malloc(5*sizeof(float));
	}
	printf("Enter data x & y: \n");
	for(i=0;i<n;i++){
		scanf("%f %f",&a[i][0],&a[i][1]);//x y
		a[i][2] = (pow(a[i][0],2));//x2
		a[i][3] = (pow(a[i][0],3));//x3
		a[i][4] = (a[i][0]*a[i][1]);//xy
		sx += a[i][0];
		sy += a[i][1];
		sx2 += a[i][2];
		sx3 += a[i][3];
		sxy += a[i][4];
	}
	
	//straight line
	B = ((n*sxy)-(sx*sy))/((n*sx2)-(pow(sx,2)));
	A = (sy-(B*sx))/(n*1.0);
	printf("y = %.2f + %.2fx",A,B);
	
}

void el(n){
	
	int i;
	
	a = (float**)malloc(n*sizeof(float*));
	for(i=0;i<n;i++){
		a[i] = (float*)malloc(6*sizeof(float));
	}
	printf("Enter data x & y: \n");
	for(i=0;i<n;i++){
		scanf("%f %f",&a[i][0],&a[i][5]);//x y
		a[i][1] = log(a[i][5]);
		a[i][2] = (pow(a[i][0],2));//x2
		a[i][3] = (pow(a[i][0],3));//x3
		a[i][4] = (a[i][0]*a[i][1]);//xy
		sx += a[i][0];
		sy += a[i][1];
		sx2 += a[i][2];
		sx3 += a[i][3];
		sxy += a[i][4];
	}
	
	//straight line
	B = ((n*sxy)-(sx*sy))/((n*sx2)-(pow(sx,2)));
	A = (sy-(B*sx))/(n*1.0);
	printf("y = %.2f*e^%.2fx",exp(A),B);
	
}

int main(){
	int i,n,ch;
	
	printf("1. Straight line\n2. Exponential\nChioce :: ");
	scanf("%d",&ch);
	printf("Number of data : ");
	scanf("%d",&n);
	switch(ch){
		case 1:
			sl(n);
			break;
		case 2:
			el(n);
			break;
		default:
			printf("Wrong chioce!");
			exit(0);
	}
	
	return 0;
}
