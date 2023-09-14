
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import model.Mensagem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 182210133
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Mensagem m= new Mensagem();
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
