
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.setSaldo(300);
		
		System.out.println("Saldo da primeira "+ primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
	}

}
