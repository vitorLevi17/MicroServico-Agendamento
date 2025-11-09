package com.MicroServico_Agendamento.DTO;

import com.MicroServico_Agendamento.Model.StatusConsulta;
import java.time.LocalDateTime;

public record ConsultaResponse(
         Long idMedico,
         Long idPaciente,
         String descricao,
         LocalDateTime diaHoraConsulta,
         StatusConsulta status,
         String motivoConsulta
) {
}
