/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abrirpastas;

/**
 *
 * @author Aerocopias-Designer
 */

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class pastas {
       public void abrirpastadir(String caminho){
                  
        // Define o caminho do diretório a ser aberto
        String path = caminho; //variavel com o caminho do diretorio por parâmentro.
        
        // Cria um objeto File com o caminho especificado
        File dir = new File(path);
        
        // Verifica se o diretório existe
        if (dir.exists()) {
            try {
                // Abre o diretório usando o ambiente de trabalho padrão
                Desktop.getDesktop().open(dir);
            } catch (IOException e) {
                // Trata erros de I/O
                e.printStackTrace();
            }
        } else {
            System.out.println("O diretório especificado não existe.");
        }
       }
       public void aroeira(){

        abrirpastadir("Z:/Aero Copias - Aroeira/2023/Arte/maio");
       }
        //proxima
       
//        public void teste(){
//	System.out.println("Funcionando.");
//	}
       
        public void rede(){
	abrirpastadir("z:/");
	}
        public void redesSociaisIcones(){
	abrirpastadir("X:/redes sociais icones");
	}
        public void aaa(){
	abrirpastadir("C:/Users/Meu Computador/Desktop/Oi.txt");
	}
        public void tipografia(){abrirpastadir("C:/Users/Meu Computador/OneDrive/Todos truques de informatica/Edição Gráfica/Biblioteca/Tipografia_Fontes.txt");}
        public void teoria(){abrirpastadir("C:/Users/Meu Computador/OneDrive/Todos truques de informatica/Edição Gráfica/Biblioteca/Teoria Design.txt");}
        public void illustrator(){abrirpastadir("C:/Users/Meu Computador/OneDrive/Todos truques de informatica/Edição Gráfica/Biblioteca/illustrator.txt");}
        public void photoshop(){abrirpastadir("C:/Users/Meu Computador/OneDrive/Todos truques de informatica/Edição Gráfica/Biblioteca/Photoshop.txt");}
        public void coreldraw(){abrirpastadir("C:/Users/Meu Computador/OneDrive/Todos truques de informatica/Edição Gráfica/Biblioteca/Corel draw.txt");}
        public void bancodeimagens(){abrirpastadir("X:/");}
        public void pecas(){abrirpastadir("X:/peças redes sociais");}
   
    
}
