#include<stdio.h>

int g[10][10],visited[10];
int stack[10],top=-1,n;
int queue[10],front=-1,rear=-1;

//dfs - stack
void push(int x){
	stack[++top] = x;
}
int pop(){
	return stack[top--];
}
int isEmptyS(){
	if(top == -1) return 1;
	else return 0;
}
void dfs(int v){
	int c,j;
	push(v);
	visited[v] = 1;
	while(!isEmptyS()){
		c = pop();
		printf("%d -> ",c);
		for(j=n;j>=1;j--){
			if(g[c][j] && !visited[j]){
				push(j);
				visited[j] = 1;
			}
		}
	}
}

//bfs - queue
void enq(int x){
	if(front == -1){
		front++;
	}
	queue[++rear] = x;
}
int deq(){
	int x;
	if(rear == front){
		x = queue[front];
		rear = front = -1;
	}
	else{
		x = queue[front++];	
	}
	return x;
}
int isEmptyQ(){
	if(rear == -1){
		return 1;
	}
	else{
		return 0;
	}
}
void bfs(int v){
	int c,j;
	enq(v);
	visited[v] = 1;
	while(!isEmptyQ()){
		c = deq();
		printf("%d -> ",c);
		for(j=1;j<=n;j++){
			if(g[c][j] && !visited[j]){
				enq(j);
				visited[j] = 1;
			}
		}
	}
}

void main(){
	int i,j,v;
	printf("Number of vertics : ");
	scanf("%d",&n);
	printf("Enter adjacency matrix : \n");
	for(i=1;i<=n;i++){
		for(j=1;j<=n;j++){
			scanf("%d",&g[i][j]);
		}
	}
	printf("Enter start vertex : ");
	scanf("%d",&v);
//	dfs(v);
	bfs(v);
}
