import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dadosCliente = new Scanner(System.in);
        System.out.println("Olá novo usuário, para iniciarmos você deve nos informar seu nome!");
        String nomeConta = dadosCliente.nextLine(); //nome
        System.out.println("Olá " + nomeConta + "! agora, precisamos que nos informe qual tipo de conta deseja! se Conta Corrente, poupança, de pagamento ou salário!");
        String declareTipoDeConta = dadosCliente.nextLine(); // tipo de conta
        System.out.println("Agora, para finalizarmos seus dados, precisamos que insira seu depósito inicial da conta!");
        double depositoInicial = dadosCliente.nextDouble(); // dinheiro da conta

        //Dados pessoais do usuário
        System.out.println("********************************\n" +
                "Dados iniciais do cliente:\n" +
                "Nome:          " + nomeConta + "\n" +
                "Tipo de conta: " + declareTipoDeConta + "\n" +
                "Saldo Inicial: " + depositoInicial + "\n" +
                "********************************");


        while (true) {
            //opções de interação
            System.out.println("1- Consultar saldos\n" +
                    "2- Receber valor\n" +
                    "3- Transferir valor\n" +
                    "4- Sair\n" +
                    "\n" +
                    "Digite a opção desejada:");
            int menuUsuario = dadosCliente.nextInt();
            switch (menuUsuario) {
                case 1:
                    System.out.println("Seu saldo é de: R$"+ depositoInicial);
                    break;
                case 2:
                    System.out.println("Quanto irá receber?");
                    double movimentacaoDeSaldo = dadosCliente.nextDouble();
                    double reciboDeValor = (depositoInicial + movimentacaoDeSaldo);
                    depositoInicial = reciboDeValor;
                    System.out.println("Seu novo saldo é de: R$" + reciboDeValor);
                    break;
                case 3:
                    System.out.println("Quanto deseja transferir?");
                    double trasnferenciaDeSaldo = dadosCliente.nextDouble();
                    if(trasnferenciaDeSaldo <= depositoInicial) {
                        double transferencia = (depositoInicial - trasnferenciaDeSaldo);
                        depositoInicial = transferencia;
                        System.out.println("Seu novo saldo é de: R$" + transferencia);
                        break;
                    } else {
                        System.out.println("infelizmente não possui esta quantia na conta\n " +
                                "Sua conta possui o saldo de : R$" + depositoInicial);
                        break;
                    }
                case 4:
                    System.out.println("seu saldo é: R$" + depositoInicial);
                    System.out.println("Até a próxima " + nomeConta + "!");
                    dadosCliente.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("resposta inválida");
                    break;
            }

        }
    }
}