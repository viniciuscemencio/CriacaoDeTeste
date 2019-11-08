package com.example.regradetres;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculaTest {

    Calcula calc;

    @Before
    public void setup(){ calc = new Calcula();}

    @Test
    public void CalculaDireta() {
        assertEquals
                (4,
                        calc.CalculaRegra(50.0,2.0,100.0),0.01);


    }

    @Test
    public void CalculaInversa() {
        assertEquals
                (1,
                        calc.CalculaRegraInversa(50.0,2.0,100.0),0.01);


    }




    @Test
    public void CalculaSoma(){
        assertEquals
                (10,
                        calc.CalculaSoma(5.0,5.0), 0.01);
    }

    @Test
    public void CalculaSomaNegativa(){
        assertEquals
                (0,
                        calc.CalculaSoma(-5.0,5.0), 0.01);
    }

    @Test
    public void CalculaSomaZero(){
        assertEquals
                (5,
                        calc.CalculaSoma(5.0,0.0), 0.01);
    }

    @Test
    public void CaculaSomaDecimal(){
        assertEquals
                (10.2, calc.CalculaSoma(5.1,5.1), 0.01);
    }

    @Test
    public void CalculaSubtracao(){
        assertEquals
                (0,
                        calc.CalculaSubtracao(5.0,5.0), 0.01);
    }

    @Test
    public void CalculaSubtracaoNegativa(){
        assertEquals
                (-10,
                        calc.CalculaSubtracao(-5.0,5.0), 0.01);
    }

    @Test
    public void CalculaSubtracaoZero(){
        assertEquals
                (5,
                        calc.CalculaSubtracao(5.0,0.0), 0.01);
    }

    @Test
    public void CaculaSubtracaoDecimal(){
        assertEquals
                (0.1, calc.CalculaSubtracao(5.1,5.0), 0.01);
    }


    @Test
    public void CalculaMultiplicacao(){
        assertEquals
                (25,
                        calc.CalculaMultiplicacao(5.0,5.0), 0.01);
    }

    @Test
    public void CalculaMultiplicacaoNegativa(){
        assertEquals
                (-25,
                        calc.CalculaMultiplicacao(-5.0,5.0), 0.01);
    }

    @Test
    public void CalculaMultiplicacaoZero(){
        assertEquals
                (0,
                        calc.CalculaMultiplicacao(5.0,0.0), 0.01);
    }

    @Test
    public void CaculaMultiplicacaoDecimal(){
        assertEquals
                (26.01, calc.CalculaMultiplicacao(5.1,5.1), 0.01);
    }

    @Test
    public void CalculaDivisao(){
        assertEquals
                (1,
                        calc.CalculaDivisao(5.0,5.0), 0.01);
    }

    @Test
    public void CalculaDivisaoNegativa(){
        assertEquals
                (-1,
                        calc.CalculaDivisao(-5.0,5.0), 0.01);
    }

    @Test
    public void CaculaDivisaoDecimal(){
        assertEquals
                (1.02, calc.CalculaDivisao(5.1,5.0), 0.01);
    }




}

