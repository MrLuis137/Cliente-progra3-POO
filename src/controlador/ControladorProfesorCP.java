/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import vista.ConsultarDatos;
import vista.ConsultarNotasFinales;
import vista.MenuProfesorCursoPractica;

/** 
 * @author Luis Diego Aleman
 * @author Valeria Quesada
 * @author Marlen Solano 
 */
public class ControladorProfesorCP extends JFrame implements ActionListener{ 
  public MenuProfesorCursoPractica menu= new MenuProfesorCursoPractica(); 
  public ConsultarDatos datos= new ConsultarDatos(); 
  public ConsultarNotasFinales notas= new ConsultarNotasFinales();  
  /**
   * Constructor
   */
  public ControladorProfesorCP(){ 
    menu.salir.addActionListener(this);
    menu.consultarNF.addActionListener(this);
    menu.consultarPract.addActionListener(this); 
    datos.cons.addActionListener(this);
    datos.salir.addActionListener(this);
    notas.consN.addActionListener(this);
    notas.salir.addActionListener(this);  
  }

  /**
   * Encargado de gestionar las acciones de los botones
   * @param e
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    switch(e.getActionCommand()) {
      case "Consultar notas finales":
        notas.setVisible(true);
        break;
      case "Consultar practicante":
        datos.setVisible(true);
        break;
      case "Consultar datos":
        //consultarDatos();
        break;  
      case "Consultar notas":
        //consultarNotas();
        break;  
      case "Salir":
        System.exit(0);
        break;  
      default:
        break;
    }
  } 
 
}
