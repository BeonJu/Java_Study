package Ex.chapter1_01;

public class Ref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[];
		int arr2[];
		int arr3[];
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = new int[3];
//		arr2에서 0번 자리 부터 arr3번에 0번자리에 arr2 내용 갯수 만큼 복붙
		System.arraycopy(arr2, 0, arr3, 0, arr2.length);
		
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3); 
	}

}
