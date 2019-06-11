/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import javax.swing.*;
import java.awt.event.*; 
import java.util.ArrayList;
import vista.MenuEncargadoPractica;
import vista.RegistrarProfesor;
import vista.RegistrarEmpresa;
import vista.RegistrarPeriodo;
import vista.RegistrarPracticante;

/**
 *
 * @author Valeria
 */
public class ControladorEncargado extends JFrame implements ActionListener {
  public MenuEncargadoPractica menu = new MenuEncargadoPractica();
  public RegistrarProfesor regisProfe = new RegistrarProfesor();
  public RegistrarEmpresa regisEm = new RegistrarEmpresa();
  public RegistrarPeriodo periodo = new RegistrarPeriodo();
  public RegistrarPracticante regPrac = new RegistrarPracticante();
  
  public ControladorEncargado() {
    menu.jButton1.addActionListener(this);
    menu.jButton2.addActionListener(this);
    menu.jButton3.addActionListener(this);
    menu.jButton4.addActionListener(this);
    menu.jButton5.addActionListener(this);
    menu.jButton6.addActionListener(this);
    regisProfe.exit.addActionListener(this);
    regisProfe.regis.addActionListener(this);
    regisEm.exit.addActionListener(this);
    regisEm.regist.addActionListener(this);
    periodo.exit.addActionListener(this);
    periodo.regis.addActionListener(this);
    regPrac.exit.addActionListener(this);
    regPrac.reg.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e) {
    switch(e.getActionCommand()) {
      case "Registrar profesor":
        regisProfe.setVisible(true);
        break;
      case "Registrar empresa":
        regisEm.setVisible(true);
        break;
      case "Registrar periodo":
        periodo.setVisible(true);
        break;
      case "Registrar practicante":
        regPrac.setVisible(true);
        break;
      case "Crear calendario":
        //
        break;
    }
  }
  
}
