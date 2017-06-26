import java.util.Scanner;

public class Homework1 {
	
	public static boolean isEnableTriangle(int x, int y, int z) {  //isEnalbeTriangle 메소드: 3개의 대입한 숫자가 삼각형이 되는지 판별
		if(x+y>z && x+z>y && y+z>x)
			return true;
		return false;
	}
	

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int input = a.nextInt();
		if(isEnableTriangle(input, input, input) == false)
			System.out.println("삼각형을 만들수 없음");
		
		    
			else
				System.out.println("삼각형을 만들수 있음");
		
		
				
		
			
		
		}

}
