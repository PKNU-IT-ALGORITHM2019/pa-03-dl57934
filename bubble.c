#include <stdio.h>
#include <time.h>
#define MAX_SIZE 100001

int arr[MAX_SIZE];

void bubbleSort(int N);
void selectionSort(int n);
void swap(int a, int b);
void arrayRandomInit(int size);
float getSpendTime(clock_t start, clock_t end);
void arrayReverseInit(int size);

int main(){
	arrayReverseInit(99999);
	clock_t start = clock();
	bubbleSort(99999);
	clock_t end = clock();
	
	for(int i = 0; i <= 99999; i++)
		printf("%d\n", arr[i]);
	printf("%f",getSpendTime(start, end));
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