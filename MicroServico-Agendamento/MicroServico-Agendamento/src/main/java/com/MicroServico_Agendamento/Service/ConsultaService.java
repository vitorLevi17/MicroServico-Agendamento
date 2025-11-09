package com.MicroServico_Agendamento.Service;

import com.MicroServico_Agendamento.DTO.ConsultaDTO;
import com.MicroServico_Agendamento.DTO.ConsultaResponse;
import com.MicroServico_Agendamento.Model.ConsultaModel;
import com.MicroServico_Agendamento.Repository.ConsultaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ConsultaService {
    private final ConsultaRepository repository;

    public ConsultaService(ConsultaRepository repository) {
        this.repository = repository;
    }
    public ConsultaResponse buscarAgendamento(Long id){
        //ADICIONAR EXCEPTION PERSONALIZADA
        ConsultaModel agendamento = repository.findById(id).orElseThrow(() -> new RuntimeException("Consulta não encontrada"));
        ConsultaResponse consulta = new ConsultaResponse(
                agendamento.getIdMedico(),
                agendamento.getIdPaciente(),
                agendamento.getDescricao(),
                agendamento.getDiaHoraConsulta(),
                agendamento.getStatus(),
                agendamento.getMotivoConsulta()
        );
        return consulta;
    }

    public ConsultaModel criarAgendamento(ConsultaDTO request){

        if (!request.diaHoraConsulta().isAfter(LocalDateTime.now())){ //ADICIONAR 1 DIA
            throw new IllegalArgumentException("A data da consulta deve ser no futuro.");
        }
        if (request.idMedico().equals(request.idPaciente())){
            throw new RuntimeException("O paciente não pode se atender");
        }
        ConsultaModel consultaModel = new ConsultaModel(request);
        return repository.save(consultaModel);
    }
}
