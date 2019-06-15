/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Calendar;

/**
 *
 * @author Luis AZ
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
  public String getPeriodo() {
    return periodo;
  }

  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }
   
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCarnet() {
    return carnet;
  }

  public void setCarnet(String carnet) {
    this.carnet = carnet;
  }

  public String getCedula() {
    return cedula;
  }

  public void setCedula(String cedula) {
    this.cedula = cedula;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public Calendar getNacimiento() {
    return nacimiento;
  }

  public void setNacimiento(Calendar nacimiento) {
    this.nacimiento = nacimiento;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getProfeCurso() {
    return profeCurso;
  }

  public void setProfeCurso(String profeCurso) {
    this.profeCurso = profeCurso;
  }

  public String getEmpresa() {
    return empresa;
  }

  public void setEmpresa(String empresa) {
    this.empresa = empresa;
  }

  public String getProfeAsesor() {
    return profeAsesor;
  }

  public void setProfeAsesor(String profeAsesor) {
    this.profeAsesor = profeAsesor;
  }
} 