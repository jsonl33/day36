import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

class FrameEvent10 extends JFrame{
	public FrameEvent10() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("스윙 프레임 윈도우 그리기");
		
		setLayout(new FlowLayout());
		JButton btn = new JButton("버튼");
		this.add(btn);
		setVisible(true);
	}
}

public class UiTest10 {
	public static void main(String[] args) {
		new FrameEvent10();
	}
}
