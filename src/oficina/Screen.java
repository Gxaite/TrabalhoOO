package oficina;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.Dimension;


public class Screen {
    
	public static void main(String[] args) {
		
        // Criando Frame 
		
		JFrame frame = new JFrame("Cadastro");
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel 
        
        JPanel panel = new JPanel();
        
        // Adicionar o painel necessário para o frame;
        
        frame.add(panel);

        // Fazer o frame ficar visível
        
        frame.setVisible(true);
        
        // Butões
               
 
        
        JButton button1 = new JButton("Cadastro");
        JButton button2 = new JButton("Ordem de Serviço");

        Dimension buttonSize = new Dimension(350, 250);


        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
       

        // Adicionar butoes ao painel;
        
        panel.add(button1);
        panel.add(button2);
        


        // Setar posicionamento dos butoes;
        
        panel.setLayout(null); 

        
        button1.setBounds(50, 100, buttonSize.width, buttonSize.height);
        button2.setBounds(450, 100, buttonSize.width, buttonSize.height);
        

        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openNewWindow0("Cadastrar");
            }
        });
        

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	openNewWindow2("Ordem de Serviço");
            }
        });
        
        
    }
	
	
	
	private static void openNewWindow0(String windowTitle) {
		
		 JFrame newFrame = new JFrame(windowTitle);
	        newFrame.setSize(800, 500);
	      
	        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
	        
	        
	        JPanel panel2 = new JPanel();
	        
	        
	        newFrame.add(panel2);
	        
	        newFrame.setVisible(true);
	        
	        JButton button3 = new JButton("Adicionar Cliente");
	        JButton button4 = new JButton("Adicionar Peça");
	        JButton button5 = new JButton("Adicionar Serviço");
	     
	        
	        panel2.add(button3);
	        panel2.add(button4);
	        panel2.add(button5);
	        
	        Dimension buttonSize = new Dimension(250, 300);
	        
	        button3.setPreferredSize(buttonSize);
	        button4.setPreferredSize(buttonSize);
	        button5.setPreferredSize(buttonSize);
	        
	        button3.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                openNewWindow1("Adicionar Serviço");
	            }
	        });

	        button4.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                openNewWindow1("Adicionar Cliente");
	            }
	        });
	        
	        button5.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                openNewWindow1("Adicionar Peça");
	            }
	        });
	               
	  
	        
	  
	}
	
	
	
    private static void openNewWindow1(String windowTitle) {
    	
        JFrame newFrame = new JFrame(windowTitle);
        newFrame.setSize(800, 500);
      
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        
        
        JPanel panel2 = new JPanel();
        
        
        newFrame.add(panel2);
        
        newFrame.setVisible(true);
        
        JButton button5 = new JButton("Adicionar descrição:");
        JButton button6 = new JButton("Adicionar Código:");
        JButton button7 = new JButton("Adicionar preço:");
        
        Dimension buttonSize = new Dimension(200, 150);
        
        button5.setPreferredSize(buttonSize);
        button6.setPreferredSize(buttonSize);
        button7.setPreferredSize(buttonSize);
        
        panel2.add(button5);
        panel2.add(button6);
        panel2.add(button7);
        
        // Listeners dos butoes
        
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarInfo(TipoInformacao.DESCRICAO, TipoAdiçao.CLIENTE);

            }
        });
        
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarInfo(TipoInformacao.CODIGO, TipoAdiçao.PECA);

            }
        });
        
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarInfo(TipoInformacao.PRECO, TipoAdiçao.SERVIÇO);
            }
        });
          
    }
    
    // para os diferentes tipos de info no switch Case
    
    enum TipoInformacao {
        DESCRICAO,
        CODIGO,
        PRECO
    }
    
    enum TipoAdiçao{
    	
    	CLIENTE,
    	PECA,
    	SERVIÇO,
    	
    }
    
    private static void openNewWindow2(String windowTitle) {
    	
        JFrame newFrame = new JFrame(windowTitle);
        newFrame.setSize(800, 500);
      
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        
        newFrame.setVisible(true);
        
    }
   
    
    	
    private static void adicionarInfo(TipoInformacao tipo1, TipoAdiçao tipo2) {
    	
    	    String mensagem = "";
    	    
    	    switch (tipo2) {
    	    
    	    case CLIENTE:
    	    	
    	    	switch (tipo1) {
    	    	
    	        	case DESCRICAO:
    	        		mensagem = "Informe o nome:";
    	        		break;
    	        	case CODIGO:
    	        		mensagem = "Informe o CPF:";
    	        		break;
    	        	case PRECO:
    	        		mensagem = "Informe o carro:";
    	        		break;
    	        	default:
    	        		break;
    	        		
    	    	}
    	        		
    	        break;
    	        		
    	     case PECA:
    	    	 
    	    		switch (tipo1) {
    	        	case DESCRICAO:
    	        		mensagem = "Informe o nome:";
    	        		break;
    	        	case CODIGO:
    	        		mensagem = "Informe o código:";
    	        		break;
    	        	case PRECO:
    	        		mensagem = "Informe o preço:";
    	        		break;
    	        	default:
    	        		break;
    	        		
    	    		}
    	        		
    	        		
    	        break;
    	    	 
    	    	
    	    		
    	     case SERVIÇO:
    	    	 
    	    	 
    	    		switch (tipo1) {
    	        	case DESCRICAO:
    	        		mensagem = "Informe a descrição:";
    	        		break;
    	        	case CODIGO:
    	        		mensagem = "Informe o código:";
    	        		break;
    	        	case PRECO:
    	        		mensagem = "Informe o preço:";
    	        		break;
    	        	default:
    	        		break;
    	        		    	        		
    	    		}
    	    		
    	        	break;

    	    	 
    	    
    	    }

    	    // Obter informações da peça usando JOptionPane
    	    String input = JOptionPane.showInputDialog(mensagem);

    	    // Aqui você pode fazer o que quiser com a informação obtida
    	    System.out.println(tipo1 + ": " + input);
    	}
 

}