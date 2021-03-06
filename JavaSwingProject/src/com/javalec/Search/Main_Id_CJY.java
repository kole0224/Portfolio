package com.javalec.Search;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.javalec.MainPackage.MainProcess;
import com.javalec.dbaction.DbAction_Id_CJY;

public class Main_Id_CJY extends JFrame{

	private MainProcess mainPr;
	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1_1_1_2;
	private JLabel lblNewLabel_1_1_1_3;
	private JTextField tfTel;
	private JTextField tfName;
	private JButton btnOK;
	private JButton btnCancel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Id_CJY window = new Main_Id_CJY();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_Id_CJY() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initialize();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("์นดํํ");
		frame.setBounds(100, 100, 545, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1_1_1_2());
		frame.getContentPane().add(getLblNewLabel_1_1_1_3());
		frame.getContentPane().add(getTfTel());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getBtnOK());
		frame.getContentPane().add(getBtnCancel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_2());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("์์ด๋ ์ฐพ๊ธฐ");
			lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblNewLabel.setBounds(28, 42, 145, 32);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1_1_1_2() {
		if (lblNewLabel_1_1_1_2 == null) {
			lblNewLabel_1_1_1_2 = new JLabel("์ด๋ฆ");
			lblNewLabel_1_1_1_2.setFont(new Font("๋์", Font.PLAIN, 13));
			lblNewLabel_1_1_1_2.setBounds(28, 85, 56, 40);
		}
		return lblNewLabel_1_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_3() {
		if (lblNewLabel_1_1_1_3 == null) {
			lblNewLabel_1_1_1_3 = new JLabel("์?ํ๋ฒํธ");
			lblNewLabel_1_1_1_3.setFont(new Font("๋์", Font.PLAIN, 13));
			lblNewLabel_1_1_1_3.setBounds(30, 133, 74, 40);
		}
		return lblNewLabel_1_1_1_3;
	}
	private JTextField getTfTel() {
		if (tfTel == null) {
			tfTel = new JTextField();
			tfTel.setColumns(10);
			tfTel.setBounds(111, 137, 237, 32);
		}
		return tfTel;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(109, 89, 237, 32);
		}
		return tfName;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("์๋ฃ");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int chk = insertFieldCheck();
					
					if(chk == 0) {
						okAction();
					}

				}
			});
			btnOK.setFont(new Font("๋์", Font.PLAIN, 13));
			btnOK.setBounds(430, 402, 83, 29);
		}
		return btnOK;
	}
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("์ทจ์");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					cancelAction();
					Login_YJ login_YJ = new Login_YJ();
					login_YJ.setVisible(true);
					frame.dispose();
					
				}
			});
			btnCancel.setFont(new Font("๋์", Font.PLAIN, 13));
			btnCancel.setBounds(335, 402, 83, 29);
		}
		return btnCancel;
	}
	
	
	
	
	// Method
	
	// ์๋ฃ_btnOK
	private void okAction() {

		String userName = tfName.getText().trim();
		String userTelno = tfTel.getText().trim();		

		String findClientId = "";  // ์ด๊ธฐํ ์?์ธ

		DbAction_Id_CJY dbAction_Id_CJY = new DbAction_Id_CJY(userName, userTelno);
		findClientId = dbAction_Id_CJY.okAction();
		
		if (findClientId == "no") {
			JOptionPane.showMessageDialog(null, "์๋?ฅํ์? ์?๋ณด๋ฅผ ํ์ธํด์ฃผ์ธ์!", "์์ด๋ ์ฐพ๊ธฐ", JOptionPane.WARNING_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, tfName.getText() + "๋์ ์์ด๋๋ " + findClientId + " ์๋๋ค!");
			
			mainPr.main(null);
			frame.dispose();
		}

	}
	


	// ์๋ฃ ๋ฒํผ : tf ์ค์์ ๋น?์ง ๋ถ๋ถ์ด ์์ ๋
		private int insertFieldCheck() {	// void๋ ๋ฐ๋ ๊ฒ ์๊ณ? ์ฌ๊ธฐ์ฒ๋ผ returnํ๋ฉด ๋ฐ์์ค๋ ๊ฐ์ด ์๋ ๊ฒ์
				
				int i = 0;
				String message = "";
				
				
				// tfName.getText().trim()์ ๊ธธ์ด๊ฐ 0์ผ๋ = ๋ฃ์ ํ์คํธ๊ฐ ์์ ๋ (trim()์ ๊ณต๋ฐฑ ์?๊ฑฐ)
				
				if(tfName.getText().trim().length() == 0) {
					i++;
					message = "์ด๋ฆ์ ";
					tfName.requestFocus();
				}
				if(tfTel.getText().trim().length() == 0) {
					i++;
					message = "์?ํ๋ฒํธ๋ฅผ ";
					tfTel.requestFocus();
				}

				// i๊ฐ์ด 0๋ณด๋ค ํด ๋ = i๊ฐ์ด ์ฆ๊ฐํ์ ๋ = getText()๊ฐ ์์์ ๋
				if(i > 0) {
					JOptionPane.showMessageDialog(null, message + "์๋?ฅํ์ธ์.", "์์ด๋ ์ฐพ๊ธฐ", JOptionPane.WARNING_MESSAGE);
				}
				
				return i;
			}
	
	
	// ์ทจ์ : ์ด๊ธฐํ
		private void cancelAction() {
			tfName.setText("");
			tfTel.setText("");
		}

	
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("์นดํํ");
			lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
			lblNewLabel_1.setBounds(243, 0, 63, 41);
			lblNewLabel_1.setForeground(Color.white);
		}
		return lblNewLabel_1;
	}



	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon("/Users/gimminjae/Desktop/แแฅแแกแผ/background/background/client_mypage.png"));
			lblNewLabel_2.setBounds(0, -16, 545, 478);
		}
		return lblNewLabel_2;
	}
} // --------------------------------------
