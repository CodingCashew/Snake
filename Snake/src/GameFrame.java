import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GameFrame() {
				
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		// pack method takes JFrame and fits it snugly around components
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null); // centers it in middle of screen
	}

}
