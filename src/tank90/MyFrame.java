package tank90;

import javax.swing.JFrame;


public class MyFrame extends JFrame{
	
	static final int W = 800;
	static final int H = 600;
	
	public MyFrame(){
		setSize(W,H);
		setLocation(100, 100);
		setLocationRelativeTo(null);
		setTitle("Tank 90");
		setDefaultCloseOperation(EXIT_ON_CLOSE);//DISPOSE_ON_CLOSE,DO_NOTHING_ON_CLOSE,EXIT_ON_CLOSE
		MyPanel myPanel = new MyPanel();
		add(myPanel);
		
		
		
		
		setVisible(true);
	}
	
	
}
