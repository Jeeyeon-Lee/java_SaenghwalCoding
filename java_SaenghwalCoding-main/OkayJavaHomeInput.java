
import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkayJavaHomeInput {

	//매개변수, parameter
	public static void main(String[] args) {
		// 내가 무엇을 하려고 하는지? 어떤 순으로 진행되는가?
		// 엘리베이터 콜
		String id = args[0];
		String bright = args[1];
		
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// 경비 꺼지기
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// 불 켜기
		Lighting hallLamp = new Lighting(id);
		hallLamp.on();		
		
		Lighting floorLamp = new Lighting(id);
		floorLamp.on();		
		
		DimmingLights moodLamp = new DimmingLights(id +" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}

}
