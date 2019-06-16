/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import cliente.Cliente;
import dto.DTO_Object;
import dto.DTO_PeriodoPractica;
import dto.DTO_Profesor;
import dto.DTO_Solicitud;
import javax.swing.*;
import java.awt.event.*; 
import java.util.ArrayList;
import vista.MenuEncargadoPractica;
import vista.RegistrarProfesor;
import vista.RegistrarEmpresa;
import vista.RegistrarPeriodo;
import vista.RegistrarPracticante;
import vista.RegistrarCalendario;

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
  public DTO_Profesor dtoProfesor= new DTO_Profesor();
  public Cliente logica= new Cliente();
  public RegistrarCalendario calenR = new RegistrarCalendario();
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
      case "Registrar profe":
        registrarProfe();
        break;  
      case "Registrar Periodo":
        registrarPP();
        break;  
    }
  }
  
  public void registrarProfe() { 
    if (regisProfe.logInDatosCorrectos() == true) {
      String nombreUsuario = regisProfe.nombre.getText();
      String contrasena = regisProfe.contr.getText();
      String telef = regisProfe.tel.getText();
      String correo = regisProfe.correo.getText();
      String opcion = regisProfe.tipos.getSelectedItem().toString();
      DTO_Profesor profe= new DTO_Profesor();
      profe.setNombre(nombreUsuario);
      profe.setPuesto(opcion);
      profe.setTelefono(telef);
      profe.setCorreo(correo);
      profe.setContra(contrasena);
      DTO_Solicitud soli= new DTO_Solicitud();
      soli.setInstruccion("regProf");
      soli.setObjeto((DTO_Object) profe);
      logica.enviarInformacion(soli);
      //modelo = new Usuario(nombreUsuario, contraseña);
      boolean usuarioActual = true;
      if (usuarioActual != false) { 
      }
      else {
        //JOptionPane.showMessageDialog(vista3, "El usuario indicado ya existe");
      }
    } else {
      //JOptionPane.showMessageDialog(vista3, "Todos los datos son requeridos");
    }
  }
  
  public void registrarPP() { 
    if (periodo.logInDatosCorrectos() == true) {
      String semestre = periodo.semestre.getText();
      String anio = periodo.Anio.getText(); 
      DTO_PeriodoPractica pp= new DTO_PeriodoPractica();
      pp.setSemestre(semestre);
      pp.setAnio(anio); 
      DTO_Solicitud soli= new DTO_Solicitud();
      soli.setInstruccion("regPP");
      soli.setObjeto((DTO_Object) pp);
      logica.enviarInformacion(soli);
      //modelo = new Usuario(nombreUsuario, contraseña);
      boolean usuarioActual = true;
      if (usuarioActual != false) { 
      }
      else {
        //JOptionPane.showMessageDialog(vista3, "El usuario indicado ya existe");
      }
    } else {
      //JOptionPane.showMessageDialog(vista3, "Todos los datos son requeridos");
    }
  }
}
