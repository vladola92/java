public class Dog {

    private String culoare;
    private int varsta;
    private float greutate;
    private String rasa;
    private String nume;

//    Dog(String color, int varsta, float greutate, String rasa, String nume) {
//        this.culoare = color;
//        this.varsta = varsta;
//        this.greutate = greutate;
//        this.rasa = rasa;
//        this.nume = nume;


    }
public void seteazaNume(String nume){
        this.nume = nume;

}

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return this.nume;
    }

    public void alearga() {
        System.out.println("Cainele latra");
    }

    public void mananca() {
        System.out.println(("Cainele mananca, mananca, mananca"));
    }

    public void latra() {
        System.out.println("Ham!");


    }
}

