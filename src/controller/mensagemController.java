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
            FileWriter fw = new FileWriter("src/mensagem.txt",true);
            fw.write(mensagem+"\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Erro na escrita do arquivo "+e.getMessage());
        }
    }
    public String outputMensagem(){
        Mensagem m= new Mensagem();
        try {
            
            Random random = new Random();
            FileReader fr = new FileReader("src/mensagem.txt");
            BufferedReader bf= new BufferedReader(fr);
            String line=bf.readLine();
            int cont=0;
            while(line!=null){
                m.setMensagem(line);
                cont++;
                line=bf.readLine();
                int i =random.nextInt(2);
                if(i % 2 == 0){
                    return m.getMensagem();
                }
            }
            bf.close();
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo "+e.getMessage());
        }
        return m.getMensagem();
    }
}
