#include <stdio.h>
#define MAX_SIZE 100001

int arr[MAX_SIZE];
void selectionSort(int n);
void swap(int x, int y);

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
