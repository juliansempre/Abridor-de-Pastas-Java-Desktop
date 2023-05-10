package com.mycompany.abrirpastas;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.File;
import javax.swing.JOptionPane;

public class Limpeza {

    public static void main(String[] args) {
        try {
            //comando cmd aqui
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cleanmgr");
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //DELETAR DONLOADS
        String[] directories = {"C:\\Users\\MEUCOM~1\\AppData\\Local\\Temp\\", "C:\\Users\\Meu Computador\\Downloads\\"};
        boolean allDeleted = true;
        for (String directory : directories) {
            File folder = new File(directory);
            if (folder.exists()) {
                File[] files = folder.listFiles();
                if (files != null) {
                    for (File file : files) {
                        if (file.isFile()) {
                            boolean deleted = file.delete();
                            if (!deleted) {
                                allDeleted = false;
                            }
                        }
                    }
                }
            }
        }
        if (allDeleted) {
            JOptionPane.showMessageDialog(null, "Todos os arquivos foram excluídos com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Alguns arquivos não puderam ser excluídos.");
        }
    }
}
