package JavaCompleto.lPOO.Jogo;

public class Atributos {
    
    private String Atributes;

    public String setChoicesAtributes(String typeChoices){
        switch (typeChoices) {
            case "vida":
                Atributes = typeChoices;
                break;
            default:
              return "This stantment doens´t exist";
        }
        return Atributes;
        }
    }


