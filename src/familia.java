import java.util.ArrayList;

public class familia {
    private String apellido;
    ArrayList<Aldeano> guerreros = new ArrayList();

    public familia(String apellido){
        this.apellido=apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    }

}
