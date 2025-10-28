#include<stdio.h>

int id[10],deadline[10],profit[10],slot[10];

void js(int n){
	int i,j,max_D_i=0,temp;
	for(i=1;i<n-1;i++){
		if(deadline[max_D_i] < deadline[i]){
			max_D_i = i;
		}
	}
	for(i=0;i<=max_D_i;i++){
		slot[i] = -1;
	}
	for(i=0;i<n-1;i++){
		for(j=0;j<n-i-1;j++){
			if(profit[j] < profit[j+1]){
				// Swap profit
                int temp = profit[j];
                profit[j] = profit[j + 1];
                profit[j + 1] = temp;

                // Swap deadline
                temp = deadline[j];
                deadline[j] = deadline[j + 1];
                deadline[j + 1] = temp;

                // Swap job ID
                temp = id[j];
                id[j] = id[j + 1];
                id[j + 1] = temp;
            }
			}
		}
	
	for (i = 0; i < n; i++) {
        for (j = deadline[i]; j > 0; j--) {
            if (slot[j] == -1) {
                slot[j] = i; // assign job index to time slot
//                totalProfit += profit[i];
                break;
            }
        }
    }
	for(i=1;i<=max_D_i;i++){
		printf("%d ",id[slot[i]]);
	}
}

void main(){
	int i,n;
	
	printf("Number of jobs : ");
	scanf("%d",&n);
	printf("Enter job details :\n");
	for(i=0;i<n;i++){
		printf("D%d & P%d = ",(i+1),(i+1));
		id[i] = i+1;
		scanf("%d %d",&deadline[i],&profit[i]);
	}
	js(n);
}
