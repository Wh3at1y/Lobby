package app.view;

import javax.swing.JFrame;
import app.controller.AppController;

public class AppFrame extends JFrame
	{
		/*
		 * Declaration Section
		 */
		private AppPanel panel;
		
		
		/*
		 * Constructor
		 */
		public AppFrame(AppController controller)
		{
			panel = new AppPanel(controller);
			
			setupFrame();
		}
		
		
		/*
		 * Sets the properties of the window & frame
		 */
		private void setupFrame()
		{
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setSize(800, 600);
			this.setTitle("SEKA Client");
			this.setContentPane(panel);
			this.setVisible(true);
		}
		
		
		/*
		 * Getters and Setters
		 */
		public AppPanel getPanel()
		{
			return panel;
		}
	}
