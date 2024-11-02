// �������Ͽ��� ���� ������ �޼ҵ尡 �����Ѵ�.
// AccountingClassApp�� ����� Accounting�� ����� �ٲ�
// class�� �������ν� �ҼӰ��踦 ��Ȯ�� �� �� �ְ�, �ٸ� ������ �ڵ��� �ڼ����� �������. 
// print�� ���� ���� �̸��� �޼ҵ��� ����ص� Ŭ������ ���еǾ� �־� ������ ���� �ʴ´�.
class Accounting{
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	public void print() {
		System.out.println("Value of supply :"+ valueOfSupply); // ���ް�
		System.out.println("VAT : "+ getVAT() ); // �ΰ���
		System.out.println("Total : "+ getTotal() ); // �� ����ݾ�
		System.out.println("Expense : "+ getExpense() ); // ���
		System.out.println("Income : "+ getIncome() ); // �� ����
		System.out.println("Dividend1 : "+ getDividend1() ); // ���� ù��° ������
		System.out.println("Dividend2 : "+ getDividend2() ); // �ι�° ������
		System.out.println("Dividend3 : "+ getDividend3() ); // ����° ������
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
class Accounting2{
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
		// ���� 1)
//		Accounting.valueOfSupply = 10000.0; // Accounting Ŭ�������� ȣ���Ѵ�.
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;
		// ... ���� ���鰳�� �޼ҵ尡 ȣ���� �� ��Ȳ�̶� �� ��,
//		Accounting.print();
		// ... 
		// ��¼�� �ѹ� �ٸ� ��ǰ�� ����.
//		Accounting.valueOfSupply = 20000.0;
//		Accounting.vatRate = 0.05;
//		Accounting.expenseRate = 0.2;
//		Accounting.print();
		// .. �޼ҵ带 �� �ѹ� ȣ���� �� �ٽ� ������ �ش�Ǵ� �۾��� �� �ؾ� �� ��. 
		// �ٽ� ���¸� �������ְ�, �޼ҵ带 ȣ���ϸ鼭 �ڵ�.
//		Accounting.valueOfSupply = 10000.0; 
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;
//		Accounting.print();
// �̷� �������� ����ϰ� �߻��ϸ�, Ŭ������ �������� ���¸� �ٲٴ� ������ ���׸� ������ ���ɼ��� ������ ����.

		// ���� 2)
// -> Accounting class�� 1, 2, 3.. �����Ѵ�. �Ʒ��� ���� �����Ѵ�.
// Accounting1, 2 ���Ŀ� print()�� ȣ���ص� �̻����. 1�� �������� ���´� ������� �����Ƿ�
		
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
//// Accounting1, 2 ���Ŀ� print()�� ȣ���ص� �̻����. 1�� �������� ���´� ������� �����Ƿ�
//// -> Ŭ������ �����Ҷ����� ���Ǹ� �߰����ְ� �������ֱ�� �� ���ŷӴ�!
//		Accounting1.print();
		
		// ���� 3)
		// class�� �������� �ʾƵ� ��.
		// instance : Ŭ���� �տ� new�� �ٿ��� ����� �� ��. �� �ڵ尡 �����ϱ� ���ؼ� static Ű���尡 ���Ǹ� �ȵ�.
		Accounting a1 = new Accounting(); // ���� �� Accounting�� ������ ���𰡰� ������.
		// a1�̶�� ������ �����δ� �ݵ�� Accounting�� �������� ���� �� �ִ�.
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

