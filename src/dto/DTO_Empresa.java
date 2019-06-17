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
public class DTO_Empresa extends DTO_Object{
  private String nombre;
  private String direccion;
  private String telefono;
  private String sup;
  private String correo;
  private String telefonoS;
  private String puesto;

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
   * @return telefonoS
   */
  public String getTelefonoS() {
    return telefonoS;
  }

  /**
   *
   * @param telefonoS
   */
  public void setTelefonoS(String telefonoS) {
    this.telefonoS = telefonoS;
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
   * @return sup
   */
  public String getSup() {
    return sup;
  }

  /**
   *
   * @param sup
   */
  public void setSup(String sup) {
    this.sup = sup;
  } 
}
