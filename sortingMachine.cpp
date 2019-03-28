#include <cstdio>

void bubbleSort(int N);
void swap(int a, int b);
void arrayRandomInit(int size);
float getSpendTime(clock_t start, clock_t end);
void arrayReverseInit(int size);
int getMidPivot(int start ,int end);

int main(){

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


int getMidPivot(int start ,int end){
	int mid = arr[(start+end)/2];
	int first = arr[start];
	int end = arr[end]; 
	if((first>=mid && mid>=end) || (end>=mid && mid>=first))
		return arr[mid];
	else if((mid>=first && first>=end) || (end>=first && first>=mid))
		return arr[first];
	else 
		return arr[end];
}