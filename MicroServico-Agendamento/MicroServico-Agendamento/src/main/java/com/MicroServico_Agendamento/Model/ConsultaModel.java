package com.MicroServico_Agendamento.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "consulta")
public class ConsultaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idMedico;
    private Long idPaciente;
    private String descricao;
    private LocalDateTime diaHoraConsulta;
    @Enumerated(EnumType.STRING)
    private StatusConsulta status;
    private String motivoConsulta;
}
