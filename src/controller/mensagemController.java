/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 182210133
 */
public class mensagemController {
    public boolean validaMensagem(String mensagem){
        return mensagem!=null;
    }
    public void inputMensagem(String mensagem){
        try {
            FileWriter fw = new FileWriter("src/mensagem.txt");
            fw.write(mensagem);
            fw.close();
        } catch (IOException e) {
            System.out.println("Erro na escrita do arquivo "+e.getMessage());
        }
    }
}
