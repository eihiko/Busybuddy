package busybuddy;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener{
	
	JTextArea display = new JTextArea();
	JTextField input = new JTextField();
	
	public Main(){
		display.setEditable(false);
		input.addActionListener(this);
		this.setLayout(new BorderLayout());
		this.add(display, BorderLayout.CENTER);
		this.add(input, BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,200);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		display.append(input.getText());
		display.append("\n");
		input.setText(null);
	}	

	public static void main(String [] args){
		new Main();
	}

}
