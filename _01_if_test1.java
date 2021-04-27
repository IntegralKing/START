package mymain;

public class _01_if_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="50미만";
		
		int su=49;
		
		if(su>=50) {
			str="50이상";
		}
		
		// String str;
		//The local variable str may not have been initialized
		//str변수를 초기화 하지 않았기 때문에 발생하는 에러
		System.out.printf("%d는 %s입니다\n", su, str);

	}

}
