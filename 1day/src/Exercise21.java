import java.util.Scanner;

public class Exercise21 {
	
	public static void multi(int x){
		for(int i=1; i<=9; i++){
			System.out.println(x + "*" + i + "=" + x*i);
		}
		System.out.println();
		
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0; //초기화 해주는 습관을 해줘야함 오류날수도 있음.
		System.out.println("단수를 입력하세요.");
		while((number = scanner.nextInt()) != -1){
			multi(number);
		}

	}

}
