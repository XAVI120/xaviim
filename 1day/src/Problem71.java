
public class Problem71 {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		intArray[0] = 0;
		
		
		try{
		for (int i = 0; i <= 5; i++) {  //i<=4로 하면 되지만 try catch 구문으로 잡아본다.
			intArray[i] = i + intArray[i];
			
			
			System.out.println("intArray[" + i + "]=" + intArray[i]);
		}
		}
			catch(ArrayIndexOutOfBoundsException e){ //Exception e 만 써줘도 되지만 싸그리 묶어서 예외처리를 하면 하나밖에 처리 못하므로 각각을 구문 해주는 것이 좋다. 그래서 다 써주는것.
				System.out.println("에러발생");
			
			}
			}
}


