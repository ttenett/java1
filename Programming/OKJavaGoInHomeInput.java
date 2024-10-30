import javax.swing.JOptionPane; // javax�� swing�� �����ִ� JOptionPane�̶�� Ŭ������ �ε� ��. ��밡��.

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator; // ��ǰ �ҷ�����
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoInHomeInput {
	
	// parameter, �Ű�����
	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter a ID");
		String bright = JOptionPane.showInputDialog("Enter a Bright level"); // ���工�� �Է°�
		
		// Elevator call
		Elevator myElevator = new Elevator(id); // �ڹ� ����Ʈ�� ���������� ȣ��
		myElevator.callForUp(1); // 1������ ����
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();

	}

}
