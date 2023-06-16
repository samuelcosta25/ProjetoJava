
import javax.swing.JOptionPane;

import Conta.contaPF;
import Conta.contaPJ;

public class App {
    public static void main(String[] args) {

        // criar vetor de objetos

        contaPF clientePF[] = new contaPF[10];
        contaPJ clientePj[] = new contaPJ[10];

        // começar meu banco
        boolean menu = true;
        int contadorPF = 0;
        int contadorPJ = 0;
        while (menu) {
            int acao = Integer.parseInt(JOptionPane
                    .showInputDialog("Informe a ação desejada: \n1-Abrir conta. \n2-Acessar conta. \n3-Sair."));
            switch (acao) {
                case 1:
                    boolean acessoCriar = true;

                    // criar conta
                    // selecionar tipo de conta
                    int tipoConta = Integer.parseInt(JOptionPane
                            .showInputDialog(
                                    "Informe o tipo de conta a ser aberta: \n1-Conta Pessoa Física (PF). \n2- Conta Pessoa Jurídica (PJ)."));
                    switch (tipoConta) {
                        case 1:
                            while (acessoCriar) {
                                // criar objeto
                                clientePF[contadorPF] = new contaPF();
                                clientePF[contadorPF].setnConta(1 + contadorPF);
                                contadorPF++; // somar no contador
                                break;
                            }
                            break;
                        case 2:
                            while (acessoCriar) {
                                // criar objeto
                                clientePj[contadorPJ] = new contaPJ();
                                clientePj[contadorPJ].setnConta(10000 + contadorPJ);
                                contadorPJ++; // somar no contador
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    break;

                case 2: // acessar conta, localiza no vetor
                    boolean acessoBusca = true;
                    boolean acessoFuncoes = true;
                    int tipoContaPesquisar = Integer.parseInt(JOptionPane
                            .showInputDialog(
                                    "Informa o tipo de conta a ser acessada: \n1-Conta Pessoa Física (PF). \n2- Conta Pessoa Jurídica (PJ)."));
                    switch (tipoContaPesquisar) {
                        case 1: // Acesso conta PF
                            int metodoPesquisa = Integer.parseInt(JOptionPane
                                    .showInputDialog(
                                            "Informe o método de pesquisa: \n1-Pesquisar por nome. \n2-Pesquisar por n° de conta."));
                            // fazer aqui lógica para buscar por numero e nome da conta
                            int i;
                            switch (metodoPesquisa) {
                                case 1: // Conta PF pesquisada por nome
                                    while (acessoBusca) {
                                        String nomeBusca = JOptionPane
                                                .showInputDialog("Informe o nome da Conta a ser buscada:");
                                        for (i = 0; i < clientePF.length; i++) {
                                            if (nomeBusca.equals(clientePF[i].getNome())) {
                                                JOptionPane.showMessageDialog(null, "Conta encontrada");
                                            } else {
                                                JOptionPane.showMessageDialog(null,
                                                        "Conta não encontrada! Digite novamente.");
                                                break;
                                            }
                                            while (acessoFuncoes) {

                                                int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Informe a ação desejada para a conta: \n1-Consultar saldo. \n2-Realizar saque. \n3-Realizar depósito. \n4-Realizar empréstimo \n5- Sair"));
                                                switch (acao2) {
                                                    case 1:
                                                        JOptionPane.showMessageDialog(null,
                                                                "Seu saldo é de R$" + clientePF[i].getSaldo());
                                                        break;
                                                    case 2:
                                                        clientePF[i].saque();
                                                        break;
                                                    case 3:
                                                        clientePF[i].depósito();
                                                        break;
                                                    case 4:
                                                        clientePF[i].emprestimo();
                                                        break;
                                                    case 5:
                                                        acessoFuncoes = false;
                                                        break;
                                                    default:
                                                        JOptionPane.showMessageDialog(null,
                                                                "ERRO! Digite uma opção válida.");
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                case 2: // Conta PF pesquisada por numero
                                    while (acessoBusca) {
                                        int nBusca = Integer
                                                .parseInt(JOptionPane
                                                        .showInputDialog("Informe o nº da Conta a ser buscada:"));
                                        for (i = 0; i < clientePF.length; i++) {
                                            if (nBusca == clientePF[i].getnConta()) {
                                                JOptionPane.showMessageDialog(null, "Conta encontrada");

                                            } else {
                                                JOptionPane.showMessageDialog(null,
                                                        "Conta não encontrada! Digite novamente.");
                                                break;
                                            }

                                            while (acessoFuncoes) {

                                                int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Informe a ação desejada para a conta: \n1-Consultar saldo. \n2-Realizar saque. \n3-Realizar depósito. \n4-Realizar empréstimo \n5- Sair"));
                                                switch (acao2) {
                                                    case 1:
                                                        JOptionPane.showMessageDialog(null,
                                                                "Seu saldo é de R$" + clientePF[i].getSaldo());
                                                        break;
                                                    case 2:
                                                        clientePF[i].saque();
                                                        break;
                                                    case 3:
                                                        clientePF[i].depósito();
                                                        break;
                                                    case 4:
                                                        clientePF[i].emprestimo();
                                                        break;
                                                    case 5:
                                                        acessoFuncoes = false;
                                                        break;
                                                    default:
                                                        JOptionPane.showMessageDialog(null,
                                                                "ERRO! Digite uma opção válida.");
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        case 2: // Acesso conta PJ
                            metodoPesquisa = Integer.parseInt(JOptionPane
                                    .showInputDialog(
                                            "Informe o método de pesquisa: \n1-Pesquisar por nome. \n2-Pesquisar por n° de conta."));
                            // fazer aqui lógica para buscar por numero e nome da conta

                            switch (metodoPesquisa) {
                                case 1: // Conta PJ pesquisada por nome
                                    while (acessoBusca) {
                                        String nomeBusca = JOptionPane
                                                .showInputDialog("Informe o nome da Conta a ser buscada:");
                                        for (i = 0; i < clientePj.length; i++) {
                                            if (nomeBusca.equals(clientePj[i].getNome())) {
                                                JOptionPane.showMessageDialog(null, "Conta encontrada");

                                            } else {
                                                JOptionPane.showMessageDialog(null,
                                                        "Conta não encontrada! Digite novamente.");
                                                break;
                                            }

                                            while (acessoFuncoes) {

                                                int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Informe a ação desejada para a conta: \n1-Consultar saldo. \n2-Realizar saque. \n3-Realizar depósito. \n4-Realizar empréstimo \n5- Sair"));
                                                switch (acao2) {
                                                    case 1:
                                                        JOptionPane.showMessageDialog(null,
                                                                "Seu saldo é de R$" + clientePj[i].getSaldo());
                                                        break;
                                                    case 2:
                                                        clientePj[i].saque();
                                                        break;
                                                    case 3:
                                                        clientePj[i].depósito();
                                                        break;
                                                    case 4:
                                                        clientePj[i].emprestimo();
                                                        break;
                                                    case 5:
                                                        acessoFuncoes = false;
                                                        break;
                                                    default:
                                                        JOptionPane.showMessageDialog(null,
                                                                "ERRO! Digite uma opção válida.");
                                                        break;
                                                }
                                            }
                                        }
                                        break;

                                    }
                                    break;
                                case 2: // Conta PJ pesquisada por numero
                                    while (acessoBusca) {
                                        int nBusca = Integer
                                                .parseInt(JOptionPane
                                                        .showInputDialog("Informe o nº da Conta a ser buscada:"));
                                        for (i = 0; i < clientePj.length; i++) {
                                            if (nBusca == clientePj[i].getnConta()) {
                                                JOptionPane.showMessageDialog(null, "Conta encontrada");

                                            } else {
                                                JOptionPane.showMessageDialog(null,
                                                        "Conta não encontrada! Digite novamente.");
                                                break;
                                            }
                                            while (acessoFuncoes) {

                                                int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Informe a ação desejada para a conta: \n1-Consultar saldo. \n2-Realizar saque. \n3-Realizar depósito. \n4-Realizar empréstimo \n5- Sair"));
                                                switch (acao2) {
                                                    case 1:
                                                        JOptionPane.showMessageDialog(null,
                                                                "Seu saldo é de R$" + clientePj[i].getSaldo());
                                                        break;
                                                    case 2:
                                                        clientePj[i].saque();
                                                        break;
                                                    case 3:
                                                        clientePj[i].depósito();
                                                        break;
                                                    case 4:
                                                        clientePj[i].emprestimo();
                                                        break;
                                                    case 5:
                                                        acessoFuncoes = false;
                                                        break;
                                                    default:
                                                        JOptionPane.showMessageDialog(null,
                                                                "ERRO! Digite uma opção válida.");
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    }
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