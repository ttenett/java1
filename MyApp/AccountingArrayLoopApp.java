// 동업자-배당금 3명이 아니라 수천 수만명이라면?
// while 반복문으로 동일한 코드를 여러번 수행할 수 있다!
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		
		

		System.out.println("Value of supply :"+valueOfSupply); // 공급가
		System.out.println("VAT : "+ vat ); // 부가세
		System.out.println("Total : "+ total ); // 총 지출금액
		System.out.println("Expense : "+ expense ); // 비용
		System.out.println("Income : "+ income ); // 순 이익
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;		
		
		
		int i = 0; // 3번 반복되기 위해 반복값을 i에 기록.
		while(i < dividendRates.length) {
			System.out.println("Dividend : "+ (income*dividendRates[i]) );
			i = i + 1;
		}		

	}

}
