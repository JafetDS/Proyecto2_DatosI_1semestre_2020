package Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Clase para iniciar el socket client y el socket Server
 *
 * SE PUEDE UTILIZAR EN CUALQUIER PROYECTO : MODULARIDAD
 */
public class Sockets{
    public static void newSockets(String Ip, int port,String mensaje)  throws Exception{newSocket2(Ip,  port,mensaje); }
    private static void newSocket2(String Ip, int port,String mensaje)  throws Exception {

        try {
            Socket socket = new Socket(Ip, port);
            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
            salida.writeUTF(mensaje);
            salida.close();

        }
        catch (UnknownHostException e){
            //   System.out.println("jua2");
            System.out.println(e.getMessage());

        }
        catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }
}
