package app.view;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import app.controller.AppController;

public class AppLogin extends JPanel implements AllPanels
	{
		private AppController controller;

		private SpringLayout layout;

		private JLabel userNameLabel;
		private JLabel userPasswordLabel;
		private JLabel backgroundImage;

		private JTextField userNameField;
		private JPasswordField userPasswordField;

		private JButton loginButton;

		public AppLogin(AppController controller)
			{
				setLook();
				this.controller = controller;
				this.setFocusable(true);
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
				
				userPasswordField.addKeyListener(new KeyListener()
				{
					@Override
					public void keyPressed(KeyEvent pressed)
						{
							enterButton();	
						}

					public void keyReleased(KeyEvent e)
						{
							// TODO Auto-generated method stub
							
						}

					@Override
					public void keyTyped(KeyEvent e)
						{
							// TODO Auto-generated method stub
							
						}
				});
				
				userNameField.addKeyListener(new KeyListener()
					{
						@Override
						public void keyPressed(KeyEvent pressed)
							{
								enterButton();	
							}

						public void keyReleased(KeyEvent e)
							{
								// TODO Auto-generated method stub
								
							}

						@Override
						public void keyTyped(KeyEvent e)
							{
								// TODO Auto-generated method stub
								
							}
					});
				
				loginButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
							{
								enterButton();
							}
					});
				
				this.addKeyListener(new KeyListener()
					{
						@Override
						public void keyPressed(KeyEvent pressed)
							{
								enterButton();
							}

						public void keyTyped(KeyEvent e)
							{
								// TODO Auto-generated method stub
								
							}

						public void keyReleased(KeyEvent e)
							{
								// TODO Auto-generated method stub
								
							}
					});

			}
		
		private void enterButton()
		{
			if (checkLogin() == true)
				{
					setVisible(false);
					controller.getPanel().getMainPanel().setVisible(true);
					controller.getPanel().getMainPanel().setUserName(userNameField.getText());
				}
		}

		private boolean checkLogin()
			{
				boolean canLogin = true;
				String userName = userNameField.getText();
				int userPassword = userPasswordField.getText().length();

				if (userName.length() > 15)
					{
						userNameLabel.setForeground(Color.RED);
						JOptionPane.showMessageDialog(null, "Username has too many characters! Must be below 15.");
						canLogin = false;
					}
				else if (userName.length() < 5)
					{
						userNameLabel.setForeground(Color.RED);
						JOptionPane.showMessageDialog(null, "Username has too few characters! Must be more than 5.");
						canLogin = false;
					}
				if (userPassword > 15)
					{
						userPasswordLabel.setForeground(Color.RED);
						JOptionPane.showMessageDialog(null, "Password has too many characters! Must be below 15.");
						canLogin = false;
					}
				if (userPassword < 5)
					{
						userPasswordLabel.setForeground(Color.RED);
						JOptionPane.showMessageDialog(null, "Password has too few characters! Must be more than 5.");
						canLogin = false;
					}
				return canLogin;
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
