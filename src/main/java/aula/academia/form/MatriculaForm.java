package aula.academia.form;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {

	@NotNull(message = "Preencha o campo corretamente.")
	  @Positive(message = "O Id do aluno precisa ser positivo.")
	  private Long alunoId;
	
	
  public Long getAlunoId() {
		return alunoId;
	}

	public void setAlunoId(Long alunoId) {
		this.alunoId = alunoId;
	}
}

