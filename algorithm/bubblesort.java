package algorithm;

import java.lang.reflect.Array;

interface MinMax{ //배열의 최대,최소
	int arrMin(int[] arr);
	int arrMax(int[] arr);
}

interface Sort{ //배열의 정렬 알고리즘
	void bubbleSort(int[] arr);
	void insertSort(int[] arr);
	void selectSort(int[] arr);
}

interface Search{
	int sequentialSerch(int[] arr,int val); //순차탐색 그냥 하던대로 맨앞에서부터 끝까지 비교. 성능이 떨어진다
	int binarySearch(int[] arr,int val); //이진탐색 탐색의 범위를 반반반 줄여줌. 
}

class WorkArr implements MinMax,Sort,Search{

	@Override
	public void bubbleSort(int[] arr) {
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = 0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}


	@Override
	public int arrMin(int[] arr) {
		int min=arr[0];
		for(int i : arr) {
			if(min>i)
				min = i;
		}
		return min;
	}

	@Override
	public int arrMax(int[] arr) {
		int max=arr[0];
		for(int i : arr) {
			if(max<i)
				max = i;
		}
		return max;
	}

	public void printArr(int[] arr) {
		for( int i : arr)
			System.out.print(i +" ");
		System.out.println();
	}
	
}

public class Test1Main {

	public static void main(String[] args) {
		WorkArr wa = new WorkArr();
		int[] a = {7,4,2,6,9,1,8,3,5};
		int[] b = {7,4,2,6,9,1,8,3,5}; // 초기화용 배열
		System.out.println("==================초기 배열 출력=================");
		wa.printArr(a);
		
		System.out.println("최대값: "+wa.arrMax(a));
		System.out.println("최소값: "+wa.arrMin(a));
		
		//버블정렬
		System.out.println("버블정렬 결과 출력");
		wa.bubbleSort(a);
		wa.printArr(a);
		

	}

}
