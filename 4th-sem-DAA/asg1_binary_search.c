#include<stdio.h>
int a[10],n;
int binsrch(i,l,x){//nondecreasing
	if(i==l){
		if(x == a[i])
			return i;
		else
			return -1;
	}
	else{
		int mid = (i+l)/2;
		if(x == a[mid])
			return mid;
		else if(x < a[mid])
			return binsrch(i,mid-1,x);
		else
			return binsrch(mid+1,l,x);
	}
}
void main(){
	int i,x;
	printf("How many element : ");
	scanf("%d",&n);
	printf("Enter elements as nondecresing order : ");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	printf("Enetr search element : ");
	scanf("%d",&x);
	int index = binsrch(0,n-1,x);
	if(index == -1)
		printf("%d is not found",x);
	else
		printf("%d found at index %d",x,index);
}
