package mymain;

public class _01_if_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="50�̸�";
		
		int su=49;
		
		if(su>=50) {
			str="50�̻�";
		}
		
		// String str;
		//The local variable str may not have been initialized
		//str������ �ʱ�ȭ ���� �ʾұ� ������ �߻��ϴ� ����
		System.out.printf("%d�� %s�Դϴ�\n", su, str);

	}

}
