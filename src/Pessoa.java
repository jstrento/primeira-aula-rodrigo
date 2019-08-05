
public class Pessoa {
	
	private String nome;
	private String sobrenome; 
	private Integer idade;
    private Integer altura;
    private Integer peso; 
    
  public Pessoa(String nome, String sobrenome, Integer idade, Integer altura, Integer peso) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

public Pessoa() { // Método constructor vazio
	super();
}

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

public Integer getIdade() {
	return idade;
}

public void setIdade(Integer idade) {
	this.idade = idade;
}

public Integer getAltura() {
	return altura;
}

public void setAltura(Integer altura) {
	this.altura = altura;
}

public Integer getPeso() {
	return peso;
}

public void setPeso(Integer peso) {
	this.peso = peso;
}
	
	
}
