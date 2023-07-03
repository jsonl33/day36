import javax.swing.*;

public class UiTest11 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("온도 변환기");
		JPanel panel = new JPanel();
		f.add(panel);

		JLabel label01 = new JLabel("화씨 온도");
		JLabel label02 = new JLabel("섭씨 온도");

		JTextField field01 = new JTextField(15);
		JTextField field02 = new JTextField(15);
		JButton button = new JButton("변환");

		panel.add(label01);
		panel.add(field01);
		panel.add(label02);
		panel.add(field02);
		panel.add(button);
		
		f.setSize(300,150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
