/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Container;
import javax.swing.JFrame;


public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultado miPanelResultado;
    
    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,480,190);
        add(miPanelEntradaDatos);
       
        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,220,480,60);
        add(miPanelOperaciones);
        
        //Creación y adición del PanelOperaciones
        miPanelResultado = new PanelResultado();
        miPanelResultado.setBounds(10,290,480,80);
        add(miPanelResultado);
        
        //Caracteristicas de la ventana
        setTitle("Plan Telefonia");
        setSize(500,430);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
