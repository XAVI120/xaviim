import java.util.Scanner;

public class Homework1 {
	
	public static boolean isEnableTriangle(int x, int y, int z) {  //isEnalbeTriangle �޼ҵ�: 3���� ������ ���ڰ� �ﰢ���� �Ǵ��� �Ǻ�
		if(x+y>z && x+z>y && y+z>x)
			return true;
		return false;
	}
	

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int input = a.nextInt();
		if(isEnableTriangle(input, input, input) == false)
			System.out.println("�ﰢ���� ����� ����");
		
		    
			else
				System.out.println("�ﰢ���� ����� ����");
		
		
				
		
			
		
		}

}
