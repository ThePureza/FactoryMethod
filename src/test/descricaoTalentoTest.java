package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DescricaoTalentoTest {

    @Test
    void deveDescreverItem() {
        IDescricao descricao = DescricaoFactory.obterDescricao("Talento");
        assertEquals("Descrição de um Talento", descricao.descreve());
    }

    @Test
    void deveCancelarDescricaoItem() {
        IDescricao descricao = DescricaoFactory.obterDescricao("Talento");
        assertEquals("Descrição do Talento cancelado", descricao.cancela());
    }

}
