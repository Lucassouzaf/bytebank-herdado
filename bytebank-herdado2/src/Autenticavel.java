//Contrato Autenticavel do sistema
//quem assina, deve implementar OBRIGAT�RIAMENTE
// metodos SetSenha
// metodo autentica


public abstract interface Autenticavel{
	
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}
