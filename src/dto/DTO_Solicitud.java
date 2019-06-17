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
public class DTO_Solicitud extends DTO_Object implements Serializable{
  DTO_Object objeto;
  String instruccion;

  /**
   *
   * @return objeto
   */
  public DTO_Object getObjeto() {
    return objeto;
  }

  /**
   *
   * @param objeto
   */
  public void setObjeto(DTO_Object objeto) {
    this.objeto = objeto;
  }

  /**
   *
   * @return instruccion
   */
  public String getInstruccion() {
    return instruccion;
  }

  /**
   *
   * @param instruccion
   */
  public void setInstruccion(String instruccion) {
    this.instruccion = instruccion;
  }

}
