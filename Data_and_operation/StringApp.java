
public class StringApp {

	public static void main(java.lang.String[] args) {
		System.out.println("Hello World"); // String 문자열
		System.out.println('H'); // Character 작은 따옴표는 한글자만 가능. 의미가 달라짐
		System.out.println("H"); // String 문자열
		
		System.out.println("Hello World"); // 줄바꿈을 하면 자바는 인식을 못함.
		System.out.println("Hello "
				+ "World");
		// \n : new line
		System.out.println("Hello \nWorld"); // 줄바꿈 가능.
		
		// \" : escape
		// System.out.println("Hello" + ""World"");
		System.out.println("Hello \"World\""); // Hello "World" 만들기
	}

}
