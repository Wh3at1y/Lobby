package app.model;

import app.controller.AppController;

public class Account
	{
		/*
		 * Declaration Section
		 */
		private AppController controller;

		
		/*
		 * Constructor
		 */
		public Account(AppController controller)
			{
				this.controller = controller;
			}

		
		/**
		 * Updates the user name on the Main Panel with parameter
		 * @param userName
		 */
		public void updateUserName(String userName)
			{
				controller.getPanel().getMainPanel().setUserName(userName);
			}
	}
