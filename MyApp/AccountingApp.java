
public class AccountingApp {

	public static void main(String[] args) {
		
//		double valueOfSupply = 12345.0 �Ʒ� ������ ������ ����
		
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
		
		System.out.println("Value of supply :"+valueOfSupply); // ���ް�
		System.out.println("VAT : "+ vat ); // �ΰ���
		System.out.println("Total : "+ total ); // �� ����ݾ�
		System.out.println("Expense : "+ expense ); // ���
		System.out.println("Income : "+ income ); // �� ����
		System.out.println("Dividend : "+ dividend1 ); // ���� ù��° ������
		System.out.println("Dividend : "+ devidend2 ); // �ι�° ������
		System.out.println("Dividend : "+ dividend3 ); // ����° ������

	}

}
