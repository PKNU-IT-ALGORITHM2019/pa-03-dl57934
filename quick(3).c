#include <stdio.h>
#define MAX_SIZE 100001

int arr[MAX_SIZE];

void quicksort(int start, int end);
int partition(int start, int end);
int getRandPivot();
void swap(int a, int b);

int main(){

}

void quicksort(int start, int end){
	if(start < end){
		int mid = partition(start, end);
		if(start < mid)
			quicksort(start, mid-1);
		if(mid < end)
			quicksort(mid, end);
	}
}

int partition(int start, int end){
	int pivot = arr[getRandPivot()];

	while(start <= end){
		while(pivot > arr[start])start++;
		while(pivot < arr[end])end--;
		if(start <= end){
			swap(start, end);
			start++;
			end--;
		}
	}

	return start;
}

int getRandPivot(){
	return rand()%MAX_SIZE;
}

void swap(int a, int b){
 int temp = arr[a];
 arr[a] = arr[b];
 arr[b] = temp; 
}