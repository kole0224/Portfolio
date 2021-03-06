package com.javalec.Search;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.javalec.MainPackage.MainProcess;
import com.javalec.dbaction.DbAction_Join_CJY;

public class Main_Join_CJY extends JFrame{

	private MainProcess mainPr;
	private JFrame frame;
	private JLabel lblJoin;
	private JLabel lblId;
	private JLabel lblPw;
	private JLabel lblPwCheck;
	private JLabel lblName;
	private JLabel lblTelno;
	private JLabel lblNick;
	private JTextField tfId;
	private JTextField tfName;
	private JTextField tfTel;
	private JTextField tfNick;
	private JPasswordField pwtfPw;
	private JPasswordField pwtfPw2;
	private JButton btnId;
	private JButton btnNick;
	private JButton btnOK;
	private JButton btnCancel;
	private JLabel lblPwCheckText;
	private JLabel lblNewLabel;
	
	private boolean isIdCheck = false;
	private boolean isNickCheck = false;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Join_CJY window = new Main_Join_CJY();
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
	public Main_Join_CJY() {
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
		frame.getContentPane().add(getLblJoin());
		frame.getContentPane().add(getLblId());
		frame.getContentPane().add(getLblPw());
		frame.getContentPane().add(getLblPwCheck());
		frame.getContentPane().add(getLblName());
		frame.getContentPane().add(getLblTelno());
		frame.getContentPane().add(getLblNick());
		frame.getContentPane().add(getTfId());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getTfTel());
		frame.getContentPane().add(getTfNick());
		frame.getContentPane().add(getPwtfPw());
		frame.getContentPane().add(getPwtfPw2());
		frame.getContentPane().add(getBtnId());
		frame.getContentPane().add(getBtnNick());
		frame.getContentPane().add(getBtnOK());
		frame.getContentPane().add(getBtnCancel());
		frame.getContentPane().add(getLblPwCheckText());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
//		frame.getContentPane().add(getLblpw());
	}

	private JLabel getLblJoin() {
		if (lblJoin == null) {
			lblJoin = new JLabel("ํ์๊ฐ์");
			lblJoin.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblJoin.setBounds(28, 42, 183, 35);
		}
		return lblJoin;
	}

	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("์์ด๋");
			lblId.setFont(new Font("๋์", Font.PLAIN, 13));
			lblId.setBounds(30, 83, 59, 26);
		}
		return lblId;
	}

	private JLabel getLblPw() {
		if (lblPw == null) {
			lblPw = new JLabel("๋น๋ฐ๋ฒํธ");
			lblPw.setFont(new Font("๋์", Font.PLAIN, 13));
			lblPw.setBounds(30, 135, 66, 26);
		}
		return lblPw;
	}

	private JLabel getLblPwCheck() {
		if (lblPwCheck == null) {
			lblPwCheck = new JLabel("๋น๋ฐ๋ฒํธํ์ธ");
			lblPwCheck.setFont(new Font("๋์", Font.PLAIN, 13));
			lblPwCheck.setBounds(30, 188, 93, 26);
		}
		return lblPwCheck;
	}

	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("์ด๋ฆ");
			lblName.setFont(new Font("๋์", Font.PLAIN, 13));
			lblName.setBounds(30, 239, 59, 26);
		}
		return lblName;
	}

	private JLabel getLblTelno() {
		if (lblTelno == null) {
			lblTelno = new JLabel("์?ํ๋ฒํธ");
			lblTelno.setFont(new Font("๋์", Font.PLAIN, 13));
			lblTelno.setBounds(30, 289, 66, 26);
		}
		return lblTelno;
	}

	private JLabel getLblNick() {
		if (lblNick == null) {
			lblNick = new JLabel("๋๋ค์");
			lblNick.setFont(new Font("๋์", Font.PLAIN, 13));
			lblNick.setBounds(30, 341, 69, 26);
		}
		return lblNick;
	}

	private JTextField getTfId() {
		if (tfId == null) {
			tfId = new JTextField();
			tfId.setColumns(10);
			tfId.setBounds(120, 83, 225, 26);
		}
		return tfId;
	}

	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(120, 239, 225, 26);
		}
		return tfName;
	}

	private JTextField getTfTel() {
		if (tfTel == null) {
			tfTel = new JTextField();
			tfTel.setColumns(10);
			tfTel.setBounds(120, 290, 225, 26);
		}
		return tfTel;
	}

	private JTextField getTfNick() {
		if (tfNick == null) {
			tfNick = new JTextField();
			tfNick.setColumns(10);
			tfNick.setBounds(120, 342, 225, 26);
		}
		return tfNick;
	}

	private JPasswordField getPwtfPw() {
		if (pwtfPw == null) {
			pwtfPw = new JPasswordField();
			pwtfPw.setBounds(120, 136, 225, 26);
		}
		return pwtfPw;
	}

	private JPasswordField getPwtfPw2() {
		if (pwtfPw2 == null) {
			pwtfPw2 = new JPasswordField();
			pwtfPw2.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					
					pwCheckAction();
					
				}
			});
			pwtfPw2.setBounds(120, 189, 225, 26);
		}
		return pwtfPw2;
	}

	private JButton getBtnId() {
		if (btnId == null) {
			btnId = new JButton("์ค๋ณตํ์ธ");
			btnId.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					checkIdAction();
					isIdCheck = true;
				}
			});
			btnId.setFont(new Font("๋์", Font.PLAIN, 13));
			btnId.setBounds(353, 83, 97, 26);
		}
		return btnId;
	}

	private JButton getBtnNick() {
		if (btnNick == null) {
			btnNick = new JButton("์ค๋ณตํ์ธ");
			btnNick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					checkNickAction();
					isNickCheck = true;
				}
			});
			btnNick.setFont(new Font("๋์", Font.PLAIN, 13));
			btnNick.setBounds(353, 343, 97, 25);
		}
		return btnNick;
	}
	Login_YJ login_YJ; // ๋ก๊ทธ์ธ 
	Client_FirstView_YJ clientFirst;
	private JLabel lblNewLabel_1;
