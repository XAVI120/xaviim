
public class Problem71 {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		intArray[0] = 0;
		
		
		try{
		for (int i = 0; i <= 5; i++) {  //i<=4�� �ϸ� ������ try catch �������� ��ƺ���.
			intArray[i] = i + intArray[i];
			
			
			System.out.println("intArray[" + i + "]=" + intArray[i]);
		}
		}
			catch(ArrayIndexOutOfBoundsException e){ //Exception e �� ���൵ ������ �α׸� ��� ����ó���� �ϸ� �ϳ��ۿ� ó�� ���ϹǷ� ������ ���� ���ִ� ���� ����. �׷��� �� ���ִ°�.
				System.out.println("�����߻�");
			
			}
			}
}


