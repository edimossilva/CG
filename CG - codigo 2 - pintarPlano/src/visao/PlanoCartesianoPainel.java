package visao;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import modelo.Ponto;

public class PlanoCartesianoPainel extends JPanel {
	private static final long serialVersionUID = 1L;
	private List<Ponto> pontos;
	private Ponto resolucaoAbstraida;
	private int tamPixel;

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

		pintaPlanoCartesiano(g2d);
		g2d.setColor(Color.BLUE);
		pintarPixels(g2d);

	}

	private void pintarPixels(Graphics2D g2d) {
		for (Ponto ponto : getPontos()) {
			Ponto pontoConvertido = ponto.escala(getTamPixel());
			pintarPixel(g2d, getTamPixel(), pontoConvertido);
		}
	}

	public void setResolucaoAbstraida(Ponto resolucao) {
		this.resolucaoAbstraida = resolucao;
	}

	private Ponto getResolucaoReal() {
		return resolucaoAbstraida.escala(getTamPixel());
	}

	private List<Ponto> getPontos() {
		return pontos;
	}

	private void pintarPixel(Graphics2D g2d, int tamPixel, Ponto pontoConvertido) {
		g2d.fillRect(pontoConvertido.getX(), pontoConvertido.getY(), tamPixel, tamPixel);
	}

	private void pintaPlanoCartesiano(Graphics2D g2d) {
		Ponto pontoMin = new Ponto(0, 0);
		Ponto pontoMax = getResolucaoReal();
		int tamPixel = getTamPixel();

		for (int x = pontoMin.getX(); x <= pontoMax.getX(); x += tamPixel) {
			g2d.drawLine(x, pontoMin.getY(), x, pontoMax.getY());
		}
		for (int y = pontoMin.getY(); y <= pontoMax.getY(); y += tamPixel) {
			g2d.drawLine(pontoMin.getX(), y, pontoMax.getX(), y);
		}
	}

	public void setPontos(List<Ponto> pontos) {
		this.pontos = pontos;
	}

	public void setTamPixel(int tamPixel) {
		this.tamPixel = tamPixel;
	}

	public int getTamPixel() {
		return tamPixel;
	}

}
