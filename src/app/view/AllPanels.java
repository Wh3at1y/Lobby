package app.view;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public interface AllPanels
	{
		void buildPanel();
		void buildListeners();
		void buildPlacements();
		
		default void setLook()
		{
			try
				{
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				}
			catch (ClassNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			catch (InstantiationException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			catch (IllegalAccessException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			catch (UnsupportedLookAndFeelException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
