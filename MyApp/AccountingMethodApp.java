// vat 코드가 1억줄 짜리 코드 또는 복잡한 코드라면, 그 수식을 getVAT()에 넣고 다른곳에 숨겨놓으면 애플리케이션이 단순해지지 않을까?
// 그것이 메소드. 메소드를 도입해서 이전보다 사용하기 단정한 코드를 만들 수 있다.
public class AccountingMethodApp {
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {	
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		print();

	}
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
