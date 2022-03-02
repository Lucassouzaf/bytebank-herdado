
public class testaFuncionario {
	
	public static void main(String[] args) {
		
		Cliente cli = new Cliente();
		cli.autentica(2222)
;
		Gerente lucas = new Gerente();
		lucas.setNome("Lucas Souza");
		lucas.setCpf("044.152.510-56");
		lucas.setSalario(2500); 
		
		System.out.println(lucas.getNome());
		System.out.println(lucas.getCpf());
		System.out.println(lucas.getSalario());
		System.out.println(lucas.getBonificacao());
	}
}
