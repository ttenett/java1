// ���ǹ� if else�� �̿��� ���� 10000�� �̸�, �̻��� ��� ������ ������ ���� �����ϴ�!
public class AccountingIFApp {

	public static void main(String[] args) {
		
//		double valueOfSupply = 12345.0 �Ʒ� ������ ������ ����
//		double valueOfSupply = args[0]; // ���ڿ��� ���� ������ ������
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		
		// 1���� �̸��϶��� 1���� �� ��������, 1�����̻� �϶� ����Ϸ���?
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
		System.out.println("Value of supply :"+valueOfSupply); // ���ް�
		System.out.println("VAT : "+ vat ); // �ΰ���
		System.out.println("Total : "+ total ); // �� ����ݾ�
		System.out.println("Expense : "+ expense ); // ���
		System.out.println("Income : "+ income ); // �� ����
		System.out.println("Dividend1 : "+ dividend1 ); // ���� ù��° ������
		System.out.println("Dividend2 : "+ dividend2 ); // �ι�° ������
		System.out.println("Dividend3 : "+ dividend3 ); // ����° ������

	}

}
