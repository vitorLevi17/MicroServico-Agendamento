package com.MicroServico_Agendamento.Repository;

import com.MicroServico_Agendamento.Model.ConsultaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<ConsultaModel,Long> {
}
