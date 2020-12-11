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
public class admi_programas {

    ArrayList<programas> progra = new ArrayList();
    File archivo = null;

    public void admi_programas(String path) {
        archivo = new File(path);
    }

    public ArrayList<programas> getProgra() {
        return progra;
    }

    public void setProgra(ArrayList<programas> progra) {
        this.progra = progra;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return progra + "";
    }

    public void setProgramas(programas p) {
        this.progra.add(p);
    }

    public void escribeArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (programas c : progra) {
                bw.write(c.getNombre() + "/");
                bw.write(c.getGenero() + "/");
                bw.write(c.getTipo() + "/");
                bw.write(c.getYear_lanzamiento() + "/");
                bw.write(c.getPuntuacion() + "/");

            }
            bw.flush();

        } catch (Exception e) {
        }
        bw.close();
        fw.close();

    }

    public void cargarArchivo() {
        Scanner sc = null;
        progra = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    progra.add(new programas(sc.next(), sc.nextInt(), sc.nextInt(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}
