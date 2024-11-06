import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter; // 이 파일내 PrintWriter 이름의 클래스는 java.io에 소속된 것이다

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		// p1은 printWriter 클래스의 인스턴스만 들어감.
		PrintWriter p1 = new PrintWriter("result1.txt"); // printWriter 클래스의 인스턴스가 p1 변수에 담김. 
		// 그래도 빨간 줄이 있는경우 : 파일을 읽다보면, 파일이 없으면 문제가 됨. = 예외상황. 예외를 어떻게 처리할지 정의해야 함. 
		// 아직 다루기엔 이르니, 빨간줄 누르고 add throws declaration > IOException 으로 처리함.
		p1.write("Hello 1"); // 작업할 내용
		p1.close(); // 작업 후 파일을 잡고 있지 않도록, 남도 수정이 가능하도록 함.
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2"); 
		p2.close();
		System.out.println(p1.toString());
		p2.toString();
		p2.write("hello 2"); // PrintWriter에 있는 write 기능을 사용함.
	}

}
