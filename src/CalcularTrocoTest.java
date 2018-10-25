
//**********************************************************************
// Copyright (c) 2018 Telefonaktiebolaget LM Ericsson, Sweden.
// All rights reserved.
// The Copyright to the computer program(s) herein is the property of
// Telefonaktiebolaget LM Ericsson, Sweden.
// The program(s) may be used and/or copied with the written permission
// from Telefonaktiebolaget LM Ericsson or in accordance with the terms
// and conditions stipulated in the agreement/contract under which the
// program(s) have been supplied.
// **********************************************************************

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcularTrocoTest
{

    @Test
    public void calculaTrocoTodasNotas()
    {
        CalcularTroco newCalcularTroco = new CalcularTroco();
        newCalcularTroco.calcularTroco(1, 167.66);
        assertEquals(newCalcularTroco.nota100, 1);
        assertEquals(newCalcularTroco.nota50, 1);
        assertEquals(newCalcularTroco.nota10, 1);
        assertEquals(newCalcularTroco.nota5, 1);
        assertEquals(newCalcularTroco.nota1, 1);

        assertEquals(newCalcularTroco.moeda50, 1);
        assertEquals(newCalcularTroco.moeda10, 1);
        assertEquals(newCalcularTroco.moeda5, 1);
        assertEquals(newCalcularTroco.moeda1, 1);

        newCalcularTroco.exibirResultados();

        newCalcularTroco.main(null);
    }

    @Test
    public void calculaTrocoNegativo()
    {
        CalcularTroco newCalcularTroco = new CalcularTroco();
        assertEquals(newCalcularTroco.calcularTroco(10, 8), "Valor Insuficiente");
    }

}
