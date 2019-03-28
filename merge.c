#include <stdio.h>
#include <time.h>
#define MAX_SIZE 100003

int arr[MAX_SIZE];

void mergesort(int start, int end);
void merge(int start, int mid, int end);
void arrayReverseInit(int size);

void arrayRandomInit(int size);
float getSpendTime(clock_t start, clock_t end);


int main(){
	clock_t start, end;
	arrayRandomInit(100000);
	start = clock();
	mergesort(0, 99999);
	end = clock();
	for(int i = 0; i < 100000; i++)
		printf("%d\n", arr[i]);
	printf("%f", getSpendTime(start, end));
}

void mergesort(int start, int end){
	if(start < end){
		int mid = (start+end)/2;
		mergesort(start, mid);
		mergesort(mid+1, end);
		merge(start, mid, end);
	}
}
void merge(int start, int mid, int end){
	int temp[100001];
	for(int i = start; i <= end; i++)
		temp[i] = arr[i];

	int part1 = start, index = start;
	int part2 = mid+1;

	while(part1 <= mid && part2 <= end){
		if(temp[part1] < temp[part2]){
			arr[index] = temp[part1];
			part1++;
		}else {
			arr[index] = temp[part2];
			part2++;
		}
		index++;
	}

	for(int i = 0; i <= mid-part1; i++)
		arr[i+index] = temp[part1+i];
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