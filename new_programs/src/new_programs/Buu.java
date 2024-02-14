package new_programs;

public class Buu {
	static void bubblesort(int arr[]) {
		int n = arr.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {3,83,0,33,22};
		bubblesort(arr);
//		for(int i=0;i<=arr.length;i++) {
		for(int i=arr.length-1;i<=0;i--) {
		System.out.println(arr[i]+" ");
		}
	}
}
