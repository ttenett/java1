// �������Ͽ��� ���� ������ �޼ҵ尡 �����Ѵ�.
// AccountingClassApp�� ����� Accounting�� ����� �ٲ�
// class�� �������ν� �ҼӰ��踦 ��Ȯ�� �� �� �ְ�, �ٸ� ������ �ڵ��� �ڼ����� �������. 
// print�� ���� ���� �̸��� �޼ҵ��� ����ص� Ŭ������ ���еǾ� �־� ������ ���� �ʴ´�.
class Accounting{
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	
	public static void print() {
		System.out.println("Value of supply :"+ valueOfSupply); // ���ް�
		System.out.println("VAT : "+ getVAT() ); // �ΰ���
		System.out.println("Total : "+ getTotal() ); // �� ����ݾ�
		System.out.println("Expense : "+ getExpense() ); // ���
		System.out.println("Income : "+ getIncome() ); // �� ����
		System.out.println("Dividend1 : "+ getDividend1() ); // ���� ù��° ������
		System.out.println("Dividend2 : "+ getDividend2() ); // �ι�° ������
		System.out.println("Dividend3 : "+ getDividend3() ); // ����° ������
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
		Accounting.valueOfSupply = 10000.0; // Accounting Ŭ�������� ȣ���Ѵ�.
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
		Accounting.print();
		// anotherVariable = ...; Accounting ���� �� ������ �޼ҵ尡 ������ �� �ִ�.
		// anotherMethod = ...; ���꼺�� ����߸� �� ����.

	}


}
