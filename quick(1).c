#include <stdio.h>
#include <stdlin.h>
#define MAX_SIZE 100001

int arr[MAX_SIZE];

void quicksort(int start, int end);
int partition(int start, int end);
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
	int pivot = arr[end];

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

void swap(int a, int b){
 int temp = arr[a];
 arr[a] = arr[b];
 arr[b] = temp; 
}