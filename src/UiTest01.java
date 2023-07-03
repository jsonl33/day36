import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEvent01 extends Frame {
	public FrameEvent01() {
		super("Frame Window");
		setSize(300, 200);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
}

public class UiTest01 {
	public static void main(String[] args) {
		new FrameEvent01();
	}
}