//	Main_Join_CJY join_CJY;
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("์๋ฃ");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
						int chk = insertFieldCheck();
						
						if(chk == 0) {
							if (isIdCheck == false || isNickCheck == false) {
								JOptionPane.showMessageDialog(null, "์ค๋ณต์ฒดํฌ๋ ํ์์๋๋ค.","์ค๋ณต ํ์ธ", JOptionPane.WARNING_MESSAGE);
							} else {
								okAction();
							}
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
	
	private JLabel getLblPwCheckText() {
		if (lblPwCheckText == null) {
			lblPwCheckText = new JLabel("");
			lblPwCheckText.setBounds(120, 214, 237, 15);
		}
		return lblPwCheckText;
	}


	// -----------------------------
	// Method
	// -----------------------------
	
	// ์๋ฃ ๋ฒํผ(ํ์๊ฐ์)
	private void okAction() {
		
		String id = tfId.getText().trim();
//		String pw = pwtfPw.getPassword().toString();
		char[] str = pwtfPw.getPassword();
		String pw = new String(str);
		char[] str2 = pwtfPw2.getPassword();
		String pw2 = new String(str2);
//		String pw2= pwtfPw2.getPassword().toString();
		String name = tfName.getText().trim();
		String telno = tfTel.getText().trim();
		String nick = tfNick.getText().trim();		
//		System.out.println(pw2);
				
		if(pw.equals(pw2)) {
			
			DbAction_Join_CJY dbAction_Join_CJY = new DbAction_Join_CJY(id, pw, name, telno, nick);
			boolean msg = dbAction_Join_CJY.okAction();
			
			if(msg == true) {
				JOptionPane.showMessageDialog(null, tfName.getText() + "๋์ ํ์๊ฐ์์ด ์๋ฃ๋์์ต๋๋ค!\n" + "๋ก๊ทธ์ธ์ฐฝ์ผ๋ก ๋์๊ฐ๋๋ค.");
				
				mainPr.main(null);
				frame.dispose();
				
			} 
		} 
	}
	
	// ์๋ฃ ๋ฒํผ : tf ์ค์์ ๋น?์ง ๋ถ๋ถ์ด ์์ ๋
		private int insertFieldCheck() {	
				String checkMsg = "์ค๋ณต์ฒดํฌ๋ ํ์์๋๋ค.";
				int i = 0;
				String message = "";

				if(tfId.getText().trim().length() == 0) {
					i++;					// ๋ฃ์ ํ์คํธ ์์ผ๋ฉด i๊ฐ ์ฆ๊ฐ
					message = "์์ด๋๋ฅผ ";		// tfName์ ํ์คํธ๊ฐ ์์ ๋ ๋์ฌ ๋ฉ์ธ์ง์ ์?๋ณด
					tfId.requestFocus();	// .requestFocus() ์ปค์ ๊น๋นก์ด ์์น๋ก ํด์ฃผ๊ธฐ
//					if (isIdCheck == false) {
//						JOptionPane.showMessageDialog(null, checkMsg);
//					}
				}
				if(pwtfPw.getPassword().toString().length() == 0) {  //.length() : ๊ธ์์ ๊ฐ์ /๋ฅผ ๋งํ๋ ๊ฑด๋ฐ ์ฌ๊ธฐ์๋ ๊ธ์์ ๊ฐ์๊ฐ 0์ผ ๋๋ฅผ ๋งํ๋๊น
					i++;
					message = "๋น๋ฐ๋ฒํธ๋ฅผ ";
					pwtfPw.requestFocus();
				}
				if(pwtfPw2.getPassword().toString().length() == 0) {
					i++;
					message = "๋น๋ฐ๋ฒํธ ํ์ธ์ ";
					pwtfPw2.requestFocus();
				}
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
				if(tfNick.getText().trim().length() == 0) {
					i++;
					message = "๋๋ค์์ ";
					tfNick.requestFocus();
//					if (isNickCheck == false) {
//						JOptionPane.showMessageDialog(null, checkMsg);
//					}
				}
				
				// i๊ฐ์ด 0๋ณด๋ค ํด ๋ = i๊ฐ์ด ์ฆ๊ฐํ์ ๋ = getText()๊ฐ ์์์ ๋
				if(i > 0) {
					JOptionPane.showMessageDialog(null, message + "์๋?ฅํ์ธ์.", "ํ์๊ฐ์", JOptionPane.WARNING_MESSAGE);
				}
				
				return i;
			}
		
		// ๋น๋ฐ๋ฒํธ ๋์ผ or ์๋
		
		private void pwCheckAction() {
			
			// pw
			char[] str = pwtfPw.getPassword();
			String pw = new String(str);
			
			// pw2
			char[] str2 = pwtfPw2.getPassword();
			String pw2 = new String(str2);

			
			if(pw.equals(pw2)) {
				lblPwCheckText.setText("๋น๋ฐ๋ฒํธ์ ๋์ผํฉ๋๋ค.");
			}else {
				lblPwCheckText.setText("๋น๋ฐ๋ฒํธ์ ๋์ผํ์ง ์์ต๋๋ค.");
			}
				
		}
		
		
		// ์์ด๋ ์ค๋ณต ํ์ธ
		private void checkIdAction() {
			String wkId = tfId.getText().trim();
			
			DbAction_Join_CJY dbAction_Join_CJY = new DbAction_Join_CJY();
			boolean checkIdAction = dbAction_Join_CJY.checkIdAction(wkId);
			// boolean : ๋ฌด์กฐ๊ฑด true ์๋๋ฉด false์ด๋๊น if๋ฌธ ์ฌ์ฉ์ if-else๋ง ์จ๋ ๊ฐ๋ฅ
			
			if (checkIdAction == true) {
				JOptionPane.showMessageDialog(null, "์ฌ์ฉ ๊ฐ๋ฅํ ์์ด๋์๋๋ค!");
			} else  {
				JOptionPane.showMessageDialog(null, "์ด๋ฏธ ์ฌ์ฉ์ค์ธ ์์ด๋์๋๋ค!", "์์ด๋ ์ค๋ณต ํ์ธ", JOptionPane.WARNING_MESSAGE);	
			}			
		}
		
		// ๋๋ค์ ์ค๋ณต ํ์ธ
		private void checkNickAction() {
			String wkNick = tfNick.getText().trim();
			
			DbAction_Join_CJY dbAction_Join_CJY = new DbAction_Join_CJY();
			boolean checkNickAction = dbAction_Join_CJY.checkNickAction(wkNick);
			
			if (checkNickAction == true) {
				JOptionPane.showMessageDialog(null, "์ฌ์ฉ ๊ฐ๋ฅํ ๋๋ค์์๋๋ค!");
			} else  {
				JOptionPane.showMessageDialog(null, "์ด๋ฏธ ์ฌ์ฉ์ค์ธ ๋๋ค์์๋๋ค!", "๋๋ค์ ์ค๋ณต ํ์ธ", JOptionPane.WARNING_MESSAGE);	
			}
		}
		
		
		// ์ทจ์ : ์ด๊ธฐํ
		private void cancelAction() {
			tfId.setText("");
			pwtfPw.setText("");
			pwtfPw2.setText("");
			tfName.setText("");
			tfTel.setText("");
			tfNick.setText("");
		}
		

	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("์นดํํ");
			lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
			lblNewLabel.setBounds(243, 0, 63, 41);
			lblNewLabel.setForeground(Color.white);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("/Users/gimminjae/Desktop/แแฅแแกแผ/background/background/client_mypage.png"));
			lblNewLabel_1.setBounds(0, -16, 545, 478);
		}
		return lblNewLabel_1;
	}
} // ----------------
