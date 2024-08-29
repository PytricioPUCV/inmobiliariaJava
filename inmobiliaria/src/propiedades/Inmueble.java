package propiedades;

public class Inmueble {
    /* Atributos */
    private int id;
    private double precio;
    private String direccion;
    private double mts2;
    private String claseDeZona;

    /* Constructor */
    public Inmueble(int id, double precio, String direccion, double mts2, String ClaseDeZona) {
        this.id = id;
        this.precio = precio;
        this.direccion = direccion;
        this.mts2 = mts2;
        this.claseDeZona = ClaseDeZona;
    }

    public Inmueble() {
        this.id = 0;
        this.precio = 0;
        this.direccion = "";
        this.mts2 = 0;
        this.claseDeZona = "";
    }

    /* Getter & Setter */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getMts2() {
        return mts2;
    }

    public void setMts2(double mts2) {
        this.mts2 = mts2;
    }

    public String getClaseDeZona() {
        return claseDeZona;
    }

    public void setClaseDeZona(String ClaseDeZona) {
        this.claseDeZona = ClaseDeZona;
    }

    /* Metodos */

    @Override
    public String toString() {
        return id + "," + precio + "," + direccion + "," + mts2 + "," + claseDeZona;
    }


}
