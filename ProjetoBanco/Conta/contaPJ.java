package Conta;

import javax.swing.JOptionPane;

public class contaPJ extends conta{
    //atributos

    String nCNPJ;
    
    //métodos
    //construtor default
    // sets and gets
    public String getnCNPJ() {
        return nCNPJ;
    }

    public void setnCNPJ(String nCNPJ) {
        this.nCNPJ = nCNPJ;
    }

    public contaPJ() {
        // preencher atributos do objeto
       nome=JOptionPane.showInputDialog("Informe o nome da empresa:");
       nCNPJ=JOptionPane.showInputDialog("Informe o CNPJ da empresa:");
       saldo=0;
    }
    
}
