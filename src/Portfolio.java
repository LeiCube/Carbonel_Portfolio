import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Portfolio extends JFrame {

	private JPanel contentPane;
	
	//Instance of button class
	Strength aboutBtn = new Strength();
	Strength talentBtn = new Strength();
	Strength educBtn = new Strength();
	Strength whyBtn = new Strength();
	button strengthBtn = new Strength();

	
	JLabel About = new JLabel();
	JLabel Talent = new JLabel();
	JLabel Educ = new JLabel();
	JLabel Why = new JLabel();
	JLabel Strength = new JLabel();
	
	//Instane of Strength Class that inherits all parent classes
	Strength butt = new Strength();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portfolio frame = new Portfolio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Portfolio() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		//ABOUT BUTTON
		aboutBtn.setFont(new Font("Century Gothic", Font.PLAIN, 8));
		aboutBtn.setText(butt.Aboutname);
		aboutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About.setVisible(true);
				Talent.setVisible(false);
				Educ.setVisible(false);
				Why.setVisible(false);
				Strength.setVisible(false);
				
			}
		});
		aboutBtn.setBounds(334, 27, 66, 23);
		contentPane.add(aboutBtn);
		
		//TALENT BUTTON
		talentBtn.setFont(new Font("Century Gothic", Font.PLAIN, 8));
		talentBtn.setText(butt.Talentname);
		talentBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About.setVisible(false);
				Talent.setVisible(true);
				Educ.setVisible(false);
				Why.setVisible(false);
				Strength.setVisible(false);
			}
		});
		talentBtn.setBounds(410, 27, 76, 23);
		contentPane.add(talentBtn);
		
		//EDUCATION BUTTON
		educBtn.setFont(new Font("Century Gothic", Font.PLAIN, 8));
		educBtn.setText(butt.Educname);
		educBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About.setVisible(false);
				Talent.setVisible(false);
				Educ.setVisible(true);
				Why.setVisible(false);
				Strength.setVisible(false);
			}
		});
		educBtn.setBounds(496, 27, 66, 23);
		contentPane.add(educBtn);
		
		//WHY BUTTON
		whyBtn.setFont(new Font("Century Gothic", Font.PLAIN, 8));
		whyBtn.setText(butt.Whyname);
		whyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About.setVisible(false);
				Talent.setVisible(false);
				Educ.setVisible(false);
				Why.setVisible(true);
				Strength.setVisible(false);
			}
		});
		whyBtn.setBounds(572, 27, 66, 23);
		contentPane.add(whyBtn);
		
		//STRENGTH BUTTON
		strengthBtn.setFont(new Font("Century Gothic", Font.PLAIN, 8));
		strengthBtn.setText(butt.Strengthname);
		strengthBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About.setVisible(false);
				Talent.setVisible(false);
				Educ.setVisible(false);
				Why.setVisible(false);
				Strength.setVisible(true);
			}
		});
		strengthBtn.setBounds(648, 27, 121, 23);
		contentPane.add(strengthBtn);
		
		About.setIcon(new ImageIcon("C:\\Users\\danie\\Desktop\\Eclipse workspace\\Port\\src\\About.png"));
		About.setBounds(0, 0, 800, 500);
		contentPane.add(About);
		Talent.setIcon(new ImageIcon("C:\\Users\\danie\\Desktop\\Eclipse workspace\\Port\\src\\Talents.png"));
		Talent.setBounds(0, 0, 800, 500);
		Talent.setVisible(false);
		contentPane.add(Talent);
		Educ.setIcon(new ImageIcon("C:\\Users\\danie\\Desktop\\Eclipse workspace\\Port\\src\\Educ.png"));
		Educ.setBounds(0, 0, 800, 500);
		Educ.setVisible(false);
		contentPane.add(Educ);
		

		Why.setIcon(new ImageIcon("C:\\Users\\danie\\Desktop\\Eclipse workspace\\Port\\src\\Why.png"));
		Why.setBounds(0, 0, 800, 500);
		Why.setVisible(false);
		contentPane.add(Why);
		Strength.setIcon(new ImageIcon("C:\\Users\\danie\\Desktop\\Eclipse workspace\\Port\\src\\Strength.png"));
		Strength.setBounds(0, 0, 800, 500);
		Strength.setVisible(false);
		contentPane.add(Strength);
		
		JLabel BG = new JLabel("");
		BG.setIcon(new ImageIcon("C:\\Users\\danie\\Desktop\\Eclipse workspace\\Port\\src\\BG.png"));
		BG.setBounds(0, 0, 800, 500);
		contentPane.add(BG);
	}
}
