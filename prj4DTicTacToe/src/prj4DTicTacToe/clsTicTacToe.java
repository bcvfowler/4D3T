package prj4DTicTacToe;

import java.util.ArrayList;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;

import prj4DTicTacToe.clsEnum.piece;

public class clsTicTacToe implements ActionListener{

	/*
	 * this creates an instance of the object Scanner from java.util.Scanner to be used to read user inputs. It is named scan
	 */
	private static Scanner scan = new Scanner(System.in);
	private static clsBoard board;
	private static clsPlayer[] players = new clsPlayer[2];
	private static int playerNumber = 0;
	public static int pastMoves = 0;
	private static FiniteStateController control;
	public static clsGUI frame = null;
	public static clsTicTacToe trueMain = null;
	
	public static void main(String[] args) {
		
		board = new clsBoard();
		players[0] = new clsPlayer(piece.CROSS);
		players[1] = new clsPlayer(piece.CIRCLE);
		doTheyExist();
		players[playerNumber].doYouExist();
		players[playerNumber+1].doYouExist();
		
		control = new FiniteStateController(board, players);
		
		
		trueMain = new clsTicTacToe();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new clsGUI(board, control, trueMain);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		/*while(true){
			board.displayBoard();
			System.out.println("Cross's turn");
			playerTurn(cross);
			board.displayBoard();
			System.out.println("Circle's turn");
			playerTurn(circle);
		}*/
			
		
	
	}
	
	
	public static void playerTurn(clsPlayer player){
		
		piece playerPiece = player.getPlayer();
		
		int[] coord = new int[4]; //this is the coordinate that will be passed to the board
		
		/*
		 * This asks the player for input and makes a call to the setPoint method of board. If it cannot set the point it goes into a while loop until the player successfully sets a point to their piece
		 */
		
		coord = collectElement();
		while (!(board.setPoint(playerPiece, coord))) {
			
			System.out.println("that point is occupied");
			coord = collectElement();
		}
		
		player.addMove(coord);
		player.checkLine(board);
	}
	
	public static int[] collectElement() {
		int[] coord = new int[4];
		System.out.println("choose a point of format x,y,z,t to place your token. Input each on a new line and ensure they are an int of value 0-2");
		try {
			for (int a=0;a<4;a++){
				coord[a] = scan.nextInt();
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException oOBounds){
			System.out.println("that input includes an integer that is not 0-2");
		} catch (java.util.InputMismatchException misMatch){
			System.out.println("input can only be an integer");
		} 
		return coord;
	}
	
	public static void testCollectThreeElements() {
		int[] coordA = new int[4];
		int[] coordB = new int[4];
		int[] coordC = new int[4];
		
		
		System.out.println("input element 1");
		try {
			for (int a=0;a<4;a++){
				coordA[a] = scan.nextInt();
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException oOBounds){
			System.out.println("that input includes an integer that is not 0-2");
		} catch (java.util.InputMismatchException misMatch){
			System.out.println("input can only be an integer");
		} 
		
		System.out.println("input element 2");
		try {
			for (int a=0;a<4;a++){
				coordB[a] = scan.nextInt();
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException oOBounds){
			System.out.println("that input includes an integer that is not 0-2");
		} catch (java.util.InputMismatchException misMatch){
			System.out.println("input can only be an integer");
		} 
		
		System.out.println("input element 3");
		try {
			for (int a=0;a<4;a++){
				coordC[a] = scan.nextInt();
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException oOBounds){
			System.out.println("that input includes an integer that is not 0-2");
		} catch (java.util.InputMismatchException misMatch){
			System.out.println("input can only be an integer");
		} 
		
		board.threeElementCheck(coordA, coordB, coordC);
	}
	
	public static void doTheyExist() {
		players[playerNumber].doYouExist();
		players[playerNumber+1].doYouExist();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		reset();
		
	}
	
	public void reset() {
		System.out.println("refreshing");
		playerNumber=0;
		players[0].reset();
		players[1].reset();
		control.reset();
		board.reset();
		frame.buildBoard(board, control, trueMain);
	}

}
