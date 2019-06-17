/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/** 
 * @author Luis Diego Aleman
 * @author Valeria Quesada
 * @author Marlen Solano 
 */
public class DTO_Profesor extends DTO_Object implements Serializable{ 
  private String nombre;
  private String telefono;
  private String correo;
  private String puesto;
  private String contra;

  /**
   *
   * @return contra
   */
  public String getContra() {
    return contra;
  }

  /**
   *
   * @param contra
   */
  public void setContra(String contra) {
    this.contra = contra;
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
   * @return puesto
   */
  public String getPuesto() {
    return puesto;
  }

  /**
   *
   * @param puesto
   */
  public void setPuesto(String puesto) {
    this.puesto = puesto;
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
}
