
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
        int contaAcesssada = 0;
        while (menu) {
            boolean sairConta = true;
            int acao = Integer.parseInt(JOptionPane
                    .showInputDialog("Informe a ação desejada: \n1-Abrir conta. \n2-Acessar conta. \n3-Sair."));
            switch (acao) {
                case 1:
                    boolean acessoCriar = true;
                    while (acessoCriar) {
                        // criar conta
                        // selecionar tipo de conta
                        int tipoConta = Integer.parseInt(JOptionPane
                                .showInputDialog(
                                        "Informe o tipo de conta a ser aberta: \n1-Conta Pessoa Física (PF). \n2- Conta Pessoa Jurídica (PJ)."));
                        switch (tipoConta) {
                            case 1:
                                // criar objeto
                                clientePF[contadorPF] = new contaPF();
                                clientePF[contadorPF].setnConta(1 + contadorPF);
                                JOptionPane.showMessageDialog(null,
                                        "Conta Criada com Sucesso, N° da conta: " + clientePF[contadorPF].getnConta());
                                contadorPF++; // somar no contador
                                break;

                            case 2:
                                // criar objeto
                                clientePj[contadorPJ] = new contaPJ();
                                clientePj[contadorPJ].setnConta(10000 + contadorPJ);
                                JOptionPane.showMessageDialog(null,
                                        "Conta Criada com Sucesso, N° da conta: " + clientePj[contadorPJ].getnConta());
                                contadorPJ++; // somar no contador
                                break;

                            default:
                                break;
                        } // fecha switch tipoConta
                        break;
                    } // fecha while acessoCriar
                    break;

                case 2: // acessar conta, localiza no vetor
                    boolean acessoBusca = true;
                    boolean acessoFuncoes = true;
                    while (sairConta) {

                        int tipoContaPesquisar = Integer.parseInt(JOptionPane
                                .showInputDialog(
                                        "Informa o tipo de conta a ser acessada: \n1-Conta Pessoa Física (PF). \n2- Conta Pessoa Jurídica (PJ)."));
                        switch (tipoContaPesquisar) {
                            case 1: // Acesso conta PF
                                int metodoPesquisa = Integer.parseInt(JOptionPane
                                        .showInputDialog(
                                                "Informe o método de pesquisa: \n1-Pesquisar por nome. \n2-Pesquisar por n° de conta."));
                                // lógica para buscar por numero e nome da conta
                                
                                switch (metodoPesquisa) {
                                    case 1: // Conta PF pesquisada por nome
                                        while (acessoBusca) {
                                            String nomeBusca = JOptionPane
                                                    .showInputDialog("Informe o nome da Conta a ser buscada:");
                                            for (int i = 0; i < clientePF.length; ) {
                                                if (nomeBusca.equals(clientePF[i].getNome())) {
                                                    i = contaAcesssada;
                                                    JOptionPane.showMessageDialog(null, "Conta encontrada");
                                                    while (acessoFuncoes) {

                                                        int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                                                "Informe a ação desejada para a conta: \n1-Consultar saldo. \n2-Realizar saque. \n3-Realizar depósito. \n4-Realizar empréstimo \n5- Sair"));
                                                        switch (acao2) {
                                                            case 1:
                                                                JOptionPane.showMessageDialog(null,
                                                                        "Seu saldo é de R$" + clientePF[contaAcesssada].getSaldo());
                                                                break;
                                                            case 2:
                                                                clientePF[contaAcesssada].saque();
                                                                break;
                                                            case 3:
                                                                clientePF[contaAcesssada].depósito();
                                                                break;
                                                            case 4:
                                                                clientePF[contaAcesssada].emprestimo();
                                                                break;
                                                            case 5:
                                                                acessoFuncoes = false;
                                                                acessoBusca = false;
                                                                sairConta = false;
                                                                break;
                                                            default:
                                                                JOptionPane.showMessageDialog(null,
                                                                        "ERRO! Digite uma opção válida.");
                                                                break;
                                                        } // fecha switch acao2
                                                    
                                                    } // fecha while acessoFuncoes
                                                    break;

                                                } // fecha if
                                                else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Conta não encontrada! Digite novamente.");
                                                    break;

                                                } // fecha else
                                            } // fecha for
                                            break;
                                        } // fecha while acessoBusca
                                        break;

                                    case 2: // Conta PF pesquisada por numero
                                        while (acessoBusca) {
                                            int numeroBusca = Integer.parseInt(JOptionPane
                                                    .showInputDialog("Informe o nome da Conta a ser buscada:"));
                                                    if (numeroBusca>0 && numeroBusca<=10000) {
                                                        
                                                    
                                            for (int j = 0; j < clientePF.length; ) {
                                                if (numeroBusca == clientePF[j].getnConta()) {
                                                    j = contaAcesssada;
                                                    JOptionPane.showMessageDialog(null, "Conta encontrada");
                                                    while (acessoFuncoes) {

                                                        int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                                                "Informe a ação desejada para a conta: \n1-Consultar saldo. \n2-Realizar saque. \n3-Realizar depósito. \n4-Realizar empréstimo \n5- Sair"));
                                                        switch (acao2) {
                                                            case 1:
                                                                JOptionPane.showMessageDialog(null,
                                                                        "Seu saldo é de R$" + clientePF[contaAcesssada].getSaldo());
                                                                break;
                                                            case 2:
                                                                clientePF[contaAcesssada].saque();
                                                                break;
                                                            case 3:
                                                                clientePF[contaAcesssada].depósito();
                                                                break;
                                                            case 4:
                                                                clientePF[contaAcesssada].emprestimo();
                                                                break;
                                                            case 5:
                                                                acessoFuncoes = false;
                                                                acessoBusca = false;
                                                                sairConta = false;
                                                                break;
                                                            default:
                                                                JOptionPane.showMessageDialog(null,
                                                                        "ERRO! Digite uma opção válida.");
                                                                break;
                                                        } // fecha switch acao2
                                                    } // fecha while acessoFuncoes
                                                    break;

                                                } // fecha if
                                                else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Conta não encontrada! Digite novamente.");
                                                    break;

                                                } // fecha else
                                            } // fecha for
                                        } // fecha if range
                                            break;
                                        } // fecha while acessoBusca
                                        break;

                                    default:
                                        JOptionPane.showMessageDialog(null,
                                                "ERRO! Digite uma opção válida.");
                                        break;

                                } // fecha switch metodoPesquisa
                                break;

                                case 2: // Acesso conta PF
                                 metodoPesquisa = Integer.parseInt(JOptionPane
                                        .showInputDialog(
                                                "Informe o método de pesquisa: \n1-Pesquisar por nome. \n2-Pesquisar por n° de conta."));
                                // lógica para buscar por numero e nome da conta
                            
                                switch (metodoPesquisa) {
                                    case 1: // Conta Pj pesquisada por nome
                                        while (acessoBusca) {
                                            String nomeBusca = JOptionPane
                                                    .showInputDialog("Informe o nome da Conta a ser buscada:");
                                            for (int k = 0; k < clientePj.length; ) {
                                                if (nomeBusca.equals(clientePj[k].getNome())) {
                                                    k = contaAcesssada;
                                                    JOptionPane.showMessageDialog(null, "Conta encontrada");
                                                    while (acessoFuncoes) {

                                                        int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                                                "Informe a ação desejada para a conta: \n1-Consultar saldo. \n2-Realizar saque. \n3-Realizar depósito. \n4-Realizar empréstimo \n5- Sair"));
                                                        switch (acao2) {
                                                            case 1:
                                                                JOptionPane.showMessageDialog(null,
                                                                        "Seu saldo é de R$" + clientePj[contaAcesssada].getSaldo());
                                                                break;
                                                            case 2:
                                                                clientePj[contaAcesssada].saque();
                                                                break;
                                                            case 3:
                                                                clientePj[contaAcesssada].depósito();
                                                                break;
                                                            case 4:
                                                                clientePj[contaAcesssada].emprestimo();
                                                                break;
                                                            case 5:
                                                                acessoFuncoes = false;
                                                                acessoBusca = false;
                                                                sairConta = false;
                                                                break;
                                                            default:
                                                                JOptionPane.showMessageDialog(null,
                                                                        "ERRO! Digite uma opção válida.");
                                                                break;
                                                        } // fecha switch acao2
                                                    
                                                    } // fecha while acessoFuncoes
                                                    break;

                                                } // fecha if
                                                else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Conta não encontrada! Digite novamente.");
                                                    break;

                                                } // fecha else
                                            } // fecha for
                                            break;
                                        } // fecha while acessoBusca
                                        break;

                                    case 2: // Conta Pj pesquisada por numero
                                        while (acessoBusca) {
                                            int numeroBusca = Integer.parseInt(JOptionPane
                                                    .showInputDialog("Informe o nome da Conta a ser buscada:"));
                                            for (int l = 0; l < clientePj.length; ) {
                                                if (numeroBusca == clientePj[l].getnConta()) {
                                                    l = contaAcesssada;
                                                    JOptionPane.showMessageDialog(null, "Conta encontrada");
                                                    while (acessoFuncoes) {

                                                        int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                                                "Informe a ação desejada para a conta: \n1-Consultar saldo. \n2-Realizar saque. \n3-Realizar depósito. \n4-Realizar empréstimo \n5- Sair"));
                                                        switch (acao2) {
                                                            case 1:
                                                                JOptionPane.showMessageDialog(null,
                                                                        "Seu saldo é de R$" + clientePj[contaAcesssada].getSaldo());
                                                                break;
                                                            case 2:
                                                                clientePj[contaAcesssada].saque();
                                                                break;
                                                            case 3:
                                                                clientePj[contaAcesssada].depósito();
                                                                break;
                                                            case 4:
                                                                clientePj[contaAcesssada].emprestimo();
                                                                break;
                                                            case 5:
                                                                acessoFuncoes = false;
                                                                acessoBusca = false;
                                                                sairConta = false;
                                                                break;
                                                            default:
                                                                JOptionPane.showMessageDialog(null,
                                                                        "ERRO! Digite uma opção válida.");
                                                                break;
                                                        } // fecha switch acao2
                                                    } // fecha while acessoFuncoes
                                                    break;

                                                } // fecha if
                                                else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Conta não encontrada! Digite novamente.");
                                                    break;

                                                } // fecha else
                                            } // fecha for
                                            break;
                                        } // fecha while acessoBusca
                                        break;

                                    default:
                                        JOptionPane.showMessageDialog(null,
                                                "ERRO! Digite uma opção válida.");
                                        break;

                                } // fecha switch metodoPesquisa
                                break;

                                default:
                                        JOptionPane.showMessageDialog(null,
                                                "ERRO! Digite uma opção válida.");
                                        break;

                        } // fecha switch tipoContaPesquisar
                    } // fecha while sairConta
                    break;
                case 3:
                    menu = false;

                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "ERRO! Digite uma opção válida.");
                    break;
            } // fecha switch acao
        } // fecha while menu
    }// fecha main
} // fecha App