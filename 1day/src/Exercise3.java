import java.util.Scanner;
public class Exercise3 {
	
	
    public static boolean isAlphabet(char a) { // 알파벳인지 아닌지 판별하는 메소드
    	if((a >= 'A' && a <= 'Z') ||(a>='a' && a<='z'))   // what does that mean?? 파란색 글씨
    		return true;
    	return false;
    }
    
  public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	char result=0;
    	
    	char input = scanner.next().charAt(0);            // charAt ???
    	if(isAlphabet(input) == false){
			System.out.println("영문자가 아닙니다.");
		}
		else{
			if(Character.isUpperCase(input)){
				result = Character.toLowerCase(input);
			}
			else
				result = input;
	}

		System.out.println(result);
    }
}


//import 같은경우 int밖에 안되므로 케릭터형을 선언하고 저장해야함