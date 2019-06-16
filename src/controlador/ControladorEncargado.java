/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import cliente.Cliente;
import dto.DTO_Empresa;
import dto.DTO_Object;
import dto.DTO_PeriodoPractica;
import dto.DTO_Practicante;
import dto.DTO_Profesor;
import dto.DTO_Solicitud;
import javax.swing.*;
import java.awt.event.*; 
import java.util.ArrayList;
import java.util.Calendar;
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
      case "Registrar periodo de práctica":
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
      case "Registrar Practicante":
        registrarPract();
        break;   
      case "Registrar Empresa":
        registrarEmpresa();
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
        JOptionPane.showMessageDialog(regisProfe, "El usuario ha sido registrado con exito");
        regisProfe.setVisible(false);
      }
      else {
        //JOptionPane.showMessageDialog(vista3, "El usuario indicado ya existe");
      }
    } else {
       JOptionPane.showMessageDialog(regisProfe, "Todos los datos son requeridos");
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
        JOptionPane.showMessageDialog(periodo, "El periodo ha sido registrado con exito");
        periodo.setVisible(false);
      }
      else {
        //JOptionPane.showMessageDialog(vista3, "El usuario indicado ya existe");
      }
    } else {
      JOptionPane.showMessageDialog(periodo, "Todos los datos son requeridos");
    } 
  }
  
  public void registrarEmpresa() { 
    if (regisEm.logInDatosCorrectos() == true) {
      String nombreEmp = regisEm.nameEmp.getText();
      String tel = regisEm.telEmp.getText(); 
      String dir = regisEm.dir.getText();
      String nombreSup = regisEm.nameSup.getText(); 
      String correo = regisEm.correoSup.getText();
      String telS = regisEm.telSuper.getText(); 
      String puesto = regisEm.puestSuper.getText(); 
      DTO_Empresa pp= new DTO_Empresa();
      pp.setNombre(nombreEmp);
      pp.setDireccion(dir); 
      pp.setTelefono(tel);
      pp.setSup(nombreSup); 
      pp.setCorreo(correo);
      pp.setTelefonoS(telS); 
      pp.setPuesto(puesto);
      DTO_Solicitud soli= new DTO_Solicitud();
      soli.setInstruccion("regEm");
      soli.setObjeto((DTO_Object) pp);
      logica.enviarInformacion(soli);
      //modelo = new Usuario(nombreUsuario, contraseña);
      boolean usuarioActual = true;
      if (usuarioActual != false) { 
        JOptionPane.showMessageDialog(regisEm, "La empresa ha sido registrada con exito");
        regisEm.setVisible(false);
      }
      else {
        //JOptionPane.showMessageDialog(vista3, "El usuario indicado ya existe");
      }
    } else {
      JOptionPane.showMessageDialog(periodo, "Todos los datos son requeridos");
    } 
  }
  
  public void registrarPract() { 
    if (regPrac.logInDatosCorrectos() == true) {
      String nombreUsuario = regPrac.Nombre.getText();
      String contrasena = regPrac.contra.getText();
      String telef = regPrac.tel.getText();
      String correo = regPrac.correo.getText(); 
      String carnet = regPrac.carnet.getText(); 
      String direc = regPrac.direc.getText(); 
      String ced = regPrac.ced.getText(); 
      String per = regPrac.periodo.getText(); 
      String pa = regPrac.pa.getText(); 
      String pc = regPrac.pc.getText(); 
      String emp = regPrac.emp.getText(); 
      Calendar date = regPrac.jCalendar1.getCalendar();
      DTO_Practicante pract= new DTO_Practicante();
      pract.setNombre(nombreUsuario);
      pract.setCedula(ced);
      pract.setTelefono(telef);
      pract.setCorreo(correo);
      pract.setContr(contrasena);
      pract.setNacimiento(date);
      pract.setDireccion(direc);
      pract.setCarnet(carnet);
      pract.setProfeAsesor(pa);
      pract.setProfeCurso(pc);
      pract.setPeriodo(per);
      pract.setEmpresa(emp);
      DTO_Solicitud soli= new DTO_Solicitud();
      soli.setInstruccion("regPract");
      soli.setObjeto((DTO_Object) pract);
      logica.enviarInformacion(soli);
      //modelo = new Usuario(nombreUsuario, contraseña);
      boolean usuarioActual = true;
      if (usuarioActual != false) { 
        JOptionPane.showMessageDialog(regPrac, "El usuario ha sido registrado con exito");
        regPrac.setVisible(false);
      }
      else {
        //JOptionPane.showMessageDialog(vista3, "El usuario indicado ya existe");
      }
    } else {
       JOptionPane.showMessageDialog(regisProfe, "Todos los datos son requeridos");
    }
  }  
}
