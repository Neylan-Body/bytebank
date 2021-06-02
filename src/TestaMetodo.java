
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoNeylan = new Conta();
		contaDoNeylan.deposita(500);
		System.out.println(contaDoNeylan.getSaldo());
		if(contaDoNeylan.saca(20)) {
			System.out.println("Saque concluido");
		}else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println("Conta de Neylan "+contaDoNeylan.getSaldo());
		
		Conta contaDaMarcela = new Conta();
		if(contaDoNeylan.transfere(300, contaDaMarcela)) {
			System.out.println("Transferencia concluida");
		}else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println("Conta de Neylan "+contaDoNeylan.getSaldo());
		System.out.println("Conta de Marcela "+contaDaMarcela.getSaldo());
	}
}
