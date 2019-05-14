package guessNum;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		
		JFrame obj = new JFrame();
		//Gameplay gameplay = new Gameplay();
		obj.setBounds(20, 20, 600, 500);
		obj.setTitle("Guess The Number");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//obj.add(gameplay);

	}

}
