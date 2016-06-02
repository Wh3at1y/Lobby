package app.controller;

import app.model.Account;
import app.view.AppFrame;
import app.view.AppPanel;

public class AppController
	{
		/*
		 * Declaration Section
		 */
		private AppFrame frame;
		private Account account;

		
		/*
		 * Constructor
		 */
		public AppController()
			{
				frame = new AppFrame(this);
				account = new Account(this);
			}

		
		/**
		 * Getters and Setters
		 */
		public AppPanel getPanel()
			{	return frame.getPanel();	}
		public Account getAccount()
			{	return account;	}
	}
