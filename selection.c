#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#define MAX_SIZE 100001
#define VER1 1
#define VER2 2
#define VER3 3

int arr[MAX_SIZE];
void selectionSort(int n);
void swap(int x, int y);
void arrayRandomInit(int size);
float getSpendTime(clock_t start, clock_t end);
void arrayReverseInit(int size);

int main(){

}

void selectionSort(int n){
	for(int i = 0; i < n-1; i++){
		int least = i;

		for(int j=i+1; j < n; j++)
			if(arr[j] < arr[least])
				least = j;

		if(i != least)
			swap(i, least);
	}
}

void swap(int x, int y){
	int temp = arr[x];
	arr[x] = arr[y];
	arr[y] = temp;
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

