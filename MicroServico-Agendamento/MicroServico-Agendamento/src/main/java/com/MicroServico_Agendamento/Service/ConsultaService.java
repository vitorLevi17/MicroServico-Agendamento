package com.MicroServico_Agendamento.Service;

import com.MicroServico_Agendamento.DTO.ConsultaDTO;
import com.MicroServico_Agendamento.Model.ConsultaModel;
import com.MicroServico_Agendamento.Repository.ConsultaRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {
    private final ConsultaRepository repository;

    public ConsultaService(ConsultaRepository repository) {
        this.repository = repository;
    }
    public ConsultaDTO buscarAgendamento(Long id){
        //ADICIONAR EXCEPTION PERSONALIZADA
        ConsultaModel agendamento = repository.findById(id).orElseThrow(() -> new RuntimeException("Consulta não encontrada"));
        ConsultaDTO consulta = new ConsultaDTO(
                agendamento.getIdMedico(),
                agendamento.getIdPaciente(),
                agendamento.getDescricao(),
                agendamento.getDiaHoraConsulta(),
                agendamento.getStatus(),
                agendamento.getMotivoConsulta()
        );
        return consulta;
    }
}
