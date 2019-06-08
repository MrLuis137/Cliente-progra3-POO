/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import encargadopractica.Supervisor;

/**
 *
 * @author Luis AZ
 */
public class DTO_Empresa extends DTO_Object{
    private String nombre;
  private String direccion;
  private int telefono;
  private String sup;

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

  public int getTelefono() {
    return telefono;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

  public String getSup() {
    return sup;
  }

  public void setSup(String sup) {
    this.sup = sup;
  }
  
  
  
}
