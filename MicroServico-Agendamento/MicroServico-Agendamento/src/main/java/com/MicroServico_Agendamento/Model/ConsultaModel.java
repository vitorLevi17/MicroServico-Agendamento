package com.MicroServico_Agendamento.Model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "consulta")
public class ConsultaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idMedico;
    private Long idPaciente;
    private String descricao;
    private Date diaHoraConsulta;
    //private Enum
}
