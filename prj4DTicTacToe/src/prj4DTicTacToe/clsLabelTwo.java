package prj4DTicTacToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class clsLabelTwo extends JLabel  {
	
	public clsLabelTwo (){
		super();
	}
	
	public void refreshButton(int score){
		this.setVisible(true);
		if (score==0){
			setText("That piece didn't form a line");
		} else if (score==-1){
			setText("");
		} else {
			setText("That piece formed "+score+" lines");
		}
	}
}
