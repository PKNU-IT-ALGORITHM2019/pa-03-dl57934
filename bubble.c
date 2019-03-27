#include <stdio.h>
#define MAX_SIZE 100001

int arr[MAX_SIZE];

void bubbleSort(int N);
void swap(int a, int b);

int main(){
	
}

void bubbleSort(int N){
	for(int i = 0; i < N; i++){
		for(int j = i+1; j < N; j++){
			if(arr[i] > arr[j])
				swap(i, j);
		}
	}
}

void swap(int a, int b){
	int temp = arr[a];
	arr[a] = arr[b];
	arr[b] = temp;
}