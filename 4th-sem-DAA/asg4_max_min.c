#include<stdio.h>
int a[10],n;
int f_max,f_min;
int max(int a,int b){
	return (a>b)?a:b;
}
int min(int a,int b){
	return (a>b)?b:a;
}
void max_min(int i,int j){
	int tmax,tmin;
	if(i==j)
		f_max=f_min=a[i];
	else if(i == j-1){
		if(a[i] > a[j]){
			f_max = a[i];
			f_min = a[j];
		}
		else{
			f_max = a[j];
			f_min = a[i];
		}
	}
	else{
		int mid = (i+j)/2;
		max_min(i,mid);
		tmax = f_max;
		tmin = f_min;
		max_min(mid+1,j);
		f_max = max(f_max,tmax);
		f_min = min(f_min,tmin);
	}	
}
void main(){
	int i;
	printf("Number of element : ");
	scanf("%d",&n);
	printf("Enter element : ");
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	f_max=f_min=a[0];
	max_min(0,n-1);
	printf("Final max = %d\nFinal min = %d",f_max,f_min);
}
