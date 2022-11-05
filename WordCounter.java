import javax.swing.*;
import java.awt.event.*;
public class WordCounter{
	public static void main(String args []){
	
	JFrame frame = new JFrame("Word Counter");
	JTextArea area = new JTextArea();
	area.setBounds(20,75,400,300);
	JButton button = new JButton("Count Words");
	button.setBounds(100,420,200,30);


	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e){
			String text = area.getText();
			if(!text.equals(" ")){
				String [] words = text.split("\\s");
				JOptionPane.showMessageDialog(frame, words.length);
			}
		}
	});

	frame.add(area);
	frame.add(button);
	frame.setSize(500,500);
	frame.setLayout(null);
	frame.setVisible(true);


	}
	


}