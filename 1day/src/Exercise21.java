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
		int number = 0; //�ʱ�ȭ ���ִ� ������ ������� ���������� ����.
		System.out.println("�ܼ��� �Է��ϼ���.");
		while((number = scanner.nextInt()) != -1){
			multi(number);
		}

	}

}
