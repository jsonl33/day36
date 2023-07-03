
import java.awt.*;
import java.awt.event.*;

class FrameEvent07 extends Frame {
	Button redBtn, blueBtn;

	public FrameEvent07() {
		setLayout(new FlowLayout());

		redBtn = new Button("Red");
		blueBtn = new Button("Blue");

		add(redBtn);
		add(blueBtn);
		
		ButtonListener07 handler = new ButtonListener07(this);
		
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

class ButtonListener07 implements ActionListener {
	Frame frm;

	public ButtonListener07() {
	}

	public ButtonListener07(Frame frm) {
		this.frm = frm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Red")) {
			frm.setBackground(Color.RED);
		}
		else {
			frm.setBackground(Color.BLUE);
		}
	}
}

public class UiTest07 {
	public static void main(String[] args) {
		new FrameEvent07();
	}
}
