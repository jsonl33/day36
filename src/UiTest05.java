import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEvent05 extends Frame {
	Panel pan01, pan02, pan03;

	public FrameEvent05() {
		pan01 = new Panel();
		pan02 = new Panel();
		pan03 = new Panel();

		pan01.setBackground(Color.orange);
		pan02.setBackground(Color.blue);
		pan03.setBackground(Color.red);

		add(BorderLayout.NORTH, pan01);
		add(BorderLayout.CENTER, pan02);
		add(BorderLayout.SOUTH, pan03);

		pan01.add(new Button("Button01"));
		pan01.add(new Button("Button02"));

		pan02.add(new Button("Button03"));

		pan03.add(new Button("Button04"));
		pan03.add(new Button("Button05"));

		setSize(300, 130);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

public class UiTest05 {
	public static void main(String[] args) {
		new FrameEvent05();
	}
}
