#include<stdio.h>
#define INF 999999
int p[10];
int m[10][10],s[10][10];
void mco(int dim){
	int i,j,k,l,q,n;

	n = dim-1;
	for(i=1;i<=n;i++){
		m[i][i] = 0;//diagonal
	}
	for(l=2;l<=n;l++){
		for(i=1;i<=n-l+1;i++){
			j = i+l-1;
			m[i][j] = INF;
			for(k=i;k<=j-1;k++){
				q = m[i][k]+m[k+1][j]+(p[i-1]*p[k]*p[j]);
				if(m[i][j] > q){
					m[i][j] = q;
					s[i][j] = k;
				}
			}
		}
	}
}
void pop(int i,int j){
	if(i == j)
		printf("A%d",i);
	else{
		printf("(");
		pop(i,s[i][j]);
		pop(s[i][j]+1,j);
		printf(")");
	}
}
void main(){
	int i,dim;
	printf("Number of dimentions : ");
	scanf("%d",&dim);
	printf("Enter dimention : ");
	for(i=0;i<dim;i++)
		scanf("%d",&p[i]);
	mco(dim);
	pop(1,dim-1);
	printf("Optimal solution = %d",m[1][dim-1]);
}
