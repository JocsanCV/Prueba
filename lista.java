/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;



import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class lista{
    public static void main(String [] args){
        String respuesta="";
        int respuesta1=0;
       
        coche coche=new coche();
        boolean seleccion=true;
        while(seleccion=true){
        respuesta=JOptionPane.showInputDialog(null,"Selecciones una opcion\n1-Asignar \n2-Ruedas\n3-Salir");
       
        switch(respuesta){
                case "1":
                      respuesta=JOptionPane.showInputDialog(null,"Selecciones una opcion\n1-Carros\n2-Motocicletas\n3-Bicicletas\n4-Camionetas");
                      switch(respuesta){
                          case"1":
                                 respuesta=(JOptionPane.showInputDialog(null,"Ingrese el cilindrage"));
                                 coche.setcilindrado(respuesta);
                                 respuesta1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de llantas"));
                                 coche.setruedas(respuesta1);
                                 respuesta1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el kilometrage"));
                                 coche.setvelocidad(respuesta1);
                                 respuesta=(JOptionPane.showInputDialog(null,"Ingrese el color"));
                                 coche.setcolor(respuesta);
                                  
                              break;
                                case"2":
                                 respuesta=(JOptionPane.showInputDialog(null,"Digite el cilindrage"));
                                 coche.setcilindrado(respuesta);
                                 respuesta1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de llantas"));
                                 coche.setruedas(respuesta1);
                                 respuesta1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el kilometrage"));
                                 coche.setvelocidad(respuesta1);
                                 respuesta=(JOptionPane.showInputDialog(null,"Digite el color"));
                                 coche.setcolor(respuesta);
                              break;
                                case"3":
                                    
                              break;
                                    
                              
                                case"4":
                                    
                              break;
                      }
                    break;
                    case "2":
                        respuesta1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de llantas"));
                        coche.setruedas(respuesta1);
                        if(coche.ruedas==2){
                              JOptionPane.showMessageDialog(null,"Motocicletas:\n-Honda \n-BMW \n-Suzuki \n-KTM \n");
                               JOptionPane.showMessageDialog(null,"Bicicletas:\n-BMX \n-Specialized \n-Trek \n-Shimano \n");
                        }
                        if(coche.ruedas==4){
                              JOptionPane.showMessageDialog(null,"Carros:\n-Ferrari\n-Honda \n-MC Claren \n-Dodge \n");
                             JOptionPane.showMessageDialog(null,"Camionetas: \n-Raptor \n-Hiunday \n-Thule \n"); 
                        }
                      
                    break;
                    case "3":
                        System.exit(0);
                    break;
        }
        }

    }   
}
