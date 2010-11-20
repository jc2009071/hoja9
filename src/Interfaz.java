/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad del Valle de Guatemala
 * Facultad de Ingenieria
 * Licenciatura en Ingenieria en Ciencias de la Computación
 * Algoritmos y Estucturas de datos
 *
 * Hoja de trabajo # 9. Grafos implementados con el Algoritmo de Floyd
 * @author Autor: Kareen Anasilvia Salazar Morales, 09378
 * Sección: 10
 * Fecha: 19/11/2010
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.*;



public class Interfaz extends JFrame implements ActionListener
{
	int contador = 0;
	/**
     * Es una referencia la clase principal del mundo
     */
	
	static Grafo g = new Grafo();
	/**
	 * Ventana principal de la interfaz
	 */
	private JFrame ventana = new JFrame("Grafos: Algoritmo de Floyd");
	
	/**
	 * Etiquetas de la ventana principal 
	 */
	private JLabel etiqueta = new JLabel("   AGENCIA DE VIAJES");
	private JLabel mensaje = new JLabel("Calcular camino desde departamento: ");
	private JLabel mensaje2 = new JLabel("Hacia departamento: ");
	private JLabel inicial2 = new JLabel("Departamento inicial");
	private JLabel fin2 = new JLabel("Departamento final");
	private JLabel peso2 = new JLabel("Distancia");
	private JLabel ingreso = new JLabel("Primer departamento");
	private JLabel ingreso2 = new JLabel("Segundo departamento");
	private JLabel info;
	private JTextPane resultado = new JTextPane();
	private ImageIcon imagen;
	/**
	 * Paneles de la interfaz
	 */
	private JPanel panelTitulo = new JPanel();
	private JPanel panelConsulta = new JPanel();
	private JPanel panelDatos = new JPanel();
	private JPanel panelDatos2 = new JPanel();
	private JPanel panelIngreso = new JPanel();
	private JPanel panelCurvas = new JPanel();
	private JPanel panelIngreso2 = new JPanel();
	
	
	/**
	 * Botones de la interfaz
	 */
	private JButton analizar = new JButton("Analizar");
	private JButton agregar = new JButton("Guardar cambios");
	private JButton Bnodo = new JButton("Interrumpir");
	private JButton Bnodo2 = new JButton("Cancelar");
	private JButton cancelar = new JButton("Cancelar");
	
	/**
	 * Campos de edición de texto, para la inserción de empleados
	 */
	private JTextField cadena= new JTextField();
	private JTextField cadena2= new JTextField();
	private JTextField inicial = new  JTextField();
	private JTextField fin = new JTextField();
	private JTextField peso = new JTextField();	
	private JTextField nodo = new JTextField();	
	private JTextField nodo2 = new JTextField();	
	//---------------------------------------------
	//CONSTANTES
	//---------------------------------------------
	
	/**
     * Constante de los botones
     */
	
	public static final String ANALIZAR = "analizar";
	public static final String AGREGAR = "agregar";
	public static final String NODO = "nodo";
	public static final String NODO2 = "nodo2";
	public static final String CANCELAR = "cancelar";
	
	
	//---------------------------------------------
	//CONSTRUCTOR
	//---------------------------------------------
	
