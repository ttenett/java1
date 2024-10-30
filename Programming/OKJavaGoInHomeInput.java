import javax.swing.JOptionPane; // javax에 swing에 속해있는 JOptionPane이라는 클래스가 로드 됨. 사용가능.

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator; // 부품 불러오기
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoInHomeInput {
	
	// parameter, 매개변수
	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter a ID");
		String bright = JOptionPane.showInputDialog("Enter a Bright level"); // 무드램프 입력값
		
		// Elevator call
		Elevator myElevator = new Elevator(id); // 자바 아파트의 엘리베이터 호출
		myElevator.callForUp(1); // 1층으로 보내
		
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
