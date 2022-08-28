package entidades;

public class Empregado {

	private Integer id;
	private String nome;
	private Double salario;

	public Empregado() {
	}

	public Empregado(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public Double getSalary() {
		return salario;
	}

	public void setSalary(Double salario) {
		this.salario = salario;
	}

	public void increaseSalary(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}

	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
}