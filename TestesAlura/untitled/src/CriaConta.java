public class CriaConta {
    public static void main(String[] args){
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("prirmeira conta tem; " + primeiraConta.saldo);
        System.out.println("segunda conta tem: " + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        System.out.println(primeiraConta.titular);

        Conta terceiraConta = primeiraConta;
        System.out.println("saldo da terceira conta: " + terceiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println("saldo da primeira conta: " + primeiraConta.saldo);

        System.out.println(terceiraConta.saldo);

        if(primeiraConta == terceiraConta){
            System.out.println("mesma conta");
        }
        System.out.println(primeiraConta);
        System.out.println(terceiraConta);
        System.out.println(segundaConta);
    }
}
