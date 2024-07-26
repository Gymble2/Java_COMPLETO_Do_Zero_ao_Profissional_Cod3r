import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer,String> user = new HashMap<>();// Cria um mapa com chave e valor ligado a chave
        user.put(1,"Roberto");
        user.put(1, "Ricaredo");// inclui ou subistitui
        user.put(20, "Ricaredo");// inclui ou subistitui
        user.put(23, "Rebeca");// inclui ou subistitui

        System.out.println(user.size());
        System.out.println(user.isEmpty());
        System.out.println(user.values());
        System.out.println(user.entrySet());
        System.out.println(user.containsKey(20));
        System.out.println(user.containsValue("Rebeca"));
        System.out.println(user.get(20));


        //Imprime as chaves
        for (int chave:
             user.keySet()) {
            System.out.println(chave);
        }

        for (String values:
             user.values()) {
            System.out.println(values);
        }

        for (java.util.Map.Entry<Integer, String> registros:
             user.entrySet()) {
            System.out.println(registros.getKey()+ " ");
            System.out.println(registros.getValue());
        }


    }
}