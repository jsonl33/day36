import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

class FrameEvent12 extends JFrame{
	public FrameEvent12() {
		setTitle("그리드 레이아웃 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0,3));
		
		add(new JButton("Button 01"));
		add(new JButton("Button 02"));
		add(new JButton("Button 03"));
		add(new JButton("Button 04"));
		add(new JButton("Long Button 05"));
		
		setLocationRelativeTo(null);
		
		pack();
		setVisible(true);
	}
}
public class UiTest12 {
	public static void main(String[] args) {
		new FrameEvent12();
	}
}
