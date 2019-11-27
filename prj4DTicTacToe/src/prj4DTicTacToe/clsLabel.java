package prj4DTicTacToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class clsLabel extends JLabel  {
	
	public clsLabel (int state){
		super();
		refreshButton(state);
	}
	
	public void refreshButton(int state){
		this.setVisible(true);
		switch (state){
		case 0:  setText("Player Cross' turn"); break;
		case 1:  setText("Player Circle's turn"); break;
		}
	}
}
