/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 182210133
 */
public class Mensagem {
    private String mensagem;

    public Mensagem() {
    }

    public Mensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
}
