
public class Exercise1 {
	
	public static int Max(int a, int b){
		if(a>b)
			return a;
		else
			return b;
	}
	
	public static double Max(double a, double b){
		if(a>b)
			return a;
		else
			return b;
	}
	public static void main(String[] args) {
		System.out.println("4와 3중 큰 수는" + Max(4,3) + "입니다. 5.5와 5.2 중 큰 수는" + Max(5.5, 5.2) + "입니다.");


	}

}
