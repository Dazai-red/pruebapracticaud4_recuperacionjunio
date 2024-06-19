package org.iesvdm.reservamesa;

//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class ReservaMesaTest {
        ReservaMesa reservaMesa =  new ReservaMesa();
    @BeforeEach
     void setMesasYTamanioMesas(){
        reservaMesa.setTamanioMesa(4);
        int[] mesas = {1,0,3,4,3,7};
        reservaMesa.setMesas(mesas);
    }
    @Test
    void failTest() {
        //fail("TEST SIN IMPLEMENTAR");
    }

    @Test
    void buscarPrimeraMesaVaciaTest(){
        int indice=reservaMesa.buscarPrimeraMesaVacia();
        Assertions.assertThat(indice==1);
    }
    @Test
    void buscarMesaParaCompartirTest(){
        int indice=reservaMesa.buscarMesaParaCompartir(3);
        Assertions.assertThat(indice==3);
    }
    @Test
    void buscarMesaCompartirMasCercaDeDerechaTest(){
        int indice = reservaMesa.buscarMesaCompartirMasCercaDe(3,5);
        Assertions.assertThat(indice==5);
    }
    @Test
    void buscarMesaCompartirMasCercaDeIzquierdaTest(){
        int indice = reservaMesa.buscarMesaCompartirMasCercaDe(3,3);
        Assertions.assertThat(indice==2);
    }

    @Test
    void  buscarMesaCompartirMasCercaDeNoEncontrado(){
        int indice = reservaMesa.buscarMesaCompartirMasCercaDe(3,10);
        Assertions.assertThat(indice==-1);
    }

    @Test
    void buscarCompartirNMesasConsecutivasIzquierdaTest(){
        int indice =  reservaMesa.buscarCompartirNMesasConsecutivas(1,3);
        Assertions.assertThat(indice==2);
    }
    @Test
    void buscarCompartirNMesasConsecutivasDerechaTest(){
        int indice =  reservaMesa.buscarCompartirNMesasConsecutivas(2,3);
        Assertions.assertThat(indice==5);
    }

    @Test
    void comensalesTotalesTest(){
        int totalComensales=reservaMesa.comensalesTotales();
        Assertions.assertThat(totalComensales==18);
    }

    @Test
    void getMesasTest(){
        int[] mesas2=reservaMesa.getMesas();
        Assertions.assertThat(mesas2.equals(mesas2));
    }

    @Test
    void getTamanioMesasTest(){
        int tamanioMesas=reservaMesa.getTamanioMesa();
        Assertions.assertThat(tamanioMesas==4);
    }



}
