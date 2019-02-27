/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativpetshop;

import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Ativpetshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pets pet = new Pets();
        pet.setNome(JOptionPane.showInputDialog(null,"Insira o nome do pet"));
        pet.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Idade do pet")));
        pet.setRaca(JOptionPane.showInputDialog(null,"Qual raça"));
        Cliente cliente = new Cliente();
        cliente.setNome(JOptionPane.showInputDialog(null,"Informe seu nome"));
        cliente.setTelefone(JOptionPane.showInputDialog(null,"Informe seu telefone"));
        pet.setDono(cliente);
        Entrega entrega = new Entrega ();
        JOptionPane.showMessageDialog(null, "Informe a entrega em (km)\n*limite 35km");
        if(entrega.setDistancia(Double.parseDouble(JOptionPane.showInputDialog(null,"Informe Distancia")))){
        JOptionPane.showMessageDialog(null,"Confirmação de Serviço" +"\n_____________________________\n" + "Cliente:" + cliente.getNome() + "\n_____________________________\n" + "Pet:" + pet.getNome() + "\n" + "Raça:" + pet.getRaca() + "\n_____________________________\n" + "Valor do serviço:" + "R$" + entrega.getValor() );
        }else{
            JOptionPane.showMessageDialog(null, "Não será possivel fornecer serviço");
    
        }
        }
    
}
