package app.view;

import java.awt.Dimension;
import javax.swing.*;
import app.controller.AppController;

public class AppPanel extends JPanel implements AllPanels
	{
		private SpringLayout layout;
		
		private AppLogin loginPanel;
		private MainPanel mainPanel;
		
		public AppPanel(AppController controller)
			{	
				layout = new SpringLayout();
				
				loginPanel = new AppLogin(controller);
				loginPanel.setPreferredSize(new Dimension(800,600));
				
				mainPanel = new MainPanel(controller);
				mainPanel.setPreferredSize(new Dimension(800,600));
				mainPanel.setVisible(false);
				
				buildPanel();
				buildPlacements();
				buildListeners();
			}

		public void buildPanel()
			{
				setLayout(layout);
				add(mainPanel);
				add(loginPanel);
			}

		public void buildListeners()
			{
			}

		public void buildPlacements()
			{
			}

		public AppLogin getLoginPanel()
			{
				return loginPanel;
			}

		public MainPanel getMainPanel()
			{
				return mainPanel;
			}
	}
