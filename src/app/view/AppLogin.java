package app.view;

import java.awt.Color;
import javax.swing.*;

public class AppLogin extends JPanel implements AllPanels
	{
		private SpringLayout layout;

		private JLabel userNameLabel;
		private JLabel userPasswordLabel;
		private JLabel backgroundImage;

		private JTextField userNameField;
		private JPasswordField userPasswordField;

		private JButton loginButton;

		public AppLogin()
			{
				layout = new SpringLayout();

				userNameLabel = new JLabel("Enter User Name");
				userNameLabel.setForeground(Color.WHITE);
				
				userPasswordLabel = new JLabel("Enter Password");
				userPasswordLabel.setForeground(Color.WHITE);
				
				backgroundImage = new JLabel();
				backgroundImage.setIcon(new ImageIcon(AppLogin.class.getResource("/app/view/background.png")));

				userNameField = new JTextField();
				userPasswordField = new JPasswordField();

				loginButton = new JButton("Login");

				buildPanel();
				buildPlacements();
				buildListeners();
			}

		public void buildPanel()
			{
				setLayout(layout);
				add(userNameLabel);
				add(userPasswordLabel);
				add(userNameField);
				add(userPasswordField);
				add(loginButton);
				add(backgroundImage);
			}

		public void buildListeners()
			{
			}

		public void buildPlacements()
			{
				layout.putConstraint(SpringLayout.WEST, loginButton, 200, SpringLayout.WEST, this);
				layout.putConstraint(SpringLayout.EAST, loginButton, -200, SpringLayout.EAST, this);
				layout.putConstraint(SpringLayout.NORTH, loginButton, 300, SpringLayout.NORTH, this);
				layout.putConstraint(SpringLayout.WEST, userNameField, 0, SpringLayout.WEST, loginButton);
				layout.putConstraint(SpringLayout.EAST, userNameField, 0, SpringLayout.EAST, loginButton);
				layout.putConstraint(SpringLayout.WEST, userPasswordField, 0, SpringLayout.WEST, loginButton);
				layout.putConstraint(SpringLayout.SOUTH, userPasswordField, -20, SpringLayout.NORTH, loginButton);
				layout.putConstraint(SpringLayout.EAST, userPasswordField, 0, SpringLayout.EAST, loginButton);
				layout.putConstraint(SpringLayout.SOUTH, userNameField, -20, SpringLayout.NORTH, userPasswordField);
				layout.putConstraint(SpringLayout.WEST, userPasswordLabel, 0, SpringLayout.WEST, userPasswordField);
				layout.putConstraint(SpringLayout.SOUTH, userPasswordLabel, 0, SpringLayout.NORTH, userPasswordField);
				layout.putConstraint(SpringLayout.WEST, userNameLabel, 0, SpringLayout.WEST, userNameField);
				layout.putConstraint(SpringLayout.SOUTH, userNameLabel, 0, SpringLayout.NORTH, userNameField);
				layout.putConstraint(SpringLayout.NORTH, backgroundImage, 0, SpringLayout.NORTH, this);
				layout.putConstraint(SpringLayout.WEST, backgroundImage, 0, SpringLayout.WEST, this);
				layout.putConstraint(SpringLayout.SOUTH, backgroundImage, 0, SpringLayout.SOUTH, this);
				layout.putConstraint(SpringLayout.EAST, backgroundImage, 0, SpringLayout.EAST, this);
			}
	}
