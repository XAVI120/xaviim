import java.util.Scanner;

public class Exercise11 {
	
	public static void Sigma(int x, int y){  //�߰����� ����ϰ� ��°��� ���;��ϹǷ� void int�� ����ϸ� ��°��� ��� �Ѵٰ� ������.
		int sum = 0;
		for(int i=x; i<=y; i++){
			sum += i;  // �� ǥ���� sum + i ��� �Ҹ�
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
