package app.view;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public interface AllPanels
	{
		void buildPanel();
		void buildListeners();
		void buildPlacements();
		
		/*
		 * Gets the default system look and feel
		 */
		default void setLook()
		{
			try
				{	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());	}
			catch (ClassNotFoundException e)
				{	e.printStackTrace();		}
			catch (InstantiationException e)
				{	e.printStackTrace();		}
			catch (IllegalAccessException e)
				{	e.printStackTrace();		}
			catch (UnsupportedLookAndFeelException e)
				{	e.printStackTrace();		}
		}
	}
