import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter; // �� ���ϳ� PrintWriter �̸��� Ŭ������ java.io�� �Ҽӵ� ���̴�

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		// p1�� printWriter Ŭ������ �ν��Ͻ��� ��.
		PrintWriter p1 = new PrintWriter("result1.txt"); // printWriter Ŭ������ �ν��Ͻ��� p1 ������ ���. 
		// �׷��� ���� ���� �ִ°�� : ������ �дٺ���, ������ ������ ������ ��. = ���ܻ�Ȳ. ���ܸ� ��� ó������ �����ؾ� ��. 
		// ���� �ٷ�⿣ �̸���, ������ ������ add throws declaration > IOException ���� ó����.
		p1.write("Hello 1"); // �۾��� ����
		p1.close(); // �۾� �� ������ ��� ���� �ʵ���, ���� ������ �����ϵ��� ��.
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2"); 
		p2.close();
		System.out.println(p1.toString());
		p2.toString();
		p2.write("hello 2"); // PrintWriter�� �ִ� write ����� �����.
	}

}
