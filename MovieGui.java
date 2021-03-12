//GUI based version of the Movie application from Chapter 1

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovieGui extends JFrame implements ActionListener
{
	
	//instance variables for this class
	Font myFont =  new Font("Times New Roman", Font.BOLD, 24);
	JLabel quote = new JLabel("Game over man! Game over!");
	JLabel movie = new JLabel("");
	JButton button = new JButton("Show Movie");

	//Create a custom constructor for this class
	public MovieGui()
	{
		super("Movie Quote App");
		setSize(320,160);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,1));
		getContentPane().setBackground(new Color(152,224,190));
		setVisible(true);
		quote.setFont(myFont);
		movie.setFont(myFont);
		button.setForeground(Color.RED);
		add(quote);
		add(button);
		add(movie);
		button.addActionListener(this);
	}

	//Event handling method
	@Override
	public void actionPerformed(ActionEvent evt)
	{
		movie.setText("*** Aliens (1986) ***");
	}

	public static void main(String[] args)	
	{
		MovieGui myFrame = new MovieGui();
	}
}