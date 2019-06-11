/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador; 
import javax.swing.*;
import java.awt.event.*; 
import java.util.ArrayList; 
import vista.CrearMinuta;
import vista.MenuPracticante;
import vista.NotasyCalendario;
import vista.RegistrarEntregable;

/**
 *
 * @author 1001001238
 */
public class ControladorPracticante  extends JFrame implements ActionListener{ 
  public MenuPracticante menu= new MenuPracticante();
  public RegistrarEntregable entregable= new RegistrarEntregable();
  public NotasyCalendario notas= new NotasyCalendario();
  public CrearMinuta minuta= new CrearMinuta();
  public ControladorPracticante(){ 
    menu.regEntr.addActionListener(this);
    menu.crearMinu.addActionListener(this);
    menu.notycal.addActionListener(this);
    menu.salir.addActionListener(this);
    entregable.cargarA.addActionListener(this);
    entregable.salir.addActionListener(this);
    entregable.entregar.addActionListener(this);
    minuta.agpM.addActionListener(this); 
    minuta.salir.addActionListener(this); 
    minuta.crearM.addActionListener(this); 
    minuta.minuta.addActionListener(this); 
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    switch(e.getActionCommand()) {
      case "Registrar entregable":
        entregable.setVisible(true);
        break;
      case "Crear minutas":
        minuta.setVisible(true);
        break;
      case "Consultar notas y calendario":
        notas.setVisible(true);
        break;  
      case "Entregar":
        //entregable();
        break;  
      case "Cargar archivo":
        //guardarArchivo();
        break; 
      case "Cargar minuta":
        //cargarMinuta();
        break;  
      case "Agregar personas a minuta":
        //agregarPersonasM();
        break;     
      case "Crear minuta":
        //crearMinuta();
        break;  
      default:
        break;
    }
  } 
 
}
