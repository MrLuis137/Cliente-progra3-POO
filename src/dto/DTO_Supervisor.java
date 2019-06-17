/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/** 
 * @author Luis Diego Aleman
 * @author Valeria Quesada
 * @author Marlen Solano 
 */
public class DTO_Supervisor extends DTO_Object{ 
  private String nombre;
  private String puesto;
  private int telefono;
  private String correo;

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
   * @return telefono
   */
  public int getTelefono() {
    return telefono;
  }

  /**
   *
   * @param telefono
   */
  public void setTelefono(int telefono) {
    this.telefono = telefono;
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
