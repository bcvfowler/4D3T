package prj4DTicTacToe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import prj4DTicTacToe.clsEnum.piece;

public class clsButton extends JButton{

	private int[] coord = {1,1,1,1};
	private int[] backupCoord;
	private clsBoard board;
	private boolean coordNotSet = true;
	
	public clsButton(int[] coord, clsBoard board){
		super(representPiece(board.getPoint(coord)));
		this.board=board;
		if (coordNotSet) {
			this.coord=coord;
			this.backupCoord=coord;
			coordNotSet=false;
		}
	}
	
	/*public clsButton(int[] input){
		coord = input;
	}*/
	
	/*public void setCoord(int[] input){
		this.coord = input;
		int[] zero = {0,0,0,0};
		if (coord == zero){
			System.out.println("I've been set to 0!");
		}
	}*/
	
	public int[] getCoord(){
		return this.coord;
	}
	
	public static String representPiece(piece Piece){
		String Return = null;
		switch (Piece) {
			case BLOCKER : Return = "/"; break;
			case CIRCLE : Return = "O"; break;
			case CROSS : Return = "X"; break;
			case EMPTY : Return = ""; break;
		}
		return Return;
	}
	
	public void refreshButton(){
		this.setText(representPiece(board.getPoint(this.coord)));
		System.out.println("my coord is "+coord[0]+coord[1]+coord[2]+coord[3]+" "+coordNotSet);
		System.out.println("my backup is "+backupCoord[0]+backupCoord[1]+backupCoord[2]+backupCoord[3]);
	}
}
