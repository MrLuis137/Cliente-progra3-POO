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

/**
 *
 * @author 1001001238
 */
public class ControladorTotal extends JFrame implements ActionListener{
  public ingreso ingreso; 
  public MenuPracticante prac; 
  public ControladorTotal(ingreso pVista){
    ingreso = pVista; 
    ingreso.ingresar.addActionListener(this);
    ingreso.salir.addActionListener(this); 
  }
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
  
  public void logIn() {
    if (ingreso.logInDatosCorrectos() == true) {
      String nombreUsuario = ingreso.ingresar.getText();
      String contraseña = ingreso.contrasenia.getText();
      String opcion = ingreso.tipos.getSelectedItem().toString();
      //modelo = new Usuario(nombreUsuario, contraseña);
      //Usuario usuarioActual = vv.iniciarSesion(modelo);
      if (opcion == "Practicante") {
        ingreso.setVisible(false); 
        //JOptionPane.showMessageDialog(vista, "Bienvenido: " +modelo.getNombre());
        MenuPracticante vista = new MenuPracticante();
        ControladorPracticante controladorPracticante = new ControladorPracticante();
        controladorPracticante.menu.setVisible(true);
        controladorPracticante.menu.setLocationRelativeTo(null); 
      }
      else {
        //JOptionPane.showMessageDialog(vista, "El usuario indicado no existe");
      }
    } else {
     // JOptionPane.showMessageDialog(vista, "Todos los datos son requeridos");
    }
  }
  
  public void cerrarVentanaLogin() {
    ingreso.cancelarInicioSesion();
  }
}
