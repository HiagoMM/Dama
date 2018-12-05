package dama.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class InterfaceGui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGui window = new InterfaceGui();
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
	public InterfaceGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.RED);
		frame.setBounds(100, 100, 800, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(43, 33, 60, 60);
		btnNewButton.setBackground(Color.WHITE);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("");
		button.setBackground(Color.BLACK);
		button.setBounds(43, 92, 60, 60);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(43, 210, 60, 60);
		button_1.setBackground(Color.BLACK);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(43, 151, 60, 60);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBackground(Color.BLACK);
		button_3.setBounds(43, 446, 60, 60);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(43, 387, 60, 60);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBackground(Color.BLACK);
		button_5.setBounds(43, 328, 60, 60);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setBackground(Color.WHITE);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_6.setBounds(43, 269, 60, 60);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setBackground(Color.BLACK);
		button_7.setBounds(103, 33, 60, 60);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(103, 92, 60, 60);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(103, 210, 60, 60);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.setBackground(Color.BLACK);
		button_10.setBounds(103, 151, 60, 60);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setBackground(Color.WHITE);
		button_11.setBounds(103, 446, 60, 60);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.setBackground(Color.BLACK);
		button_12.setBounds(103, 387, 60, 60);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setBackground(Color.WHITE);
		button_13.setBounds(103, 328, 60, 60);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setBackground(Color.BLACK);
		button_14.setBounds(103, 269, 60, 60);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.setBackground(Color.WHITE);
		button_15.setBounds(163, 33, 60, 60);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.setBackground(Color.BLACK);
		button_16.setBounds(163, 92, 60, 60);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.setBackground(Color.BLACK);
		button_17.setBounds(163, 210, 60, 60);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.setBackground(Color.WHITE);
		button_18.setBounds(163, 151, 60, 60);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.setBackground(Color.BLACK);
		button_19.setBounds(163, 446, 60, 60);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("");
		button_20.setBackground(Color.WHITE);
		button_20.setBounds(163, 387, 60, 60);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("");
		button_21.setBackground(Color.BLACK);
		button_21.setBounds(163, 328, 60, 60);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("");
		button_22.setBackground(Color.WHITE);
		button_22.setBounds(163, 269, 60, 60);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.setBackground(Color.BLACK);
		button_23.setBounds(223, 33, 60, 60);
		frame.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("");
		button_24.setBackground(Color.WHITE);
		button_24.setBounds(223, 92, 60, 60);
		frame.getContentPane().add(button_24);
		
		JButton button_25 = new JButton("");
		button_25.setBackground(Color.WHITE);
		button_25.setBounds(223, 210, 60, 60);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("");
		button_26.setBackground(Color.BLACK);
		button_26.setBounds(223, 151, 60, 60);
		frame.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("");
		button_27.setBackground(Color.WHITE);
		button_27.setBounds(223, 446, 60, 60);
		frame.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("");
		button_28.setBackground(Color.BLACK);
		button_28.setBounds(223, 387, 60, 60);
		frame.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("");
		button_29.setBackground(Color.WHITE);
		button_29.setBounds(223, 328, 60, 60);
		frame.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("");
		button_30.setBackground(Color.BLACK);
		button_30.setBounds(223, 269, 60, 60);
		frame.getContentPane().add(button_30);
		
		JButton button_31 = new JButton("");
		button_31.setBackground(Color.WHITE);
		button_31.setBounds(284, 33, 60, 60);
		frame.getContentPane().add(button_31);
		
		JButton button_32 = new JButton("");
		button_32.setBackground(Color.BLACK);
		button_32.setBounds(284, 92, 60, 60);
		frame.getContentPane().add(button_32);
		
		JButton button_33 = new JButton("");
		button_33.setBackground(Color.BLACK);
		button_33.setBounds(284, 210, 60, 60);
		frame.getContentPane().add(button_33);
		
		JButton button_34 = new JButton("");
		button_34.setBackground(Color.WHITE);
		button_34.setBounds(284, 151, 60, 60);
		frame.getContentPane().add(button_34);
		
		JButton button_35 = new JButton("");
		button_35.setBackground(Color.BLACK);
		button_35.setBounds(284, 446, 60, 60);
		frame.getContentPane().add(button_35);
		
		JButton button_36 = new JButton("");
		button_36.setBackground(Color.WHITE);
		button_36.setBounds(284, 387, 60, 60);
		frame.getContentPane().add(button_36);
		
		JButton button_37 = new JButton("");
		button_37.setBackground(Color.BLACK);
		button_37.setBounds(284, 328, 60, 60);
		frame.getContentPane().add(button_37);
		
		JButton button_38 = new JButton("");
		button_38.setBackground(Color.WHITE);
		button_38.setBounds(284, 269, 60, 60);
		frame.getContentPane().add(button_38);
		
		JButton button_39 = new JButton("");
		button_39.setBackground(Color.BLACK);
		button_39.setBounds(344, 33, 60, 60);
		frame.getContentPane().add(button_39);
		
		JButton button_40 = new JButton("");
		button_40.setBackground(Color.WHITE);
		button_40.setBounds(344, 92, 60, 60);
		frame.getContentPane().add(button_40);
		
		JButton button_41 = new JButton("");
		button_41.setBackground(Color.WHITE);
		button_41.setBounds(344, 210, 60, 60);
		frame.getContentPane().add(button_41);
		
		JButton button_42 = new JButton("");
		button_42.setBackground(Color.BLACK);
		button_42.setBounds(344, 151, 60, 60);
		frame.getContentPane().add(button_42);
		
		JButton button_43 = new JButton("");
		button_43.setBackground(Color.WHITE);
		button_43.setBounds(344, 446, 60, 60);
		frame.getContentPane().add(button_43);
		
		JButton button_44 = new JButton("");
		button_44.setBackground(Color.BLACK);
		button_44.setBounds(344, 387, 60, 60);
		frame.getContentPane().add(button_44);
		
		JButton button_45 = new JButton("");
		button_45.setBackground(Color.WHITE);
		button_45.setBounds(344, 328, 60, 60);
		frame.getContentPane().add(button_45);
		
		JButton button_46 = new JButton("");
		button_46.setBackground(Color.BLACK);
		button_46.setBounds(344, 269, 60, 60);
		frame.getContentPane().add(button_46);
		
		JButton button_47 = new JButton("");
		button_47.setBackground(Color.WHITE);
		button_47.setBounds(404, 33, 60, 60);
		frame.getContentPane().add(button_47);
		
		JButton button_48 = new JButton("");
		button_48.setBackground(Color.BLACK);
		button_48.setBounds(404, 92, 60, 60);
		frame.getContentPane().add(button_48);
		
		JButton button_49 = new JButton("");
		button_49.setBackground(Color.BLACK);
		button_49.setBounds(404, 210, 60, 60);
		frame.getContentPane().add(button_49);
		
		JButton button_50 = new JButton("");
		button_50.setBackground(Color.WHITE);
		button_50.setBounds(404, 151, 60, 60);
		frame.getContentPane().add(button_50);
		
		JButton button_51 = new JButton("");
		button_51.setBackground(Color.BLACK);
		button_51.setBounds(404, 446, 60, 60);
		frame.getContentPane().add(button_51);
		
		JButton button_52 = new JButton("");
		button_52.setBackground(Color.WHITE);
		button_52.setBounds(404, 387, 60, 60);
		frame.getContentPane().add(button_52);
		
		JButton button_53 = new JButton("");
		button_53.setBackground(Color.BLACK);
		button_53.setBounds(404, 328, 60, 60);
		frame.getContentPane().add(button_53);
		
		JButton button_54 = new JButton("");
		button_54.setBackground(Color.WHITE);
		button_54.setBounds(404, 269, 60, 60);
		frame.getContentPane().add(button_54);
		
		JButton button_55 = new JButton("");
		button_55.setBackground(Color.BLACK);
		button_55.setBounds(464, 33, 60, 60);
		frame.getContentPane().add(button_55);
		
		JButton button_56 = new JButton("");
		button_56.setBackground(Color.WHITE);
		button_56.setBounds(464, 92, 60, 60);
		frame.getContentPane().add(button_56);
		
		JButton button_57 = new JButton("");
		button_57.setBackground(Color.WHITE);
		button_57.setBounds(464, 210, 60, 60);
		frame.getContentPane().add(button_57);
		
		JButton button_58 = new JButton("");
		button_58.setBackground(Color.BLACK);
		button_58.setBounds(464, 151, 60, 60);
		frame.getContentPane().add(button_58);
		
		JButton button_59 = new JButton("");
		button_59.setBackground(Color.WHITE);
		button_59.setBounds(464, 446, 60, 60);
		frame.getContentPane().add(button_59);
		
		JButton button_60 = new JButton("");
		button_60.setBackground(Color.BLACK);
		button_60.setBounds(464, 387, 60, 60);
		frame.getContentPane().add(button_60);
		
		JButton button_61 = new JButton("");
		button_61.setBackground(Color.WHITE);
		button_61.setBounds(464, 328, 60, 60);
		frame.getContentPane().add(button_61);
		
		JButton button_62 = new JButton("");
		button_62.setBackground(Color.BLACK);
		button_62.setBounds(464, 269, 60, 60);
		frame.getContentPane().add(button_62);
	}
}
