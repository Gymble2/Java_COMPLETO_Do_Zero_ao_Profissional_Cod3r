public class Main {
    public static void main(String[] args) {
         //Trabalho na terça (V ou F)
        //Trabalho na quinta (V ou F)

        boolean Tq = true;
        boolean Tt = false;

        if(Tq && Tt){
            System.out.println("Tv 50 polegadas e sorverte");
        }else if(Tq ^ Tt){
            System.out.println("Tv 30 polegadas e sorvete");
        }else{
                System.out.println("Chora o trabalhador");
        }
    }
}