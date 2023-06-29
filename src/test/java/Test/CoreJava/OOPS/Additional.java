package Test.CoreJava.OOPS;

public class Additional {
    private String tomato;
    private String carrot;
    private String lettuce;
    private String burgerType;


    public Additional(String tomato, String carrot, String lettuce, String burgerType) {
        this.tomato = tomato;
        this.carrot = carrot;
        this.lettuce = lettuce;
        this.burgerType = burgerType;
    }

    public String getTomato() {
        return "tomato";
    }

    public String getCarrot() {
        return "carrot";
    }

    public String getLettuce() {
        return "lettuce";
    }
}
