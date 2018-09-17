
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.NumberFormat;

import javax.swing.*;
public class Calculator {

	public static boolean isempty(JTextField t1,JTextField t2)
	{
		String s1=t1.getText();
		String s2=t2.getText();
		if(s1.equals("") || s1.equals("Enter a number") || s2.equals("") || s2.equals("Enter a number"))
			return true;
		return false;

	}
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				new Calculator();

			}

		});
	}

	public Calculator()
	{
		JFrame jf = new JFrame("Calculator");
		jf.getContentPane().setBackground(Color.CYAN);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400, 160);
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		jf.add(p);
		final JFormattedTextField num1 = new JFormattedTextField(NumberFormat.getNumberInstance());
		final JFormattedTextField num2 = new JFormattedTextField(NumberFormat.getNumberInstance());
		final JLabel ans = new JLabel("");
		ans.setAlignmentX(0);
		//ans.setSize(420,30);
		num1.setText("Enter a number");
		num2.setText("Enter a number");
		num1.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(num1.getText().equals("Enter a number"))
					num1.setText("");
				if(num2.getText().equals(""))
					num2.setText("Enter a number");

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

		});
		num2.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(num2.getText().equals("Enter a number"))
					num2.setText("");
				if(num1.getText().equals(""))
					num1.setText("Enter a number");

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {


			}

			@Override
			public void mousePressed(MouseEvent arg0) {

			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

		});
		p.add(num1);
		p.add(num2);
		p.add(ans);
		JPanel jp =new JPanel();
		jp.setLayout(new FlowLayout());
		JButton add = new JButton("+");
		JButton sub = new JButton("-");
		JButton mul = new JButton("*");
		JButton div = new JButton("/");
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ans.setText("");
				num1.setText("Enter a number");
				num2.setText("Enter a number");

			}

		});
		add.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(isempty(num1,num2))
					ans.setText("Mention Both the Numbers");
				else
				{
					int  n1 = Integer.parseInt(num1.getText());
					int  n2 = Integer.parseInt(num2.getText());
					ans.setText(n1+" + "+n2+" = " +(n1+n2));
				}

			}

		});
		sub.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {

				if(isempty(num1,num2))
					ans.setText("Mention Both the Numbers");
				else
				{
					int  n1 = Integer.parseInt(num1.getText());
					int  n2 = Integer.parseInt(num2.getText());
					ans.setText(n1+" - "+n2+" = " +(n1-n2));
				}
			}

		});
		mul.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(isempty(num1,num2))
					ans.setText("Mention Both the Numbers");
				else
				{
					int  n1 = Integer.parseInt(num1.getText());
					int  n2 = Integer.parseInt(num2.getText());
					ans.setText(n1+" * "+n2+" = " +(n1*n2));
				}
			}

		});
		div.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(isempty(num1,num2))
					ans.setText("Mention Both the Numbers");
				else
				{
					int  n1 = Integer.parseInt(num1.getText());
					int  n2 = Integer.parseInt(num2.getText());
					ans.setText(n1+" / "+n2+" = " +((float)n1/(float)n2));
				}
			}

		});
		jp.add(add);
		jp.add(sub);
		jp.add(mul);
		jp.add(div);
		jp.add(clear);
		p.add(jp);
		jf.setVisible(true);
	}

}
