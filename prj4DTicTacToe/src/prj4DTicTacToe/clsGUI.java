package prj4DTicTacToe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import prj4DTicTacToe.clsEnum.piece;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BorderFactory;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class clsGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clsGUI frame = new clsGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("null")
	public clsGUI(clsBoard board, FiniteStateController main, clsTicTacToe trueMain) {
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 430, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		buildBoard(board,main,trueMain);
		//contentPane.removeAll();
		
		
		
		
		
		/*
		panelArray[0][0] = new JPanel(grid);
		panel.add(panelArray[0][0]);
				
		
		buttonArray[0][0][0][0] = new clsButton(representPiece(board.getPoint(arrayCoord)));
		panelArray[0][0].add(buttonArray[0][0][0][0]);
		buttonArray[0][0][0][0].addActionListener(board);
		buttonArray[0][0][0][0].setCoord(arrayCoord);
		
		JPanel innerPanel00 = new JPanel(grid);
		panel.add(innerPanel00);
		
		int[] coord = { 0, 0, 0, 0 };
		clsButton btnNewButton = new clsButton(representPiece(board.getPoint(coord)));
		innerPanel00.add(btnNewButton);
		btnNewButton.addActionListener(board);
		btnNewButton.setCoord(coord);
		
		int[] coord1 = { 0, 0, 1, 0 };
		clsButton btnNewButton1 = new clsButton(representPiece(board.getPoint(coord)));
		innerPanel00.add(btnNewButton1);
		btnNewButton1.addActionListener(board);
		btnNewButton1.setCoord(coord1);
		
		int[] coord2 = { 0, 0, 2, 0 };
		clsButton btnNewButton2 = new clsButton("Button 3");
		innerPanel00.add(btnNewButton2);
		btnNewButton2.addActionListener(board);
		btnNewButton2.setCoord(coord2);
		
		int[] coord3 = { 0, 0, 0, 1 };
		clsButton btnNewButton3 = new clsButton("Button 4");
		innerPanel00.add(btnNewButton3);
		btnNewButton3.addActionListener(board);
		btnNewButton3.setCoord(coord3);
		
		int[] coord4 = { 0, 0, 1, 1 };
		clsButton btnNewButton4 = new clsButton("Button 5");
		innerPanel00.add(btnNewButton4);
		btnNewButton4.addActionListener(board);
		btnNewButton4.setCoord(coord4);
		
		int[] coord5 = { 0, 0, 2, 1 };
		clsButton btnNewButton5 = new clsButton("Button 6");
		innerPanel00.add(btnNewButton5);
		btnNewButton5.addActionListener(board);
		btnNewButton5.setCoord(coord5);
		
		int[] coord6 = { 0, 0, 0, 2 };
		clsButton btnNewButton6 = new clsButton("Button 7");
		innerPanel00.add(btnNewButton6);
		btnNewButton6.addActionListener(board);
		btnNewButton6.setCoord(coord6);
		
		int[] coord7 = { 0, 0, 1, 2 };
		clsButton btnNewButton7 = new clsButton("Button 8");
		innerPanel00.add(btnNewButton7);
		btnNewButton7.addActionListener(board);
		btnNewButton7.setCoord(coord7);
		
		int[] coord8 = { 0, 0, 2, 2 };
		clsButton btnNewButton8 = new clsButton("Button 9");
		innerPanel00.add(btnNewButton8);
		btnNewButton8.addActionListener(board);
		btnNewButton8.setCoord(coord8);
		
		JPanel innerPanel10 = new JPanel(grid);
		panel.add(innerPanel10);
		
		int[] coord9 = { 1, 0, 0, 0 };
		clsButton btnNewButton9 = new clsButton("Button 10");
		innerPanel10.add(btnNewButton9);
		btnNewButton9.addActionListener(board);
		btnNewButton9.setCoord(coord9);
		
		int[] coord10 = { 1, 0, 1, 0 };
		clsButton btnNewButton10 = new clsButton("Button 11");
		innerPanel10.add(btnNewButton10);
		btnNewButton10.addActionListener(board);
		btnNewButton10.setCoord(coord10);
		
		int[] coord11 = { 1, 0, 2, 0 };
		clsButton btnNewButton11 = new clsButton("Button 12");
		innerPanel10.add(btnNewButton11);
		btnNewButton11.addActionListener(board);
		btnNewButton11.setCoord(coord11);
		
		int[] coord12 = { 1, 0, 0, 1 };
		clsButton btnNewButton12 = new clsButton("Button 13");
		innerPanel10.add(btnNewButton12);
		btnNewButton12.addActionListener(board);
		btnNewButton12.setCoord(coord12);
		
		
		
		JPanel innerPanel20 = new JPanel(grid);
		panel.add(innerPanel20);
		*/
		
		
		
		
		// Action testAction = new clsAction();

		/*clsButton btnNewButton_1 = new clsButton("Button 2");

		

		panel.add(btnNewButton_1);

		btnNewButton_1.addActionListener(this);

		btnNewButton_1.setActionCommand("zdravstvuytye");

		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("New button");
		panel.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("New button");
		panel.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("New button");
		panel.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("New button");
		panel.add(btnNewButton_7);*/

		
		
	}
	
	/*public clsButton instantiateButton(int[] coord) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> clas = Class.forName("clsButton");
		
		Constructor<?> construct = null;
		
		return (clsButton) construct.newInstance(coord);
	}*/

	/*public void actionPerformed(ActionEvent e) {

		int[] coord = new int[4];
		clsButton button = (clsButton) e.getSource();
		coord = button.getCoord();
		for (int x=0;x<4;x++){
			System.out.println(coord[x]);
		}*/
		
		
		/*System.out.println("action preformed: " + e.paramString() + " ~ " + e.getWhen() + " ~ " + e.getModifiers()
				+ " ~ " + e.getActionCommand());
		System.out.println(e.getID());
		System.out.println(e.getSource());
		System.out.println(e.getActionCommand());
		System.out.println(e.getClass());
		System.out.println(e.getModifiers());
		System.out.println(e.getActionCommand());
		if (e.getActionCommand() == "Button 1") {
			clsButton button = (clsButton) e.getSource();
			System.out.println(button.getCoord());
			btnNewButton();
		}
		if (e.getActionCommand() == "Button 2") {
			clsButton button = (clsButton) e.getSource();
			System.out.println(button.getCoord());
			btnNewButton1();
		}
		
		clsButton button1 = (clsButton) e.getSource();
		int[] coord = new int[4];
		switch (e.getActionCommand()) {
			case "1" :  coord = button1.getCoord();
						for (int x=0;x<4;x++){
							System.out.println(coord[x]);
						}
						break;
		}
		
	}*/
	
	/*
	public void btnNewButton() {FiniteStateController main, 
		System.out.println("button 1 was pressed");
	}

	public void btnNewButton1() {
		System.out.println("button 2 was pressed");
	}

	public void btnNewButton2() {
		System.out.println("0,0,0,2");
	}
	*/
	
	public void buildBoard(clsBoard board, FiniteStateController main, clsTicTacToe trueMain){
		
		contentPane.removeAll();
		
		JLabel lbldimensionalTictactoe = new JLabel("4Dimensional TicTacToe");
		lbldimensionalTictactoe.setBounds(142, 10, 167, 25);
		contentPane.add(lbldimensionalTictactoe);

		GridLayout grid = new GridLayout(3,3);
		JPanel panel = new JPanel(grid);
		panel.setBounds(0, 55, 415, 415);
		contentPane.add(panel);
		
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JPanel panelArray[][] = new JPanel[3][3];
		clsButton[][][][] buttonArray = new clsButton[3][3][3][3];
		
		int[][] arrayCoord = new int[81][4];
		
		int e = 0;
		
		clsLabel playerLabel = new clsLabel(0);
		playerLabel.setBounds(5,30,200,25);
		contentPane.add(playerLabel);
		
		main.addPlayerLabel(playerLabel);
		
		clsLabelTwo scoreLabel = new clsLabelTwo();
		scoreLabel.setBounds(5,475,200,25);
		contentPane.add(scoreLabel);
		
		main.addScoreLabel(scoreLabel);
		
		clsLabelThree playerScoreLabel = new clsLabelThree(0);
		playerScoreLabel.setBounds(205,465,200,25);
		contentPane.add(playerScoreLabel);
		
		main.addPlayerScoreLabel(playerScoreLabel, 0);
		
		clsLabelThree playerScoreLabel1 = new clsLabelThree(1);
		playerScoreLabel1.setBounds(205,485,200,25);
		contentPane.add(playerScoreLabel1);
		
		main.addPlayerScoreLabel(playerScoreLabel1, 1);
		
		JButton resetButton = new JButton("Reset");
		resetButton.setBounds(170, 475, 75, 25);
		contentPane.add(resetButton);
		resetButton.addActionListener(trueMain);
		
		for (int a=0;a<3;a++){
			for (int b=0;b<3;b++){
				panelArray[b][a] = new JPanel(grid);
				panel.add(panelArray[b][a]);
				for (int c=0;c<3;c++){
					for (int d=0;d<3;d++){
						
						arrayCoord[e][0] = b;
						arrayCoord[e][1] = a;
						arrayCoord[e][2] = d;
						arrayCoord[e][3] = c;
						
						buttonArray[b][a][d][c] = new clsButton(arrayCoord[e],board);
						panelArray[b][a].add(buttonArray[b][a][d][c]);
						buttonArray[b][a][d][c].addActionListener(main);
						
						main.addButton(e, buttonArray[b][a][d][c]);
						
						/*buttonArray[b][a][d][c].addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								clsButton button = (clsButton) e.getSource();
								button.setText(representPiece(board.getPoint(button.getCoord())));
								System.out.println("Shwaaam");
							}
						});*/
						
						e++;
						}
					}
				}
			}
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
}
