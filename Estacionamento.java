package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Estacionamento {
     
	 static Font letra = new Font ("ARIAL",Font.BOLD,15);
	 static Font letra1 = new Font ("ARIAL",Font.BOLD,20);
	 static Font letra2 = new Font ("ARIAL",Font.BOLD,30);
	
	 static JFrame tela;
	 static JFrame fCarro;
	 
	 static JPanel vagas [][] = new JPanel [3][24];
	 static boolean local[] = new boolean [24];
	 
	 static int total = 24;
	 
	 static JButton start =  new JButton("Iniciar");
	 static JButton primeiroAndar =  new JButton("Primeiro Andar");
	 static JButton segundoAndar =  new JButton("Segundo Andar");
	 static JButton terceiroAndar =  new JButton("Terceiro Andar");
	 static JButton random =  new JButton("Entrada");
	 static JButton random2 =  new JButton("Entrada");
	 static JButton random3 =  new JButton("Entrada");
	 static JButton out =  new JButton("Saída");
	 
	 static JPanel lugar;
	 static JPanel lugar1;
	 static JPanel lugar2;
	 static JPanel lugar3;
	 static JPanel lugar4;
	 static JPanel lugar5;
	 static JPanel lugar6;
	 static JPanel lugar7;
	 static JPanel lugar8;
	 static JPanel lugar9;
	 static JPanel lugar10;
	 static JPanel lugar11;
	 static JPanel lugar12;
	 static JPanel lugar13;
	 static JPanel lugar14;
	 static JPanel lugar15;
	 static JPanel lugar16;
	 static JPanel lugar17;
	 static JPanel lugar18;
	 static JPanel lugar19;
	 static JPanel lugar20;
	 static JPanel lugar21;
	 static JPanel lugar22;
	 static JPanel lugar23;

	 static JLabel fundo = new JLabel (new ImageIcon("Images\\Parking.png"));
	 static JLabel vaga = new JLabel (new ImageIcon("Images\\Estacionamento.png"));
	 
	 static JLabel Esp = new JLabel (new ImageIcon("Images\\vagaEsp.png"));
	 static JLabel Esp1 = new JLabel (new ImageIcon("Images\\vagaEsp.png"));
	 static JLabel Esp2 = new JLabel (new ImageIcon("Images\\vagaEsp.png"));
	 static JLabel Esp3 = new JLabel (new ImageIcon("Images\\vagaEsp.png"));
	 static JLabel Esp4 = new JLabel (new ImageIcon("Images\\vagaEsp.png"));
	 static JLabel Esp5 = new JLabel (new ImageIcon("Images\\vagaEsp.png"));
	 static JLabel Esp6 = new JLabel (new ImageIcon("Images\\vagaEsp.png"));
	 static JLabel Esp7 = new JLabel (new ImageIcon("Images\\vagaEsp.png"));
	 
	 static JLabel Car = new JLabel (new ImageIcon("Images\\Carro.png"));
	 static JLabel Car1 = new JLabel (new ImageIcon("Images\\Carro.png"));
	 static JLabel Car2 = new JLabel (new ImageIcon("Images\\Carro.png"));
	 static JLabel Car3 = new JLabel (new ImageIcon("Images\\Carro.png"));
	 static JLabel Car4 = new JLabel (new ImageIcon("Images\\Carro.png"));
	 static JLabel Car5 = new JLabel (new ImageIcon("Images\\Carro.png"));
	 static JLabel Car6 = new JLabel (new ImageIcon("Images\\Carro.png"));
	 static JLabel Car7 = new JLabel (new ImageIcon("Images\\Carro.png"));
	 
	 static JLabel moto = new JLabel (new ImageIcon("Images\\moto.png"));
	 static JLabel moto1 = new JLabel (new ImageIcon("Images\\moto.png"));
	 static JLabel moto2 = new JLabel (new ImageIcon("Images\\moto.png"));
	 static JLabel moto3 = new JLabel (new ImageIcon("Images\\moto.png"));
	 static JLabel moto4 = new JLabel (new ImageIcon("Images\\moto.png"));
	 static JLabel moto5 = new JLabel (new ImageIcon("Images\\moto.png"));
	 static JLabel moto6 = new JLabel (new ImageIcon("Images\\moto.png"));
	 static JLabel moto7 = new JLabel (new ImageIcon("Images\\moto.png"));
	 
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
					entrada1();
				}
			});
    	random.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				sorteiaVaga();
   				mudarCor();
   			}
   		});
    	random2.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				sorteiaVaga2();
   				mudarCor2();
   			}
   		});
    	random3.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				sorteiaVaga3();
   				mudarCor3();
   			}
   		});
    	
    	out.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				sorteiaVagaS();
   				mudarCor();
   			}
   		});
     }
     
     static void entrada1(){
    	 fCarro = new JFrame();
    	 fCarro.setTitle("Sistema de gerenciamento de estacionamento");
    	 fCarro.setSize(1400, 720);
    	 fCarro.setJMenuBar(barraMenu);
    	 fCarro.setLocationRelativeTo(null);
    	 fCarro.setLayout(null);
    	 fCarro.setResizable(false);
    	 fCarro.getContentPane().setBackground(Color.WHITE);
    	 fCarro.setVisible(true);
    	 fCarro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 
    	 JLabel informação = new JLabel ("Primeiro andar!");
    	 fCarro.add(informação);
    	 informação.setFont(letra2);
    	 informação.setBounds(0,0,500,100);
    	 
    	 fCarro.add(segundoAndar);
    	 segundoAndar.setBounds(250,50,200,50);
    	 segundoAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(terceiroAndar);
    	 terceiroAndar.setBounds(450,50,200,50);
    	 terceiroAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(random);
    	 random.setBounds(650,50,200,50);
    	 random.setBackground(Color.WHITE);
    	 
    	 fCarro.add(out);
    	 out.setBounds(850,50,200,50);
    	 out.setBackground(Color.WHITE);
    	 
    	 lugar =  new JPanel();
    	 fCarro.add(lugar);
    	 lugar.setBounds(170,125,80,90);
    	 lugar.setBackground(Color.GREEN);
    	 lugar.setFont(letra2);
    	 lugar.add(Esp);
    	 vagas[0][0] = lugar;
    	 local[0] = false;
    	 
    	 lugar1 =  new JPanel();
    	 fCarro.add(lugar1);
    	 lugar1.setBounds(265,125,80,90);
    	 lugar1.setBackground(Color.GREEN);
    	 lugar1.setFont(letra2);
    	 lugar1.add(Esp1);
    	 vagas[0][1] = lugar1;
    	 local[1] = false;
    	 
    	 lugar2 =  new JPanel();
    	 fCarro.add(lugar2);
    	 lugar2.setBounds(360,125,80,90);
    	 lugar2.setBackground(Color.GREEN);
    	 lugar2.setFont(letra2);
    	 lugar2.add(Esp2);
    	 vagas[0][2] = lugar2;
    	 local[2] = false;
    	 
    	 lugar3 =  new JPanel();
    	 fCarro.add(lugar3);
    	 lugar3.setBounds(460,125,80,90);
    	 lugar3.setBackground(Color.GREEN);
    	 lugar3.setFont(letra2);
    	 lugar3.add(Esp3);
    	 vagas[0][3] = lugar3;
    	 local[3] = false;
    	 
    	 lugar4 =  new JPanel();
    	 fCarro.add(lugar4);
    	 lugar4.setBounds(560,125,80,90);
    	 lugar4.setBackground(Color.GREEN);
    	 lugar4.setFont(letra2);
    	 lugar4.add(Esp4);
    	 vagas[0][4] = lugar4;
    	 local[4] = false;
    	 
    	 lugar5 =  new JPanel();
    	 fCarro.add(lugar5);
    	 lugar5.setBounds(655,125,80,90);
    	 lugar5.setBackground(Color.GREEN);
    	 lugar5.setFont(letra2);
    	 lugar5.add(Esp5);
    	 vagas[0][5] = lugar5;
    	 local[5] = false;
    	 
    	 lugar6 =  new JPanel();
    	 fCarro.add(lugar6);
    	 lugar6.setBounds(750,125,80,90);
    	 lugar6.setBackground(Color.GREEN);
    	 lugar6.setFont(letra2);
    	 lugar6.add(Esp6);
    	 vagas[0][6] = lugar6;
    	 local[6] = false;
    	 
    	 lugar7 =  new JPanel();
    	 fCarro.add(lugar7);
    	 lugar7.setBounds(850,125,80,90);
    	 lugar7.setBackground(Color.GREEN);
    	 lugar7.setFont(letra2);
    	 lugar7.add(Esp7);    	 
    	 vagas[0][7] = lugar7;
    	 local[7] = false;
    	 
    	 lugar8 =  new JPanel();
    	 fCarro.add(lugar8);
    	 lugar8.setBounds(950,125,80,90);
    	 lugar8.setBackground(Color.GREEN);
    	 lugar8.setFont(letra2);
    	 lugar8.add(Car);
    	 vagas[0][8] = lugar8;
    	 local[8] = false;
    	 
    	 lugar9 =  new JPanel();
    	 fCarro.add(lugar9);
    	 lugar9.setBounds(1050,125,80,90);
    	 lugar9.setBackground(Color.GREEN);
    	 lugar9.setFont(letra2);
    	 lugar9.add(Car1);
    	 vagas[0][9] = lugar9;
    	 local[9] = false;
    	 
    	 lugar10 =  new JPanel();
    	 fCarro.add(lugar10);
    	 lugar10.setBounds(1150,125,80,90);
    	 lugar10.setBackground(Color.GREEN);
    	 lugar10.add(Car2);
    	 lugar10.setFont(letra2);
    	 vagas[0][10] = lugar10;
    	 local[10] = false;
    	 
    	 lugar11 =  new JPanel();
    	 fCarro.add(lugar11);
    	 lugar11.setBounds(1250,125,80,90);
    	 lugar11.setBackground(Color.GREEN);
    	 lugar11.add(Car3);
    	 lugar11.setFont(letra2);
    	 vagas[0][11] = lugar11;
    	 local[11] = false;
    	 
    	 lugar12 =  new JPanel();
    	 fCarro.add(lugar12);
    	 lugar12.setBounds(175,535,80,90);
    	 lugar12.setBackground(Color.GREEN);
    	 lugar12.setFont(letra2);
    	 lugar12.add(Car4);
    	 vagas[0][12] = lugar12;
    	 local[12] = false;
    	 
    	 lugar13 =  new JPanel();
    	 fCarro.add(lugar13);
    	 lugar13.setBounds(270,535,80,90);
    	 lugar13.setBackground(Color.GREEN);
    	 lugar13.setFont(letra2);
    	 lugar13.add(Car5);
    	 vagas[0][13] = lugar13;
    	 local[13] = false;
    	 
    	 lugar14 =  new JPanel();
    	 fCarro.add(lugar14);
    	 lugar14.setBounds(365,535,80,90);
    	 lugar14.setBackground(Color.GREEN);
    	 lugar14.setFont(letra2);
    	 lugar14.add(Car6);
    	 vagas[0][14] = lugar14;
    	 local[14] = false;
    	 
    	 lugar15 =  new JPanel();
    	 fCarro.add(lugar15);
    	 lugar15.setBounds(465,535,80,90);
    	 lugar15.setBackground(Color.GREEN);
    	 lugar15.setFont(letra2);
    	 lugar15.add(Car7);
    	 vagas[0][15] = lugar15;
    	 local[15] = false;
    	 
    	 lugar16 =  new JPanel();
    	 fCarro.add(lugar16);
    	 lugar16.setBounds(560,535,80,90);
    	 lugar16.setBackground(Color.GREEN);
    	 lugar16.setFont(letra2);
    	 lugar16.add(moto);
    	 vagas[0][16] = lugar16;
    	 local[16] = false;
    	 
    	 lugar17 =  new JPanel();
    	 fCarro.add(lugar17);
    	 lugar17.setBounds(660,535,80,90);
    	 lugar17.setBackground(Color.GREEN);
    	 lugar17.setFont(letra2);
    	 lugar17.add(moto1);
    	 vagas[0][17] = lugar17;
    	 local[17] = false;
    	 
    	 lugar18 =  new JPanel();
    	 fCarro.add(lugar18);
    	 lugar18.setBounds(755,535,80,90);
    	 lugar18.setBackground(Color.GREEN);
    	 lugar18.setFont(letra2);
    	 lugar18.add(moto2);
    	 vagas[0][18] = lugar18;
    	 local[18] = false;
    	 
    	 lugar19 =  new JPanel();
    	 fCarro.add(lugar19);
    	 lugar19.setBounds(855,535,80,90);
    	 lugar19.setBackground(Color.GREEN);
    	 lugar19.setFont(letra2);
    	 lugar19.add(moto3);
    	 vagas[0][19] = lugar19;
    	 local[19] = false;
    	 
    	 lugar20 =  new JPanel();
    	 fCarro.add(lugar20);
    	 lugar20.setBounds(955,535,80,90);
    	 lugar20.setBackground(Color.GREEN);
    	 lugar20.setFont(letra2);
    	 lugar20.add(moto4);
    	 vagas[0][20] = lugar20;
    	 local[20] = false;
    	 
    	 lugar21 =  new JPanel();
    	 fCarro.add(lugar21);
    	 lugar21.setBounds(1055,535,80,90);
    	 lugar21.setBackground(Color.GREEN);
    	 lugar21.setFont(letra2);
    	 lugar21.add(moto5);
    	 vagas[0][21] = lugar21;
    	 local[21] = false;
    	 
    	 lugar22 =  new JPanel();
    	 fCarro.add(lugar22);
    	 lugar22.setBounds(1150,535,80,90);
    	 lugar22.setBackground(Color.GREEN);
    	 lugar22.setFont(letra2);
    	 lugar22.add(moto6);
    	 vagas[0][22] = lugar22;
    	 local[22] = false;
    	 
    	 lugar23 =  new JPanel();
    	 fCarro.add(lugar23);
    	 lugar23.setBounds(1250,535,80,90);
    	 lugar23.setBackground(Color.GREEN);
    	 lugar23.setFont(letra2);
    	 lugar23.add(moto7);
    	 vagas[0][23] = lugar23;
    	 local[23] = false;
    	 
    	 fCarro.add(vaga);
    	 vaga.setBounds(0, 15, 1400, 720);
    	 
    	 segundoAndar.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				fCarro.setVisible(false);
  				entrada2();
  			}
  		});
     	 terceiroAndar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				fCarro.setVisible(false);
   				entrada3();
   				
   			}
   		});
     }
     
     static void entrada2(){
    	 fCarro = new JFrame();
    	 fCarro.setTitle("Sistema de gerenciamento de estacionamento");
    	 fCarro.setSize(1400,720);
    	 fCarro.setJMenuBar(barraMenu);
    	 fCarro.setLocationRelativeTo(null);
    	 fCarro.setLayout(null);
    	 fCarro.setResizable(false);
    	 fCarro.getContentPane().setBackground(Color.WHITE);
    	 fCarro.setVisible(true);
    	 fCarro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 
    	 JLabel informação = new JLabel ("Segundo andar!");
    	 fCarro.add(informação);
    	 informação.setFont(letra2);
    	 informação.setBounds(0,0,500,100);
    	 
    	 fCarro.add(primeiroAndar);
    	 primeiroAndar.setBounds(250,50,200,50);
    	 primeiroAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(terceiroAndar);
    	 terceiroAndar.setBounds(450,50,200,50);
    	 terceiroAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(random2);
    	 random2.setBounds(650,50,200,50);
    	 random2.setBackground(Color.WHITE);
    	 
    	 fCarro.add(out);
    	 out.setBounds(850,50,200,50);
    	 out.setBackground(Color.WHITE);
    	 
    	 lugar =  new JPanel();
    	 fCarro.add(lugar);
    	 lugar.setBounds(170,125,80,90);
    	 lugar.setBackground(Color.GREEN);
    	 lugar.setFont(letra2);
    	 lugar.add(Esp);
    	 vagas[0][0] = lugar;
    	 local[0] = false;
    	 
    	 lugar1 =  new JPanel();
    	 fCarro.add(lugar1);
    	 lugar1.setBounds(265,125,80,90);
    	 lugar1.setBackground(Color.GREEN);
    	 lugar1.setFont(letra2);
    	 lugar1.add(Esp1);
    	 vagas[0][1] = lugar1;
    	 local[1] = false;
    	 
    	 lugar2 =  new JPanel();
    	 fCarro.add(lugar2);
    	 lugar2.setBounds(360,125,80,90);
    	 lugar2.setBackground(Color.GREEN);
    	 lugar2.setFont(letra2);
    	 lugar2.add(Esp2);
    	 vagas[0][2] = lugar2;
    	 local[2] = false;
    	 
    	 lugar3 =  new JPanel();
    	 fCarro.add(lugar3);
    	 lugar3.setBounds(460,125,80,90);
    	 lugar3.setBackground(Color.GREEN);
    	 lugar3.setFont(letra2);
    	 lugar3.add(Esp3);
    	 vagas[0][3] = lugar3;
    	 local[3] = false;
    	 
    	 lugar4 =  new JPanel();
    	 fCarro.add(lugar4);
    	 lugar4.setBounds(560,125,80,90);
    	 lugar4.setBackground(Color.GREEN);
    	 lugar4.setFont(letra2);
    	 lugar4.add(Esp4);
    	 vagas[0][4] = lugar4;
    	 local[4] = false;
    	 
    	 lugar5 =  new JPanel();
    	 fCarro.add(lugar5);
    	 lugar5.setBounds(655,125,80,90);
    	 lugar5.setBackground(Color.GREEN);
    	 lugar5.setFont(letra2);
    	 lugar5.add(Esp5);
    	 vagas[0][5] = lugar5;
    	 local[5] = false;
    	 
    	 lugar6 =  new JPanel();
    	 fCarro.add(lugar6);
    	 lugar6.setBounds(750,125,80,90);
    	 lugar6.setBackground(Color.GREEN);
    	 lugar6.setFont(letra2);
    	 lugar6.add(Esp6);
    	 vagas[0][6] = lugar6;
    	 local[6] = false;
    	 
    	 lugar7 =  new JPanel();
    	 fCarro.add(lugar7);
    	 lugar7.setBounds(850,125,80,90);
    	 lugar7.setBackground(Color.GREEN);
    	 lugar7.setFont(letra2);
    	 lugar7.add(Esp7);    	 
    	 vagas[0][7] = lugar7;
    	 local[7] = false;
    	 
    	 lugar8 =  new JPanel();
    	 fCarro.add(lugar8);
    	 lugar8.setBounds(950,125,80,90);
    	 lugar8.setBackground(Color.GREEN);
    	 lugar8.setFont(letra2);
    	 lugar8.add(Car);
    	 vagas[0][8] = lugar8;
    	 local[8] = false;
    	 
    	 lugar9 =  new JPanel();
    	 fCarro.add(lugar9);
    	 lugar9.setBounds(1050,125,80,90);
    	 lugar9.setBackground(Color.GREEN);
    	 lugar9.setFont(letra2);
    	 lugar9.add(Car1);
    	 vagas[0][9] = lugar9;
    	 local[9] = false;
    	 
    	 lugar10 =  new JPanel();
    	 fCarro.add(lugar10);
    	 lugar10.setBounds(1150,125,80,90);
    	 lugar10.setBackground(Color.GREEN);
    	 lugar10.add(Car2);
    	 lugar10.setFont(letra2);
    	 vagas[0][10] = lugar10;
    	 local[10] = false;
    	 
    	 lugar11 =  new JPanel();
    	 fCarro.add(lugar11);
    	 lugar11.setBounds(1250,125,80,90);
    	 lugar11.setBackground(Color.GREEN);
    	 lugar11.add(Car3);
    	 lugar11.setFont(letra2);
    	 vagas[0][11] = lugar11;
    	 local[11] = false;
    	 
    	 lugar12 =  new JPanel();
    	 fCarro.add(lugar12);
    	 lugar12.setBounds(175,535,80,90);
    	 lugar12.setBackground(Color.GREEN);
    	 lugar12.setFont(letra2);
    	 lugar12.add(Car4);
    	 vagas[0][12] = lugar12;
    	 local[12] = false;
    	 
    	 lugar13 =  new JPanel();
    	 fCarro.add(lugar13);
    	 lugar13.setBounds(270,535,80,90);
    	 lugar13.setBackground(Color.GREEN);
    	 lugar13.setFont(letra2);
    	 lugar13.add(Car5);
    	 vagas[0][13] = lugar13;
    	 local[13] = false;
    	 
    	 lugar14 =  new JPanel();
    	 fCarro.add(lugar14);
    	 lugar14.setBounds(365,535,80,90);
    	 lugar14.setBackground(Color.GREEN);
    	 lugar14.setFont(letra2);
    	 lugar14.add(Car6);
    	 vagas[0][14] = lugar14;
    	 local[14] = false;
    	 
    	 lugar15 =  new JPanel();
    	 fCarro.add(lugar15);
    	 lugar15.setBounds(465,535,80,90);
    	 lugar15.setBackground(Color.GREEN);
    	 lugar15.setFont(letra2);
    	 lugar15.add(Car7);
    	 vagas[0][15] = lugar15;
    	 local[15] = false;
    	 
    	 lugar16 =  new JPanel();
    	 fCarro.add(lugar16);
    	 lugar16.setBounds(560,535,80,90);
    	 lugar16.setBackground(Color.GREEN);
    	 lugar16.setFont(letra2);
    	 lugar16.add(moto);
    	 vagas[0][16] = lugar16;
    	 local[16] = false;
    	 
    	 lugar17 =  new JPanel();
    	 fCarro.add(lugar17);
    	 lugar17.setBounds(660,535,80,90);
    	 lugar17.setBackground(Color.GREEN);
    	 lugar17.setFont(letra2);
    	 lugar17.add(moto1);
    	 vagas[0][17] = lugar17;
    	 local[17] = false;
    	 
    	 lugar18 =  new JPanel();
    	 fCarro.add(lugar18);
    	 lugar18.setBounds(755,535,80,90);
    	 lugar18.setBackground(Color.GREEN);
    	 lugar18.setFont(letra2);
    	 lugar18.add(moto2);
    	 vagas[0][18] = lugar18;
    	 local[18] = false;
    	 
    	 lugar19 =  new JPanel();
    	 fCarro.add(lugar19);
    	 lugar19.setBounds(855,535,80,90);
    	 lugar19.setBackground(Color.GREEN);
    	 lugar19.setFont(letra2);
    	 lugar19.add(moto3);
    	 vagas[0][19] = lugar19;
    	 local[19] = false;
    	 
    	 lugar20 =  new JPanel();
    	 fCarro.add(lugar20);
    	 lugar20.setBounds(955,535,80,90);
    	 lugar20.setBackground(Color.GREEN);
    	 lugar20.setFont(letra2);
    	 lugar20.add(moto4);
    	 vagas[0][20] = lugar20;
    	 local[20] = false;
    	 
    	 lugar21 =  new JPanel();
    	 fCarro.add(lugar21);
    	 lugar21.setBounds(1055,535,80,90);
    	 lugar21.setBackground(Color.GREEN);
    	 lugar21.setFont(letra2);
    	 lugar21.add(moto5);
    	 vagas[0][21] = lugar21;
    	 local[21] = false;
    	 
    	 lugar22 =  new JPanel();
    	 fCarro.add(lugar22);
    	 lugar22.setBounds(1150,535,80,90);
    	 lugar22.setBackground(Color.GREEN);
    	 lugar22.setFont(letra2);
    	 lugar22.add(moto6);
    	 vagas[0][22] = lugar22;
    	 local[22] = false;
    	 
    	 lugar23 =  new JPanel();
    	 fCarro.add(lugar23);
    	 lugar23.setBounds(1250,535,80,90);
    	 lugar23.setBackground(Color.GREEN);
    	 lugar23.setFont(letra2);
    	 lugar23.add(moto7);
    	 vagas[0][23] = lugar23;
    	 local[23] = false;
    	 
    	 fCarro.add(vaga);
    	 vaga.setBounds(0, 15, 1400, 720);
    	 
    	 primeiroAndar.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				fCarro.setVisible(false);
  				entrada1();
  			}
  		});
     	 terceiroAndar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				fCarro.setVisible(false);
   				entrada3();
   			}
   		});
    	 
     }
     static void entrada3(){
    	 fCarro = new JFrame();
    	 fCarro.setTitle("Sistema de gerenciamento de estacionamento");
    	 fCarro.setSize(1400,720);
    	 fCarro.setJMenuBar(barraMenu);
    	 fCarro.setLocationRelativeTo(null);
    	 fCarro.setLayout(null);
    	 fCarro.setResizable(false);
    	 fCarro.getContentPane().setBackground(Color.WHITE);
    	 fCarro.setVisible(true);
    	 fCarro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 
    	 JLabel informação = new JLabel ("Terceiro andar!");
    	 fCarro.add(informação);
    	 informação.setFont(letra2);
    	 informação.setBounds(0,0,500,100);
    	 
    	 fCarro.add(primeiroAndar);
    	 primeiroAndar.setBounds(250,50,200,50);
    	 primeiroAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(segundoAndar);
    	 segundoAndar.setBounds(450,50,200,50);
    	 segundoAndar.setBackground(Color.WHITE);
    	 
    	 fCarro.add(random3);
    	 random3.setBounds(650,50,200,50);
    	 random3.setBackground(Color.WHITE);
    	 
    	 fCarro.add(out);
    	 out.setBounds(850,50,200,50);
    	 out.setBackground(Color.WHITE);
    	 
    	 lugar =  new JPanel();
    	 fCarro.add(lugar);
    	 lugar.setBounds(170,125,80,90);
    	 lugar.setBackground(Color.GREEN);
    	 lugar.setFont(letra2);
    	 lugar.add(Esp);
    	 vagas[0][0] = lugar;
    	 local[0] = false;
    	 
    	 lugar1 =  new JPanel();
    	 fCarro.add(lugar1);
    	 lugar1.setBounds(265,125,80,90);
    	 lugar1.setBackground(Color.GREEN);
    	 lugar1.setFont(letra2);
    	 lugar1.add(Esp1);
    	 vagas[0][1] = lugar1;
    	 local[1] = false;
    	 
    	 lugar2 =  new JPanel();
    	 fCarro.add(lugar2);
    	 lugar2.setBounds(360,125,80,90);
    	 lugar2.setBackground(Color.GREEN);
    	 lugar2.setFont(letra2);
    	 lugar2.add(Esp2);
    	 vagas[0][2] = lugar2;
    	 local[2] = false;
    	 
    	 lugar3 =  new JPanel();
    	 fCarro.add(lugar3);
    	 lugar3.setBounds(460,125,80,90);
    	 lugar3.setBackground(Color.GREEN);
    	 lugar3.setFont(letra2);
    	 lugar3.add(Esp3);
    	 vagas[0][3] = lugar3;
    	 local[3] = false;
    	 
    	 lugar4 =  new JPanel();
    	 fCarro.add(lugar4);
    	 lugar4.setBounds(560,125,80,90);
    	 lugar4.setBackground(Color.GREEN);
    	 lugar4.setFont(letra2);
    	 lugar4.add(Esp4);
    	 vagas[0][4] = lugar4;
    	 local[4] = false;
    	 
    	 lugar5 =  new JPanel();
    	 fCarro.add(lugar5);
    	 lugar5.setBounds(655,125,80,90);
    	 lugar5.setBackground(Color.GREEN);
    	 lugar5.setFont(letra2);
    	 lugar5.add(Esp5);
    	 vagas[0][5] = lugar5;
    	 local[5] = false;
    	 
    	 lugar6 =  new JPanel();
    	 fCarro.add(lugar6);
    	 lugar6.setBounds(750,125,80,90);
    	 lugar6.setBackground(Color.GREEN);
    	 lugar6.setFont(letra2);
    	 lugar6.add(Esp6);
    	 vagas[0][6] = lugar6;
    	 local[6] = false;
    	 
    	 lugar7 =  new JPanel();
    	 fCarro.add(lugar7);
    	 lugar7.setBounds(850,125,80,90);
    	 lugar7.setBackground(Color.GREEN);
    	 lugar7.setFont(letra2);
    	 lugar7.add(Esp7);    	 
    	 vagas[0][7] = lugar7;
    	 local[7] = false;
    	 
    	 lugar8 =  new JPanel();
    	 fCarro.add(lugar8);
    	 lugar8.setBounds(950,125,80,90);
    	 lugar8.setBackground(Color.GREEN);
    	 lugar8.setFont(letra2);
    	 lugar8.add(Car);
    	 vagas[0][8] = lugar8;
    	 local[8] = false;
    	 
    	 lugar9 =  new JPanel();
    	 fCarro.add(lugar9);
    	 lugar9.setBounds(1050,125,80,90);
    	 lugar9.setBackground(Color.GREEN);
    	 lugar9.setFont(letra2);
    	 lugar9.add(Car1);
    	 vagas[0][9] = lugar9;
    	 local[9] = false;
    	 
    	 lugar10 =  new JPanel();
    	 fCarro.add(lugar10);
    	 lugar10.setBounds(1150,125,80,90);
    	 lugar10.setBackground(Color.GREEN);
    	 lugar10.add(Car2);
    	 lugar10.setFont(letra2);
    	 vagas[0][10] = lugar10;
    	 local[10] = false;
    	 
    	 lugar11 =  new JPanel();
    	 fCarro.add(lugar11);
    	 lugar11.setBounds(1250,125,80,90);
    	 lugar11.setBackground(Color.GREEN);
    	 lugar11.add(Car3);
    	 lugar11.setFont(letra2);
    	 vagas[0][11] = lugar11;
    	 local[11] = false;
    	 
    	 lugar12 =  new JPanel();
    	 fCarro.add(lugar12);
    	 lugar12.setBounds(175,535,80,90);
    	 lugar12.setBackground(Color.GREEN);
    	 lugar12.setFont(letra2);
    	 lugar12.add(Car4);
    	 vagas[0][12] = lugar12;
    	 local[12] = false;
    	 
    	 lugar13 =  new JPanel();
    	 fCarro.add(lugar13);
    	 lugar13.setBounds(270,535,80,90);
    	 lugar13.setBackground(Color.GREEN);
    	 lugar13.setFont(letra2);
    	 lugar13.add(Car5);
    	 vagas[0][13] = lugar13;
    	 local[13] = false;
    	 
    	 lugar14 =  new JPanel();
    	 fCarro.add(lugar14);
    	 lugar14.setBounds(365,535,80,90);
    	 lugar14.setBackground(Color.GREEN);
    	 lugar14.setFont(letra2);
    	 lugar14.add(Car6);
    	 vagas[0][14] = lugar14;
    	 local[14] = false;
    	 
    	 lugar15 =  new JPanel();
    	 fCarro.add(lugar15);
    	 lugar15.setBounds(465,535,80,90);
    	 lugar15.setBackground(Color.GREEN);
    	 lugar15.setFont(letra2);
    	 lugar15.add(Car7);
    	 vagas[0][15] = lugar15;
    	 local[15] = false;
    	 
    	 lugar16 =  new JPanel();
    	 fCarro.add(lugar16);
    	 lugar16.setBounds(560,535,80,90);
    	 lugar16.setBackground(Color.GREEN);
    	 lugar16.setFont(letra2);
    	 lugar16.add(moto);
    	 vagas[0][16] = lugar16;
    	 local[16] = false;
    	 
    	 lugar17 =  new JPanel();
    	 fCarro.add(lugar17);
    	 lugar17.setBounds(660,535,80,90);
    	 lugar17.setBackground(Color.GREEN);
    	 lugar17.setFont(letra2);
    	 lugar17.add(moto1);
    	 vagas[0][17] = lugar17;
    	 local[17] = false;
    	 
    	 lugar18 =  new JPanel();
    	 fCarro.add(lugar18);
    	 lugar18.setBounds(755,535,80,90);
    	 lugar18.setBackground(Color.GREEN);
    	 lugar18.setFont(letra2);
    	 lugar18.add(moto2);
    	 vagas[0][18] = lugar18;
    	 local[18] = false;
    	 
    	 lugar19 =  new JPanel();
    	 fCarro.add(lugar19);
    	 lugar19.setBounds(855,535,80,90);
    	 lugar19.setBackground(Color.GREEN);
    	 lugar19.setFont(letra2);
    	 lugar19.add(moto3);
    	 vagas[0][19] = lugar19;
    	 local[19] = false;
    	 
    	 lugar20 =  new JPanel();
    	 fCarro.add(lugar20);
    	 lugar20.setBounds(955,535,80,90);
    	 lugar20.setBackground(Color.GREEN);
    	 lugar20.setFont(letra2);
    	 lugar20.add(moto4);
    	 vagas[0][20] = lugar20;
    	 local[20] = false;
    	 
    	 lugar21 =  new JPanel();
    	 fCarro.add(lugar21);
    	 lugar21.setBounds(1055,535,80,90);
    	 lugar21.setBackground(Color.GREEN);
    	 lugar21.setFont(letra2);
    	 lugar21.add(moto5);
    	 vagas[0][21] = lugar21;
    	 local[21] = false;
    	 
    	 lugar22 =  new JPanel();
    	 fCarro.add(lugar22);
    	 lugar22.setBounds(1150,535,80,90);
    	 lugar22.setBackground(Color.GREEN);
    	 lugar22.setFont(letra2);
    	 lugar22.add(moto6);
    	 vagas[0][22] = lugar22;
    	 local[22] = false;
    	 
    	 lugar23 =  new JPanel();
    	 fCarro.add(lugar23);
    	 lugar23.setBounds(1250,535,80,90);
    	 lugar23.setBackground(Color.GREEN);
    	 lugar23.setFont(letra2);
    	 lugar23.add(moto7);
    	 vagas[0][23] = lugar23;
    	 local[23] = false;
    	 
    	 fCarro.add(vaga);
    	 vaga.setBounds(0, 15, 1400, 720);
    	 
    	 primeiroAndar.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				fCarro.setVisible(false);
  				entrada1();
  			}
  		});
     	 segundoAndar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				fCarro.setVisible(false);
   				entrada2();
   			}
   		});
     }
      
     static void mudarCor(){
    	 if (local[0] == true) {
 			lugar.setBackground(Color.RED);

 		} else {
 			lugar.setBackground(Color.GREEN);
 		}
 		if (local[1] == true) {
 			lugar1.setBackground(Color.RED);

 		} else {
 			lugar1.setBackground(Color.GREEN);
 		}
 		if (local[2] == true) {
 			lugar2.setBackground(Color.RED);

 		} else {
 			lugar2.setBackground(Color.GREEN);
 		}
 		if (local[3] == true) {
 			lugar3.setBackground(Color.RED);

 		} else {
 			lugar3.setBackground(Color.GREEN);
 		}
 		if (local[4] == true) {
 			lugar4.setBackground(Color.RED);

 		} else {

 			lugar4.setBackground(Color.GREEN);
 		}
 		if (local[5] == true) {
 			lugar5.setBackground(Color.RED);

 		} else {
 			lugar5.setBackground(Color.GREEN);
 		}
 		if (local[6] == true) {
 			lugar6.setBackground(Color.RED);

 		} else {
 			lugar6.setBackground(Color.GREEN);
 		}
 		if (local[7] == true) {
 			lugar7.setBackground(Color.RED);

 		} else {
 			lugar7.setBackground(Color.GREEN);
 		}
 		if (local[8] == true) {
 			lugar8.setBackground(Color.RED);

 		} else {
 			lugar8.setBackground(Color.GREEN);
 		}
 		if (local[9] == true) {
 			lugar9.setBackground(Color.RED);

 		} else {
 			lugar9.setBackground(Color.GREEN);
 		}
 		if (local[10] == true) {
 			lugar10.setBackground(Color.RED);

 		} else {
 			lugar10.setBackground(Color.GREEN);
 		}
 		if (local[11] == true) {
 			lugar11.setBackground(Color.RED);

 		} else {
 			lugar11.setBackground(Color.GREEN);
 		}
 		if (local[12] == true) {
 			lugar12.setBackground(Color.RED);

 		} else {
 			lugar12.setBackground(Color.GREEN);
 		} 
 		if (local[13] == true) {
 			lugar13.setBackground(Color.RED);

 		} else {
 			lugar13.setBackground(Color.GREEN);
 		} 
 		if (local[14] == true) {
 			lugar14.setBackground(Color.RED);

 		} else {
 			lugar14.setBackground(Color.GREEN);
 		} 
 		if (local[15] == true) {
 			lugar15.setBackground(Color.RED);

 		} else {
 			lugar15.setBackground(Color.GREEN);
 		} 
 		if (local[16] == true) {
 			lugar16.setBackground(Color.RED);

 		} else {
 			lugar16.setBackground(Color.GREEN);
 		} 
 		if (local[17] == true) {
 			lugar17.setBackground(Color.RED);

 		} else {
 			lugar17.setBackground(Color.GREEN);
 		} 
 		if (local[18] == true) {
 			lugar18.setBackground(Color.RED);

 		} else {
 			lugar18.setBackground(Color.GREEN);
 		} 
 		if (local[19] == true) {
 			lugar19.setBackground(Color.RED);

 		} else {
 			lugar19.setBackground(Color.GREEN);
 		} 
 		if (local[20] == true) {
 			lugar20.setBackground(Color.RED);

 		} else {
 			lugar20.setBackground(Color.GREEN);
 		} 
 		if (local[21] == true) {
 			lugar21.setBackground(Color.RED);

 		} else {
 			lugar21.setBackground(Color.GREEN);
 		} 
 		if (local[22] == true) {
 			lugar22.setBackground(Color.RED);

 		} else {
 			lugar22.setBackground(Color.GREEN);
 		} 
 		if (local[23] == true) {
 			lugar23.setBackground(Color.RED);

 		} else {
 			lugar23.setBackground(Color.GREEN);
 		} 
     }
     static void mudarCor2(){
 		if (local[0] == true) {
 			lugar.setBackground(Color.RED);

 		} else {
 			lugar.setBackground(Color.GREEN);
 		}
 		if (local[1] == true) {
 			lugar1.setBackground(Color.RED);

 		} else {
 			lugar1.setBackground(Color.GREEN);
 		}
 		if (local[2] == true) {
 			lugar2.setBackground(Color.RED);

 		} else {
 			lugar2.setBackground(Color.GREEN);
 		}
 		if (local[3] == true) {
 			lugar3.setBackground(Color.RED);

 		} else {
 			lugar3.setBackground(Color.GREEN);
 		}
 		if (local[4] == true) {
 			lugar4.setBackground(Color.RED);

 		} else {

 			lugar4.setBackground(Color.GREEN);
 		}
 		if (local[5] == true) {
 			lugar5.setBackground(Color.RED);

 		} else {
 			lugar5.setBackground(Color.GREEN);
 		}
 		if (local[6] == true) {
 			lugar6.setBackground(Color.RED);

 		} else {
 			lugar6.setBackground(Color.GREEN);
 		}
 		if (local[7] == true) {
 			lugar7.setBackground(Color.RED);

 		} else {
 			lugar7.setBackground(Color.GREEN);
 		}
 		if (local[8] == true) {
 			lugar8.setBackground(Color.RED);

 		} else {
 			lugar8.setBackground(Color.GREEN);
 		}
 		if (local[9] == true) {
 			lugar9.setBackground(Color.RED);

 		} else {
 			lugar9.setBackground(Color.GREEN);
 		}
 		if (local[10] == true) {
 			lugar10.setBackground(Color.RED);

 		} else {
 			lugar10.setBackground(Color.GREEN);
 		}
 		if (local[11] == true) {
 			lugar11.setBackground(Color.RED);

 		} else {
 			lugar11.setBackground(Color.GREEN);
 		}
 		if (local[12] == true) {
 			lugar12.setBackground(Color.RED);

 		} else {
 			lugar12.setBackground(Color.GREEN);
 		} 
 		if (local[13] == true) {
 			lugar13.setBackground(Color.RED);

 		} else {
 			lugar13.setBackground(Color.GREEN);
 		} 
 		if (local[14] == true) {
 			lugar14.setBackground(Color.RED);

 		} else {
 			lugar14.setBackground(Color.GREEN);
 		} 
 		if (local[15] == true) {
 			lugar15.setBackground(Color.RED);

 		} else {
 			lugar15.setBackground(Color.GREEN);
 		} 
 		if (local[16] == true) {
 			lugar16.setBackground(Color.RED);

 		} else {
 			lugar16.setBackground(Color.GREEN);
 		} 
 		if (local[17] == true) {
 			lugar17.setBackground(Color.RED);

 		} else {
 			lugar17.setBackground(Color.GREEN);
 		} 
 		if (local[18] == true) {
 			lugar18.setBackground(Color.RED);

 		} else {
 			lugar18.setBackground(Color.GREEN);
 		} 
 		if (local[19] == true) {
 			lugar19.setBackground(Color.RED);

 		} else {
 			lugar19.setBackground(Color.GREEN);
 		} 
 		if (local[20] == true) {
 			lugar20.setBackground(Color.RED);

 		} else {
 			lugar20.setBackground(Color.GREEN);
 		} 
 		if (local[21] == true) {
 			lugar21.setBackground(Color.RED);

 		} else {
 			lugar21.setBackground(Color.GREEN);
 		} 
 		if (local[22] == true) {
 			lugar22.setBackground(Color.RED);

 		} else {
 			lugar22.setBackground(Color.GREEN);
 		} 
 		if (local[23] == true) {
 			lugar23.setBackground(Color.RED);

 		} else {
 			lugar23.setBackground(Color.GREEN);
 		}
     }
     static void mudarCor3(){
 		if (local[0] == true) {
 			lugar.setBackground(Color.RED);

 		} else {
 			lugar.setBackground(Color.GREEN);
 		}
 		if (local[1] == true) {
 			lugar1.setBackground(Color.RED);

 		} else {
 			lugar1.setBackground(Color.GREEN);
 		}
 		if (local[2] == true) {
 			lugar2.setBackground(Color.RED);

 		} else {
 			lugar2.setBackground(Color.GREEN);
 		}
 		if (local[3] == true) {
 			lugar3.setBackground(Color.RED);

 		} else {
 			lugar3.setBackground(Color.GREEN);
 		}
 		if (local[4] == true) {
 			lugar4.setBackground(Color.RED);

 		} else {

 			lugar4.setBackground(Color.GREEN);
 		}
 		if (local[5] == true) {
 			lugar5.setBackground(Color.RED);

 		} else {
 			lugar5.setBackground(Color.GREEN);
 		}
 		if (local[6] == true) {
 			lugar6.setBackground(Color.RED);

 		} else {
 			lugar6.setBackground(Color.GREEN);
 		}
 		if (local[7] == true) {
 			lugar7.setBackground(Color.RED);

 		} else {
 			lugar7.setBackground(Color.GREEN);
 		}
 		if (local[8] == true) {
 			lugar8.setBackground(Color.RED);

 		} else {
 			lugar8.setBackground(Color.GREEN);
 		}
 		if (local[9] == true) {
 			lugar9.setBackground(Color.RED);

 		} else {
 			lugar9.setBackground(Color.GREEN);
 		}
 		if (local[10] == true) {
 			lugar10.setBackground(Color.RED);

 		} else {
 			lugar10.setBackground(Color.GREEN);
 		}
 		if (local[11] == true) {
 			lugar11.setBackground(Color.RED);

 		} else {
 			lugar11.setBackground(Color.GREEN);
 		}
 		if (local[12] == true) {
 			lugar12.setBackground(Color.RED);

 		} else {
 			lugar12.setBackground(Color.GREEN);
 		} 
 		if (local[13] == true) {
 			lugar13.setBackground(Color.RED);

 		} else {
 			lugar13.setBackground(Color.GREEN);
 		} 
 		if (local[14] == true) {
 			lugar14.setBackground(Color.RED);

 		} else {
 			lugar14.setBackground(Color.GREEN);
 		} 
 		if (local[15] == true) {
 			lugar15.setBackground(Color.RED);

 		} else {
 			lugar15.setBackground(Color.GREEN);
 		} 
 		if (local[16] == true) {
 			lugar16.setBackground(Color.RED);

 		} else {
 			lugar16.setBackground(Color.GREEN);
 		} 
 		if (local[17] == true) {
 			lugar17.setBackground(Color.RED);

 		} else {
 			lugar17.setBackground(Color.GREEN);
 		} 
 		if (local[18] == true) {
 			lugar18.setBackground(Color.RED);

 		} else {
 			lugar18.setBackground(Color.GREEN);
 		} 
 		if (local[19] == true) {
 			lugar19.setBackground(Color.RED);

 		} else {
 			lugar19.setBackground(Color.GREEN);
 		} 
 		if (local[20] == true) {
 			lugar20.setBackground(Color.RED);

 		} else {
 			lugar20.setBackground(Color.GREEN);
 		} 
 		if (local[21] == true) {
 			lugar21.setBackground(Color.RED);

 		} else {
 			lugar21.setBackground(Color.GREEN);
 		} 
 		if (local[22] == true) {
 			lugar22.setBackground(Color.RED);

 		} else {
 			lugar22.setBackground(Color.GREEN);
 		} 
 		if (local[23] == true) {
 			lugar23.setBackground(Color.RED);

 		} else {
 			lugar23.setBackground(Color.GREEN);
 		}
     }
     
     static void sorteiaVaga(){
    	 int valor1 = (int)(Math.random() * 24);
    	 if (local[valor1] == false) {
 			local[valor1] = true;
 		} else if (local[valor1] == true) {
 			sorteiaVaga();
 		} else {
 			JOptionPane.showMessageDialog(null, "Andar com lotação máxima!");
 		}
    }
     
     static void sorteiaVaga2(){
    	 int valor1 = (int)(Math.random() * 24);
    	 if (local[valor1] == false) {
 			local[valor1] = true;
 		} else if (local[valor1] == true) {
 			sorteiaVaga2();
 		} else {
 			JOptionPane.showMessageDialog(null, "Andar com lotação máxima!");
 		}
    }
     
     static void sorteiaVaga3(){
    	 int valor1 = (int)(Math.random() * 24);
    	 if (local[valor1] == false) {
 			local[valor1] = true;
 			if (total>0) {
				total++;
			}
 		} else if (local[valor1] == true && total>0) {
 			sorteiaVaga3();
 		} else {
 			JOptionPane.showMessageDialog(null, "Andar com lotação máxima!");
 		}
    }
     
     static void sorteiaVagaS(){
    	int valor = (int) (Math.random() * 3);
 		int valor1 = (int) (Math.random() * 24);

 		if (local[valor1] == true) {
 			local[valor] = false;

 		} else if (local[valor1] == false) {
 			sorteiaVagaS();
 		} else {
 			JOptionPane.showMessageDialog(null, "Andar livre!");
 		}

 	}	 
     }
	
