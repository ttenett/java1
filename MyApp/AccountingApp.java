
public class AccountingApp {

	public static void main(String[] args) {
		
//		double valueOfSupply = 12345.0 아래 값들을 변수로 변경
		
		double valueOfSupply = 10000.0;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		double dividend1 = income * 0.5;
		double devidend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		System.out.println("Value of supply :"+valueOfSupply); // 공급가
		System.out.println("VAT : "+ vat ); // 부가세
		System.out.println("Total : "+ total ); // 총 지출금액
		System.out.println("Expense : "+ expense ); // 비용
		System.out.println("Income : "+ income ); // 순 이익
		System.out.println("Dividend : "+ dividend1 ); // 배당금 첫번째 투자자
		System.out.println("Dividend : "+ devidend2 ); // 두번째 투자자
		System.out.println("Dividend : "+ dividend3 ); // 세번째 투자자

	}

}
