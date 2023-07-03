import java.awt.*;
import java.awt.event.*;

class FrameEvent06 extends Frame {
	Button redBtn, blueBtn;

	public FrameEvent06() {
		setLayout(new FlowLayout());

		redBtn = new Button("Red Color");
		blueBtn = new Button("Blue Color");
		add(redBtn);
		add(blueBtn);
		
		ButtonListener handler = new ButtonListener();
		
		redBtn.addActionListener(handler);
		blueBtn.addActionListener(handler);
		
		setSize(300, 200);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

class ButtonListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("각 버튼이 클릭되었다.");
	}
}

public class UiTest06 {
	public static void main(String[] args) {
		new FrameEvent06();
	}
}
