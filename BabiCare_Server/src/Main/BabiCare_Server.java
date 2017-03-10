/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Data.Config;
import Notification.FCMNotification;
import java.net.ServerSocket;
import Network.Connect;
import java.io.IOException;

/**
 *
 * @author TAM
 */
public class BabiCare_Server {
private static FCMNotification mNotification;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //mNotification=new FCMNotification();
         System.out.println("Server is running . . . \nPORT: "+Config.PORT);
       ServerSocket listener = new ServerSocket(Config.PORT);
        try {
            while (true) {
                new Connect.Handler(listener.accept()).start();
            }
        } finally {
            listener.close();
        }
    }
    
}
