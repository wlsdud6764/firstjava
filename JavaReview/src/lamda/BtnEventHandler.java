package lamda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnEventHandler implements ActionListener {

	// 이벤트핸들러
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("event");
	}

}
