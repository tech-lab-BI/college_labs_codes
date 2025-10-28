#include<stdio.h>
#define INF 99999
int k,u,v,n,i,j,min,mincost=0;
int visited[10],g[10][10];
int prims(){
	int edge = 1;
	for(i=1;i<=n;i++){
		visited[i] = 0;
	}
	visited[1] = 1;
	while(edge < n){
		min = INF;
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				if(g[i][j] && visited[i]==1 && visited[j] == 0){
					if(min > g[i][j]){
						min = g[i][j];
						u = i;
						v = j;
					}
				}
			}
		}
		visited[u] = visited[v] = 1;
		mincost += min;
		edge++;
	}
	return mincost;
}
void main(){
	printf("Number of vertics : ");
	scanf("%d",&n);
	printf("Enter adjacency matrix :\n");
	for(i=1;i<=n;i++){
		for(j=1;j<=n;j++){
			scanf("%d",&g[i][j]);
			if(i != j && g[i][j] == 0){
				g[i][j] = INF;
			}
		}
	}
	int cost = prims();
	printf("MIn cost = %d",cost);
}
