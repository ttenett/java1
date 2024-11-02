// 실행파일에는 여러 변수와 메소드가 존재한다.
// AccountingClassApp의 멤버를 Accounting의 멤버로 바꿈
// class에 넣음으로써 소속관계를 명확히 할 수 있고, 다른 취지의 코드들과 뒤섞여도 상관없음. 
// print와 같이 흔한 이름의 메소들을 사용해도 클래스로 구분되어 있어 영향을 주지 않는다.
class Accounting{
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	public void print() {
		System.out.println("Value of supply :"+ valueOfSupply); // 공급가
		System.out.println("VAT : "+ getVAT() ); // 부가세
		System.out.println("Total : "+ getTotal() ); // 총 지출금액
		System.out.println("Expense : "+ getExpense() ); // 비용
		System.out.println("Income : "+ getIncome() ); // 순 이익
		System.out.println("Dividend1 : "+ getDividend1() ); // 배당금 첫번째 투자자
		System.out.println("Dividend2 : "+ getDividend2() ); // 두번째 투자자
		System.out.println("Dividend3 : "+ getDividend3() ); // 세번째 투자자
	}

	public double getDividend1() {
		return getIncome() * 0.5;
	}
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	public double getDividend3() {
		return getIncome() * 0.2;
	}
	public double getIncome() {
		return valueOfSupply - getExpense();
	}
	public double getExpense() {
		return valueOfSupply*expenseRate;
	}
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
	public double getVAT() {
		return valueOfSupply * vatRate;
		}
}
class Accounting1{
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
class Accounting2{
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
		// 예제 1)
//		Accounting.valueOfSupply = 10000.0; // Accounting 클래스에서 호출한다.
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;
		// ... 수십 수백개의 메소드가 호출이 된 상황이라 할 때,
//		Accounting.print();
		// ... 
		// 어쩌다 한번 다른 제품이 들어옴.
//		Accounting.valueOfSupply = 20000.0;
//		Accounting.vatRate = 0.05;
//		Accounting.expenseRate = 0.2;
//		Accounting.print();
		// .. 메소드를 딱 한번 호출한 후 다시 이전에 해당되는 작업을 또 해야 할 때. 
		// 다시 상태를 세팅해주고, 메소드를 호출하면서 코딩.
//		Accounting.valueOfSupply = 10000.0; 
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;
//		Accounting.print();
// 이런 과정들이 빈번하게 발생하면, 클래스의 내부적인 상태를 바꾸는 행위가 버그를 유발할 가능성이 굉장히 높다.

		// 예제 2)
// -> Accounting class를 1, 2, 3.. 복제한다. 아래와 같이 세팅한다.
// Accounting1, 2 이후에 print()를 호출해도 이상없음. 1의 내부적인 상태는 변경되지 않으므로
		
//		Accounting1.valueOfSupply = 10000.0;
//		Accounting1.vatRate = 0.1;
//		Accounting1.expenseRate = 0.3;
//		Accounting1.print();
//		
//		Accounting2.valueOfSupply = 20000.0;
//		Accounting2.vatRate = 0.05;
//		Accounting2.expenseRate = 0.2;
//		Accounting2.print();
//		
//// Accounting1, 2 이후에 print()를 호출해도 이상없음. 1의 내부적인 상태는 변경되지 않으므로
//// -> 클래스를 생성할때마다 정의를 추가해주고 변경해주기는 또 번거롭다!
//		Accounting1.print();
		
		// 예제 3)
		// class를 복제하지 않아도 됨.
		// instance : 클래스 앞에 new를 붙여서 만들어 진 것. 이 코드가 동작하기 위해선 static 키워드가 사용되면 안됨.
		Accounting a1 = new Accounting(); // 실행 후 Accounting이 복제된 무언가가 생성됨.
		// a1이라는 변수의 값으로는 반드시 Accounting의 복제본만 들어올 수 있다.
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		a1.print();

	}
}

