
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1; // 좀 더 명시적으로 변환.
		
		System.out.println(b); // 정수지만 변수에 담길때, 변수가 실수형이라서 자동으로 converting이 됨.
		
//		int c = 1.1;  정수형에 실수형을 담으려하면 컨버팅 오류가 남
		double d = 1.1;
		int e = (int) 1.1; // double을 int로 바꾸면 손실이 일어나므로 반드시 명시적으로 형변환을 해야 함
		System.out.println(e);
		
		// 1 to sting : java int to casting으로 구글링
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		

	}

}
