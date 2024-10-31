// ���� ������ ���̿� ������ �ڵ����� �߰��Ǿ� ������ ���̰� �ȴٸ�? �̶� �ذ��� �� �ִ°� �迭 ��������.
public class AccountingArrayApp {

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
		
		// �迭�� �������ν� ������ ������ ���� ������ �����̶�� ���� �и��ϰ� �� ���ִ�. �ϳ��� ������ ������ ���ɼ��� �پ��.
		double[] dividendRates = new double[3]; // double �迭 3������ ������
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;		
		
		double dividend1 = income * dividendRates[0];
		double devidend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
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
