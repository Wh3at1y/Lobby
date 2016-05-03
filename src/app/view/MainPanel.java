package app.view;

import javax.swing.*;

public class MainPanel extends JPanel implements AllPanels
	{
		private SpringLayout layout;

		private JLabel helloUser;
		
		private JLabel backgroundImage;

		public MainPanel()
			{
				layout = new SpringLayout();
				
				helloUser = new JLabel("Hello ");

				backgroundImage = new JLabel();
				backgroundImage.setIcon(new ImageIcon(MainPanel.class.getResource("/app/view/mainbackground.png")));

				buildPanel();
				buildPlacements();
				buildListeners();
			}

		public void buildPanel()
			{
				setLayout(layout);
				add(helloUser);
				add(backgroundImage);
			}

		public void buildListeners()
			{
			}

		public void buildPlacements()
			{
			}
	}
