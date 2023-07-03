import java.awt.*;
import java.awt.event.*;

class FrameEvent08 extends Frame implements ActionListener{
	Button orangeBtn, yellowBtn;

	public FrameEvent08() {
		setLayout(new FlowLayout());

		orangeBtn = new Button("Orange");
		yellowBtn = new Button("Yellow");

		add(orangeBtn);
		add(yellowBtn);
		
		orangeBtn.addActionListener(this);
		yellowBtn.addActionListener(this);
		
		setSize(300, 200);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == orangeBtn) {
			this.setBackground(Color.ORANGE);
		}
		else {
			this.setBackground(Color.YELLOW);
		}
	}
}

public class UiTest08 {
	public static void main(String[] args) {
		new FrameEvent08();
	}
}
