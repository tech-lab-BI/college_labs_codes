#include<stdio.h>
#include<math.h>

int x[10];

void display(int n){
	int i,j;
	for(i=1;i<=n;i++){
		printf("%d ",x[i]);
	}
	printf("\n");
}

int Place(int k,int i){
	int j;
	for(j=1;j<=k-1;j++){
		if((x[j] == i) || (abs(x[j]-i) == abs(j-k)))
			return 0;
	}
	return 1;
}

void Nqueen(int k,int n){//k = queen no = row no
	int i;
	for(i=1;i<=n;i++){
		if(Place(k,i)){
			x[k] = i;
			if(k == n)
				display(n);
			else
				Nqueen(k+1,n);
		}
	}
}

void main(){
	int n;
	printf("Number of queen : ");
	scanf("%d",&n);
	Nqueen(1,n);
}

