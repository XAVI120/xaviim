import java.util.Scanner;

public class Homework2 {
	
	public static double triangle(double x1, double y1, double x2, double y2, double x3, double y3){
		return((x1*y2+x2*y3+x3*y1)-(x2*y1+x3*y2+x1*y3))*(1/2);
	}

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		double result=0;
		
		double input =a.nextDouble();
		if(triangle(input, input, input, input, input, input) == 0)
			System.out.println("삼각형이 아니므로 면적을 구할수 없다.");

		    else
				{result = triangle(input, input, input, input, input, input);}
		
		System.out.println("삼각형의 면적은" + result + "입니다.");
			
				
	}

}
