import java.util.ArrayList;

public class familia {
    private String apellidofamiliar;
    ArrayList<Aldeano> lista = new ArrayList();

    public familia(String apellidofamiliar){
        this.apellidofamiliar=apellidofamiliar;
    }

    public String getApellidofamiliar() {
        return apellidofamiliar;
    }

    public void setApellidofamiliar(String apellidofamiliar) {
        this.apellidofamiliar = apellidofamiliar;
    }
    public ArrayList<Aldeano> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        return "familia{" + "apellidofamiliar='" + apellidofamiliar + '\'' + ", lista=" + lista + '}';
    }
}



