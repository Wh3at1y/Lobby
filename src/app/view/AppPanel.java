package app.view;

import java.awt.Dimension;
import javax.swing.*;
import app.controller.AppController;

public class AppPanel extends JPanel implements AllPanels
	{
		private SpringLayout layout;
		
		private AppLogin loginPanel;
		
		public AppPanel(AppController controller)
			{
				layout = new SpringLayout();
				
				loginPanel = new AppLogin();
				loginPanel.setPreferredSize(new Dimension(800,600));
				
				buildPanel();
				buildPlacements();
				buildListeners();
			}

		public void buildPanel()
			{
				setLayout(layout);
				add(loginPanel);
			}

		public void buildListeners()
			{
			}

		public void buildPlacements()
			{
			}
	}
