
import java.util.ArrayList;
import java.util.List;

import modelo.Ponto;
import visao.MainFrame;
import visao.PlanoCartesianoPainel;

public class Main {
	public static void main(String[] args) {
		MainFrame mainFrame = new MainFrame("Plano Cartesiano");
		PlanoCartesianoPainel planoCartesianoPainel;

		List<Ponto> pontos = getPontos();

		planoCartesianoPainel = new PlanoCartesianoPainel();
		planoCartesianoPainel.setTamPixel(40);
		planoCartesianoPainel.setResolucaoAbstraida(new Ponto(10, 10));
		planoCartesianoPainel.setPontos(pontos);
	
		mainFrame.getContentPane().add(planoCartesianoPainel);
	}

	private static List<Ponto> getPontos() {
		List<Ponto> pontos = new ArrayList<Ponto>();
		pontos.add(new Ponto(2, 2));
		pontos.add(new Ponto(4, 4));
		pontos.add(new Ponto(4, 6));
		pontos.add(new Ponto(8, 6));

		return pontos;
	}

}
