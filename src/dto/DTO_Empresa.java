/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;


/**
 *
 * @author Luis AZ
 */
public class DTO_Empresa extends DTO_Object{
  private String nombre;
  private String direccion;
  private String telefono;
  private String sup;
  private String correo;
  private String telefonoS;
  private String puesto;

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getTelefonoS() {
    return telefonoS;
  }

  public void setTelefonoS(String telefonoS) {
    this.telefonoS = telefonoS;
  }

  public String getPuesto() {
    return puesto;
  }

  public void setPuesto(String puesto) {
    this.puesto = puesto;
  }
  
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getSup() {
    return sup;
  }

  public void setSup(String sup) {
    this.sup = sup;
  }
  
  
  
}
