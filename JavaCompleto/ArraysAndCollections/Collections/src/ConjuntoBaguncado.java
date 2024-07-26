import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "rawtypes"})
public class ConjuntoBaguncado {

    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        //noinspection unchecked
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho do conjunto"+
                conjunto.size());//tamanho do conjunto
        System.out.println(conjunto.remove('x'));// remove
        System.out.println(conjunto.contains(1));//verifica se contem

        Set nums = new HashSet();//cria um conjunto objeto

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums);//união entre dois conjuntos
        conjunto.retainAll(nums); //Puxa do conjunto apenas os valores iguais ao segundo conjunto
        System.out.println(conjunto);

        conjunto.clear();//limpa o conjunto
        System.out.println(conjunto);
    }
}
