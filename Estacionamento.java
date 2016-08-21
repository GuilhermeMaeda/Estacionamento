package Main;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class Estacionamento {
     
	 static Font letra = new Font ("ARIAL",Font.BOLD,15);
	 static Font letra1 = new Font ("ARIAL",Font.BOLD,20);
	 static Font letra2 = new Font ("ARIAL",Font.BOLD,30);
	
	 static JFrame tela;
	 static JFrame tipos;
	 static JFrame fCarro;
	 static JFrame fMoto;
	 
	 static Integer vagas [] = new Integer [8];
	 static Integer especial [] = new Integer [8];
	 static Integer motoca [] = new Integer [8];
	 
	 static JButton primeiroAndar =  new JButton("Primeiro Andar");
	 static JButton segundoAndar =  new JButton("Segundo Andar");
	 static JButton terceiroAndar =  new JButton("Terceiro Andar");
	 
	 static JButton lugar =  new JButton(new ImageIcon("Images\\permitido-estacionar.png"));
	 static JButton lugar1 =  new JButton(new ImageIcon("Images\\permitido-estacionar.png"));
	 static JButton lugar2 =  new JButton(new ImageIcon("Images\\permitido-estacionar.png"));
	 static JButton lugar3 =  new JButton(new ImageIcon("Images\\permitido-estacionar.png"));
	 static JButton lugar4 =  new JButton(new ImageIcon("Images\\permitido-estacionar.png"));
	 static JButton lugar5 =  new JButton(new ImageIcon("Images\\permitido-estacionar.png"));
	 static JButton lugar6 =  new JButton(new ImageIcon("Images\\permitido-estacionar.png"));
	 static JButton lugar7 =  new JButton(new ImageIcon("Images\\permitido-estacionar.png"));
	 
	 static JButton start =  new JButton("Iniciar");
	 static JRadioButton car = new JRadioButton("Carro");
	 static JRadioButton motorcycle = new JRadioButton("Moto");
	 static ButtonGroup grupo = new ButtonGroup();
	 
	 static JLabel fundo = new JLabel (new ImageIcon("Images\\Parking.png"));
	 static JLabel carro = new JLabel (new ImageIcon("Images\\Fiat147.png"));
	 static JLabel moto = new JLabel (new ImageIcon("Images\\Lambreta2.png"));
	 static JLabel vaga = new JLabel (new ImageIcon("Images\\Vagas-carro.png"));
	 static JLabel vagaEsp = new JLabel (new ImageIcon("Images\\Vagas-Especial.png"));
	 static JLabel vagaMoto = new JLabel (new ImageIcon("Images\\Vagas-moto.png"));
	 
	 static JMenuBar barraMenu;
     static JMenu info = new JMenu("Menu");
	 static JMenuItem informacao = new JMenuItem("Informações");
	 static JMenuItem ajuda = new JMenuItem("Ajuda");
	 static JMenuItem sobre = new JMenuItem("Sobre o software");
	
     public static void main (String [] args){
	     tela = new JFrame();
	     barraMenu = new JMenuBar();
    	 telaPrincipal();
	     menu();
	     botao();
}

     static void telaPrincipal(){ 
    	    tela.setTitle("Sistema de gerenciamento de estacionamento");
			tela.setSize(600,400);
			tela.setJMenuBar(barraMenu);
			tela.setLocationRelativeTo(null);
			tela.setLayout(null);
			tela.setResizable(false);
			tela.setVisible(true);
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			tela.add(start);
			tela.add(fundo);
			start.setBounds(230,230,100,50);
			fundo.setBounds(0,0,600,400);
			start.setBackground(Color.GREEN);
        }
     
     static void menu() {
			barraMenu.add(info);
			info.add(informacao);
			info.add(ajuda);
			info.add(sobre);
			informacao.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,
							"Limite máximo de 100 cadastros\n Ao sair, todos os dados serão perdidos\n"
							+ "O cadastro de telefones só será possível se tiver ao menos um cliente cadastrado!");
				}
			});
			ajuda.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,
							"FAZER UM TUTORIAL");
				}
			});
			sobre.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,
							"Desenvolvido por Guilherme Maeda\n Acadêmico do curso de ciência da computação");
				}
			});
		}
     
     static void botao(){
    	start.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tela.setVisible(false);
					park();
					JOptionPane.showMessageDialog(null,
							"Informe o tipo do seu possante");
				}
			});
    	car.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirma = JOptionPane.showConfirmDialog(null,"Você deseja ter uma vaga especial?\n"
						+ "Vagas especiais para idosos e/ou cadeirantes");
				if(confirma == JOptionPane.YES_OPTION){
					entracarro1();
				}else if (confirma == JOptionPane.NO_OPTION){
					tipos.setVisible(false);
					entracarro();
					
				}
			}
		});
    	motorcycle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tipos.setVisible(false);
				entramoto();
			}
		});
     }
     
     static void park(){
    	 tipos = new JFrame();
    	 tipos.setTitle("Sistema de gerenciamento de estacionamento");
		 tipos.setSize(600,400);
		 tipos.setJMenuBar(barraMenu);
		 tipos.setLocationRelativeTo(null);
		 tipos.setLayout(null);
		 tipos.setResizable(false);
		 tipos.setVisible(true);
		 tipos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 JLabel pergunta = new JLabel ("Qual é o seu automóvel?");
		 pergunta.setFont(letra1);
		 pergunta.setBounds(170,0,300,100);
		 tipos.add(pergunta);
		 
		 grupo.add(car);
		 grupo.add(motorcycle);
		 car.setBounds(100,80,100,100);
		 car.setFont(letra);
		 motorcycle.setBounds(400,80,100,100);
		 motorcycle.setFont(letra);
		 tipos.add(car);
		 tipos.add(motorcycle);
		 tipos.add(carro);
		 carro.setBounds(1,120,300,300);
		 tipos.add(moto);
		 moto.setBounds(280,120,300,300);
		 
		 }
     
     static void entracarro(){
    	 fCarro = new JFrame();
    	 fCarro.setTitle("Sistema de gerenciamento de estacionamento");
    	 fCarro.setSize(900, 700);
    	 fCarro.setJMenuBar(barraMenu);
    	 fCarro.setLocationRelativeTo(null);
    	 fCarro.setLayout(null);
    	 fCarro.setResizable(false);
    	 fCarro.getContentPane().setBackground(Color.WHITE);
    	 fCarro.setVisible(true);
    	 fCarro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 
    	 fCarro.add(vaga);
    	 vaga.setBounds(0, 15, 700, 700);
    	 
    	 JLabel informação = new JLabel ("Você está no primeiro andar!");
    	 fCarro.add(informação);
    	 informação.setFont(letra2);
    	 informação.setBounds(0,0,500,100);
    	 
    	 fCarro.add(segundoAndar);
    	 segundoAndar.setBounds(650,100,200,50);
    	 segundoAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(terceiroAndar);
    	 terceiroAndar.setBounds(650,200,200,50);
    	 terceiroAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(lugar);
    	 lugar.setBounds(225,115,80,90);
    	 lugar.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar1);
    	 lugar1.setBounds(320,115,80,90);
    	 lugar1.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar2);
    	 lugar2.setBounds(415,115,80,90);
    	 lugar2.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar3);
    	 lugar3.setBounds(515,115,80,90);
    	 lugar3.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar4);
    	 lugar4.setBounds(230,525,80,90);
    	 lugar4.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar5);
    	 lugar5.setBounds(325,525,80,90);
    	 lugar5.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar6);
    	 lugar6.setBounds(420,525,80,90);
    	 lugar6.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar7);
    	 lugar7.setBounds(520,525,80,90);
    	 lugar7.setBackground(Color.GREEN);
    	 
    	 segundoAndar.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				fCarro.setVisible(false);
  				segundoCarro();
  			}
  		});
     	 terceiroAndar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				fCarro.setVisible(false);
   				terceiroCarro();
   			}
   		});
     }
     
     static void segundoCarro(){
    	 fCarro = new JFrame();
    	 fCarro.setTitle("Sistema de gerenciamento de estacionamento");
    	 fCarro.setSize(900,700);
    	 fCarro.setJMenuBar(barraMenu);
    	 fCarro.setLocationRelativeTo(null);
    	 fCarro.setLayout(null);
    	 fCarro.setResizable(false);
    	 fCarro.getContentPane().setBackground(Color.WHITE);
    	 fCarro.setVisible(true);
    	 fCarro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 
    	 fCarro.add(vaga);
    	 vaga.setBounds(0, 15, 700, 700);
    	 
    	 JLabel informação = new JLabel ("Você está no segundo andar!");
    	 fCarro.add(informação);
    	 informação.setFont(letra2);
    	 informação.setBounds(0,0,500,100);
    	 
    	 fCarro.add(primeiroAndar);
    	 primeiroAndar.setBounds(650,100,200,50);
    	 primeiroAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(terceiroAndar);
    	 terceiroAndar.setBounds(650,200,200,50);
    	 terceiroAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(lugar);
    	 lugar.setBounds(225,115,80,90);
    	 lugar.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar1);
    	 lugar1.setBounds(320,115,80,90);
    	 lugar1.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar2);
    	 lugar2.setBounds(415,115,80,90);
    	 lugar2.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar3);
    	 lugar3.setBounds(515,115,80,90);
    	 lugar3.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar4);
    	 lugar4.setBounds(230,525,80,90);
    	 lugar4.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar5);
    	 lugar5.setBounds(325,525,80,90);
    	 lugar5.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar6);
    	 lugar6.setBounds(420,525,80,90);
    	 lugar6.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar7);
    	 lugar7.setBounds(520,525,80,90);
    	 lugar7.setBackground(Color.GREEN);
    	 
    	 primeiroAndar.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				fCarro.setVisible(false);
  				entracarro();
  			}
  		});
     	 terceiroAndar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				fCarro.setVisible(false);
   				terceiroCarro();
   			}
   		});
    	 
     }
     static void terceiroCarro(){
    	 fCarro = new JFrame();
    	 fCarro.setTitle("Sistema de gerenciamento de estacionamento");
    	 fCarro.setSize(900,700);
    	 fCarro.setJMenuBar(barraMenu);
    	 fCarro.setLocationRelativeTo(null);
    	 fCarro.setLayout(null);
    	 fCarro.setResizable(false);
    	 fCarro.getContentPane().setBackground(Color.WHITE);
    	 fCarro.setVisible(true);
    	 fCarro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 
    	 fCarro.add(vaga);
    	 vaga.setBounds(0, 15, 700, 700);
    	 
    	 JLabel informação = new JLabel ("Você está no terceiro andar!");
    	 fCarro.add(informação);
    	 informação.setFont(letra2);
    	 informação.setBounds(0,0,500,100);
    	 
    	 fCarro.add(primeiroAndar);
    	 primeiroAndar.setBounds(650,100,200,50);
    	 primeiroAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(segundoAndar);
    	 segundoAndar.setBounds(650,200,200,50);
    	 segundoAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(lugar);
    	 lugar.setBounds(225,115,80,90);
    	 lugar.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar1);
    	 lugar1.setBounds(320,115,80,90);
    	 lugar1.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar2);
    	 lugar2.setBounds(415,115,80,90);
    	 lugar2.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar3);
    	 lugar3.setBounds(515,115,80,90);
    	 lugar3.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar4);
    	 lugar4.setBounds(230,525,80,90);
    	 lugar4.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar5);
    	 lugar5.setBounds(325,525,80,90);
    	 lugar5.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar6);
    	 lugar6.setBounds(420,525,80,90);
    	 lugar6.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar7);
    	 lugar7.setBounds(520,525,80,90);
    	 lugar7.setBackground(Color.GREEN);
    	 
    	 primeiroAndar.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				fCarro.setVisible(false);
  				entracarro();
  			}
  		});
     	 segundoAndar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				fCarro.setVisible(false);
   				segundoCarro();
   			}
   		});
    	 
     }
     static void entracarro1(){
    	 fCarro = new JFrame();
    	 fCarro.setTitle("Sistema de gerenciamento de estacionamento");
    	 fCarro.setSize(900,700);
    	 fCarro.setJMenuBar(barraMenu);
    	 fCarro.setLocationRelativeTo(null);
    	 fCarro.setLayout(null);
    	 fCarro.setResizable(false);
    	 fCarro.getContentPane().setBackground(Color.WHITE);
    	 fCarro.setVisible(true);
    	 fCarro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 
    	 fCarro.add(vagaEsp);
    	 vagaEsp.setBounds(0, 15, 700, 700);
    	 
    	 JLabel informação = new JLabel ("Você está no primeiro andar!");
    	 fCarro.add(informação);
    	 informação.setFont(letra2);
    	 informação.setBounds(0,0,500,100);
    	 
    	 fCarro.add(segundoAndar);
    	 segundoAndar.setBounds(650,100,200,50);
    	 segundoAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(terceiroAndar);
    	 terceiroAndar.setBounds(650,200,200,50);
    	 terceiroAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(lugar);
    	 lugar.setBounds(160,115,80,90);
    	 lugar.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar1);
    	 lugar1.setBounds(260,115,80,90);
    	 lugar1.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar2);
    	 lugar2.setBounds(360,115,80,90);
    	 lugar2.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar3);
    	 lugar3.setBounds(460,115,80,90);
    	 lugar3.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar4);
    	 lugar4.setBounds(160,525,80,90);
    	 lugar4.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar5);
    	 lugar5.setBounds(260,525,80,90);
    	 lugar5.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar6);
    	 lugar6.setBounds(360,525,80,90);
    	 lugar6.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar7);
    	 lugar7.setBounds(460,525,80,90);
    	 lugar7.setBackground(Color.GREEN);
    	 
    	 segundoAndar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				fCarro.setVisible(false);
   				segundoCarro1();
   			}
   		});
      	 terceiroAndar.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				fCarro.setVisible(false);
    				terceiroCarro1();
    			}
    		});
     }
     
     static void segundoCarro1(){
    	 fCarro = new JFrame();
    	 fCarro.setTitle("Sistema de gerenciamento de estacionamento");
    	 fCarro.setSize(900,700);
    	 fCarro.setJMenuBar(barraMenu);
    	 fCarro.setLocationRelativeTo(null);
    	 fCarro.setLayout(null);
    	 fCarro.setResizable(false);
    	 fCarro.getContentPane().setBackground(Color.WHITE);
    	 fCarro.setVisible(true);
    	 fCarro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 
    	 fCarro.add(vagaEsp);
    	 vagaEsp.setBounds(0, 15, 700, 700);
    	 
    	 JLabel informação = new JLabel ("Você está no segundo andar!");
    	 fCarro.add(informação);
    	 informação.setFont(letra2);
    	 informação.setBounds(0,0,500,100);
    	 
    	 fCarro.add(primeiroAndar);
    	 primeiroAndar.setBounds(650,100,200,50);
    	 primeiroAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(terceiroAndar);
    	 terceiroAndar.setBounds(650,200,200,50);
    	 terceiroAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(lugar);
    	 lugar.setBounds(160,115,80,90);
    	 lugar.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar1);
    	 lugar1.setBounds(260,115,80,90);
    	 lugar1.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar2);
    	 lugar2.setBounds(360,115,80,90);
    	 lugar2.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar3);
    	 lugar3.setBounds(460,115,80,90);
    	 lugar3.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar4);
    	 lugar4.setBounds(160,525,80,90);
    	 lugar4.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar5);
    	 lugar5.setBounds(260,525,80,90);
    	 lugar5.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar6);
    	 lugar6.setBounds(360,525,80,90);
    	 lugar6.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar7);
    	 lugar7.setBounds(460,525,80,90);
    	 lugar7.setBackground(Color.GREEN);
    	 
    	 primeiroAndar.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				fCarro.setVisible(false);
  				entracarro1();
  			}
  		});
     	 terceiroAndar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				fCarro.setVisible(false);
   				terceiroCarro1();
   			}
   		});
    	 
     }
     
     static void terceiroCarro1(){
    	 fCarro = new JFrame();
    	 fCarro.setTitle("Sistema de gerenciamento de estacionamento");
    	 fCarro.setSize(900,700);
    	 fCarro.setJMenuBar(barraMenu);
    	 fCarro.setLocationRelativeTo(null);
    	 fCarro.setLayout(null);
    	 fCarro.setResizable(false);
    	 fCarro.getContentPane().setBackground(Color.WHITE);
    	 fCarro.setVisible(true);
    	 fCarro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 
    	 fCarro.add(vagaEsp);
    	 vagaEsp.setBounds(0, 15, 700, 700);
    	 
    	 JLabel informação = new JLabel ("Você está no terceiro andar!");
    	 fCarro.add(informação);
    	 informação.setFont(letra2);
    	 informação.setBounds(0,0,500,100);
    	 
    	 fCarro.add(primeiroAndar);
    	 primeiroAndar.setBounds(650,100,200,50);
    	 primeiroAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(segundoAndar);
    	 segundoAndar.setBounds(650,200,200,50);
    	 segundoAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(lugar);
    	 lugar.setBounds(160,115,80,90);
    	 lugar.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar1);
    	 lugar1.setBounds(260,115,80,90);
    	 lugar1.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar2);
    	 lugar2.setBounds(360,115,80,90);
    	 lugar2.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar3);
    	 lugar3.setBounds(460,115,80,90);
    	 lugar3.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar4);
    	 lugar4.setBounds(160,525,80,90);
    	 lugar4.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar5);
    	 lugar5.setBounds(260,525,80,90);
    	 lugar5.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar6);
    	 lugar6.setBounds(360,525,80,90);
    	 lugar6.setBackground(Color.GREEN);
    	 
    	 fCarro.add(lugar7);
    	 lugar7.setBounds(460,525,80,90);
    	 lugar7.setBackground(Color.GREEN);
    	 
    	 primeiroAndar.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				fCarro.setVisible(false);
  				entracarro1();
  			}
  		});
     	 segundoAndar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				fCarro.setVisible(false);
   				segundoCarro1();
   			}
   		});
    	 
     }
     
     static void entramoto(){
    	 fMoto = new JFrame();
    	 fMoto.setTitle("Sistema de gerenciamento de estacionamento");
    	 fMoto.setSize(900,700);
    	 fMoto.setJMenuBar(barraMenu);
    	 fMoto.setLocationRelativeTo(null);
    	 fMoto.setLayout(null);
    	 fMoto.setResizable(false);
    	 fMoto.getContentPane().setBackground(Color.WHITE);
    	 fMoto.setVisible(true);
    	 fMoto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 
    	 fMoto.add(vagaMoto);
    	 vagaMoto.setBounds(0, 15, 700, 700);
    	 
    	 JLabel informação = new JLabel ("Você está no primeiro andar!");
    	 fMoto.add(informação);
    	 informação.setFont(letra2);
    	 informação.setBounds(0,0,500,100);
    	 
    	 fMoto.add(segundoAndar);
    	 segundoAndar.setBounds(650,100,200,50);
    	 segundoAndar.setBackground(Color.WHITE);
    	 
    	 fMoto.add(terceiroAndar);
    	 terceiroAndar.setBounds(650,200,200,50);
    	 terceiroAndar.setBackground(Color.WHITE);
    	 
    	 fMoto.add(lugar);
    	 lugar.setBounds(160,115,80,90);
    	 lugar.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar1);
    	 lugar1.setBounds(260,115,80,90);
    	 lugar1.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar2);
    	 lugar2.setBounds(360,115,80,90);
    	 lugar2.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar3);
    	 lugar3.setBounds(460,115,80,90);
    	 lugar3.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar4);
    	 lugar4.setBounds(160,525,80,90);
    	 lugar4.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar5);
    	 lugar5.setBounds(260,525,80,90);
    	 lugar5.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar6);
    	 lugar6.setBounds(360,525,80,90);
    	 lugar6.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar7);
    	 lugar7.setBounds(460,525,80,90);
    	 lugar7.setBackground(Color.GREEN);
    	 
    	 segundoAndar.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				fMoto.setVisible(false);
 				segundoMoto();
 			}
 		});
    	 terceiroAndar.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				fMoto.setVisible(false);
  				terceiroMoto();
  			}
  		});
     }
     static void segundoMoto(){
    	 fMoto = new JFrame();
    	 fMoto.setTitle("Sistema de gerenciamento de estacionamento");
    	 fMoto.setSize(900,700);
    	 fMoto.setJMenuBar(barraMenu);
    	 fMoto.setLocationRelativeTo(null);
    	 fMoto.setLayout(null);
    	 fMoto.setResizable(false);
    	 fMoto.getContentPane().setBackground(Color.WHITE);
    	 fMoto.setVisible(true);
    	 fMoto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 
    	 fMoto.add(vagaMoto);
    	 vagaMoto.setBounds(0, 15, 700, 700);
    	 
    	 JLabel informação = new JLabel ("Você está no segundo andar!");
    	 fMoto.add(informação);
    	 informação.setFont(letra2);
    	 informação.setBounds(0,0,500,100);
    	 
    	 fMoto.add(primeiroAndar);
    	 primeiroAndar.setBounds(650,100,200,50);
    	 primeiroAndar.setBackground(Color.WHITE);
    	 
    	 fMoto.add(terceiroAndar);
    	 terceiroAndar.setBounds(650,200,200,50);
    	 terceiroAndar.setBackground(Color.WHITE);
    	 
    	 fMoto.add(lugar);
    	 lugar.setBounds(160,115,80,90);
    	 lugar.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar1);
    	 lugar1.setBounds(260,115,80,90);
    	 lugar1.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar2);
    	 lugar2.setBounds(360,115,80,90);
    	 lugar2.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar3);
    	 lugar3.setBounds(460,115,80,90);
    	 lugar3.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar4);
    	 lugar4.setBounds(160,525,80,90);
    	 lugar4.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar5);
    	 lugar5.setBounds(260,525,80,90);
    	 lugar5.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar6);
    	 lugar6.setBounds(360,525,80,90);
    	 lugar6.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar7);
    	 lugar7.setBounds(460,525,80,90);
    	 lugar7.setBackground(Color.GREEN);
    	 
    	 primeiroAndar.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				fMoto.setVisible(false);
  				entramoto();
  			}
  		});
     	 terceiroAndar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				fMoto.setVisible(false);
   				terceiroMoto();
   			}
   		});
    	 
     }
     static void terceiroMoto(){
    	 fMoto = new JFrame();
    	 fMoto.setTitle("Sistema de gerenciamento de estacionamento");
    	 fMoto.setSize(900,700);
    	 fMoto.setJMenuBar(barraMenu);
    	 fMoto.setLocationRelativeTo(null);
    	 fMoto.setLayout(null);
    	 fMoto.setResizable(false);
    	 fMoto.getContentPane().setBackground(Color.WHITE);
    	 fMoto.setVisible(true);
    	 fMoto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 
    	 fMoto.add(vagaMoto);
    	 vagaMoto.setBounds(0, 15, 700, 700);
    	 
    	 JLabel informação = new JLabel ("Você está no terceiro andar!");
    	 fMoto.add(informação);
    	 informação.setFont(letra2);
    	 informação.setBounds(0,0,500,100);
    	 
    	 fMoto.add(primeiroAndar);
    	 primeiroAndar.setBounds(650,100,200,50);
    	 primeiroAndar.setBackground(Color.WHITE);
    	 
    	 fMoto.add(segundoAndar);
    	 segundoAndar.setBounds(650,200,200,50);
    	 segundoAndar.setBackground(Color.WHITE);
    	 
    	 fMoto.add(lugar);
    	 lugar.setBounds(160,115,80,90);
    	 lugar.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar1);
    	 lugar1.setBounds(260,115,80,90);
    	 lugar1.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar2);
    	 lugar2.setBounds(360,115,80,90);
    	 lugar2.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar3);
    	 lugar3.setBounds(460,115,80,90);
    	 lugar3.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar4);
    	 lugar4.setBounds(160,525,80,90);
    	 lugar4.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar5);
    	 lugar5.setBounds(260,525,80,90);
    	 lugar5.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar6);
    	 lugar6.setBounds(360,525,80,90);
    	 lugar6.setBackground(Color.GREEN);
    	 
    	 fMoto.add(lugar7);
    	 lugar7.setBounds(460,525,80,90);
    	 lugar7.setBackground(Color.GREEN);
    	 
    	 primeiroAndar.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				fMoto.setVisible(false);
  				entramoto();
  			}
  		});
     	 segundoAndar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				fMoto.setVisible(false);
   				segundoMoto();
   			}
   		});
    	 
     }
     
     static void sorteiaVaga(){
    	 //Integer vagas [] = new Integer [8];
    	 
    	//if (){
    		
    	//}
     }
	}
