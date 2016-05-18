package app.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.*;
import app.controller.AppController;

public class MainPanel extends JPanel implements AllPanels
	{
		
		private SpringLayout layout;

		private JLabel helloUser;
		
		private JLabel backgroundImage;

		public MainPanel(AppController controller)
			{
				layout = new SpringLayout();

				helloUser = new JLabel();
				helloUser.setForeground(Color.WHITE);
				helloUser.setFont(new Font("Avenir", Font.PLAIN, 50));
				
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

		public void setUserName(String userName)
		{
			helloUser.setText("Welcome, " + userName + ".");
		}
		
		public void buildPlacements()
			{
			}
	}
