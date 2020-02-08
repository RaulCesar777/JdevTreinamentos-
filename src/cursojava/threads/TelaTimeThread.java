package cursojava.threads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	private static final long serialVersionUID = 5669741374699052757L;

	private JPanel jpanel = new JPanel(new GridBagLayout());

	private JLabel descricaohora = new JLabel("Time Thread 1");
	private JTextField mostratempo = new JTextField();

	private JLabel descricaohora2 = new JLabel("Time Thread 2");
	private JTextField mostratempo2 = new JTextField();

	JButton jbstart = new JButton("START");
	JButton jbstop = new JButton("STOP");

	private Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			while (true) {

				mostratempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
		}
	};
	private Thread thread1Time;

	public TelaTimeThread() {

		setTitle("Minha tela de Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		/////// primeira parte
		GridBagConstraints gridbagconstraits = new GridBagConstraints();
		gridbagconstraits.gridx = 0;
		gridbagconstraits.gridy = 0;
		gridbagconstraits.gridwidth =2;
		gridbagconstraits.insets =new Insets(5, 10, 5, 5);
		gridbagconstraits.anchor = GridBagConstraints.WEST;

		//// controldador de posicionamento

		descricaohora.setPreferredSize(new Dimension(200, 25));		
		jpanel.add(descricaohora, gridbagconstraits);
		

		mostratempo.setPreferredSize(new Dimension(200, 25));		
		mostratempo.setEditable(false);
		gridbagconstraits.gridy  ++;
		jpanel.add(mostratempo, gridbagconstraits);
		
		
		
		
		descricaohora2.setPreferredSize(new Dimension(200, 25));
		gridbagconstraits.gridy++;
		jpanel.add(descricaohora2, gridbagconstraits);

		mostratempo2.setPreferredSize(new Dimension(200, 25));
		mostratempo2.setEditable(false);
		gridbagconstraits.gridy ++;
		jpanel.add(mostratempo2, gridbagconstraits);
		
		
		gridbagconstraits.gridwidth =1;
		
		jbstart.setPreferredSize(new Dimension(92,25));		
		gridbagconstraits.gridy ++;
		jpanel.add(jbstart,gridbagconstraits);
		
		jbstop.setPreferredSize(new Dimension(92,25));
		gridbagconstraits.gridx++;
		jpanel.add(jbstop,gridbagconstraits);
		
		
		
		
		
		
		
		jbstart.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){

				thread1Time =new Thread (thread1);
				thread1Time.start();
			}



		});
		jbstop.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){

				
				thread1Time.stop();
				
			}


		});

		add(jpanel, BorderLayout.WEST);
		/// sempre o fim
		setVisible(true);
	}

}