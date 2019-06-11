/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import interfaz.ingreso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author 1001001238
 */
public class ControladorTotal extends JFrame implements ActionListener{
  public ingreso ingreso; 
  public ControladorTotal(ingreso pVista){
    ingreso = pVista; 
    ingreso.ingresar.addActionListener(this);
    ingreso.salir.addActionListener(this); 
  }
  @Override
  public void actionPerformed(ActionEvent e) { 
    switch(e.getActionCommand()) {
      case "Ingresar":
        //logIn();
        break;
      case "Cancelar":
        //cerrarVentanaLogin();
        break; 
      default:
        break;
    }
  }
}
