package myPackages.p1;
public class Max {
	public static int max(int x, int y, int z) {
		int temp = x > y ? x : y;
		int result = z > temp ? z : temp ;
		return result;
	}
	public static float max(float x, float y, float z) {
		float temp = x > y ? x : y;
		float result = z > temp ? z : temp ;
		return result;
	}
	public static int max(int [] arr) {
		int maximum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maximum) {
				maximum = arr[i];
			}
		}
		return maximum;
	}
	public static int max(int [][] arr) {
		int maximum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > maximum) {
					maximum = arr[i][j];
				}
			}
		}
		return maximum;
	}
}
