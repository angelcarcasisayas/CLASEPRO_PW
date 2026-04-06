package ejercicios.clases.ejercici;

public class Persona {
    private String names;
    private int ages;

    public Persona(String names, int ages){
        this.names=names;
        this.ages= ages;

    }

    public void llamada(){
        System.out.println();
    }

    public String getNames() {
        return names;
    }
    public int getAges(){
        return ages;
    }
    public String setNames(){
        return names;
    }
    public void setAges(int ages){
        this.ages=ages;
    }

}


