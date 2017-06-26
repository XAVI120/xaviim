import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
      Scanner rd = new Scanner(System.in);
      int divisor = 0;
      int dividend = 0;
      
      System.out.print("나뉨수를 입력하시오:");
      dividend = rd.nextInt();
      System.out.print("나뉨수를 입력하시오:");
      divisor = rd.nextInt();
      
      try{//예외가 생기는 부분
    	  
    	  System.out.println("안녕"); //예외 없을때 안나오는 이유: 예외가 발생 할경우만 발생
      
      System.out.println(dividend + "를" + divisor + "로 나누면 몫은" + dividend/divisor + "입니다.");
	}
    catch(ArithmeticException e){//예외가 발생했을때 잡아준다
        System.out.println("0을 입력하셨습니다.");   
        }
      finally{
    	  System.out.println("끝"); //예외 발생시 발생되는 구문
      }
}
}