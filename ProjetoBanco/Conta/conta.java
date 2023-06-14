package Conta;

import javax.swing.JOptionPane;

public class conta {
    //atributos

    String nome;
    int nConta;
    double saldo;

    //métodos

    //construtor default
    // sets and gets
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getnConta() {
        return nConta;
    }
    public void setnConta(int nConta) {
        this.nConta = nConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque(){
        double saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de Saque."));
        if (saque<0){
            JOptionPane.showMessageDialog(null,"Digite um valor válido!");
        } else if (saldo-saque < 0){
            JOptionPane.showMessageDialog(null,"Saldo insufuciente!");
        } else {
            saldo -= saque;
            JOptionPane.showMessageDialog(null,"Saque realizado! Seu saldo agora é de R$"+saldo);
        }
    }

    public void depósito() {
        double deposito = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de Deposito."));
        saldo += deposito;
        JOptionPane.showMessageDialog(null,"Deposito realizado! Seu saldo agora é de R$"+saldo);
    }

    public void emprestimo() {
        double emprestimo = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de Emprestimo."));
        if (emprestimo<0){
            JOptionPane.showMessageDialog(null,"Digite um valor válido!");
        } else if (emprestimo<=saldo*4) {
            saldo += emprestimo;
            JOptionPane.showMessageDialog(null,"Emprestimo aprovado! Seu saldo agora é de R$"+saldo);
        } else {
            JOptionPane.showMessageDialog(null,"Emprestimo negado!");
        }
    }

    
    
}
