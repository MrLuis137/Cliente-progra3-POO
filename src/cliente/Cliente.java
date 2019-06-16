package cliente;

import dto.DTO_Solicitud;
import java.util.ArrayList;
import java.net.Socket;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Clase que realiza la conexión con el servidor.
 * @autor Luis Diego Aleman
 * @autor Valeria Quesada
 * @autor Marlen Solano
 * @version 16/5/2019
 */
public class Cliente{
  
  private static final int PUERTO = 64923; //Puerto para la conexion
  private static final String HOST = "localhost"; //Host para la conexion
  protected static String mensajeServidor;
  protected static Socket cs; //Socket del servidor;
  protected static ObjectOutputStream salidaCliente; //Flujo de datos de salida
    
  
  /**
   * constructor del cliente del juego
   */ 
  public Cliente(){
  }
    
  /**
   * Envia la solicitud e informacion en forma de arraylist
   * @param solicitud
   * @return objeto
   */
  public Object enviarInformacion(DTO_Solicitud solicitud){
    try{
      cs = new Socket(HOST, PUERTO);
      salidaCliente= new ObjectOutputStream(cs.getOutputStream());
      salidaCliente.writeObject(solicitud);
      ObjectInputStream entrada = new ObjectInputStream(cs.getInputStream());
      Object soli  = entrada.readObject();
      cs.close(); 
      return soli;
    }
    catch(Exception e){
      e.printStackTrace();
      return false;
    }
  }
}
