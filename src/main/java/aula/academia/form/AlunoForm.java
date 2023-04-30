package aula.academia.form;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.*;
import jakarta.validation.constraints.Size;


import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AlunoForm {

	@Setter
	@Getter
  @NotEmpty(message = "Preencha o campo corretamente.")
  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;

	@Setter
	@Getter
  @NotEmpty(message = "Preencha o campo corretamente.")
  //@CPF(message = "'${validatedValue}' é inválido!")
  private String cpf;

	

	@Setter
	@Getter
  @NotEmpty(message = "Preencha o campo corretamente.")
  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String bairro;

	@Setter
	@Getter
  @NotNull(message = "Prencha o campo corretamente.")
  @Past(message = "Data '${validatedValue}' é inválida.")
  private LocalDate dataDeNascimento;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

}
