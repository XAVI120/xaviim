
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
		System.out.println("4�� 3�� ū ����" + Max(4,3) + "�Դϴ�. 5.5�� 5.2 �� ū ����" + Max(5.5, 5.2) + "�Դϴ�.");


	}

}
