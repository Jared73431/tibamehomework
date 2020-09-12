package divison;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class divisonexe extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txDivisor;
	private JLabel label;
	private JButton btnCalcu;
	private JScrollPane scrollPane;
	private JTextField txDividend;
	private JTextArea textArea ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					divisonexe frame = new divisonexe();
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
	public divisonexe() {
		setTitle("除法");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("除數");
		lblNewLabel.setBounds(68, 74, 46, 15);
		contentPane.add(lblNewLabel);
		
		label = new JLabel("被除數");
		label.setBounds(68, 49, 46, 15);
		contentPane.add(label);
		
		txDivisor = new JTextField();
		txDivisor.setBounds(119, 46, 96, 21);
		contentPane.add(txDivisor);
		txDivisor.setColumns(10);
		
		txDividend = new JTextField();
		txDividend.setColumns(10);
		txDividend.setBounds(119, 71, 96, 21);
		contentPane.add(txDividend);
		
		btnCalcu = new JButton("計算");
		btnCalcu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Double.valueOf(txDivisor.getText());
				double b = Double.valueOf(txDividend.getText());
				divison.divicalcu cc= new divicalcu(a,b);
				textArea.setText(cc.toString());
				}catch(Exception ee) {
					textArea.setText("請輸入數字");
				}
			}
		});
		btnCalcu.setBounds(246, 70, 87, 23);
		contentPane.add(btnCalcu);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 119, 281, 119);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
