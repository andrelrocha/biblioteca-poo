package rocha.andre.project.domain.emprestimo.DTO;

import jakarta.validation.constraints.NotNull;


public record EmprestimoDTO(
        @NotNull
        Long user_id,
        @NotNull
        Long livro_id
) {
}
