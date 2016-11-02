package uga.cs1302.myStack;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerStackEmulator extends JFrame implements ActionListener {
	
	private Stack<String> stack;
	
	private JTable stackTable;
	private DefaultTableModel tableModel;
	private JTextField stackTextField;
	
	private JPanel rightPanel;
	
	private JPanel numberPanel;
	private JTextField numberTextField;
	private JButton[] numbers;
	private JButton pushButton;
	private JButton popButton;
	private JButton clearButton;
	
	private JPanel sizePanel;
	private JTextField sizeTextField;
	private JButton sizeButton;
	//private int size = 0;
	
	public IntegerStackEmulator() {
		this.setLayout(new GridLayout(1,2));
		
		stack = new Stack<>();
		
		stackTable = new JTable();
		tableModel = new DefaultTableModel();
		tableModel.setColumnIdentifiers(new String[]{"Stack" /*,"Size:" + size*/});
		stackTable.setModel(tableModel);
		this.add(stackTable);
		
//		stackTextField = new JTextField(10);
//		stackTextField.setEditable(false);
//		this.add(stackTextField);
		
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
	
	public static void main(String[] args)
	{
		IntegerStackEmulator emulator = new IntegerStackEmulator();
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
					//	stackTextField.setText(stack.toString());
						System.out.println(stack.toString());
						numberTextField.setText("");
				}
			}
			else if  (e.getSource() == popButton)
			{
					stack.pop();
					//stackTextField.setText(stack.toString());
					System.out.println(stack.toString());
			}
			else if (e.getSource() == sizeButton)
			{
				if (sizeButton.getText().equals(""))
				{
					//don't do anything
				}
				else
				{
				//size = Integer.parseInt(sizeTextField.getText());
				stack = new Stack<>(Integer.parseInt(sizeTextField.getText()));
				tableModel.setRowCount(Integer.parseInt(sizeTextField.getText()));
				sizeTextField.setText("");
				System.out.println(tableModel.getRowCount());
				System.out.println(stack.toString());
				
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
