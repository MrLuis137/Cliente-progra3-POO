/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import interfaz.CrearMinuta;
import interfaz.MenuPracticante;
import interfaz.NotasyCalendario;
import interfaz.RegistrarEntregable;
import javax.swing.*;
import java.awt.event.*; 
import java.util.ArrayList; 
import vista.*;  
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
  public void actionPerformed(ActionEvent ae) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
 
}
