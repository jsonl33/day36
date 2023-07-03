import java.awt.*;
import java.awt.event.*;

class FrameEvent09 extends Frame {
	public FrameEvent09() {
		setSize(600, 400);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

public class UiTest09 {
	public static void main(String[] args) {
		new FrameEvent09();
	}
}