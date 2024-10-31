// 실행파일에는 여러 변수와 메소드가 존재한다.
// AccountingClassApp의 멤버를 Accounting의 멤버로 바꿈
// class에 넣음으로써 소속관계를 명확히 할 수 있고, 다른 취지의 코드들과 뒤섞여도 상관없음. 
// print와 같이 흔한 이름의 메소들을 사용해도 클래스로 구분되어 있어 영향을 주지 않는다.
class Accounting{
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	
	public static void print() {
		System.out.println("Value of supply :"+ valueOfSupply); // 공급가
		System.out.println("VAT : "+ getVAT() ); // 부가세
		System.out.println("Total : "+ getTotal() ); // 총 지출금액
		System.out.println("Expense : "+ getExpense() ); // 비용
		System.out.println("Income : "+ getIncome() ); // 순 이익
		System.out.println("Dividend1 : "+ getDividend1() ); // 배당금 첫번째 투자자
		System.out.println("Dividend2 : "+ getDividend2() ); // 두번째 투자자
		System.out.println("Dividend3 : "+ getDividend3() ); // 세번째 투자자
	}
	public static double getDividend1() {
		return getIncome() * 0.5;
	}
	public static double getDividend2() {
		return getIncome() * 0.3;
	}
	public static double getDividend3() {
		return getIncome() * 0.2;
	}
	public static double getIncome() {
		return valueOfSupply - getExpense();
	}
	public static double getExpense() {
		return valueOfSupply*expenseRate;
	}
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	public static double getVAT() {
		return valueOfSupply * vatRate;
		}
}
public class AccountingClassApp {

	public static void main(String[] args) {	
		Accounting.valueOfSupply = 10000.0; // Accounting 클래스에서 호출한다.
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
		Accounting.print();
		// anotherVariable = ...; Accounting 내용 외 변수와 메소드가 존재할 수 있다.
		// anotherMethod = ...; 생산성을 떨어뜨릴 수 있음.

	}


}
