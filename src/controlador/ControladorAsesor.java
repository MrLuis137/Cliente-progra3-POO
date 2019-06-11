/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import javax.swing.*;
import java.awt.event.*; 
import java.util.ArrayList; 
import vista.MenuProfesorAsesor;
import vista.CalendarioPA;
import vista.AsignarNota;
import vista.SolicitarReunion;
import vista.ConsultarEntregable;
import vista.ConsultarMinutas;

/**
 *
 * @author Valeria
 */
public class ControladorAsesor extends JFrame implements ActionListener{
  public MenuProfesorAsesor menu = new MenuProfesorAsesor();
  public CalendarioPA calendario = new CalendarioPA();
  public AsignarNota nota = new AsignarNota();
  public ConsultarEntregable consultaEntre = new ConsultarEntregable();
  public SolicitarReunion soliReunion = new SolicitarReunion();
  public ConsultarMinutas consultMin = new ConsultarMinutas();
  
  public ControladorAsesor(){
    menu.AsignarNota.addActionListener(this);
    menu.ConsultaEntreg.addActionListener(this);
    menu.ConsultaMinu.addActionListener(this);
    menu.SolicitarReu.addActionListener(this);
    menu.consultarCalendario.addActionListener(this);
    calendario.salir.addActionListener(this);
    calendario.consultar.addActionListener(this);
    nota.jButton2.addActionListener(this);
    nota.jButton3.addActionListener(this);
    consultaEntre.salir.addActionListener(this);
    consultaEntre.selec.addActionListener(this);
    soliReunion.exit.addActionListener(this);
    soliReunion.soliReu.addActionListener(this);
    //faltan los de minutas
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    switch(e.getActionCommand()) {   
      case "Consultar entregable":
        consultaEntre.setVisible(true);
        break;
      case "Asignar nota entregable":
        nota.setVisible(true);
        break;
      case "Consultar calendario":
        calendario.setVisible(true);
        break;
      case "Solicitar reunion":
        soliReunion.setVisible(true);
        break;
      case "Consultar minutas":
        consultMin.setVisible(true);
    }
  }
}
