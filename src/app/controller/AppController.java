package app.controller;

import app.view.AppFrame;
import app.view.AppPanel;

public class AppController
	{
		private AppFrame frame;

		public AppController()
			{
				frame = new AppFrame(this);
			}

		public AppPanel getPanel()
			{
				return frame.getPanel();
			}
	}
