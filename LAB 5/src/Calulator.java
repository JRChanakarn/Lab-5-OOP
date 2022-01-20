import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;


import java.text.*;
import java.util.*;

public class Calulator {

	protected static final char NULL = 0;
	protected Shell shell;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text maintext;
	protected  int [] num ;
	public int i = 0;
	public int j = 0;
	public int z = 0;
	public int c = 1;
	public int m = 0;
	public int cal = 0;
	public int sum = 0;
	public char b = 0;
	private Text text_1;
	

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Calulator window = new Calulator();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	
	
	/**
	 * Create contents of the window.
	 */
	public void createContents() {
		
		shell = new Shell();
		shell.setSize(464, 476);
		shell.setText("JR Calulator");
		
		int [] nu = new int[20];
		int [] tod = {0,1,10,100,1000,100000,1000000};
		int [] s = new int[20];
		String[] text  = new String[20];
		char [] oper = new char[20];
		
		Button btnNewButton = formToolkit.createButton(shell, "0", SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				if(i == 0) {
					maintext.setText("Can not start by 0");
					i = 0 ;
				}else {
					nu[i]=0;
					text[i] = "0";
					oper[i] = '0';
					maintext.setText(""+ nu[i] );
					System.out.print("i = : ");
					for (int i : nu) {
						  System.out.print( i );
						}
					System.out.println("");
					System.out.print("j = : ");
					for (char j : oper) {
						  System.out.print( j );
						}
					System.out.println("");
					    i++ ;
					    
				}	    
			}
			
		});
		btnNewButton.setBounds(47, 363, 189, 50);
		
		Button btnNewButton_1 = formToolkit.createButton(shell, "=", SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(i == 0) {
					maintext.setText("Can not start by =");
					i = 0 ;
				}else {
					
					System.out.println("-------------------------------------");
					oper[i] = '=';
					text[i] = "=";
					for(int a = 0 ; a <=i ; a ++) {
						
						if(oper[a] != '0' && nu[a] == 0 && oper[a] != NULL) {
	
							cal = 0;
						
						System.out.println("ham :" + oper[a] );
						
							for(int q = m ; q < a ; q++ ) {
							    cal = cal + (nu[q]*tod[a-q]);
							   
							}
						
						
							
							s[z] = cal;
							z++;

							m = a;
						}//end if
						
					}//end for
					
					
					sum = s[0];

					for(int a = 0 ; a <=i ; a ++) {
						
					
										
						if(oper[a] == '+') {
							
							System.out.println("sum = "+ sum + " s[a+1] = " + s[c] );
							
							sum = sum + s[c] ;
							c++;
						}//endif
						

						if(oper[a] == '-') {
							
							
							
							sum = sum - s[c] ;
							c++;
						}//endif
						

						if(oper[a] == '*') {
							
							sum = sum * s[c] ;
							c++;
						}//endif
						

						if(oper[a] == '/') {
							if(s[c] == 0){
								text_1.setText(" 0 can not /");
							}else {
							sum = sum / s[c] ;
							c++;
							}
						}//endif
						
						
						
						
						System.out.println( "sum = "+ sum );
						text_1.setText(" " + sum );
						
					}//end for
			
					
					
					
				}
			
				char [] oper = new char[20];
				int [] nu = new int[20];
				int [] s = new int[20];
				
			}//end widget
		});
		btnNewButton_1.setBounds(256, 307, 165, 106);
		
		Button btnNewButton_2 = formToolkit.createButton(shell, "1", SWT.NONE);
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				
			
				nu[i] = 1;
				oper[i] = '0';
				text[i] = "1";
				maintext.setText(" " + nu[i] );
				System.out.print("i = : ");
				for (int i : nu) {
					  System.out.print( i );
					}
				System.out.println("");
				System.out.print("j = : ");
				for (char j : oper) {
					  System.out.print( j );
					}
				System.out.println("");
				    i++ ;
				
			}
		});
		btnNewButton_2.setBounds(47, 307, 59, 50);
		
		Button btnNewButton_3 = formToolkit.createButton(shell, "2", SWT.NONE);
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				nu[i] = 2;
				oper[i] = '0';
				maintext.setText(" " + nu[i] );
				System.out.print("i = : ");
				for (int i : nu) {
					  System.out.print( i );
					}
				System.out.println("");
				System.out.print("j = : ");
				for (char j : oper) {
					  System.out.print( j );
					}
				System.out.println("");
				    i++ ;
				    
			}
		});
		btnNewButton_3.setBounds(112, 307, 59, 51);
		
		Button btnNewButton_4 = formToolkit.createButton(shell, "3", SWT.NONE);
		btnNewButton_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				nu[i] = 3;
				oper[i] = '0';
				maintext.setText(" " + nu[i] );
				System.out.print("i = : ");
				for (int i : nu) {
					  System.out.print( i );
					}
				System.out.println("");
				System.out.print("j = : ");
				for (char j : oper) {
					  System.out.print( j );
					}
				System.out.println("");
				    i++ ;
				    
			}
		});
		btnNewButton_4.setBounds(177, 307, 59, 50);
		
		Button btnNewButton_5 = formToolkit.createButton(shell, "4", SWT.NONE);
		btnNewButton_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				nu[i] = 4;
				oper[i] = '0';
				maintext.setText(" " + nu[i] );
				System.out.print("i = : ");
				for (int i : nu) {
					  System.out.print( i );
					}
				System.out.println("");
				System.out.print("j = : ");
				for (char j : oper) {
					  System.out.print( j );
					}
				System.out.println("");
				    i++ ;
			}
		});
		btnNewButton_5.setBounds(47, 251, 59, 50);
		
		Button btnNewButton_6 = formToolkit.createButton(shell, "5", SWT.NONE);
		btnNewButton_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				nu[i] = 5;
				oper[i] = '0';
				maintext.setText(" " + nu[i] );
				System.out.print("i = : ");
				for (int i : nu) {
					  System.out.print( i );
					}
				System.out.println("");
				System.out.print("j = : ");
				for (char j : oper) {
					  System.out.print( j );
					}
				System.out.println("");
				    i++ ;
			}
		});
		btnNewButton_6.setBounds(112, 251, 59, 50);
		
		Button btnNewButton_7 = formToolkit.createButton(shell, "6", SWT.NONE);
		btnNewButton_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				nu[i] = 6;
				oper[i] = '0';
				maintext.setText(" " + nu[i] );
				System.out.print("i = : ");
				for (int i : nu) {
					  System.out.print( i );
					}
				System.out.println("");
				System.out.print("j = : ");
				for (char j : oper) {
					  System.out.print( j );
					}
				System.out.println("");
				    i++ ;
			}
		});
		btnNewButton_7.setBounds(177, 251, 59, 50);
		
		Button btnNewButton_8 = formToolkit.createButton(shell, "7", SWT.NONE);
		btnNewButton_8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				nu[i] = 7;
				oper[i] = '0';
				maintext.setText(" " + nu[i] );
				System.out.print("i = : ");
				for (int i : nu) {
					  System.out.print( i );
					}
				System.out.println("");
				System.out.print("j = : ");
				for (char j : oper) {
					  System.out.print( j );
					}
				System.out.println("");
				    i++ ;
			}
		});
		btnNewButton_8.setBounds(47, 195, 59, 50);
		
		Button btnNewButton_9 = formToolkit.createButton(shell, "8", SWT.NONE);
		btnNewButton_9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				nu[i] = 8;
				oper[i] = '0';
				maintext.setText(" " + nu[i] );
				System.out.print("i = : ");
				for (int i : nu) {
					  System.out.print( i );
					}
				System.out.println("");
				System.out.print("j = : ");
				for (char j : oper) {
					  System.out.print( j );
					}
				System.out.println("");
				    i++ ;
			}
		});
		btnNewButton_9.setBounds(112, 195, 59, 50);
		
		Button btnNewButton_10 = formToolkit.createButton(shell, "9", SWT.NONE);
		btnNewButton_10.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				nu[i] = 9;
				oper[i] = '0';
				maintext.setText(" " + nu[i] );
				System.out.print("i = : ");
				for (int i : nu) {
					  System.out.print( i );
					}
				System.out.println("");
				System.out.print("j = : ");
				for (char j : oper) {
					  System.out.print( j );
					}
				System.out.println("");
				    i++ ;
			}
		});
		btnNewButton_10.setBounds(177, 195, 59, 50);
		
		Button btnNewButton_11 = formToolkit.createButton(shell, "*", SWT.NONE);
		btnNewButton_11.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(i == 0) {
					maintext.setText("Can not start by *");
					i = 0 ;
				}else {
					
					oper[i] = '*';
					maintext.setText(" " + oper[i] );
					System.out.print("i = : ");
					for (int i : nu) {
						  System.out.print( i );
						}
					System.out.println("");
					System.out.print("j = : ");
					for (char j : oper) {
						  System.out.print( j );
						}
					System.out.println("");
					    i++ ;
					
				}
			}
		});
		btnNewButton_11.setBounds(256, 251, 77, 50);
		
		Button btnNewButton_12 = formToolkit.createButton(shell, "/", SWT.NONE);
		btnNewButton_12.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(i == 0) {
					maintext.setText("Can not start by /");
					i = 0 ;
				}else {
					
					oper[i] = '/';
					maintext.setText(" " + oper[i] );
					System.out.print("i = : ");
					for (int i : nu) {
						  System.out.print( i );
						}
					System.out.println("");
					System.out.print("j = : ");
					for (char j : oper) {
						  System.out.print( j );
						}
					System.out.println("");
					    i++ ;
					
				}
			}
		});
		btnNewButton_12.setBounds(344, 251, 77, 50);
		
		Button btnNewButton_13 = formToolkit.createButton(shell, "+", SWT.NONE);
		btnNewButton_13.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(i == 0) {
					maintext.setText("Can not start by +");
					i = 0 ;
				}else {
					
					oper[i] = '+';
					maintext.setText(" " + oper[i] );
					System.out.print("i = : ");
					for (int i : nu) {
						  System.out.print( i );
						}
					System.out.println("");
					System.out.print("j = : ");
					for (char j : oper) {
						  System.out.print( j );
						}
					System.out.println("");
					    i++ ;
					
				}
			}
		});
		btnNewButton_13.setBounds(256, 195, 77, 50);
		
		Button btnNewButton_14 = formToolkit.createButton(shell, "-", SWT.NONE);
		btnNewButton_14.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(i == 0) {
					maintext.setText("Can not start by -");
					i = 0 ;
				}else {
					
					oper[i] = '-';
					maintext.setText(" " + oper[i] );
					System.out.print("i = : ");
					for (int i : nu) {
						  System.out.print( i );
						}
					System.out.println("");
					System.out.print("j = : ");
					for (char j : oper) {
						  System.out.print( j );
						}
					System.out.println("");
					    i++ ;
					
					
					
				}
			}
		});
		btnNewButton_14.setBounds(344, 195, 77, 50);
		
		maintext = formToolkit.createText(shell, "", SWT.NONE);
		maintext.setBounds(47, 38, 374, 106);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(47, 143, 374, 46);
		formToolkit.adapt(text_1, true, true);
		
	
		
		

	}
}
