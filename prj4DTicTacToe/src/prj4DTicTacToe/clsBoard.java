package prj4DTicTacToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

import prj4DTicTacToe.clsEnum.piece;

public class clsBoard{

	/*
	 * this defines the matrix(the playing board) as a 4-dimensional array, which will be populated by pieces that are defined in the enum type piece. For future reference, variables that correspond to these dimensions will be labelled with x,y,z and t respectively
	 */
	private piece[][][][] Matrix = new piece[3][3][3][3];
	
	
	/*
	 * this is the default constructor and it generates an empty matrix (one where every element is "EMPTY" except for the very middle (coordinates (1,1,1,1)) which has a "BLOCKER" 
	 */
	public clsBoard(){
		for (int a=0;a<3;a++){
			for (int b=0;b<3;b++){
				for (int c=0;c<3;c++){
					for (int d=0;d<3;d++){
						Matrix[a][b][c][d] = piece.EMPTY;
					}
				}
			}
		}
		Matrix[1][1][1][1] = piece.BLOCKER;
	}
	
	
	/*
	 * This method sets a specific point to an enum of type piece, but first it makes a call to the method checkIfoccupied. It only sets the position in the matrix if the point is empty. It returns true if it was successful, and false if it was unsuccessful
	 */
	public boolean setPoint (piece input, int[] coord){
		if (!(this.checkIfOccupied(coord) == true)){
			Matrix[coord[0]][coord[1]][coord[2]][coord[3]] = input;
			return true;
		}
		return false;
	}
	
	
	public piece getPoint (int[] coord){
		return Matrix[coord[0]][coord[1]][coord[2]][coord[3]];
	}
	
	/*
	 * This method checks a specific point in the Matrix to see if it is empty. if it is empty, it will return true, otherwise it will return false
	 */
	public boolean checkIfOccupied (int[] coord){
		return Matrix[coord[0]][coord[1]][coord[2]][coord[3]]!=piece.EMPTY;
	}
	
	public void displayBoard (){
		for (int a=0;a<3;a++){
			for (int b=0;b<3;b++){
				for (int c=0;c<3;c++){
					for (int d=0;d<3;d++){
						switch (Matrix[c][a][d][b]) {
							case EMPTY : System.out.print(" ");
								break;
							case BLOCKER : System.out.print("/");
								break;
							case CIRCLE : System.out.print("O");
								break;
							case CROSS : System.out.print("X");
								break;
							}
							if (d!=2){System.out.print("|");}
						}
						System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				System.out.println();
			}
		}
	
	public boolean threeElementCheck (int[] objA, int[] objB, int[] objC) {
		
		boolean[] eline = {false,false,false,false};
		boolean notALine = false;
		
		int eCount = 0;
		
		for (int dimension=0; dimension<4; dimension++){
			if (objA[dimension] == objB[dimension]) {
				if (objA[dimension] == objC[dimension]){
					eline[dimension] = true;
					eCount ++;
				} else {
					notALine = true;
				}
			} 
			if ((objA[dimension] == objC[dimension]&& eline[dimension] == false)){
				notALine = true;
			}
			
			if ((objB[dimension] == objC[dimension]) && eline[dimension] == false) {
				notALine = true;
			}
		}
		System.out.println("definately not a line:"+notALine);
		System.out.println("dimension X match:"+eline[0]);
		System.out.println("dimension Y match:"+eline[1]);
		System.out.println("dimension Z match:"+eline[2]);
		System.out.println("dimension T match:"+eline[3]);
		
		if ((eCount == 4) || (notALine == true)) {
			return false;
		}
		
		char midpoint = 'u';
		boolean inconsistentMidpoint = false;
		
		for (int dimension=0; dimension<4; dimension++){
			if (!eline[dimension]){
				if (objA[dimension] == 1) {
					if (midpoint == 'u') {
						midpoint = 'a';
					} else if (midpoint != 'a') {
						inconsistentMidpoint = true;
						break;
					}
				}
				if (objB[dimension] == 1) {
					if (midpoint == 'u') {
						midpoint = 'b';
					} else if (midpoint != 'b') {
						inconsistentMidpoint = true;
						break;
					}
				}
				if (objC[dimension] == 1) {
					if (midpoint == 'u') {
						midpoint = 'c';
					} else if (midpoint != 'c') {
						inconsistentMidpoint = true;
						break;
					}
				}
			}
		}
		
		if (inconsistentMidpoint) {
			System.out.println("inconsistent midpoint");
			return false;
		}
		
		System.out.println("these form a line");
		return true;
	}
	
	
	public boolean checkAroundPoint (int[] coord){
		return false;
	}
	
	public void reset(){
		for (int a=0;a<3;a++){
			for (int b=0;b<3;b++){
				for (int c=0;c<3;c++){
					for (int d=0;d<3;d++){
						Matrix[a][b][c][d] = piece.EMPTY;
					}
				}
			}
		}
		Matrix[1][1][1][1] = piece.BLOCKER;
	}
}

