package inter;

import java.lang.reflect.Array;

interface Sort{ //배열의 정렬 알고리즘
	void bubbleSort(int[] arr);
	void insertSort(int[] arr);
	void selectSort(int[] arr);
}

class WorkArr implements Sort{


/* 삽입정렬
 * 시간복잡도 : n**2
 * 설명 : 왼쪽에 있는 항목들은 정렬된 것으로 가정하고, 증가하는 인덱스의 값을 삽입
 * 정렬 대상이 적거나 이미 부분 정렬되어있는 상황에 효율적. 선택, 버블보다 빠름
 */
		@Override
	public void insertSort(int[] arr) { 
		int i,j,key = 0;
		for(i=1; i<arr.length; i++) {
			key = arr[i];
			j = i-1;
			while(j>=0 && arr[j]>key ) { 		
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
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
		
		
		//삽입정렬
		System.out.println("삽입정렬 결과 출력");
		wa.insertSort(a);
		wa.printArr(a);
		
	}

}
