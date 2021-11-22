package cargacelular;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56992
 */
public class Celular {
    
    int saldo;
    int bateria;
    int dineroAcumulado;
    int vecesCargado;
    
    Celular()
    {
        this.bateria = 500;
        this.saldo = 5000;
    }
    
   public void llamadaTelefonica()
   {
       this.saldo -= 150;
       this.bateria -=50;
   }
   public void acumularSaldoCargado(int recarga)
   {
       this.dineroAcumulado += recarga;
   }
   public void cargarSaldo(int recarga)
   {
       this.saldo += recarga;
       acumularSaldoCargado(recarga);
       
   }
    public void acumularCargasBateria(int recarga)
   {
       this.vecesCargado += recarga;
   }
   public void cargarBateria()
   {
       this.bateria += 300;
       acumularCargasBateria(300);
   }
   public String getEstadisticas()
   {
       return "Saldo Actual: "+this.saldo+"\nBateria: "+this.bateria+"mAh\nEl celular se cargó: "+this.vecesCargado+" veces\nHa cargado en total "+this.dineroAcumulado;
   }
}
