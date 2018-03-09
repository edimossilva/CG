package visao;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame(String titulo) {
		super(titulo);
		initGui();

	}

	private void initGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(true);
		setBounds(0, 0, 800, 600);
		setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		setVisible(true);
	}

}