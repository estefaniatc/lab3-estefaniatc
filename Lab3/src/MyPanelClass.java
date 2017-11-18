import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;

		//Paint the background
		g.setColor(Color.MAGENTA);
		g.fillRect(x1, y1, width + 1, height + 1);
		
		g.setColor(Color.white);
		g.fillRect(x1, y1, width + 1, height + 1);

		g.setColor(Color.red);
		g.fillRect(x1+10, y1+10, x1+210,30);
		g.fillRect(x1+10, y1+70, x1+210,30);
		g.fillRect(x1+10, y1+130, x1+210,30);
		

		g.setColor(Color.BLUE);
		Polygon p1=new Polygon();
		p1.addPoint(x1+10,y1+10);
		p1.addPoint(x1+115,y1+170/2);
		p1.addPoint(x1+10,y1+160);
		g.fillPolygon(p1);




		Polygon p2 = new Polygon();
		p2.addPoint(x1 + 25, y1 + 73);
		p2.addPoint(x1 + 41, y1 + 73);
		p2.addPoint(x1 + 47, y1 + 58);
		p2.addPoint(x1 + 53, y1 + 73);
		p2.addPoint(x1 + 69, y1 + 73);
		p2.addPoint(x1 + 56, y1 + 83);
		p2.addPoint(x1 + 61, y1 + 98);
		p2.addPoint(x1 + 47, y1 + 88);
		p2.addPoint(x1 + 34, y1 + 98);
		p2.addPoint(x1 + 38, y1 + 83);
		g.setColor(Color.WHITE);
		g.fillPolygon(p2);
	}
}