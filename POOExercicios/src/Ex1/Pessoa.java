package Ex1;

public class Pessoa {

	// definindo atributos
	private String nome;
	private String email;
	private String telefone;
	
	//m�todo constructor
	public Pessoa(String nome, String email, String telefone)
	{
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	//fim constructor


	//inicio getters and setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	//fim dos getters e setters
	
	//m�todos
	public void ImprimeCartao() {
		System.out.println("\n"+getNome()+"\n\n"+getEmail()+"\n\n"+"telefone: "+getTelefone());
	}
	
}
