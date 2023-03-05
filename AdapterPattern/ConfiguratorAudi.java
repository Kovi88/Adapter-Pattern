package AdapterPattern;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ConfiguratorAudi {

	private JFrame frmConfiguratorAudi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { // configurarea ferestrei cu interfata grafica
					ConfiguratorAudi window = new ConfiguratorAudi();
					window.frmConfiguratorAudi.setVisible(true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static void testAdapter(CaracteristiciEuropa caracteristiciEuropa) { // functia care atribuie caracteristicile masinii

		System.out.println("Ati selectat modelul: " + caracteristiciEuropa.getModelEU());
		System.out.println("Pret in Euro: " +  String.format("%.2f", caracteristiciEuropa.getPretEU()));
		System.out.println("Combustibil: " + caracteristiciEuropa.getCombustibilEU());
		System.out.println("Capacitate cilindrica: " + caracteristiciEuropa.getCapacitateEU());
		System.out.println("Cai putere: " + String.format("%.2f", caracteristiciEuropa.getPutereEU()));
		System.out.println("Cutie de viteze: " + caracteristiciEuropa.getCutieEU());
		System.out.println("Consum in l/100 km: " + String.format("%.2f", caracteristiciEuropa.getConsumEU()));
		System.out.println("Viteza maxima in km/h: " + String.format("%.2f", caracteristiciEuropa.getVitezaMaxEU()) + "\n");
	}

	/**
	 * Create the application.
	 */
	public ConfiguratorAudi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConfiguratorAudi = new JFrame();
		frmConfiguratorAudi.setTitle("Configurator Audi");
		frmConfiguratorAudi.setBounds(100, 100, 1400, 800);
		frmConfiguratorAudi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton A3Button = new JButton("A3");
		A3Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// crearea unui obiect de tip CaracteristiciAmerica
				CaracteristiciAmerica caracteristiciAmericaA3 = new CaracteristiciAmericaImpl(); 
				// setarea caracteristicilor masinii pe baza functiilor implementate in CaracteristiciAmericaImpl
				caracteristiciAmericaA3.setModelA("A3");
				caracteristiciAmericaA3.setPretA(35425.6);
				caracteristiciAmericaA3.setCombustibilA("Benzina");
				caracteristiciAmericaA3.setCapacitateA("999 cm3");
				caracteristiciAmericaA3.setPutereA(81.0);
				caracteristiciAmericaA3.setCutieA("Manuala");
				caracteristiciAmericaA3.setConsumA(46.0);
				caracteristiciAmericaA3.setVitezaMaxA(126.75);
				
				// cream un obiect de tip CaracteristiciEuropa cu ajutorul adapterului
				CaracteristiciEuropa caracteristiciEuropa = new Adapter(caracteristiciAmericaA3);
				testAdapter(caracteristiciEuropa);
			}
		});
		Image imageA3 = new ImageIcon(this.getClass().getResource("/A3.png")).getImage();
		A3Button.setIcon(new ImageIcon(imageA3));
		A3Button.setBounds(50,50,600,300);
		frmConfiguratorAudi.getContentPane().setLayout(null);
		frmConfiguratorAudi.getContentPane().add(A3Button);
		
		A3Button.setBorder(BorderFactory.createEmptyBorder());
		A3Button.setContentAreaFilled(false);
		
		JButton A4Button = new JButton("A4");
		A4Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CaracteristiciAmerica caracteristiciAmericaA4 = new CaracteristiciAmericaImpl();
				caracteristiciAmericaA4.setModelA("A4");
				caracteristiciAmericaA4.setPretA(48395.3);
				caracteristiciAmericaA4.setCombustibilA("Diesel");
				caracteristiciAmericaA4.setCapacitateA("1968 cm3");
				caracteristiciAmericaA4.setPutereA(119.89);
				caracteristiciAmericaA4.setCutieA("Automata");
				caracteristiciAmericaA4.setConsumA(50.0);
				caracteristiciAmericaA4.setVitezaMaxA(130.48);
				
				CaracteristiciEuropa caracteristiciEuropa = new Adapter(caracteristiciAmericaA4);
				testAdapter(caracteristiciEuropa);
			}
		});
		Image imageA4 = new ImageIcon(this.getClass().getResource("/A4.png")).getImage();
		A4Button.setIcon(new ImageIcon(imageA4));
		A4Button.setBounds(750,50,600,300);
		frmConfiguratorAudi.getContentPane().setLayout(null);
		frmConfiguratorAudi.getContentPane().add(A4Button);
		
		A4Button.setBorder(BorderFactory.createEmptyBorder());
		A4Button.setContentAreaFilled(false);
		
		JButton A7Button = new JButton("A7");
		A7Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CaracteristiciAmerica caracteristiciAmericaA7 = new CaracteristiciAmericaImpl();
				caracteristiciAmericaA7.setModelA("A7");
				caracteristiciAmericaA7.setPretA(90600.3);
				caracteristiciAmericaA7.setCombustibilA("Diesel");
				caracteristiciAmericaA7.setCapacitateA("2967 cm3");
				caracteristiciAmericaA7.setPutereA(253.0);
				caracteristiciAmericaA7.setCutieA("Automata");
				caracteristiciAmericaA7.setConsumA(33.0);
				caracteristiciAmericaA7.setVitezaMaxA(155.34);
				
				CaracteristiciEuropa caracteristiciEuropa = new Adapter(caracteristiciAmericaA7);
				testAdapter(caracteristiciEuropa);
			}
		});
		Image imageA7 = new ImageIcon(this.getClass().getResource("/A7.png")).getImage();
		A7Button.setIcon(new ImageIcon(imageA7));
		A7Button.setBounds(50,400,600,300);
		frmConfiguratorAudi.getContentPane().setLayout(null);
		frmConfiguratorAudi.getContentPane().add(A7Button);
		
		A7Button.setBorder(BorderFactory.createEmptyBorder());
		A7Button.setContentAreaFilled(false);
		
		JButton A8Button = new JButton("A8");
		A8Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CaracteristiciAmerica caracteristiciAmericaA8 = new CaracteristiciAmericaImpl();
				caracteristiciAmericaA8.setModelA("A8");
				caracteristiciAmericaA8.setPretA(138400.2);
				caracteristiciAmericaA8.setCombustibilA("Benzina");
				caracteristiciAmericaA8.setCapacitateA("3996 cm3");
				caracteristiciAmericaA8.setPutereA(420.0);
				caracteristiciAmericaA8.setCutieA("Automata");
				caracteristiciAmericaA8.setConsumA(20.0);
				caracteristiciAmericaA8.setVitezaMaxA(173.97);
				
				CaracteristiciEuropa caracteristiciEuropa = new Adapter(caracteristiciAmericaA8);
				testAdapter(caracteristiciEuropa);	
			}
		});
		Image imageA8 = new ImageIcon(this.getClass().getResource("/A8.png")).getImage();
		A8Button.setIcon(new ImageIcon(imageA8));
		A8Button.setBounds(750,400,600,300);
		frmConfiguratorAudi.getContentPane().setLayout(null);
		frmConfiguratorAudi.getContentPane().add(A8Button);
		
		A8Button.setBorder(BorderFactory.createEmptyBorder());
		A8Button.setContentAreaFilled(false);
		
		Font fontConfiguratorAudi = new Font("SansSerif", Font.BOLD, 30);
		JTextField textConfiguratorAudi = new JTextField();
		textConfiguratorAudi.setFont(fontConfiguratorAudi);
		textConfiguratorAudi.setText("Configurator Audi");
		textConfiguratorAudi.setBounds(550, 25, 350, 50);
		frmConfiguratorAudi.getContentPane().add(textConfiguratorAudi);
		textConfiguratorAudi.setBorder(null);
		textConfiguratorAudi.setOpaque(false);
		
		Font fontA3 = new Font("SansSerif", Font.BOLD, 30);
		JTextField textA3 = new JTextField();
		textA3.setFont(fontA3);
		textA3.setText("A3");
		textA3.setBounds(350, 100, 65, 30);
		frmConfiguratorAudi.getContentPane().add(textA3);
		textA3.setBorder(null);
		textA3.setOpaque(false);
		
		Font fontA4 = new Font("SansSerif", Font.BOLD, 30);
		JTextField textA4 = new JTextField();
		textA4.setFont(fontA4);
		textA4.setText("A4");
		textA4.setBounds(1050, 100, 65, 30);
		frmConfiguratorAudi.getContentPane().add(textA4);
		textA4.setBorder(null);
		textA4.setOpaque(false);
		
		Font fontA7 = new Font("SansSerif", Font.BOLD, 30);
		JTextField textA7 = new JTextField();
		textA7.setFont(fontA7);
		textA7.setText("A7");
		textA7.setBounds(350, 450, 65, 30);
		frmConfiguratorAudi.getContentPane().add(textA7);
		textA7.setBorder(null);
		textA7.setOpaque(false);
		
		Font fontA8 = new Font("SansSerif", Font.BOLD, 30);
		JTextField textA8 = new JTextField();
		textA8.setFont(fontA8);
		textA8.setText("A8");
		textA8.setBounds(1050, 450, 65, 30);
		frmConfiguratorAudi.getContentPane().add(textA8);
		textA8.setBorder(null);
		textA8.setOpaque(false);
		
	}
}
