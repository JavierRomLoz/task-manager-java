import java.util.ArrayList;

public class GestorTarea {
    private ArrayList<Tarea> tareas = new ArrayList<>();

    public void crear(String name, String description, String date, Status status){
        Tarea tareaNueva = new Tarea(name, description, date, status);
        tareas.add(tareaNueva);
    }

    public void listar(){
        for(int i = 0; i <= tareas.size() -1; i++){
            System.out.println((i+1) + (". ") + tareas.get(i));
        }
    }
    


    //public void borrar
}
