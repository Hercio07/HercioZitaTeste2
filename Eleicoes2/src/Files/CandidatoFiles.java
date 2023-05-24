
package Files;

import Eleicoes.classes.Candidatos;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CandidatoFiles {

    // Usado para escrever os dados no ficheiro
    private ObjectOutputStream write = null;
    // Usado para ler os dados do ficheiro
    private ObjectInputStream read = null;
    // Criar o ficheiro 
    private File fileCandidatos = new File("candidatos.dat");
    private ArrayList<Candidatos> listaCandidatos = new ArrayList<>();

    // Regista um novo candidato
    public void registarCandidato(Candidatos candidato) {
        try {
            // Verificar se o ficheiro existe
            if (fileCandidatos.isFile()) {
                // Ler os dados do ficheiro
                read = new ObjectInputStream(new FileInputStream(fileCandidatos));
                // Adicionar os dados ao ArrayList lista de candidatos
                listaCandidatos = (ArrayList<Candidatos>) read.readObject();
                // Fechar o Stream
                read.close();
            }

            // Adicionar o novo candidato à lista
            listaCandidatos.add(candidato);
            write = new ObjectOutputStream(new FileOutputStream(fileCandidatos));
            // Adicionar a lista actualizada ao ficheiro
            write.writeObject(listaCandidatos);
            // Fechar o stream
            write.close();
            JOptionPane.showMessageDialog(null, "Candidato registado com sucesso!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    // Retorna um ArrayList com os candidatos
    public ArrayList<Candidatos> listarCandidatos() {
        try {
            // Verificar se o ficheiro existe
            if (fileCandidatos.isFile()) {
                // Ler os dados do ficheiro
                read = new ObjectInputStream(new FileInputStream(fileCandidatos));
                // Adicionar os dados ao ArrayList lista de candidatos
                listaCandidatos = (ArrayList<Candidatos>) read.readObject();
                // Fechar o Stream
                read.close();
                return listaCandidatos;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao Listar Clientes: " + e.getMessage());
        }
        return null;
    }
    
    // Remover candidato 
    


}

