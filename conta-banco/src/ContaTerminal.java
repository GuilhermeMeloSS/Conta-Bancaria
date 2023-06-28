import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("Digite a agência: ");
        String agencia = sc.next();
        System.out.println("Digite o saldo: ");
        float saldo = sc.nextFloat();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.next();
     
      
        System.out.printf("Olá " +  nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é  " + agencia + "  , conta " + numeroConta + " e seu saldo de " + saldo + "  já está para saque.");








    }
}
