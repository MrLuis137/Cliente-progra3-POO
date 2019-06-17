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
public class DTO_PeriodoPractica extends DTO_Object{
  private String semestre;
  private String anio;
 
  /**
   *
   * @return semestre
   */
  public String getSemestre() {
    return semestre;
  }

  /**
   *
   * @param semestre
   */
  public void setSemestre(String semestre) {
    this.semestre = semestre;
  }

  /**
   *
   * @return anio
   */
  public String getAnio() {
    return anio;
  }

  /**
   *
   * @param anio
   */
  public void setAnio(String anio) {
    this.anio = anio;
  }
}
