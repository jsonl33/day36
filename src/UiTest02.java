import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Button;

class FrameEvent02 extends Frame{
	public FrameEvent02() {
		setLayout(new FlowLayout());
		
		add(new Button("Button 01"));
		add(new Button("Button 02"));
		add(new Button("Button 03"));
		add(new Button("Button 04"));
		add(new Button("Button 05"));
		
		setSize(300,200);
		setVisible(true);
	}
}

public class UiTest02 {
	public static void main(String[] args) {
		new FrameEvent02();
	}
}
