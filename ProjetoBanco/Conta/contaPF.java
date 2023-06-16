package Conta;

import javax.swing.JOptionPane;

public class contaPF extends conta{
   //atributos
   
    String nCPF;

    //métodos
    //construtor default
    public contaPF() {
        // preencher atributos do objeto
       nome=JOptionPane.showInputDialog("Informe o nome da pessoa:");
       nCPF=JOptionPane.showInputDialog("Informe o CPF da pessoa:");
       saldo=0;
    }
    // sets and gets

    public String getnCPF() {
        return nCPF;
    }

    public void setnCPF(String nCPF) {
        this.nCPF = nCPF;
    }

}
