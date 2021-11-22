/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargacelular;

/**
 *
 * @author 56992
 */
import javax.swing.JOptionPane;
public class CargaCelular{
    
    public static void main(String []args)
    {   
        Celular miCelular  = new Celular();
        int menu = 0;
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu celular\n"
                    + "1.Realizar llamada\n"
                    + "2.Cargar dinero\n"
            + "3.Cargar Batería\n"
            + "4.Mostrar Estadística\n"
            +"5.Salir"));
        
            switch(menu)
            {
                case 1:
                    JOptionPane.showMessageDialog(null,"Menu celular\n"+"llamando...");
                    miCelular.llamadaTelefonica();
                    break;
                case 2:
                    int carga = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu celular\n"+"Cargando dinero..."));
                    miCelular.cargarSaldo(carga);
                    break;
                case 3:
                    JOptionPane.showInputDialog(null,"Menu celular\n"+"Cargando Bateria...");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,miCelular.getEstadisticas());
                    
                    break;
                
            }
        }while(menu != 5);
        System.exit(0);
    }
}