package com.MicroServico_Agendamento.Model;

import com.MicroServico_Agendamento.DTO.ConsultaDTO;
import com.MicroServico_Agendamento.DTO.ConsultaResponse;
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

    public ConsultaModel() {
    }

    public ConsultaModel(ConsultaDTO consultaDTO) {
        this.idMedico = consultaDTO.idMedico();
        this.idPaciente = consultaDTO.idPaciente();
        this.descricao = consultaDTO.descricao();
        this.diaHoraConsulta = consultaDTO.diaHoraConsulta();
        this.status = StatusConsulta.ABERTO;
        this.motivoConsulta = consultaDTO.motivoConsulta();
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDiaHoraConsulta() {
        return diaHoraConsulta;
    }

    public StatusConsulta getStatus() {
        return status;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }
}
