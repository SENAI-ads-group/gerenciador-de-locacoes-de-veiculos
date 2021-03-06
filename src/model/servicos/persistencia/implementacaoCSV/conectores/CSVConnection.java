package model.servicos.persistencia.implementacaoCSV.conectores;

import model.exceptions.DBException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author patrick-ribeiro
 */
public class CSVConnection {

    private CustomWriter writer;
    private CustomReader reader;

    public CustomWriter writer() {
        if (writer == null) {
            throw new IllegalStateException("A conexão não foi aberta");
        }
        return writer;
    }

    public CustomReader reader() {
        if (reader == null) {
            throw new IllegalStateException("A conexão não foi aberta");
        }
        return reader;
    }

    public void open(String caminho) {
        try {
            writer = new CustomWriter(new FileWriter(caminho, true));
            reader = new CustomReader(new FileReader(caminho));
        } catch (IOException ex) {
            throw new DBException(ex.getMessage());
        }
    }

    public void open(File file) {
        try {
            writer = new CustomWriter(new FileWriter(file, true));
            reader = new CustomReader(new FileReader(file));
        } catch (IOException ex) {
            throw new DBException(ex.getMessage());
        }
    }

    public void close() {
        try {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        } catch (IOException ex) {
            throw new DBException(ex.getMessage());
        }
    }

}
