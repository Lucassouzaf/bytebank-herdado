//Contrato Autenticavel do sistema
//quem assina, deve implementar OBRIGATÓRIAMENTE
// metodos SetSenha
// metodo autentica
//comentário teste


public abstract interface Autenticavel{
	
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}
