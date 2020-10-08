package Laboratorio1;



import java.util.HashSet;
import java.util.Iterator;

public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    
    private HashSet materias=new HashSet();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo=legajo;
        this.apellido=apellido;
        this.nombre=nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo=legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido=apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void agregarMateria(Materia m) {
        if(materias.add(m)){               //aca remplace materias.contains(m) por materia.add(m) porque sobreescribi el metodo equals 
            System.out.println(this.apellido+" fue inscripto con exito en la Materia "+m.getNombre());
    }else{
            System.out.println("!!"+this.apellido+" No se puede inscribir mas de una vez en la Materia "+m.getNombre());
        }
    }

    public int cantidadMaterias() {
        Iterator it=materias.iterator();
        int cant=0;
        while(it.hasNext()){
            it.next();
            cant++;
        }
        return cant;
    }
}
