package prj4DTicTacToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class clsLabelThree extends JLabel  {
	
	private String player;
	
	public clsLabelThree (int player){
		super("", SwingConstants.RIGHT);
		switch (player) {
		case 0: this.player = "Cross"; break;
		case 1: this.player = "Circle"; break;
		}
	}
	
	public void refreshButton(int score){
		this.setVisible(true);
		if (score == -1){
			setText("");
		} else {
			setText(player+"'s Score: "+score);
		}
	}
}
