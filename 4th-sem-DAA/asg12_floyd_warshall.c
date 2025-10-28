#include<stdio.h>
#define INF 99999

int g[10][10],d[10][10],p[10][10];
void floyd_warshall(int n){
	int i,j,k;
	for(i=1;i<=n;i++){
		for(j=1;j<=n;j++){
			d[i][j] = g[i][j];
			p[i][j] = 0;//no vertex
		}
	}
	
	for(k=1;k<=n;k++){
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				if(d[i][j] > (d[i][k]+d[k][j])){
					d[i][j] = (d[i][k]+d[k][j]);
					p[i][j] = k;
				}
			}
		}
	}
}

void display(int n){
	int i,j;
	printf("Distance matrix : \n");
	for(i=1;i<=n;i++){
		for(j=1;j<=n;j++)
			printf("%d ",d[i][j]);
		printf("\n");
	}
	printf("\nVertex matrix : \n");
	for(i=1;i<=n;i++){
		for(j=1;j<=n;j++)
			printf("%d ",p[i][j]);
		printf("\n");
	}
}

void main(){
	int i,j,n;
	printf("Number of vertics : ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		for(j=1;j<=n;j++){
			scanf("%d",&g[i][j]);
			if(i != j && g[i][j] == 0)
				g[i][j] = INF;
		}
			
	}
	floyd_warshall(n);
	display(n);
}
