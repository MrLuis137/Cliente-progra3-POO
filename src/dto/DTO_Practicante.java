/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Calendar;

/** 
 * @author Luis Diego Aleman
 * @author Valeria Quesada
 * @author Marlen Solano 
 */
public class DTO_Practicante extends DTO_Object{
  private String nombre;
  private String carnet;
  private String cedula;
  private String telefono;
  private Calendar nacimiento;
  private String correo;
  private String direccion;
  private String profeCurso;
  private String empresa;
  private String profeAsesor;
  private String periodo; 
  private String contr; 

  /**
   *
   * @return contr
   */
  public String getContr() {
    return contr;
  }

  /**
   *
   * @param contr
   */
  public void setContr(String contr) {
    this.contr = contr;
  }
  
  /**
   *
   * @return periodo
   */
  public String getPeriodo() {
    return periodo;
  }

  /**
   *
   * @param periodo
   */
  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }
   
  /**
   *
   * @return nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   *
   * @param nombre
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   *
   * @return carnet
   */
  public String getCarnet() {
    return carnet;
  }

  /**
   *
   * @param carnet
   */
  public void setCarnet(String carnet) {
    this.carnet = carnet;
  }

  /**
   *
   * @return cedula
   */
  public String getCedula() {
    return cedula;
  }

  /**
   *
   * @param cedula
   */
  public void setCedula(String cedula) {
    this.cedula = cedula;
  }

  /**
   *
   * @return telefono
   */
  public String getTelefono() {
    return telefono;
  }

  /**
   *
   * @param telefono
   */
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   *
   * @return nacimiento
   */
  public Calendar getNacimiento() {
    return nacimiento;
  }

  /**
   *
   * @param nacimiento
   */
  public void setNacimiento(Calendar nacimiento) {
    this.nacimiento = nacimiento;
  }

  /**
   *
   * @return correo
   */
  public String getCorreo() {
    return correo;
  }

  /**
   *
   * @param correo
   */
  public void setCorreo(String correo) {
    this.correo = correo;
  }

  /**
   *
   * @return direccion
   */
  public String getDireccion() {
    return direccion;
  }

  /**
   *
   * @param direccion
   */
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  /**
   *
   * @return profeCurso
   */
  public String getProfeCurso() {
    return profeCurso;
  }

  /**
   *
   * @param profeCurso
   */
  public void setProfeCurso(String profeCurso) {
    this.profeCurso = profeCurso;
  }

  /**
   *
   * @return empresa
   */
  public String getEmpresa() {
    return empresa;
  }

  /**
   *
   * @param empresa
   */
  public void setEmpresa(String empresa) {
    this.empresa = empresa;
  }

  /**
   *
   * @return profeAsesor
   */
  public String getProfeAsesor() {
    return profeAsesor;
  }

  /**
   *
   * @param profeAsesor
   */
  public void setProfeAsesor(String profeAsesor) {
    this.profeAsesor = profeAsesor;
  }
} 