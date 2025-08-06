public class caixaEletronico {

    public static void main(String[] args) {
        double saldo = 25.00;
        double saque = 26.00;

        if (saque <= saldo) {
            saldo -= saque;
            System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
}
}