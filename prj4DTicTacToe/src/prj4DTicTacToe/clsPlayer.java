package prj4DTicTacToe;


import prj4DTicTacToe.clsEnum.piece;

/*
 * the instances of class clsPlayer will hold jagged arrays of each of the two player's past moves (which are themselves int[] arrays)
 */

public class clsPlayer {

	private  clsMovesStack pastMoves = new clsMovesStack();
	private int score =0;
	private piece player;
	
	public clsPlayer(piece input){
		this.player = input;
	}
	
	public piece getPlayer(){
		return player;
	}
	
	public void addMove(int[] move) {
		System.out.println("added");
		pastMoves.push(move);
	}
	
	public int checkLine(clsBoard board){
		
		System.out.println("# of past moves ="+pastMoves.size());
		if (pastMoves.size() < 3){
			return 0;
		}
		
		int tempScore =0;
		int[] coordA, coordB, coordC = new int[4];
		int frontPointer = 1;
		int backPointer = frontPointer +1;
		while (backPointer!= pastMoves.size()){
			coordA = pastMoves.get(0);
			coordB = pastMoves.get(frontPointer);
			coordC = pastMoves.get(backPointer);
			if (board.threeElementCheck(coordA,coordB,coordC)){
				tempScore++;
				System.out.println("line formed by:");
				for (int x = 0; x<4; x++){
					System.out.print(coordA[x]);
				}
				System.out.println();
				for (int x = 0; x<4; x++){
					System.out.print(coordB[x]);
				}
				System.out.println();
				for (int x = 0; x<4; x++){
					System.out.print(coordC[x]);
				}
				System.out.println();
			}
			backPointer++;
			if(backPointer==pastMoves.size()){
				frontPointer++;
				backPointer = frontPointer +1;
			}
		}
		this.score+=tempScore;
		System.out.println("total score = "+this.score);
		return tempScore;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void doYouExist() {
		System.out.println("yes"+player);
	}
	
	public void reset(){
		this.score = 0;
		pastMoves.reset();
		System.out.println(pastMoves.size());
	}
}
	
