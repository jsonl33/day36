import java.awt.*;
import java.awt.event.*;

class FrameEvent04 extends Frame {
	public FrameEvent04() {
		setLayout(new GridLayout(3, 2));
		
		add(new Button("Button 01"));
		add(new Button("Button 02"));
		add(new Button("Button 03"));
		add(new Button("Button 04"));
		add(new Button("Button 05"));
		
		setSize(300,200); setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); System.exit(0);
			}
		});
	}
}

public class UiTest04 {
	public static void main(String[] args) {
		new FrameEvent04();
	}
}
