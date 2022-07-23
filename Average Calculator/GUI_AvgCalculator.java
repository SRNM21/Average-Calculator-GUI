import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class GUI_AvgCalculator {

	private Panel panel_1;
	private JFrame frmCalculator;
	private JLabel lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5;
	private JLabel lblNewLabel_6, lblNewLabel_7, lblNewLabel_8, lblNewLabel_9, lblNewLabel_10;
	private JTextField FilipinoGrade, EnglishGrade, MathGrade, ScienceGrade, PEGrade, APGrade, TLEGrade;
	private JTextField ESPGrade, AverageResult, FilipinoResult, EnglishResult, MathResult, ScienceResult;
	private JTextField PEResult, APResult, TLEResult, ESPResult, AverageComment;
	public double filipinoGrade, englishGrade, mathGrade, scienceGrade, peGrade;
	public double apGrade, tleGrade, espGrade, average;

//@Gregorio,NG:  June, 2, 2022
//version 1	
	
	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_AvgCalculator window = new GUI_AvgCalculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Create the application.
	public GUI_AvgCalculator() {
		initialize();
	}
	
	//Calculate the average of users input grades
	public void calculateAverage() {
	
		//Identify filipino status
		if (FilipinoGrade.getText().isEmpty()) {
			FilipinoGrade.setBorder(new LineBorder(Color.red,2));
			FilipinoResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
			FilipinoResult.setForeground(Color.BLACK);
			FilipinoResult.setText("EMPTY");
			FilipinoGrade.setToolTipText("Empty");
		} else {
			 filipinoGrade = Double.parseDouble(FilipinoGrade.getText());
			if (filipinoGrade > 100) {
				FilipinoResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				FilipinoResult.setForeground(Color.BLACK);
				FilipinoResult.setText("INVALID");
				FilipinoGrade.setToolTipText("Invalid Grade");
			} else if (filipinoGrade >= 75) {
				FilipinoResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				FilipinoResult.setForeground(Color.GREEN);
				FilipinoResult.setText("PASSED");
			} else {
				FilipinoResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				FilipinoResult.setForeground(Color.RED);
				FilipinoResult.setBorder(new LineBorder(Color.red,2));
				FilipinoGrade.setBorder(new LineBorder(Color.red,2));
				FilipinoResult.setText("FAILED");
			}
		}
			
		//Identify english status
		if (EnglishGrade.getText().isEmpty()) {
			EnglishGrade.setBorder(new LineBorder(Color.red,2));
			EnglishResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
			EnglishResult.setForeground(Color.BLACK);
			EnglishResult.setText("EMPTY");
			EnglishGrade.setToolTipText("Empty");
		} else {
			 englishGrade = Double.parseDouble(EnglishGrade.getText());
			if (englishGrade > 100) {
				EnglishResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				EnglishResult.setForeground(Color.BLACK);
				EnglishResult.setText("INVALID");
				EnglishGrade.setToolTipText("Invalid Grade");
			} else if (englishGrade >= 75) {
				EnglishResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				EnglishResult.setForeground(Color.GREEN);
				EnglishResult.setText("PASSED");
			} else {
				EnglishResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				EnglishResult.setForeground(Color.RED);
				EnglishResult.setBorder(new LineBorder(Color.red,2));
				EnglishGrade.setBorder(new LineBorder(Color.red,2));
				EnglishResult.setText("FAILED");
			}
		}
			
		//Identify math status
		if (MathGrade.getText().isEmpty()) {
			MathGrade.setBorder(new LineBorder(Color.red,2));
			MathResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
			MathResult.setForeground(Color.BLACK);
			MathResult.setText("EMPTY");
			MathGrade.setToolTipText("Empty");
		} else {
			mathGrade = Double.parseDouble(MathGrade.getText());
			if (mathGrade > 100) {
				MathResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				MathResult.setForeground(Color.BLACK);
				MathResult.setText("INVALID");
				MathGrade.setToolTipText("Invalid Grade");
			} else if (mathGrade >= 75) {
				MathResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				MathResult.setForeground(Color.GREEN);
				MathResult.setText("PASSED");
			} else {
				MathResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				MathResult.setForeground(Color.RED);
				MathResult.setBorder(new LineBorder(Color.red,2));
				MathGrade.setBorder(new LineBorder(Color.red,2));
				MathResult.setText("FAILED");
			}
		}
			
		//Identify science status
		if (ScienceGrade.getText().isEmpty()) {
			ScienceGrade.setBorder(new LineBorder(Color.red,2));
			ScienceResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
			ScienceResult.setForeground(Color.BLACK);
			ScienceResult.setText("EMPTY");
			ScienceGrade.setToolTipText("Empty");
		} else {
			scienceGrade = Double.parseDouble(ScienceGrade.getText());
			if (scienceGrade > 100) {
				ScienceResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				ScienceResult.setForeground(Color.BLACK);
				ScienceResult.setText("INVALID");
				ScienceGrade.setToolTipText("Invalid Grade");
			} else if (scienceGrade >= 75) {
				ScienceResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				ScienceResult.setForeground(Color.GREEN);
				ScienceResult.setText("PASSED");
			} else {
				ScienceResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				ScienceResult.setForeground(Color.RED);
				ScienceResult.setBorder(new LineBorder(Color.red,2));
				ScienceGrade.setBorder(new LineBorder(Color.red,2));
				ScienceResult.setText("FAILED");
			}
		}
			
		//Identify P.E. status
		if (PEGrade.getText().isEmpty()) {
			PEGrade.setBorder(new LineBorder(Color.red,2));
			PEResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
			PEResult.setForeground(Color.BLACK);
			PEResult.setText("EMPTY");
			PEGrade.setToolTipText("Empty");
		} else {
			peGrade = Double.parseDouble(PEGrade.getText());
			if (peGrade > 100) {
				PEResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				PEResult.setForeground(Color.BLACK);
				PEResult.setText("INVALID");
				PEGrade.setToolTipText("Invalid Grade");
			} else if (peGrade >= 75) {
				PEResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				PEResult.setForeground(Color.GREEN);
				PEResult.setText("PASSED");
			} else {
				PEResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				PEResult.setForeground(Color.RED);
				PEResult.setBorder(new LineBorder(Color.red,2));
				PEGrade.setBorder(new LineBorder(Color.red,2));
				PEResult.setText("FAILED");
			}
		}
			
		//Identify A.P. status
		if (APGrade.getText().isEmpty()) {
			APGrade.setBorder(new LineBorder(Color.red,2));
			APResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
			APResult.setForeground(Color.BLACK);
			APResult.setText("EMPTY");
			APGrade.setToolTipText("Empty");
		} else {
			apGrade = Double.parseDouble(APGrade.getText());
			if (apGrade > 100) {
				APResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				APResult.setForeground(Color.BLACK);
				APResult.setText("INVALID");
				APGrade.setToolTipText("Invalid Grade");
			} else if (apGrade >= 75) {
				APResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				APResult.setForeground(Color.GREEN);
				APResult.setText("PASSED");
			} else {
				APResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				APResult.setForeground(Color.RED);
				APResult.setBorder(new LineBorder(Color.red,2));
				APGrade.setBorder(new LineBorder(Color.red,2));
				APResult.setText("FAILED");
			}
		}
		
		//Identify T.L.E. status
		if (TLEGrade.getText().isEmpty()) {
			TLEGrade.setBorder(new LineBorder(Color.red,2));
			TLEResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
			TLEResult.setForeground(Color.BLACK);
			TLEResult.setText("EMPTY");
			TLEGrade.setToolTipText("Empty");
		} else {
			tleGrade = Double.parseDouble(TLEGrade.getText());
			if (tleGrade > 100) {
				TLEResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				TLEResult.setForeground(Color.BLACK);
				TLEResult.setText("INVALID");
				TLEGrade.setToolTipText("Invalid Grade");
			} else if (tleGrade >= 75) {
				TLEResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				TLEResult.setForeground(Color.GREEN);
				TLEResult.setText("PASSED");
			} else {
				TLEResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				TLEResult.setForeground(Color.RED);
				TLEResult.setBorder(new LineBorder(Color.red,2));
				TLEGrade.setBorder(new LineBorder(Color.red,2));
				TLEResult.setText("FAILED");
			}
		}
			
		//Identify E.S.P. status
		if (ESPGrade.getText().isEmpty()) {
			ESPGrade.setBorder(new LineBorder(Color.red,2));
			ESPResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
			ESPResult.setForeground(Color.BLACK);
			ESPResult.setText("EMPTY");
			ESPGrade.setToolTipText("Empty");
		} else {
			espGrade = Double.parseDouble(ESPGrade.getText());
			if (espGrade > 100) {
				ESPResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				ESPResult.setForeground(Color.BLACK);
				ESPResult.setText("INVALID");
				ESPGrade.setToolTipText("Invalid Grade");
			} else if (espGrade >= 75) {
				ESPResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				ESPResult.setForeground(Color.GREEN);
				ESPResult.setText("PASSED");
			} else {
				ESPResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
				ESPResult.setForeground(Color.RED);
				ESPResult.setBorder(new LineBorder(Color.red,2));
				ESPGrade.setBorder(new LineBorder(Color.red,2));
				ESPResult.setText("FAILED");
			}
		}
		
		//calculate average
		average = (filipinoGrade + englishGrade + mathGrade + scienceGrade + peGrade	+ apGrade + tleGrade + espGrade)/8;
		
		//Identify Average status
		if (FilipinoGrade.getText().isEmpty() || EnglishGrade.getText().isEmpty() || MathGrade.getText().isEmpty()
			|| ScienceGrade.getText().isEmpty() || PEGrade.getText().isEmpty() || APGrade.getText().isEmpty()
			|| TLEGrade.getText().isEmpty() || ESPGrade.getText().isEmpty()) {
			AverageComment.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
			AverageComment.setForeground(Color.BLACK);
			AverageComment.setText("INCOMPLETE INPUT");
			lblNewLabel_10.setIcon(new ImageIcon(GUI_AvgCalculator.class.getResource("/Images/Invalid.png")));
			lblNewLabel_10.setToolTipText("lagay ka grades boi");
		} else if (filipinoGrade > 100 || englishGrade > 100 || mathGrade > 100 || scienceGrade > 100
				|| peGrade > 100 || apGrade > 100 || tleGrade > 100 || espGrade > 100 || average > 100) {
			AverageComment.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
			AverageComment.setForeground(Color.BLACK);
			AverageComment.setText("INVALID");
			lblNewLabel_10.setIcon(new ImageIcon(GUI_AvgCalculator.class.getResource("/Images/Invalid.png")));
			lblNewLabel_10.setToolTipText("ayusin mo lagay boi");
		} else if (filipinoGrade < 75 || englishGrade < 75 || mathGrade < 75 || scienceGrade < 75
				|| peGrade < 75 || apGrade < 75 || tleGrade < 75 || espGrade < 75){
			AverageComment.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
			AverageComment.setForeground(Color.RED);
			AverageComment.setText("FAILED");
			lblNewLabel_10.setIcon(new ImageIcon(GUI_AvgCalculator.class.getResource("/Images/Failed.png")));
			lblNewLabel_10.setToolTipText("bawi sa susunod boi");
		} else if (average >= 98) {
			AverageComment.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
			AverageComment.setForeground(Color.BLACK);
			AverageComment.setText("WITH HIGHEST HONORS!");
			lblNewLabel_10.setIcon(new ImageIcon(GUI_AvgCalculator.class.getResource("/Images/Passed.png")));
			lblNewLabel_10.setToolTipText("naol highest honor");
		} else if (average >= 95) {
			AverageComment.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
			AverageComment.setForeground(Color.BLACK);
			AverageComment.setText("WITH HIGH HONOR!");
			lblNewLabel_10.setIcon(new ImageIcon(GUI_AvgCalculator.class.getResource("/Images/Passed.png")));
			lblNewLabel_10.setToolTipText("naol high honor");
		} else if (average >= 90) {
			AverageComment.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
			AverageComment.setForeground(Color.BLACK);
			AverageComment.setText("WITH HONOR!");
			lblNewLabel_10.setIcon(new ImageIcon(GUI_AvgCalculator.class.getResource("/Images/Passed.png")));
			lblNewLabel_10.setToolTipText("naks, with honor");
		} else if (average >= 75) {
			AverageComment.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
			AverageComment.setForeground(Color.GREEN);
			AverageComment.setText("PASSED");
			lblNewLabel_10.setIcon(new ImageIcon(GUI_AvgCalculator.class.getResource("/Images/Passed.png")));
			lblNewLabel_10.setToolTipText("yun oh, pasado");
		} else {
			AverageComment.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
			AverageComment.setForeground(Color.RED);
			AverageComment.setText("FAILED");
			lblNewLabel_10.setIcon(new ImageIcon(GUI_AvgCalculator.class.getResource("/Images/Failed.png")));
			lblNewLabel_10.setToolTipText("bawi sa susunod boi");
		}

		String genaverage = String.valueOf(average);  
		AverageResult.setText(genaverage); 
	}
	
	
	//Initialize the contents of the frame.
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage(GUI_AvgCalculator.class.getResource("/Images/Average_Calculator_Icon.png")));
		frmCalculator.getContentPane().setBackground(new Color(222, 184, 135));
		frmCalculator.setResizable(false);
		frmCalculator.setType(Type.POPUP);
		frmCalculator.setBounds(100, 100, 313, 613);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(205, 133, 63));
		panel.setBounds(0, 0, 299, 58);
		frmCalculator.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("    AVERAGE CALCULATOR");
		lblNewLabel.setBounds(11, 19, 221, 22);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 18));
		
		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblNewLabel_10.setBounds(237, 5, 50, 50);
		panel.add(lblNewLabel_10);
		lblNewLabel_10.setToolTipText("hi lods");
		lblNewLabel_10.setIcon(new ImageIcon(GUI_AvgCalculator.class.getResource("/Images/ok.png")));
		
		panel_1 = new Panel();
		panel_1.setBackground(new Color(222, 184, 135));
		panel_1.setBounds(0, 56, 299, 520);
		frmCalculator.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Filipino :");
		lblNewLabel_1.setBounds(10, 10, 81, 37);
		lblNewLabel_1.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("English :");
		lblNewLabel_2.setBounds(10, 57, 81, 37);
		lblNewLabel_2.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Math :");
		lblNewLabel_3.setBounds(10, 104, 81, 37);
		lblNewLabel_3.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		panel_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Science :");
		lblNewLabel_4.setBounds(10, 151, 81, 37);
		lblNewLabel_4.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		panel_1.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("P.E. :");
		lblNewLabel_5.setBounds(10, 198, 81, 37);
		lblNewLabel_5.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		panel_1.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("A.P. :");
		lblNewLabel_6.setBounds(10, 245, 81, 37);
		lblNewLabel_6.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		panel_1.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("T.L.E. :");
		lblNewLabel_7.setBounds(10, 292, 81, 37);
		lblNewLabel_7.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		panel_1.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("E.S.P. :");
		lblNewLabel_8.setBounds(10, 339, 81, 37);
		lblNewLabel_8.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		panel_1.add(lblNewLabel_8);
		
		//User Grade Input and accept numbers only
		FilipinoGrade = new JTextField();
		FilipinoGrade.setToolTipText("Enter Grades");
		FilipinoGrade.setBackground(new Color(245, 222, 179));
		FilipinoGrade.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		FilipinoGrade.setBounds(95, 10, 37, 37);
		FilipinoGrade.setBorder(null);
		FilipinoGrade.setHorizontalAlignment(SwingConstants.CENTER);
		FilipinoGrade.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			     char c = e.getKeyChar();
	             if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
	            		 || (FilipinoGrade.getText().length() >= 3)){
	                  e.consume();    	
	             }
			}
		});
		FilipinoGrade.setFont(new Font("SansSerif", Font.PLAIN, 16));
		panel_1.add(FilipinoGrade);
		
		EnglishGrade = new JTextField();
		EnglishGrade.setToolTipText("Enter Grades");
		EnglishGrade.setBackground(new Color(245, 222, 179));
		EnglishGrade.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		EnglishGrade.setBounds(95, 57, 37, 37);
		EnglishGrade.setBorder(null);
		EnglishGrade.setHorizontalAlignment(SwingConstants.CENTER);
		EnglishGrade.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			     char c = e.getKeyChar();
	             if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
	            		 || (EnglishGrade.getText().length() >= 3)){
	                  e.consume();    	
	             }
			}
		});
		EnglishGrade.setFont(new Font("SansSerif", Font.PLAIN, 16));
		EnglishGrade.setColumns(10);
		panel_1.add(EnglishGrade);
		
		MathGrade = new JTextField();
		MathGrade.setToolTipText("Enter Grades");
		MathGrade.setBackground(new Color(245, 222, 179));
		MathGrade.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		MathGrade.setBounds(95, 105, 37, 37);
		MathGrade.setBorder(null);
		MathGrade.setHorizontalAlignment(SwingConstants.CENTER);
		MathGrade.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			     char c = e.getKeyChar();
	             if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
	            		 || (MathGrade.getText().length() >= 3)){
	                  e.consume();    	
	             }
			}
		});
		MathGrade.setFont(new Font("SansSerif", Font.PLAIN, 16));
		MathGrade.setColumns(10);
		panel_1.add(MathGrade);
		
		ScienceGrade = new JTextField();
		ScienceGrade.setToolTipText("Enter Grades");
		ScienceGrade.setBackground(new Color(245, 222, 179));
		ScienceGrade.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		ScienceGrade.setBounds(95, 152, 37, 37);
		ScienceGrade.setBorder(null);
		ScienceGrade.setHorizontalAlignment(SwingConstants.CENTER);
		ScienceGrade.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			     char c = e.getKeyChar();
	             if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
	            		 || (ScienceGrade.getText().length() >= 3)){
	                  e.consume();    	
	             }
			}
		});
		ScienceGrade.setFont(new Font("SansSerif", Font.PLAIN, 16));
		ScienceGrade.setColumns(10);
		panel_1.add(ScienceGrade);
		
		PEGrade = new JTextField();
		PEGrade.setToolTipText("Enter Grades");
		PEGrade.setBackground(new Color(245, 222, 179));
		PEGrade.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		PEGrade.setBounds(95, 199, 37, 37);
		PEGrade.setBorder(null);
		PEGrade.setHorizontalAlignment(SwingConstants.CENTER);
		PEGrade.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			     char c = e.getKeyChar();
	             if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
	            		 || (PEGrade.getText().length() >= 3)){
	                  e.consume();    	
	             }
			}
		});
		PEGrade.setFont(new Font("SansSerif", Font.PLAIN, 16));
		PEGrade.setColumns(10);
		panel_1.add(PEGrade);
		
		APGrade = new JTextField();
		APGrade.setToolTipText("Enter Grades");
		APGrade.setBackground(new Color(245, 222, 179));
		APGrade.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		APGrade.setBounds(95, 246, 37, 37);
		APGrade.setBorder(null);
		APGrade.setHorizontalAlignment(SwingConstants.CENTER);
		APGrade.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			     char c = e.getKeyChar();
	             if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
	            		 || (APGrade.getText().length() >= 3)){
	                  e.consume();    	
	             }
			}
		});
		APGrade.setFont(new Font("SansSerif", Font.PLAIN, 16));
		APGrade.setColumns(10);
		panel_1.add(APGrade);

		TLEGrade = new JTextField();
		TLEGrade.setToolTipText("Enter Grades");
		TLEGrade.setBackground(new Color(245, 222, 179));
		TLEGrade.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		TLEGrade.setBounds(95, 293, 37, 37);
		TLEGrade.setBorder(null);
		TLEGrade.setHorizontalAlignment(SwingConstants.CENTER);
		TLEGrade.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			     char c = e.getKeyChar();
	             if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
	            		 || (TLEGrade.getText().length() >= 3)){
	                  e.consume();    	
	             }
			}
		});
		TLEGrade.setFont(new Font("SansSerif", Font.PLAIN, 16));
		TLEGrade.setColumns(10);
		panel_1.add(TLEGrade);
		
		ESPGrade = new JTextField();
		ESPGrade.setToolTipText("Enter Grades");
		ESPGrade.setBackground(new Color(245, 222, 179));
		ESPGrade.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		ESPGrade.setBounds(95, 340, 37, 37);
		ESPGrade.setBorder(null);
		ESPGrade.setHorizontalAlignment(SwingConstants.CENTER);
		ESPGrade.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			     char c = e.getKeyChar();
	             if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
	            		 || (ESPGrade.getText().length() >= 3)){
	                  e.consume();    	
	             }
			}
		});
		ESPGrade.setFont(new Font("SansSerif", Font.PLAIN, 16));
		ESPGrade.setColumns(10);
		panel_1.add(ESPGrade);
		
		// Average Results
		AverageResult = new JTextField();
		AverageResult.setBackground(new Color(245, 222, 179));
		AverageResult.setBounds(10, 451, 61, 61);
		AverageResult.setBorder(null);
		AverageResult.setHorizontalAlignment(SwingConstants.CENTER);
		AverageResult.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		AverageResult.setEditable(false);
		panel_1.add(AverageResult);
		AverageResult.setColumns(10);
		
		lblNewLabel_9 = new JLabel("AVERAGE :");
		lblNewLabel_9.setBounds(17, 416, 105, 37);
		lblNewLabel_9.setFont(new Font("SimSun", Font.BOLD, 16));
		panel_1.add(lblNewLabel_9);
		
		AverageComment = new JTextField();
		AverageComment.setBackground(new Color(245, 222, 179));
		AverageComment.setBounds(70, 451, 213, 61);
		AverageComment.setBorder(null);
		AverageComment.setHorizontalAlignment(SwingConstants.CENTER);
		AverageComment.setEditable(false);
		panel_1.add(AverageComment);
		AverageComment.setColumns(10);
		
		//Grade Results
		FilipinoResult = new JTextField();
		FilipinoResult.setBackground(new Color(245, 222, 179));
		FilipinoResult.setBounds(147, 10, 136, 37);
		FilipinoResult.setBorder(null);
		FilipinoResult.setHorizontalAlignment(SwingConstants.CENTER);
		FilipinoResult.setEditable(false);
		FilipinoResult.setColumns(10);
		panel_1.add(FilipinoResult);
		
		EnglishResult = new JTextField();
		EnglishResult.setBackground(new Color(245, 222, 179));
		EnglishResult.setBounds(147, 58, 136, 37);
		EnglishResult.setBorder(null);
		EnglishResult.setHorizontalAlignment(SwingConstants.CENTER);
		EnglishResult.setEditable(false);
		EnglishResult.setColumns(10);
		panel_1.add(EnglishResult);
		
		MathResult = new JTextField();
		MathResult.setBackground(new Color(245, 222, 179));
		MathResult.setBounds(147, 105, 136, 37);
		MathResult.setBorder(null);
		MathResult.setHorizontalAlignment(SwingConstants.CENTER);
		MathResult.setEditable(false);
		MathResult.setColumns(10);
		panel_1.add(MathResult);
		
		ScienceResult = new JTextField();
		ScienceResult.setBackground(new Color(245, 222, 179));
		ScienceResult.setBounds(147, 152, 136, 37);
		ScienceResult.setBorder(null);
		ScienceResult.setHorizontalAlignment(SwingConstants.CENTER);
		ScienceResult.setEditable(false);
		ScienceResult.setColumns(10);
		panel_1.add(ScienceResult);
		
		PEResult = new JTextField();
		PEResult.setBackground(new Color(245, 222, 179));
		PEResult.setBounds(147, 199, 136, 37);
		PEResult.setBorder(null);
		PEResult.setHorizontalAlignment(SwingConstants.CENTER);
		PEResult.setEditable(false);
		PEResult.setColumns(10);
		panel_1.add(PEResult);
		
		APResult = new JTextField();
		APResult.setBackground(new Color(245, 222, 179));
		APResult.setBounds(147, 246, 136, 37);
		APResult.setBorder(null);
		APResult.setHorizontalAlignment(SwingConstants.CENTER);
		APResult.setEditable(false);
		APResult.setColumns(10);
		panel_1.add(APResult);
		
		TLEResult = new JTextField();
		TLEResult.setBackground(new Color(245, 222, 179));
		TLEResult.setBounds(147, 293, 136, 37);
		TLEResult.setBorder(null);
		TLEResult.setHorizontalAlignment(SwingConstants.CENTER);
		TLEResult.setEditable(false);
		TLEResult.setColumns(10);
		panel_1.add(TLEResult);
		
		ESPResult = new JTextField();
		ESPResult.setBackground(new Color(245, 222, 179));
		ESPResult.setBounds(147, 340, 136, 37);
		ESPResult.setBorder(null);
		ESPResult.setHorizontalAlignment(SwingConstants.CENTER);
		ESPResult.setEditable(false);
		ESPResult.setColumns(10);
		panel_1.add(ESPResult);
		
		//Clear and Enter buttons
		JButton Clear = new JButton("Clear");
		Clear.setBackground(new Color(205, 133, 63));
		Clear.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 16));
		Clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Clear.setBounds(157, 387, 126, 30);
		Clear.setBorder(null);
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FilipinoGrade.setText("");
				EnglishGrade.setText("");
				MathGrade.setText("");
				ScienceGrade.setText("");
				PEGrade.setText("");
				APGrade.setText("");
				TLEGrade.setText("");
				ESPGrade.setText("");
				FilipinoResult.setText("");
				EnglishResult.setText("");
				MathResult.setText("");
				ScienceResult.setText("");
				PEResult.setText("");
				APResult.setText("");
				TLEResult.setText("");
				ESPResult.setText("");
				AverageResult.setText("");
				AverageComment.setText("");
				FilipinoResult.setBorder(null);
				FilipinoGrade.setBorder(null);
				EnglishResult.setBorder(null);
				EnglishGrade.setBorder(null);
				MathResult.setBorder(null);
				MathGrade.setBorder(null);
				ScienceResult.setBorder(null);
				ScienceGrade.setBorder(null);
				PEResult.setBorder(null);
				PEGrade.setBorder(null);
				APResult.setBorder(null);
				APGrade.setBorder(null);
				TLEResult.setBorder(null);
				TLEGrade.setBorder(null);
				ESPResult.setBorder(null);
				ESPGrade.setBorder(null);
				lblNewLabel_10.setIcon(new ImageIcon(GUI_AvgCalculator.class.getResource("/Images/ok.png")));
				lblNewLabel_10.setToolTipText("hi lods");
			}
		});
		panel_1.add(Clear);
		
		JButton Enter = new JButton("Enter");
		Enter.setBackground(new Color(205, 133, 63));
		Enter.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 16));
		Enter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Enter.setBounds(20, 387, 115, 30);
		Enter.setBorder(null);
		Enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateAverage();
			}
		});
		panel_1.add(Enter);
	}
}