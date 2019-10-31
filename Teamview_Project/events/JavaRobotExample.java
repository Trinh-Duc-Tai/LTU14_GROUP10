package events;

import java.awt.AWTException;
import java.awt.Robot;

public class JavaRobotExample {
	Robot robot = new Robot();

	public static void main(String[] args) throws AWTException {
		new JavaRobotExample();
	}

	public JavaRobotExample() throws AWTException {
		robot.setAutoDelay(40);
		robot.delay(1000);
//		robot.mouseMove(1500, 500);
//		robot.mousePress(MouseEvent.BUTTON3_DOWN_MASK);
//		robot.mouseRelease(MouseEvent.BUTTON3_DOWN_MASK);
		robot.mouseWheel(4);
		robot.delay(1000);
		System.exit(0);
	}


	@SuppressWarnings("unused")
	private void type(int i) {
		robot.delay(40);
		robot.keyPress(i);
		// robot.keyRelease(i);
	}

	@SuppressWarnings("unused")
	private void type(String s) {
		byte[] bytes = s.getBytes();
		for (byte b : bytes) {
			int code = b;
			// keycode only handles [A-Z] (which is ASCII decimal [65-90])
			if (code > 96 && code < 123)
				code = code - 32;
			robot.delay(10);
			robot.keyPress(code);
			robot.keyRelease(code);
		}
	}
}
