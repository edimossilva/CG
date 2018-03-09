package visao;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class PlanoCartesianoPainel extends JPanel {
	private static final long serialVersionUID = 1L;

	public PlanoCartesianoPainel() {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBounds(0, 0, 800, 600);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.white);
		setLayout(null);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawLine(0, 0, 200, 200);
		
		
	}

}
