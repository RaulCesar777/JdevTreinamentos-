package cursojava.threads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	private static final long serialVersionUID = 5669741374699052757L;

	private JPanel jpanel = new JPanel(new GridBagLayout());

	private JLabel descricaohora = new JLabel("nome");
	private JTextField mostratempo = new JTextField();

	private JLabel descricaohora2 = new JLabel("e-mail");
	private JTextField mostratempo2 = new JTextField();

	JButton jbstart = new JButton("ADD LISTA");
	JButton jbstop = new JButton("STOP");

	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	public TelaTimeThread() {

		setTitle("Minha tela de Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		/////// primeira parte

		GridBagConstraints gridbagconstraits = new GridBagConstraints();
		gridbagconstraits.gridx = 0;
		gridbagconstraits.gridy = 0;
		gridbagconstraits.gridwidth = 2;
		gridbagconstraits.insets = new Insets(5, 10, 5, 5);
		gridbagconstraits.anchor = GridBagConstraints.WEST;

		//// controldador de posicionamento

		descricaohora.setPreferredSize(new Dimension(200, 25));
		jpanel.add(descricaohora, gridbagconstraits);

		mostratempo.setPreferredSize(new Dimension(200, 25));

		gridbagconstraits.gridy++;
		jpanel.add(mostratempo, gridbagconstraits);

		descricaohora2.setPreferredSize(new Dimension(200, 25));
		gridbagconstraits.gridy++;
		jpanel.add(descricaohora2, gridbagconstraits);

		mostratempo2.setPreferredSize(new Dimension(200, 25));

		gridbagconstraits.gridy++;
		jpanel.add(mostratempo2, gridbagconstraits);

		gridbagconstraits.gridwidth = 1;

		jbstart.setPreferredSize(new Dimension(92, 25));
		gridbagconstraits.gridy++;
		jpanel.add(jbstart, gridbagconstraits);

		jbstop.setPreferredSize(new Dimension(92, 25));
		gridbagconstraits.gridx++;
		jpanel.add(jbstop, gridbagconstraits);

		jbstart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostratempo.getText());
				filaThread.setEmail(mostratempo2.getText());
				fila.add(filaThread);
			}

		});
		jbstop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		});
		fila.start();
		add(jpanel, BorderLayout.WEST);
		/// sempre o fim
		setVisible(true);
	}

}