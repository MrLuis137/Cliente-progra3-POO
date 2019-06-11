/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import controlador.ControladorTotal;
import vista.ingreso;

/**
 *
 * @author 1001001238
 */
public class AplCliente {
  public static void main(String[] args) {
    ingreso vista = new ingreso();  
    ControladorTotal controladorUsuario = new ControladorTotal(vista);
    controladorUsuario.ingreso.setVisible(true);
    controladorUsuario.ingreso.setLocationRelativeTo(null);
 }
}
