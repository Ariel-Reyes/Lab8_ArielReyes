/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_arielreyes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ariel
 */
public class admi_claudia_lista {

    ArrayList<claudilist> lista_claus = new ArrayList();
    File archivo = null;

   public admi_claudia_lista(String path) {
        archivo = new File(path);
    }

    public ArrayList<claudilist> getLista_claus() {
        return lista_claus;
    }

    public void setLista_claus(ArrayList<claudilist> lista_claus) {
        this.lista_claus = lista_claus;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "admi_claudia_lista{" + "lista_claus=" + lista_claus + ", archivo=" + archivo + '}';
    }

   
    
    public void escribeArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (claudilist c : lista_claus) {
                bw.write(c.getNombre() + "/");
                for (programas z : c.getProgra()) {
                    bw.write(z.getNombre() + "/");
                    bw.write(z.getGenero() + "/");
                    bw.write(z.getPuntuacion() + "/");
                    bw.write(z.getTipo() + "/");
                    bw.write(z.getYear_lanzamiento() + "/");
                }

            }
            bw.flush();

        } catch (Exception e) {
        }
        bw.close();
        fw.close();

    }
    
    
    public void cargarArchivo() {
        Scanner sc = null;
        lista_claus = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    lista_claus.add(new claudilist(sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
    

}
