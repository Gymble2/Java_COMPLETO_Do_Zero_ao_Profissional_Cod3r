public class AreaCIrc {
    double raio;

    //Fazer maiusuclo por bom costume
    static final double PI = 3.14;

    AreaCIrc(double raioInicial){
        raio = raioInicial;
    }
    double area(){
        return PI * Math.pow(raio, 2);
    }
}
