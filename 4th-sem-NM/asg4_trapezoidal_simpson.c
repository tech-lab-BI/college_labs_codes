#include<stdio.h>
#include<math.h>
float f(float x){
	float t = (x*sin(x))+pow(x,3);
	return t;
}
int main(){
	int i,n;
	float a,b,h,sum=0.0,result;
	printf("Lower , Upper , Interval : ");
	scanf("%f %f %d",&a,&b,&n);
	h = (b-a)/(1.0*n);
	
	
	//trapezoidal
	for(i=0;i<n;i++)
		sum += f(a+(i+0)*h)+f(a+(i+1)*h);
	result = (h/2.0)*sum;
	printf("Result = %.3f",result);	
	
	
	//simpson
	sum = 0.0;
	if(n%2 != 0){
		printf("n must be even!");
		return 0;
	}
	for(i=0;i<n;i+=2){
		sum += f(a+(i+0)*h)+4*f(a+(i+1)*h)+f(a+(i+2)*h);
	}
	result = (h/3.0)*sum;
	printf("Result = %.3f",result);
	
	
	return 0;
}
