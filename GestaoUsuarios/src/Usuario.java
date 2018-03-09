import java.time.LocalDate;

public class Usuario {
	// Atributos
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private String sexo;
	private LocalDate dataNascimento;
	
	
	// Metodo ToString
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", email=" + email + ", sexo="
				+ sexo + ", dataNascimento=" + dataNascimento + "]";
	}
	
	// Metodo Construtor
	public Usuario(String nome, String sobrenome, String cpf, String email, String sexo, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.email = email;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}
	
	// Metodos Get's & Set's
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	

}
