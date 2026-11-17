public class Main {
    public static void main(String[] args) {
        System.out.println("=== LOJA - CADASTRO DE PRODUTOS ===");
        System.out.println();

        Produto p1 = new Produto("Notebook", 3500.00, 5);
        Produto p2 = new Produto("Mouse sem fio", 89.90, 30);
        Produto p3 = new Produto("Monitor 24 polegadas", 899.00, 12);

        p1.exibirProduto();
        p2.exibirProduto();
        p3.exibirProduto();
    }
}
