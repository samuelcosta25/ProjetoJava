
import javax.swing.JOptionPane;

import Conta.contaPF;
import Conta.contaPJ;

public class App {
    public static void main(String[] args) {

        // criar vetor de objetos

        contaPF clientePF[] = new contaPF[10];
        contaPJ clientePj[] = new contaPJ[10];

        // começar meu banco
        boolean aberto = true;
        int contadorPF = 0;
        int contadorPJ = 0;
        while (aberto) {
            int acao = Integer.parseInt(JOptionPane
                    .showInputDialog("Informe a ação desejada: \n1-Abrir conta. \n2-Acessar conta. \n3-Sair."));
            switch (acao) {
                case 1: // criar conta
                    // selecionar tipo de conta
                    int tipoConta = Integer.parseInt(JOptionPane
                            .showInputDialog(
                                    "Informa o tipo de conta a ser aberta: \n1-Conta Pessoa Física (PF). \n2- Conta Pessoa Jurídica (PJ)."));
                    switch (tipoConta) {
                        case 1:
                            // criar objeto
                            clientePF[contadorPF] = new contaPF();
                            clientePF[contadorPF].setnConta(10000 + contadorPF);
                            contadorPF++; // somar no contador
                            break;
                        case 2:
                            // criar objeto
                            clientePj[contadorPJ] = new contaPJ();
                            clientePj[contadorPJ].setnConta(10000 + contadorPJ);
                            contadorPJ++; // somar no contador
                            break;
                        default:
                            break;
                    }

                    break;

                case 2: // acessar conta, localiza no vetor
                    int metodoPesquisa = Integer.parseInt(JOptionPane
                            .showInputDialog(
                                    "Informe o método de pesquisa: \n1-Pesquisar por nome. \n2-Pesquisar por n° de conta."));
                    // fazer aqui lógica para buscar por numero e nome da conta
                    int i;
                    switch (metodoPesquisa) {
                        case 1:
                            String nomeBusca  = JOptionPane.showInputDialog("Informe o nome da Conta a ser buscada:");
                            for (i = 0; i < clientePj.length; i++) {
                                if (nomeBusca == clientePj[i].getNome()) {
                                    JOptionPane.showMessageDialog(null, "Conta encontrada");
                                    break;
                                }
                            }
                            break;
                        case 2:
                        
                            int nBusca = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da Conta a ser buscada:"));
                            for (i = 0; i < clientePj.length; i++) {
                                if (nBusca == clientePj[i].getnConta()) {
                                    JOptionPane.showMessageDialog(null, "Conta encontrada");
                                    break;
                                }
                            }
                            break;

                        default:
                            break;
                    }

                    boolean acesso = true;
                    while (acesso) { // conta acessada
                        int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                "Informe a ação desejada para a conta: \n1-Consultar saldo. \n2-Realizar saque. \n3-Realizar depósito. \n4-Realizar empréstimo \n5- Sair"));
                        switch (acao2) {
                            case 1:
                                JOptionPane.showInputDialog("Seu saldo é de R$" + clientePj[contadorPJ].getSaldo());
                                break;
                            case 2:
                                clientePj[contadorPJ].saque();
                                break;
                            case 3:
                                clientePj[contadorPJ].depósito();
                                break;
                            case 4:
                                clientePj[contadorPJ].emprestimo();
                                break;
                            case 5:
                                break;

                            default:
                                break;
                        }
                    }

                default:
                    break;
            }

        }
    }
}