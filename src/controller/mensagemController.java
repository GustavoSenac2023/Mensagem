/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import model.Mensagem;

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
    public void outputMensagem(){
        try {
            Mensagem m= new Mensagem();
            Random random = new Random();
            FileReader fr = new FileReader("src/mensagem.txt");
            BufferedReader bf= new BufferedReader(fr);
            String line=bf.readLine();
            while(line!=null){
                m.setMensagem(line);
                System.out.println(m.getMensagem());
                line=bf.readLine();
            }
            bf.close();
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo "+e.getMessage());
        }
    }
}
