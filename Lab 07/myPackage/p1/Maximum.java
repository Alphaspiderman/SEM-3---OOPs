package myPackage.p1;

public class Maximum {
	public static int max(int a, int b, int c) {
		int max_val;
		if (a>=b && a>=c) {
			max_val = a;
		}
		else if (b>=a && b>=c) {
			max_val = b;
		}
		else {
			max_val = c;
		}
		return max_val;
	}
	
	public static int max(int[] arr) {
		int max_val;
		max_val = arr[0];
		for(int i : arr) {
			if (i >= max_val) {
				max_val = i;
			}
		}
		return max_val;
	}
	
	public static int max(int[][] mat) {
		int max_val;
		max_val = mat[0][0];
		for(int[] i : mat) {
			for(int j:i) {
				if (j >= max_val) {
					max_val = j;
				}
			}
		}
		return max_val;
	}
	
	public static float max(float a, float b, float c) {
		float max_val;
		if (a>=b && a>=c) {
			max_val = a;
		}
		else if (b>=a && b>=c) {
			max_val = b;
		}
		else {
			max_val = c;
		}
		
		return max_val;
	}
}
