package algorithm;

import java.lang.reflect.Array;

interface Sort{ 
	void bubbleSort(int[] arr);
	void insertSort(int[] arr);
	void selectSort(int[] arr);
}

class WorkArr implementsSort{


/* 버블정렬
* 시간복잡도 : O(n**2)
* 설명 : 바로 옆의 요소랑 하나하나 비교하여 전체를 비교하는 방식
* 특징 : 시간복잡도가 일정. 전체를 비교하는 swap 알고리즘이라 비효율적이다.
*/

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
		
		//버블정렬
		System.out.println("버블정렬 결과 출력");
		wa.bubbleSort(a);
		wa.printArr(a);
		

	}

}
