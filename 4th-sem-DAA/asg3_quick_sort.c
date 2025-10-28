#include<stdio.h>
int a[10],tem[10],n;
int partition(int low,int high){
	int i,j,p,pivot,t;
	i = low;
	j = high;
	pivot = a[i];
	p = i;
	while(i < j){
		while(a[i] <= pivot && i<high)
			i++;
		while(a[j] >= pivot && j>low)
			j--;
		if(i < j){
			t = a[i];
			a[i] = a[j];
			a[j] = t;
		}	
	}
	t = a[j];
	a[j] = a[p];
	a[p] = t;
	return j;
}
void quicksort(int low,int high){
	if(low < high){
		int q = partition(low,high);
		quicksort(low,q-1);
		quicksort(q+1,high);
	}
}
void display(){
	int i;
	printf("Sorted array : ");
	for(i=0;i<n;i++)
		printf("%d ",a[i]);
}
void main(){
	int i;
	printf("Number of element : ");
	scanf("%d",&n);
	printf("Eneter elements : ");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	
	quicksort(0,n-1);
	display();
}
