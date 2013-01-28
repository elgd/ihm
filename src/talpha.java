import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class talpha extends JFrame{
	
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JButton but = new JButton("Hola");
	JButton but2 = new JButton("Pan2");
	CardLayout cl = new CardLayout();
	Random alea = new Random(System.currentTimeMillis());
	
	public talpha()
	{				
	panel.setBackground(Color.blue);
	panel2.setBackground(Color.GRAY);
	but.setSize(NORMAL, NORMAL);
	setName("Test fenetre");
	setTitle("Alpha 1");
	setSize(300, 300);
	this.setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new BorderLayout());
	//setResizable(false);
	//setAlwaysOnTop(true);
	
	
	panel.add(but);
	but.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event){
			panel.setBackground(new Color(Math.abs(alea.nextInt()) % 256,
		     		   Math.abs(alea.nextInt()) % 256,
		     		   Math.abs(alea.nextInt()) % 256));

		}
	});
	
	this.setContentPane(panel);
	//this.getContentPane().add(new JButton("Test"), BorderLayout.SOUTH);
	setVisible(true);
	
	}
	
}