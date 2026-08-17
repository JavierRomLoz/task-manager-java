public class Tarea {
    private String name;
    private String description;
    private String date;
    private Status status;

    //CONSTRUCTOR
    public Tarea(String name, String description, String date, Status status){
        this.name = name;
        this.description = description;
        this.date = date;
        this.status = status;
    }
    //GETTERS Y SETTERS
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return date;
    }
    public void setStatus(Status status){
        this.status = status;
    }
    public Status getStatus(){
        return status;
    }
}