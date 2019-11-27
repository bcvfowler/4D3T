package prj4DTicTacToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FiniteStateController implements ActionListener{

	private State state;
	private clsButton[] buttons = new clsButton[81];
	private clsLabel turnLabel;
	private clsLabelTwo scoreLabel;
	private clsLabelThree[] playerScoreLabel = new clsLabelThree[2];
	private clsBoard board;
	private clsPlayer[] players = new clsPlayer[2];
	private int playerNumber;
	
	
	public FiniteStateController(clsBoard board, clsPlayer[] players) {
		
		this.state = State.CROSSTURN;
		this.board = board;
		this.players = players;
		this.playerNumber = 0;
		
	}
	
	public void addPlayerLabel (clsLabel turnLabel){
		this.turnLabel = turnLabel;
	}
	
	public void addScoreLabel (clsLabelTwo scoreLabel){
		this.scoreLabel = scoreLabel;
	}
	
	public void addPlayerScoreLabel (clsLabelThree playerScoreLabel, int which){
		this.playerScoreLabel[which] = playerScoreLabel;
	}
	
	public void addButton (int e, clsButton button){
		this.buttons[e] = button;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		switch (state) {
			case CROSSTURN : 
			case CROSSBLOCKER :
			case CIRCLETURN :
			case CIRCLEBLOCKER :
		}
		playerTurn(e);
	}

	private void playerTurn(ActionEvent e) {
		
		System.out.println("me me big boi");
		
		int[] coord = new int[4];
		clsButton button = (clsButton) e.getSource();
		coord = button.getCoord();
		for (int x=0;x<4;x++){
			System.out.println(coord[x]);
		}
		if (!board.setPoint(this.players[playerNumber].getPlayer(),coord)){
			System.out.println("space occupado ser");
			return;
		} else {
			board.displayBoard();
		}
		this.players[playerNumber].addMove(coord);
		
		int tempScore = this.players[playerNumber].checkLine(board);
		
		playerNumber = (playerNumber+1) % 2;
		
		refreshBoard(tempScore);
	}
	
	private void refreshBoard(int tempScore){
		for (int c=0;c<81;c++){
			this.buttons[c].refreshButton();
		}
		this.turnLabel.refreshButton(this.playerNumber);
		this.scoreLabel.refreshButton(tempScore);
		this.playerScoreLabel[(playerNumber+1) % 2].refreshButton(players[(playerNumber+1) % 2].getScore());
	}
	
	public void reset(){
		System.out.println("me me smol boi");
		this.state = State.CROSSTURN;
		this.playerNumber = 0;
		refreshBoard(-1);
		System.out.println("bleh");
		this.scoreLabel.setVisible(false);
		this.playerScoreLabel[0].setVisible(false);
		this.playerScoreLabel[1].setVisible(false);
		this.turnLabel.setText("Player Cross' turn");
		this.turnLabel.revalidate();
		
	}
}
