package uga.cs1302.myStack;

import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerStackEmulator extends JFrame implements ActionListener {
	
	private Stack<String> stack;
	
//	private JTable stackTable;
//	private DefaultTableModel tableModel;
	private JTextArea stackTextArea;
	
	private JPanel rightPanel;
	
	private JPanel numberPanel;
	private JTextField numberTextField;
	private JButton[] numbers;
	private JButton pushButton;
	private JButton popButton;

	private JPanel sizePanel;
	private JTextField sizeTextField;
	private JButton sizeButton;
	//private int size = 0;
	
	public IntegerStackEmulator() {
		super("Integer Stack Emulator");
		this.setLayout(new GridLayout(1,2));
		
		stack = new Stack<>();
		
//		stackTable = new JTable();
//		tableModel = new DefaultTableModel();
//		tableModel.setColumnIdentifiers(new String[]{"Stack" /*,"Size:" + size*/});
//		stackTable.setModel(tableModel);
//		this.add(stackTable);
		
		stackTextArea = new JTextArea();
		stackTextArea.setEditable(false);
		stackTextArea.setLineWrap(true);
		stackTextArea.setWrapStyleWord(true);
		this.add(stackTextArea);
		
		rightPanel = new JPanel();
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.PAGE_AXIS));
		
		numberTextField = new JTextField(10);
		rightPanel.add(numberTextField);
		
		sizePanel = new JPanel();
		sizeTextField = new JTextField(10);
		
		sizePanel.add(sizeTextField);
		sizeButton = new JButton("Set Size");
		sizeButton.addActionListener(this);
		sizePanel.add(sizeButton);
		
		rightPanel.add(sizePanel);
		
		
		numberPanel = new JPanel(new GridLayout(4,3));
		pushButton = new JButton("Push");
		popButton = new JButton("Pop");
		
		numbers = new JButton[] {
				new JButton("1"),
				new JButton("2"),
				new JButton("3"),
				new JButton("4"),
				new JButton("5"),
				new JButton("6"),
				new JButton("7"),
				new JButton("8"),
				new JButton("9"),
				pushButton,
				new JButton("0"),
				popButton
		};
		
		for (JButton number : numbers) {
			numberPanel.add(number);
			number.addActionListener(this);
		}
		
		rightPanel.add(numberPanel);
		
		this.add(rightPanel);
		this.setMinimumSize(new Dimension(400,400));
		this.pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() instanceof JButton)
		{
			if (e.getSource() == pushButton) 
			{
				if (numberTextField.getText() == "")
				{
					//don't do anything
				}
				else
				{
					String push = numberTextField.getText();
					
						stack.push(push);
						stackTextArea.setText(stack.toString());
						numberTextField.setText("");
				}
			}
			else if  (e.getSource() == popButton)
			{
					stack.pop();	
					stackTextArea.setText(stack.toString());
			}
			else if (e.getSource() == sizeButton)
			{
				if (sizeButton.getText().equals(""))
				{
					//don't do anything
				}
				else
				{
				stack = new Stack<>(Integer.parseInt(sizeTextField.getText()));
				stackTextArea.setText(stack.toString());
				sizeTextField.setText("");
				}
			}
			else
			{
				String number = ((JButton) e.getSource()).getText();
				String text = numberTextField.getText();
				numberTextField.setText(text + number);
			}
		}
		else
		{
			
		}
	}
}
