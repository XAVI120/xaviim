import java.util.Scanner;

public class Exercise11 {
	
	public static void Sigma(int x, int y){  //중간값도 계산하고 출력값도 나와야하므로 void int로 사용하면 출력값만 계산 한다고 생각함.
		int sum = 0;
		for(int i=x; i<=y; i++){
			sum += i;  // 이 표현은 sum + i 라는 소리
			System.out.print(i);
			if(i==y){
				System.out.print("=");
				System.out.println(sum);
			}
			else
				System.out.println("+");
		}
		
	}
		 
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int start = scanner.nextInt(); 
		int end = scanner.nextInt();
		
		Sigma(start, end);
		
		
		

	}

}
