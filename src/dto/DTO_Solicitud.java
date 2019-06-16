/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author Luis AZ
 */
public class DTO_Solicitud extends DTO_Object implements Serializable{
  DTO_Object objeto;
  String instruccion;

  public DTO_Object getObjeto() {
    return objeto;
  }

  public void setObjeto(DTO_Object objeto) {
    this.objeto = objeto;
  }

  public String getInstruccion() {
    return instruccion;
  }

  public void setInstruccion(String instruccion) {
    this.instruccion = instruccion;
  }

}
