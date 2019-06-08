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
public class DTO_PeriodoPractica extends DTO_Object{
  private Calendar inicio;
  private Calendar fin;
  private int semestre;
  private int anio;

  public Calendar getInicio() {
    return inicio;
  }

  public void setInicio(Calendar inicio) {
    this.inicio = inicio;
  }

  public Calendar getFin() {
    return fin;
  }

  public void setFin(Calendar fin) {
    this.fin = fin;
  }

  public int getSemestre() {
    return semestre;
  }

  public void setSemestre(int semestre) {
    this.semestre = semestre;
  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }
  
  
}
