#include <stdio.h>
#include <time.h>
#define MAX_SIZE 100001

int arr[MAX_SIZE];

void arrayRandomInit(int size);
float getSpendTime(clock_t start, clock_t end);
void arrayReverseInit(int size);
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

void arrayRandomInit(int size){
	for(int i = 0; i < size ; i++)
		arr[i]= rand()%size;
}

float getSpendTime(clock_t start, clock_t end){
	return (float)(end - start)/CLOCKS_PER_SEC;
}

void arrayReverseInit(int size){
	for(int i = size; i >= 0; i-- )
		arr[i] = i;
}