	/**
	 * Construye una nueva interfaz y agrega sus componentes a la interfaz
	 */
public Interfaz() 
{
	
	/**
	 * Configuración de la ventana prinicipal
	 */
	ventana.setLayout(new BorderLayout());
	ventana.setSize(700,650);
    ventana.setVisible(true);
           
	/**
	 * Configuración de los paneles
	 */
    panelTitulo.setBackground(Color.WHITE);
    panelTitulo.setLayout(new BorderLayout());
    TitledBorder border3 = BorderFactory.createTitledBorder("Ingrese la distancia:");
	panelConsulta.setBorder(border3);
	panelConsulta.setLayout(new GridLayout(2, 3));
	panelConsulta.setBackground(Color.WHITE);
		
	TitledBorder border4 = BorderFactory.createTitledBorder("Panel de análisis de rutas ");
	panelDatos.setBorder(border4);
	panelDatos.setLayout(new GridLayout(3, 2));
	panelDatos.setBackground(Color.WHITE);
	panelDatos2.setLayout(new BorderLayout());
	panelDatos2.setBackground(Color.WHITE);
	
	panelIngreso.setLayout(new BorderLayout());
	panelIngreso.setBackground(Color.WHITE);
	
	TitledBorder border6 = BorderFactory.createTitledBorder("Interrumpir carretera ");
	panelIngreso2.setBorder(border6);
	panelIngreso2.setLayout(new GridLayout(3, 2));
	panelIngreso2.setBackground(Color.WHITE);
	
	panelCurvas.setLayout(new BorderLayout());
	panelCurvas.setBackground(Color.WHITE);
	
	/**
	 * Configuracion del panel de texto
	 */	
	imagen = new ImageIcon("data/imagen.jpg");
	info = new JLabel(imagen);
	
	
	info.setBackground(Color.WHITE);
	info.setForeground(Color.MAGENTA);
	info.setFont( new Font( "Comic Sans MS", Font.BOLD, 16 ) );
	resultado.setBackground(Color.WHITE);
	resultado.setForeground(Color.MAGENTA);
	resultado.setFont( new Font( "Comic Sans MS", Font.BOLD, 16 ) );
	resultado.setText(" \n \n");
	
	
	/**
	 * Configuracion de los botones
	 */
    analizar.setBackground(Color.WHITE);
    analizar.setForeground(Color.MAGENTA);
    analizar.setActionCommand(ANALIZAR);
    analizar.addActionListener(this);
    
    agregar.setBackground(Color.WHITE);
    agregar.setForeground(Color.MAGENTA);
    agregar.setActionCommand(AGREGAR);
    agregar.addActionListener(this);
    
    Bnodo.setBackground(Color.WHITE);
    Bnodo.setForeground(Color.MAGENTA);
    Bnodo.setActionCommand(NODO);
    Bnodo.addActionListener(this);
    
    Bnodo2.setBackground(Color.WHITE);
    Bnodo2.setForeground(Color.MAGENTA);
    Bnodo2.setActionCommand(NODO2);
    Bnodo2.addActionListener(this);
    cancelar.setBackground(Color.WHITE);
    cancelar.setForeground(Color.MAGENTA);
    cancelar.setActionCommand(CANCELAR);
    cancelar.addActionListener(this);
	
	/**
	 * Configuración de las etiquetas
	 */
	etiqueta.setBackground(Color.WHITE);
	etiqueta.setForeground(Color.MAGENTA);
	etiqueta.setFont( new Font( "Comic Sans MS", Font.BOLD, 38 ) );
	mensaje.setBackground(Color.WHITE);
	mensaje.setForeground(Color.MAGENTA);
	mensaje2.setBackground(Color.WHITE);
	mensaje2.setForeground(Color.MAGENTA);
	
	/**
	 * inserción de los elementos a los paneles
	 */
	panelTitulo.add(etiqueta, BorderLayout.CENTER);
	
	panelDatos.add(mensaje);
	panelDatos.add(cadena);
	panelDatos.add(mensaje2);
	panelDatos.add(cadena2);
	panelDatos.add(analizar);
	panelDatos.add(cancelar);
	panelDatos2.add(panelDatos, BorderLayout.CENTER);
	panelDatos2.add(resultado, BorderLayout.SOUTH);
	
	panelConsulta.add(inicial2);
	panelConsulta.add(fin2);
	panelConsulta.add(peso2);
	panelConsulta.add(inicial);
	panelConsulta.add(fin);
	panelConsulta.add(peso);
	
	panelCurvas.add(panelConsulta, BorderLayout.CENTER);
	panelCurvas.add(agregar, BorderLayout.SOUTH);
	
	panelIngreso2.add(ingreso);
	panelIngreso2.add(ingreso2);
	panelIngreso2.add(nodo);
	panelIngreso2.add(nodo2);
	panelIngreso2.add(Bnodo);
	panelIngreso2.add(Bnodo2);
	
	panelIngreso.add(info, BorderLayout.NORTH);
	panelIngreso.add(panelCurvas, BorderLayout.CENTER);
	panelIngreso.add(panelIngreso2, BorderLayout.SOUTH);
	
	/**
 	 * inserción de los elementos a la ventana principal
 	 */
     ventana.add(panelTitulo, BorderLayout.NORTH);
     ventana.add(panelDatos2, BorderLayout.SOUTH);
     ventana.add(panelIngreso, BorderLayout.CENTER);
     
  }

