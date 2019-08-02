import javax.swing.*;

public class JframeHelloWorld{
    public static void main(String[]args){
	    // 相当于body
		JFrame frame = new JFrame("JFrame");
		// 相当于div
		JPanel panel = new JPanel();

		JLabel label = new JLabel("helloworld");
	
		panel.add(label);
		
		frame.setContentPane(panel);
		
		frame.setSize(666,666);

		frame.setVisible(true);
    }
}