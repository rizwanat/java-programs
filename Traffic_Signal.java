package cycle6;
import java.awt.*;
import java.awt.event.*;
//import java.util.*;
import javax.swing.*;

class Traffic_Signal
	extends JFrame implements ItemListener {
	
	JRadioButton jr1;
	JRadioButton jr2;
	JRadioButton jr3;
	
	ButtonGroup b = new ButtonGroup();

	int x = 0, y = 0, z = 0;
	public Traffic_Signal()
	{
		setLayout(new FlowLayout());

		jr1 = new JRadioButton("Red");
		jr2 = new JRadioButton("Yellow");
		jr3 = new JRadioButton("Green");

		jr1.addItemListener(this);
		jr2.addItemListener(this);
		jr3.addItemListener(this);

		add(jr1);
		add(jr2);
		add(jr3);
		b.add(jr1);
		b.add(jr2);
		b.add(jr3);
	}

	public void itemStateChanged(ItemEvent ie)
	{

		if (ie.getSource() == jr1) {
			if (ie.getStateChange() == 1) {

				x = 1;

				repaint();
			}
			
		}

		if (ie.getSource() == jr2) {
			if (ie.getStateChange() == 1) {

				y = 1;

				repaint();
			}
		}

		if (ie.getSource() == jr3) {
			if (ie.getStateChange() == 1) {

				z = 1;
				repaint();
			}
		}
	}

	public void paint(Graphics g)
	{
		g.drawRect(100, 105, 110, 270);
		g.drawOval(120, 150, 60, 60);
		g.drawOval(120, 230, 60, 60);
		g.drawOval(120, 300, 60, 60);

		if (x == 1) {
			g.setColor(Color.RED);
			g.fillOval(120, 150, 60, 60);
			g.setColor(Color.WHITE);
			g.fillOval(120, 230, 60, 60);
			g.setColor(Color.WHITE);
			g.fillOval(120, 300, 60, 60);
			x = 0;
		}

		if (y == 1) {
			g.setColor(Color.WHITE);
			g.fillOval(120, 150, 60, 60);
			g.setColor(Color.YELLOW);
			g.fillOval(120, 230, 60, 60);
			g.setColor(Color.WHITE);
			g.fillOval(120, 300, 60, 60);
			y = 0;
		}

		if (z == 1) {
			g.setColor(Color.WHITE);
			g.fillOval(120, 150, 60, 60);
			g.setColor(Color.WHITE);
			g.fillOval(120, 230, 60, 60);
			g.setColor(Color.GREEN);
			g.fillOval(120, 300, 60, 60);
			z = 0;
		}
	}

	public static void main(String args[])
	{
	
		JFrame jf = new Traffic_Signal();

		jf.setSize(500, 500);
		jf.setVisible(true);
	}
}