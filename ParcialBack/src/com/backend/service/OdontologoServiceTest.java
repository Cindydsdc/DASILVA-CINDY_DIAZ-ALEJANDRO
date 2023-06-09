package com.backend.service;

import com.backend.dao.impl.OdontologoDaoH2;
import com.backend.entity.Odontologo;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {
  private static Connection connection = null;

  private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @Test
    public void deberiaAgregarUnOdontologo(){
      Odontologo odontologoTest = new Odontologo(216652 , "Maria", "Solsire");

      Odontologo odontologoResult = odontologoService.registrarOdontologo(odontologoTest);

      assertNotNull(odontologoResult);
      assertEquals(216652, odontologoResult.getMatricula());
    }


    @Test
    public void deberiaListarTodosLosOdontologos() {
      List<Odontologo> odontologosTest = odontologoService.listarOdontologos();
      assertFalse(odontologosTest.isEmpty());
    }
}
