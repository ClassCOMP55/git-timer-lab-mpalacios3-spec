import acm.graphics.*;
import javax.swing.*;
import acm.program.*;
import java.awt.event.*;

public class MyFirstTimer extends GraphicsProgram implements ActionListener{
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
	private int numTimes;

	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		myLabel = new GLabel("# of times called?", 0, 100);
		add(myLabel);
		Timer t = new Timer(1000, this);
		numTimes = 0;
		t.setInitialDelay(3000);
		t.start();
		pause(10000);
		t.stop();
	}
	
	public void actionPerformed(ActionEvent e) {
		//TODO add what we want to do every second
		myLabel.move(5, 0);
		numTimes++;
		myLabel.setLabel("times called?"  + numTimes);
	}
	
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}