#include<stdio.h>
int a[10],tem[10],n;
void merge(int low,int mid,int high){
	int i,j,k;
	i = k = low;
	j = mid+1;
	while(i <= mid && j <= high){
		if(a[i] <= a[j]){
			tem[k++] = a[i++];
		}
		else{
			tem[k++] = a[j++];
		}
	}
	while(i <= mid){
		tem[k++] = a[i++];
	}
	while(j <= high){
		tem[k++] = a[j++];
	}
	for(i=low;i<=high;i++)
		a[i] = tem[i];
}
void mergesort(int low,int high){
	if(low < high){
		int mid = (low+high)/2;
		mergesort(low,mid);
		mergesort(mid+1,high);
		merge(low,mid,high);
	}
}
void display(){
	int i;
	printf("Sorted array : ");
	for(i=0;i<n;i++){
		printf("%d ",a[i]);
	}
}
void main(){
	int i;
	printf("Number of element : ");
	scanf("%d",&n);
	printf("Enter elements : ");
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	mergesort(0,n-1);
	display();
}
