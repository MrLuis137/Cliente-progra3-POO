/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.ingreso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.MenuPracticante;
import vista.MenuProfesorAsesor;

/** 
 * @author Luis Diego Aleman
 * @author Valeria Quesada
 * @author Marlen Solano 
 */
public class ControladorTotal extends JFrame implements ActionListener{ 
  public ingreso ingreso;  
  public MenuPracticante prac;  
  /**
   * Constructor
   * @param pVista
   */
  public ControladorTotal(ingreso pVista){
    ingreso = pVista; 
    ingreso.ingresar.addActionListener(this);
    ingreso.salir.addActionListener(this); 
  }

  /**
   * Encargado de gestionar las acciones de los botones
   * @param e
   */
  @Override
  public void actionPerformed(ActionEvent e) { 
    switch(e.getActionCommand()) {
      case "Ingresar":
        logIn();
        break;
      case "Cancelar":
        cerrarVentanaLogin();
        break; 
      default:
        break;
    }
  }
  
  /**
   * Encargado del login
   */
  public void logIn() {
    if (ingreso.logInDatosCorrectos() == true) {
      String nombreUsuario = ingreso.ingresar.getText();
      String contraseña = ingreso.contrasenia.getText();
      String opcion = ingreso.tipos.getSelectedItem().toString(); 
      if ("Practicante".equals(opcion)) {
        ingreso.setVisible(false); 
        JOptionPane.showMessageDialog(ingreso, "Bienvenido: " + nombreUsuario); 
        ControladorPracticante controladorPracticante = new ControladorPracticante();
        controladorPracticante.menu.setVisible(true);
        controladorPracticante.menu.setLocationRelativeTo(null); 
      } else if ("Profesor asesor".equals(opcion)) {
        ingreso.setVisible(false); 
        JOptionPane.showMessageDialog(ingreso, "Bienvenido: " + nombreUsuario); 
        ControladorAsesor controladorAsesor = new ControladorAsesor();
        controladorAsesor.menu.setVisible(true);
        controladorAsesor.menu.setLocationRelativeTo(null); 
      } else if ("Encargado de práctica".equals(opcion)) {
        ingreso.setVisible(false); 
        JOptionPane.showMessageDialog(ingreso, "Bienvenido: " + nombreUsuario);  
        ControladorEncargado controladorEncargado = new ControladorEncargado();
        controladorEncargado.menu.setVisible(true);
        controladorEncargado.menu.setLocationRelativeTo(null); 
      } else if ("Profesor de curso de prácitca".equals(opcion)) {
        ingreso.setVisible(false); 
        JOptionPane.showMessageDialog(ingreso, "Bienvenido: " + nombreUsuario); 
        ControladorProfesorCP controladorProfesorCP = new ControladorProfesorCP();
        controladorProfesorCP.menu.setVisible(true);
        controladorProfesorCP.menu.setLocationRelativeTo(null); 
      } 
      else {
        JOptionPane.showMessageDialog(ingreso, "El usuario indicado no existe");
      }
    } else {
      JOptionPane.showMessageDialog(ingreso, "Todos los datos son requeridos");
    }
  }
  
  /**
   * Cierra las ventanas
   */
  public void cerrarVentanaLogin() {
    ingreso.cancelarInicioSesion();
  }
}
