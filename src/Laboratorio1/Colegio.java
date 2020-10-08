package Laboratorio1;


public class Colegio {

    public static void main(String[] args) {
        //Crear las materias
        Materia ingles = new Materia(1,"Ingles 1", 1);
        Materia matematicas = new Materia(2,"Matematias",1);
        Materia laboratorio1 = new Materia(3,"Laboratorio 1", 1);
        Materia laboratorio_1= new Materia(3,"Laboratorio_1",1);
        
           
        //Crear 2 alumnos
        Alumno alu1= new Alumno(1001,"Lopez", "Martin");
        Alumno alu2= new Alumno(1002,"Martinez", "Brenda");
        
        //Incribir a Lopez en 3 materias
        alu1.agregarMateria(ingles);
        alu1.agregarMateria(matematicas);
        alu1.agregarMateria(laboratorio1);
        alu1.agregarMateria(laboratorio_1);
        
//        System.out.println(laboratorio_1.equals(laboratorio1)); //Pruebo la sobrescritura del metodo equals y hascode.
        
        //Inscribir a Martinez en tres materias y volver a inscribirlo en laboratorio
        alu2.agregarMateria(ingles);
        alu2.agregarMateria(matematicas);
        alu2.agregarMateria(laboratorio1);
        alu2.agregarMateria(laboratorio1);
                
       //Visualizar la cantidad de materias que esta inscripto cada alumno
        System.out.println("El alumno "+alu1.getApellido()+" "+" esta inscripto en "+alu1.cantidadMaterias()+" materias.");
        System.out.println("El alumno "+alu2.getApellido()+" "+" esta inscripto en "+alu2.cantidadMaterias()+" materias.");
    }
    
}

        
    
    

