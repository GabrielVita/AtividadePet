/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativpetshop;

/**
 *
 * @author aluno
 */
public class Entrega {
    private double valor;
    private Pets pet;
    private double distancia;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pets getPet() {
        return pet;
    }

    public void setPet(Pets pet) {
        this.pet = pet;
    }

    public double getDistancia() {
        return distancia;
    }

    public boolean setDistancia(double distancia) {
        if(distancia <= 35){
        this.distancia = distancia;
        frete(this.distancia);
        return true;
    }else{
            return false;
        }
   

}
    public void frete(double distancia){
        if(distancia<=5){
            valor=10;
        }
        if(distancia>5 && distancia<=15){
            valor=20;
        }
        if(distancia>15 && distancia<=35){
            valor=50;
        }
    }
}
