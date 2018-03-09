
import visao.MainFrame;
import visao.PlanoCartesianoPainel;

public class Main {
	public static void main(String[] args) {
		MainFrame mainFrame = new MainFrame("Plano Cartesiano");
		PlanoCartesianoPainel planoCartesianoPainel;

		planoCartesianoPainel = new PlanoCartesianoPainel();

		mainFrame.getContentPane().add(planoCartesianoPainel);
	}

}
