import java.util.Scanner;
public class Exercise3 {
	
	
    public static boolean isAlphabet(char a) { // ���ĺ����� �ƴ��� �Ǻ��ϴ� �޼ҵ�
    	if((a >= 'A' && a <= 'Z') ||(a>='a' && a<='z'))   // what does that mean?? �Ķ��� �۾�
    		return true;
    	return false;
    }
    
  public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	char result=0;
    	
    	char input = scanner.next().charAt(0);            // charAt ???
    	if(isAlphabet(input) == false){
			System.out.println("�����ڰ� �ƴմϴ�.");
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


//import ������� int�ۿ� �ȵǹǷ� �ɸ������� �����ϰ� �����ؾ���