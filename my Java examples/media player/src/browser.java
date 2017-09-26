import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.html.*;
import java.net.*;




public class browser extends JFrame implements ActionListener, HyperlinkListener 
{
		
	
	JTextField url;
	Container pane;
	JEditorPane htmlpane; 
	JButton key1, key2, key3,key4, key5,key6 ;
	private JPanel panelTools,panelProgress;
	private ArrayList pagesVisited = new ArrayList();
	private ArrayList bookmarkedPages = new ArrayList();
	static URL currentUrl, pageUrl, correctUrl ;
	JProgressBar progressBar = new JProgressBar(0, 2000);
	int num = 0;
	JTabbedPane tab;


	
	public browser(String theURL)  
	{
     	
		super("BROWSER ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		///// CREATE MENU
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenu bookmarksMenu = new JMenu("Bookmarks");
		JMenu helpMenu = new JMenu("Help");
		
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
	
		JMenuItem newWindowMenuItem = new JMenuItem("New window", KeyEvent.VK_N);
		KeyStroke ctrlN = KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK);
		newWindowMenuItem.setAccelerator(ctrlN);
		newWindowMenuItem.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				browser frame = new browser("http://www.cs.nott.ac.uk/~tar/G52GUI/coursework.html");
				frame.setVisible(true);
				frame.iterate();
			}
		}); //created new menu item NEW WINDOW
		

		JMenuItem newTabMenuItem = new JMenuItem("New Tab", KeyEvent.VK_T);
		KeyStroke ctrlT = KeyStroke.getKeyStroke(KeyEvent.VK_T,InputEvent.CTRL_MASK);
		newTabMenuItem.setAccelerator(ctrlT);
		newTabMenuItem.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				MyAction();
			}
		});   //created new menu item NEW TAB
		
		
		JMenuItem fileExitMenuItem = new JMenuItem("Exit", KeyEvent.VK_X);
		KeyStroke ctrlX = KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_MASK);
		fileExitMenuItem.setAccelerator(ctrlX);
		fileExitMenuItem.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		}); //created new menu item EXIT
		
		
		
		JMenuItem bookmarksMenuItem = new JMenuItem("Favourites", KeyEvent.VK_F);
		KeyStroke ctrlF = KeyStroke.getKeyStroke(KeyEvent.VK_F,InputEvent.CTRL_MASK);
		bookmarksMenuItem.setAccelerator(ctrlF);

		
		bookmarksMenuItem.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				 Component source = (Component) e.getSource();
        		 Object response = JOptionPane.showInputDialog(source,"Choose one of your favourites:",
          	  "Favourites", JOptionPane.QUESTION_MESSAGE, null, new String[] { "A","B", "C","D","E" },"E");
          	  
      		 	 System.out.println("Response: " + response);
      			
			}
		}); //created new menu item Favourites
			
		
		
		JMenuItem helpMenuItem = new JMenuItem("Help", KeyEvent.VK_H);
		KeyStroke ctrlH = KeyStroke.getKeyStroke(KeyEvent.VK_H,InputEvent.CTRL_MASK);
		helpMenuItem.setAccelerator(ctrlH);
		helpMenuItem.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					htmlpane.setPage("http://www.nottingham.ac.uk/utilities/help.aspx");
			
					URL newUrl = htmlpane.getPage();  
					url.setText(newUrl.toString());  
				}
				catch (Exception ex){}
			}
		}); //created new menu item HELP
		
		
		menuBar.add(fileMenu);
		menuBar.add(bookmarksMenu);
		menuBar.add(helpMenu);
		setJMenuBar(menuBar);
		fileMenu.add(newWindowMenuItem);
		fileMenu.add(newTabMenuItem);
		fileMenu.add(fileExitMenuItem);
		bookmarksMenu.add(bookmarksMenuItem);
		helpMenu.add(helpMenuItem);
				
		
		
		/////// CREATE panelTools
		panelTools = new JPanel();
		
		key1 = new JButton("<< BACK");
		key1.setActionCommand("<< BACK");
		key1.addActionListener(this);
		panelTools.add(key1);
		
		
		key2 = new JButton("FORWARD >>");
		key2.setActionCommand("FORWARD >>");
		key2.addActionListener(this);
		panelTools.add(key2);
		
		
		key3 = new JButton("LOAD");
		key3.setActionCommand("LOAD");
		key3.addActionListener(this);
		panelTools.add(key3);
		
		
		url = new JTextField(theURL);       
		url.addActionListener(this);
		panelTools.add(url);
		url.setPreferredSize(new Dimension(450, 26));
	
		
		key6 = new JButton("HOME");
		key6.setActionCommand("HOME");
		key6.addActionListener(this);
		panelTools.add(key6);

		
		key4 = new JButton("Bookmark");
		key4.setActionCommand("Bookmark");
		key4.addActionListener(this);
		panelTools.add(key4);
			
		
		
		///////////CREATE PROGRESS BAR
		panelProgress = new JPanel();
		
		progressBar.setValue(0);
		panelProgress.add(progressBar);

	       
		try 
		{
			htmlpane = new JEditorPane(url.getText());
			htmlpane.setEditable(false); 
			 
			htmlpane.addHyperlinkListener(this);    	 
			this.add(new JScrollPane(htmlpane));
		     
		}
		catch ( IOException ioe)
		{
			System.out.println("Error opening web page");
		}
		
	 
		htmlpane.setSize(600,550); 
		this.setSize(500,500);
		this.pack();   
		
		
		
		//////SET UP PAGE LAYOUT
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(panelTools, BoxLayout.X_AXIS);
		getContentPane().add(panelProgress, BorderLayout.SOUTH);
		
		
		pane = this.getContentPane();  
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS)); 

		
		setSize(950,700);
		
		setVisible(true);
		
	}
    
 
    
	//ActionListener Method
	public void actionPerformed(ActionEvent e) 
	{
	    
		String location  = this.url.getText();	
		try 
		{
			htmlpane.setPage(location);
		}
		catch (Exception ex) 
		{
			System.err.println("Unable to Move to " + location);
		}
		
		
		
		if (e.getActionCommand().equals("<< BACK"))
		{
			goBack();
		}
		else if (e.getActionCommand().equals("FORWARD >>"))
		{
			goForward();
		}
		else if (e.getActionCommand().equals("LOAD"))
		{
			//iterate();
			loadPage();
		}
		else if (e.getActionCommand().equals("HOME"))
		{
			homePage();
		}
		else if (e.getActionCommand().equals("Bookmark"))
		{
			bookmark();
		}

	}
	
	
	
	// HyperlinkListener Method
	public void hyperlinkUpdate(HyperlinkEvent e) 
	{
		if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
		{
			JEditorPane pane = (JEditorPane) e.getSource();
			if (e instanceof HTMLFrameHyperlinkEvent) 
			{
				HTMLFrameHyperlinkEvent  evt = (HTMLFrameHyperlinkEvent)e;
				HTMLDocument doc = (HTMLDocument)htmlpane.getDocument();
				doc.processHTMLFrameHyperlinkEvent(evt);
			} 
			else
			{
				show(e.getURL(), true);
			}
		}
	}
	
	
	
	private void goBack()
	{
		reset();
		currentUrl = htmlpane.getPage();
		int pageIndex = pagesVisited.indexOf(currentUrl.toString());
		try 
		{
			show(new URL((String) pagesVisited.get(pageIndex - 1)), false);
		} 
		catch (Exception e) 
		{}
	}
	
	
	
	private void goForward()
	{
		reset();
		currentUrl = htmlpane.getPage();
		int pageIndex = pagesVisited.indexOf(currentUrl.toString());
		try 
		{
			show(new URL((String) pagesVisited.get(pageIndex + 1)),false);
		} 
		catch (Exception e) 
		{}
	}
	
	private void loadPage()
	{
		correctUrl = verifyUrl(url.getText());
		if (correctUrl != null) 
		{
			reset();
			show(correctUrl ,true);
			//JOptionPane.showMessageDialog(null, "page is loaded");
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "Unable to load page requested ");
		}
		
	}
	
	private void homePage()
	{
		reset();
		try 
		{
			htmlpane.setPage("http://www.cs.nott.ac.uk/~tar/G52GUI/coursework.html");
			
			URL newUrl = htmlpane.getPage();  
			url.setText(newUrl.toString());  
			
			iterate();
		}
		catch (Exception e)
		{
		}
		
	}
	
	
	private void MyAction()
	{
		
		String str = "";
		String st = JOptionPane.showInputDialog(null, "Enter the url you want to visit");
		if(!st.equals(""))
		{
			browser frame = new browser(st);
			frame.setVisible(true);
			frame.iterate();

		}
		
	}
	
		
	
	
	private void bookmark()
	{
		int option = JOptionPane.showConfirmDialog(null,"Add to favourites ?","Bookmark", JOptionPane.YES_NO_OPTION);
		if (option == JOptionPane.YES_OPTION) 
		{
			
			currentUrl = htmlpane.getPage();   // Get URL of page currently being displayed.
			
			int listSize = bookmarkedPages.size();
			int pageIndex = pagesVisited.indexOf(currentUrl.toString());
			
			for (int i = pageIndex - 1; i < pageIndex; i++) 
			{
				bookmarkedPages.add(i);
				JOptionPane.showMessageDialog(null, "Bookmarked saved");
				//System.out.println("Saved url to bookmarkedPages(ArrayList)");
			}
			
		} 
		else if (option == JOptionPane.NO_OPTION) 
		{
			System.out.println("nothing happens");
		}
		
		
	}
	
	
	
	private URL verifyUrl(String url) 
	{
		if (!url.toLowerCase().startsWith("http://"))
		{	
			return null;
		}	
        
		URL correctUrl = null;
		try 
		{
			correctUrl = new URL(url);
		} 
		catch (Exception e) 
		{
			return null;
		}
        
		return correctUrl;
	}
    
    
	private void show(URL pageUrl, boolean add)
	{
		reset();
		try 
		{
			currentUrl = htmlpane.getPage();  
			htmlpane.setPage(pageUrl);  
			
			URL newUrl = htmlpane.getPage();  
			
			if (add)   
			{
				int listSize = pagesVisited.size();
				if (listSize > 0) 
				{
					int pageIndex = pagesVisited.indexOf(currentUrl.toString());
					if (pageIndex < listSize - 1) 
					{
						for (int i = listSize - 1; i > pageIndex; i--) 
						{
							pagesVisited.remove(i);
						}
					}
				}
				pagesVisited.add(newUrl.toString());
			}
			
			url.setText(newUrl.toString());  
			
			
			
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null, "Unable to load page requested");
		}
		finally
		{
			iterate();	
		}
			
			
		
	}

	
	private void iterate() 
	{
		while (num < 2000) 
		{
			progressBar.setValue(num);
			try 
			{
				Thread.sleep(100);
			} 
			catch (InterruptedException e) 
			{
			}
			num += 95;
		}

	}
	
	
	public void reset() 
	{
		progressBar.setValue(0);
	}
	
	
	  
	public static void main(String[] args) 
	{
		browser frame = new browser("http://www.cs.nott.ac.uk/~tar/G52GUI/coursework.html");
		frame.setVisible(true);
		//frame.iterate();
	}
	
	
}
