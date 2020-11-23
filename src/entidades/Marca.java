package entidades;

import java.util.Objects;
import util.Utilities;

/**
 *
 * @author usuario
 */
public class Marca {

    private Integer id;
    private String descricao;

    public Marca(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Marca(String descricao) {
        this.descricao = descricao;
    }

    public Marca(String[] csv) {
        id = Utilities.tryParseToInteger(csv[0]);
        descricao = csv[1];
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toCSV() {
        return "" + id + ";"
                + descricao;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Marca other = (Marca) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

}