	//---------------------------------------------
	//MÉTODOS
	//---------------------------------------------
	
	/**
	 * Manejo de los eventos de los botones
	 * @param e Acción que generó el evento.
	 */

	
	public void actionPerformed( ActionEvent e )  
	{
		
		if( e.getActionCommand( ).equals(AGREGAR)  )
		{
			
			
			try{
				g.modificarArco(inicial.getText(), fin.getText(),Integer.valueOf(peso.getText()));
				JOptionPane.showMessageDialog( this, "Se agregaron los datos correctamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE );
            	inicial.setText("");
            	fin.setText("");
            	peso.setText("");
			}
			catch(Exception g)
            	{
            		String mens = "Ingrese una cadena de caracteres validos";
        			JOptionPane.showMessageDialog( this, mens, "Caracteres invalidos", JOptionPane.INFORMATION_MESSAGE );
            	}
			
			
          }
            
	
		if( e.getActionCommand( ).equals(ANALIZAR) )
		{
			if(cadena.getText()!= null && cadena2.getText()!=null){
			try
            	{
				for (int i = 0; i < 22; i++) 
				{
					for (int j = 0; j < 22; j++) 
					{
						if (i != j) {
							if(cadena.getText().equalsIgnoreCase(g.getNombre(i))&& cadena2.getText().equalsIgnoreCase(g.getNombre(j)))
							{
								resultado.setText("El camino mas corto entre los departamentos:"
									+ g.getNombre(i) + "-" + g.getNombre(j) + " es: \n"
									+ g.caminocorto(i, j) + " y la distancia total es: "
									+ g.pesominimo(i, j)+ "km");
						}
					}
				}
				}}
            	catch(Exception g)
            	{
            		String mens = "Ha ocurrido un error en el programa, ingrese un departamento correcto";
        			JOptionPane.showMessageDialog( this, mens, "Error", JOptionPane.ERROR_MESSAGE);
            	}
            }
		else{
			String mens = "Ingrese el nombre de dos departamentos";
			JOptionPane.showMessageDialog( this, mens, "Error", JOptionPane.ERROR_MESSAGE);
    	
		}
			
	}
		
		if( e.getActionCommand( ).equals(NODO) )
		{
			if(nodo.getText()!= null && nodo2.getText()!=null){
			try
            	{
					String mens = "Se interrumpio la carretera debido al trafico ";
					g.interrupcionTrafico(nodo.getText(), nodo2.getText());
	            	//principal.crearNodos(nodo.getText());
	            	JOptionPane.showMessageDialog( this, mens, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
	            	nodo.setText("");
	            	nodo2.setText("");
            	}
            	catch(Exception g)
            	{
            		String mens = "Ha ocurrido un error en el programa";
        			JOptionPane.showMessageDialog( this, mens, "Error", JOptionPane.ERROR_MESSAGE);
            	}
            }
		else{
			String mens = "Ingrese el nombre de dos departamentos";
			JOptionPane.showMessageDialog( this, mens, "Error", JOptionPane.ERROR_MESSAGE);
    	
		}
			
	}
		if( e.getActionCommand( ).equals(NODO2) )
		{
			nodo.setText("");
        	nodo2.setText("");
		}
		if( e.getActionCommand( ).equals(CANCELAR) )
		{
			cadena.setText("");
        	cadena2.setText("");
		}
	}
            
	 /**
     * Este método ejecuta la aplicación
     * @param args Parámetros de ejecución - No se deben utilizar
     */	    
	public static void main(String[]args)
	{
		g.cargarCabeceras();
		g.cargarArcos();
		g.calcular();
		Interfaz interfaz;
		interfaz = new Interfaz();
		
	}
}