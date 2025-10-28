#include<stdio.h>
#define max 10
float p[max],w[max],r[max],x[max];

void sort(int n){
	int i,j;
	float temp;
	for(i=0;i<n-1;i++){
		for(j=0;j<n-i-1;j++){
			if(r[j] < r[j+1]){//decreasing order
				temp = r[j];
				r[j] = r[j+1];
				r[j+1] = temp;
				
				temp = p[j];
				p[j] = p[j+1];
				p[j+1] = temp;
				
				temp = w[j];
				w[j] = w[j+1];
				w[j+1] = temp;
			}
		}
	}
}
float knapsack(int m,int n){
	int i;
	for(i=0;i<n;i++)
		x[i] = 0.0;
	float u = m;
	for(i=0;i<n;i++){
		if(w[i] > u)
			break;
		x[i] = 1.0;
		u -= w[i];
	}
	if(i < n)
		x[i] = (u/w[i]);
	float tp=0.0;
	for(i=0;i<n;i++)
		tp += (x[i]*p[i]);
	return tp;
}
void main(){
	int i,n;
	float m;

	printf("Number of object : ");
	scanf("%d",&n);
	printf("Enter profit , weight : \n");
	for(i=0;i<n;i++){
		printf("Obj%d - ",i+1);
		scanf("%f %f",&p[i],&w[i]);
		r[i] = p[i]/w[i];
	}
	printf("Enter capacity : ");
	scanf("%f",&m);
	sort(n);
	float total_profit = knapsack(m,n);
	printf("Solution vector : ");
	for(i=0;i<n;i++){
		printf("%.1f ",x[i]);
	}
	printf("\nTotal profit = %.2f",total_profit);
}
