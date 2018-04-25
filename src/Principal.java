
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JPanel;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import scr.Errores;
import scr.gramaticaDecafLexer;

import org.antlr.v4.runtime.CharStream;

import java.awt.event.ActionListener;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.Toolkit;


public class Principal {
	JEditorPane ingresarTexto;
	gramaticaDecafLexer lexer;
	gramaticaDecafParser parser;
	 Errores obtenerErrores;
	private JFrame frmCompilador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmCompilador.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCompilador = new JFrame();
		frmCompilador.setFont(new Font("Cambria", Font.PLAIN, 12));
		frmCompilador.setBackground(new Color(0, 128, 128));
		frmCompilador.setTitle("Compilador");
		frmCompilador.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\UIM\\OneDrive\\UVG\\9\\Compiladores\\Proyecto\\Emoticons Happy.ico"));
		frmCompilador.setBounds(100, 100, 719, 509);
		frmCompilador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCompilador.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 703, 470);
		frmCompilador.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Codigo", null, panel, "");
		panel.setLayout(null);
		
		ingresarTexto = new JEditorPane();
		ingresarTexto.setBounds(10, 11, 678, 386);
		panel.add(ingresarTexto);
		
		
		JButton btnErrores = new JButton("Errores");
		btnErrores.setBounds(599, 408, 89, 23);
		panel.add(btnErrores);
		
		JButton btnArbol = new JButton("Test");
		btnArbol.setBounds(500, 408, 89, 23);
		panel.add(btnArbol);
		JPanel panel_2 = new JPanel();
		JScrollPane scrollPane = new JScrollPane(panel_2);
		
		tabbedPane.addTab("Arbol", null, scrollPane, null);
		
		JTextArea textArea = new JTextArea();
		tabbedPane.addTab("Errores", null, textArea, null);
		
		
		btnArbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
				  ANTLRInputStream input = new ANTLRInputStream(ingresarTexto.getText());
				  lexer  = new gramaticaDecafLexer(input);
			      TokenStream tokenStream = new CommonTokenStream(lexer);
				  parser = new gramaticaDecafParser(tokenStream);
				  obtenerErrores = new Errores();
			      lexer.removeErrorListeners();
			      lexer.addErrorListener(obtenerErrores);
			      parser.removeErrorListeners();
			      parser.addErrorListener(obtenerErrores);
			      
			      ParseTree tree = parser.program();
				  TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
				  viewr.setSize(700, 700);
				  panel_2.add(viewr);
				  
			      
			      if(obtenerErrores.mensaje().equals("")){
					  textArea.setText("Todo bien!! No hay ningun error!!");
				  }
				  else{
					  textArea.setText(obtenerErrores.mensaje());
				  }
			}
		});
		
		
		btnErrores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				    
			}
		});
		
	}
}
