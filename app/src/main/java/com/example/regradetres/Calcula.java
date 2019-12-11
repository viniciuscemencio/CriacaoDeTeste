package com.example.regradetres;

import android.widget.Toast;

public class Calcula {
    public Double CalculaRegra(Double a, Double b, Double c) {

        return (b * c)/a;

    }
    public Double CalculaRegraInversa (Double a, Double b, Double c){
        return (a * b)/c;
    }



    public Double CalculaSoma(Double a, Double b){
        return  a + b;
    }
    public Double CalculaSubtracao(Double a, Double b){
        return  a - b;
    }
    public Double CalculaMultiplicacao(Double a, Double b){
        return  a * b;
    }
    public Double CalculaDivisao(Double a, Double b){ return  a / b; }
}
