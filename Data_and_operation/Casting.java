
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1; // �� �� ��������� ��ȯ.
		
		System.out.println(b); // �������� ������ ��涧, ������ �Ǽ����̶� �ڵ����� converting�� ��.
		
//		int c = 1.1;  �������� �Ǽ����� �������ϸ� ������ ������ ��
		double d = 1.1;
		int e = (int) 1.1; // double�� int�� �ٲٸ� �ս��� �Ͼ�Ƿ� �ݵ�� ��������� ����ȯ�� �ؾ� ��
		System.out.println(e);
		
		// 1 to sting : java int to casting���� ���۸�
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		

	}

}
