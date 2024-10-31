// 배당금 변수들 사이에 수많은 코드줄이 추가되어 변수가 꼬이게 된다면? 이때 해결할 수 있는게 배열 변수설정.
public class AccountingArrayApp {

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
		
		// 배열을 만듦으로써 각각의 값들이 서로 연관된 값들이라는 것을 분명하게 할 수있다. 하나의 변수가 오염될 가능성이 줄어듬.
		double[] dividendRates = new double[3]; // double 배열 3개들어가는 생성자
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;		
		
		double dividend1 = income * dividendRates[0];
		double devidend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
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
