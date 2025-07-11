package p146;

public class ReturnArray {
	static int[] mdarr() {
		int temp[] = new int[4];
		for(int i=0; i<temp.length; i++) {
			temp[i] = i;
		}
		return temp;
	}
		
	public static void main(String[] args) {
		int arr[];
		arr = mdarr();
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}		
	}
}
