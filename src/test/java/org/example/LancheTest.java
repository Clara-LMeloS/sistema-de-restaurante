package org.example;
import org.example.nivel1.cardapio.ItemCardapio;
import org.example.nivel1.cardapio.ComCheddar;
import org.example.nivel1.cardapio.LancheFactory;
import org.example.nivel1.cardapio.Lanche;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LancheTest {
    @Test
    void xBaconComCheddarCusta26() {
        ItemCardapio lanche = new ComCheddar(LancheFactory.xBacon());
        assertEquals(26.0, lanche.getPreco(), 0.001);
    }

    @Test
    void precoNegativoDeveSerRecusado() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Lanche("X-Bacon", -1.0);
        });
    }


    }

