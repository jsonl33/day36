import java.awt.*;
import java.awt.event.*;

class FrameEvent03 extends Frame {
	public FrameEvent03() {
		setLayout(new BorderLayout());

		add(new Button("Button01"), "North");
		add(new Button("Button02"), "West");
		add(new Button("Button03"), "Center");
		add(new Button("Button04"), "East");
		add(new Button("Button05"), "South");
		
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); System.exit(0);
			}
		});
	}
}

public class UiTest03 {
	public static void main(String[] args) {
		new FrameEvent03();
	}
}