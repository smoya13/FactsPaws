package evaluacion.smoya.factspaws;

public class ItemList {
    private final String Nombre;
    private String nombre;
    private String descripcion;
    private int imgResource;

    public ItemList(String nombre, String descripcion, int imgResource) {
        this.Nombre = nombre;
        this.descripcion = descripcion;
        this.imgResource = imgResource;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImgResource() {
        return imgResource;
    }
}
