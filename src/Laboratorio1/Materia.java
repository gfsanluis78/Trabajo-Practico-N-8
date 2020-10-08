package Laboratorio1;



public class Materia {
    private int idMateria;
    private String nombre;
    private int anio;

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria=idMateria;
        this.nombre=nombre;
        this.anio=anio;
        
    }

    public int geIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria=idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio=anio;
    }

    @Override //Sobreescribo el metodo equals para poder comparar dos objetos viendo solo el id
    public boolean equals(Object o) {
//        System.out.println("Comparo id's en el equals: "+idMateria+" "+((Materia)o).idMateria);           //Lo use para ver la compracion y probra la sobre escritura del metodo.
        if(!(o instanceof Materia) && o == null){   //si no es es tipo materia o es nulo, no es igual.
            return false;
        }else{
            if(idMateria==((Materia)o).idMateria){  //si el id del objeto comparable es igual al comparado, es el mismo objeto.
                return true;
            }else{
                return false;
            }
        }
    
    
    }

    @Override
    public int hashCode() {     //Se sobreescribe el metodo HashCode tambien poque dos objetos iguales tambien tienen que tener el mismo codigo hash
        return idMateria;
    }
    
    
}
