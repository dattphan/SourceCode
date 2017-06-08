import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.omg.CORBA.Environment;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FrontEndClass{

	protected Shell shell;
	private Text txtGetNumber;
	private Text txtReFormat;
	private Text txtBreak;
	private Text txtSort;
	private Text txtCaseF;
	private Text txtRemoveHTML;
	private Text txtAddLineNo;
	private Text txtInput;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FrontEndClass window = new FrontEndClass();
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
	
	
	protected void createContents() {
		shell = new Shell();
		shell.setSize(449, 621);
		//Rename the Form
		shell.setText("Final Project for Java course");
		
		Label lblInput = new Label(shell, SWT.CENTER);
		lblInput.setBounds(10, 10, 120, 25);
		lblInput.setText("Input ");
		
		txtInput = new Text(shell, SWT.BORDER);
		txtInput.setBounds(145, 10, 265, 26);
		
		Button btnFormatAll = new Button(shell, SWT.NONE);
		btnFormatAll.setBounds(170, 41, 221, 25);
		btnFormatAll.setText("Format All");
		
		Button btnGetNumber = new Button(shell, SWT.NONE);
		btnGetNumber.setBounds(10, 80, 120, 26);
		btnGetNumber.setText("Get Number");
		
		txtGetNumber = new Text(shell, SWT.BORDER | SWT.MULTI);
		txtGetNumber.setBounds(145, 80, 265, 26);
		//Assign the attribute Cannot Edit the Textbox
		txtGetNumber.setEditable(false);
		
		txtReFormat = new Text(shell, SWT.BORDER | SWT.MULTI);
		txtReFormat.setBounds(146, 133, 264, 26);
		//Assign the attribute Cannot Edit the Textbox
		txtReFormat.setEditable(false);
		
		Button btnReformat = new Button(shell, SWT.NONE);
		btnReformat.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnReformat.setBounds(10, 133, 120, 26);
		btnReformat.setText("Re-Format");
		
		Button btnBreak = new Button(shell, SWT.NONE);
		btnBreak.setBounds(10, 186, 120, 26);
		btnBreak.setText("Break");
		
		txtBreak = new Text(shell, SWT.BORDER | SWT.MULTI);
		txtBreak.setBounds(145, 186, 265, 26);
		//Assign the attribute Cannot Edit the Textbox
		txtBreak.setEditable(false);
		
		
		Button btnSort = new Button(shell, SWT.NONE);
		btnSort.setBounds(10, 243, 120, 26);
		btnSort.setText("Sort");
		
		txtSort = new Text(shell, SWT.BORDER | SWT.MULTI);
		txtSort.setBounds(146, 243, 264, 26);
		//Assign the attribute Cannot Edit the Textbox
		txtSort.setEditable(false);
		
		txtCaseF = new Text(shell, SWT.BORDER | SWT.MULTI);
		txtCaseF.setBounds(145, 292, 265, 50);
		//Assign the attribute Cannot Edit the Textbox
		txtCaseF.setEditable(false);
		
		Button btnCaseF = new Button(shell, SWT.NONE);
		btnCaseF.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
							
			}
		});
		btnCaseF.setBounds(10, 292, 120, 50);
		btnCaseF.setText("Case F");
		
		Button btnRemoveHtml = new Button(shell, SWT.NONE);
		btnRemoveHtml.setBounds(10, 362, 120, 50);
		btnRemoveHtml.setText("Remove HTML");
		
		txtRemoveHTML = new Text(shell, SWT.BORDER | SWT.MULTI);
		txtRemoveHTML.setBounds(145, 362, 265, 50);
		//Assign the attribute Cannot Edit the Textbox
		txtRemoveHTML.setEditable(false);
		
		Button btnAddLineNo = new Button(shell, SWT.NONE);
		btnAddLineNo.setBounds(10, 426, 120, 50);
		btnAddLineNo.setText("Add Line No.");
		
		txtAddLineNo = new Text(shell, SWT.BORDER | SWT.MULTI);
		txtAddLineNo.setBounds(145, 429, 265, 50);
		//Assign the attribute Cannot Edit the Textbox
		txtAddLineNo.setEditable(false);
		
		Label lblCount = new Label(shell, SWT.NONE);
		lblCount.setBounds(10, 535, 55, 18);
		lblCount.setText("Count");
		
		Button btnExit = new Button(shell, SWT.NONE);
		btnExit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//Exit button, exit the GUI
				System.exit(0);
			}
		});
		btnExit.setBounds(317, 514, 93, 39);
		btnExit.setText("Exit");	
	}
}
