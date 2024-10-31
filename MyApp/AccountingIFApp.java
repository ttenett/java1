// 조건문 if else를 이용해 수익 10000원 미만, 이상인 경우 배당금을 나눠서 설정 가능하다!
public class AccountingIFApp {

	public static void main(String[] args) {
		
//		double valueOfSupply = 12345.0 아래 값들을 변수로 변경
//		double valueOfSupply = args[0]; // 문자열을 더블에 넣으니 에러남
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		
		// 1만원 미만일때는 1번이 다 가져가고, 1만원이상 일때 배분하려면?
		double dividend1;
		double dividend2;
		double dividend3;
		
		if(income > 10000.0) {
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;
		} else {
			dividend1 = income * 1.0;
			dividend2 = income * 0;
			dividend3 = income * 0;
		}
		System.out.println("Value of supply :"+valueOfSupply); // 공급가
		System.out.println("VAT : "+ vat ); // 부가세
		System.out.println("Total : "+ total ); // 총 지출금액
		System.out.println("Expense : "+ expense ); // 비용
		System.out.println("Income : "+ income ); // 순 이익
		System.out.println("Dividend1 : "+ dividend1 ); // 배당금 첫번째 투자자
		System.out.println("Dividend2 : "+ dividend2 ); // 두번째 투자자
		System.out.println("Dividend3 : "+ dividend3 ); // 세번째 투자자

	}

}
