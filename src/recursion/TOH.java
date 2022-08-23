package recursion;

public class TOH {

	public static void toh(int n, int s, int h, int d) {
		if(n == 0) {
			return;
		}
		
		// base condition
		if(n == 1) {
			System.out.println("Move Plate " + n + " from " + s + " to " + d);
			return;
		}
		
		// hyppthesis
		toh(n-1,s,d,h);
		
		// Induction step
		System.out.println("Move Plate " + n + " from " + s + " to " + d);
		toh(n-1,h,s,d);
	}
	
	public static void main(String[] args) {
		int n = 3;
		int s = 1;
		int h = 2;
		int d = 3;
		toh(n,s,h,d);
	}

}
