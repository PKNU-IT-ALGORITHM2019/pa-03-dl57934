#include <stdio.h>
#define MAX_SIZE 100001

int arr[MAX_SIZE];

void insertionSort(int arr[], int n);

int main(){

}

void insertionSort(int arr[], int n){
	int j = 0;
	for(int i = 1; i < n; i++){
		int key = arr[i];
		for(j = i-1; j >= 0; j--){
			if(key > arr[j])
				arr[j+1] = arr[j];
		}
		arr[j+1] = key;
	}

}