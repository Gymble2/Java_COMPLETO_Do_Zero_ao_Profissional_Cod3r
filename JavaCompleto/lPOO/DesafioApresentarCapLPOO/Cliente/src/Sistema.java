package JavaCompleto.lPOO.DesafioApresentarCapLPOO.Cliente.src;
public class Sistema {
    public static void main(String[] args) {
        Cliente cliente= new Cliente("Jessica","231");

        Compra compra = new Compra();
        compra.adicionarItem("Fundamento", 150, 13);
        compra.adicionarItem(new Produto("Dianho",1),1);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Omo liquido", 1, 1);
        compra2.adicionarItem(new Produto("Pinho sol",1),4);

        cliente.compras.add(compra);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}
