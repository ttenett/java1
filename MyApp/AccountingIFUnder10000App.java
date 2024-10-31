// 파일을 나누어 배당금 1만원 미만인 사람들에 해당하는 코드를 따로 저장할 수 있음.
public class AccountingIFUnder10000App {

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
		double dividend1 = income * 1;
		double devidend2 = income * 0;
		double dividend3 = income * 0;
		
		System.out.println("Value of supply :"+valueOfSupply); // 공급가
		System.out.println("VAT : "+ vat ); // 부가세
		System.out.println("Total : "+ total ); // 총 지출금액
		System.out.println("Expense : "+ expense ); // 비용
		System.out.println("Income : "+ income ); // 순 이익
		System.out.println("Dividend1 : "+ dividend1 ); // 배당금 첫번째 투자자
		System.out.println("Dividend2 : "+ devidend2 ); // 두번째 투자자
		System.out.println("Dividend3 : "+ dividend3 ); // 세번째 투자자

	}

}
