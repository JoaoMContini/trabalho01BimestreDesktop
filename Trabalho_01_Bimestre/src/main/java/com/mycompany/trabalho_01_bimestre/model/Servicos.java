/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_01_bimestre.model;

/**
 *
 * @author joaoc
 */
public class Servicos {
    private int[] idServicos  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private String[]descricao = {"Alinhamento", "Balanceamento", "Troca de pneus", "Trocar vela", "Troca de óleo",
                                 "Troca de bomba", "Troca de filtro de Ar", "Troca de fluído", "Troca de água", "Calibrar pneu"};
    private double[] preco = {50, 60, 150, 180, 300, 550, 340, 65, 20, 10};

    public int[] getIdServicos() {
        return idServicos;
    }

    public void setIdServicos(int[] idServicos) {
        this.idServicos = idServicos;
    }

    public String[] getDescricao() {
        return descricao;
    }

    public void setDescricao(String[] descricao) {
        this.descricao = descricao;
    }

    public double[] getPreco() {
        return preco;
    }

    public void setPreco(double[] preco) {
        this.preco = preco;
    }

    
    
    
    
    
}
