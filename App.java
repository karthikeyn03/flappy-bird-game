import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

	//Game window in pixels
	int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        // frame.setVisible(true);
		frame.setSize(boardWidth, boardHeight);     //set the size
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);    //place the window at the center of the window so the user connot resize the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//the above code is to create the blank page of the game with the title flapp bird
	    
        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);	   //adding flappybird to frame
        frame.pack();		//it is used to show the title bar for this program
        flappyBird.requestFocus();
        frame.setVisible(true);//after adding jpanal it will visible to user - so i have comment the line 11
    }
}
