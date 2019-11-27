package prj4DTicTacToe;

public class clsMovesStack {

	private int frontPointer=0;
	private int topPointer;
	private int[][] movesStack = new int[41][4];
	
	public int[] get(int point){
		return movesStack[topPointer-point];
	}
	
	public void push(int[] input){
		topPointer=frontPointer;
		movesStack[frontPointer] = input;
		frontPointer++;
	}
	
	public int size(){
		return frontPointer;
	}
	
	public void reset(){
		frontPointer=0;
		topPointer = 0;
		for (int a=0;a<41;a++){
			for (int b=0;b<4;b++){
				movesStack[a][b]=0;
			}
		}
	}
}
