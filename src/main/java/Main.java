import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Produto> produtos = new ArrayList<Produto>();
    Scanner sc = new Scanner(System.in);
    boolean continua = true;
    int opc;

    while (continua) {
      System.out.println("--MENU--");
      System.out.println("1 - Incluir produto");
      System.out.println("2 - Alterar produto");
      System.out.println("3 - Excluir produto");
      System.out.println("4 - Listar produtos");
      System.out.println("5 - Listar um produto com detalhes");
      System.out.println("6 - Sair");
      System.out.println("\n");
      System.out.println("Digite sua opção: ");
      opc = sc.nextInt();
      sc.nextLine();
      System.out.println("\n");

      switch (opc) {
        case 1:
          System.out.println("Nome do produto: ");
          String nome = sc.nextLine(); 
          System.out.println("Id do produto: ");
          int id = sc.nextInt();
          sc.nextLine();
          System.out.println("Sku do produto: ");
          String sku = sc.nextLine();
          System.out.println("Código de Barras do produto: ");
          String codBarras = sc.nextLine();
          System.out.println("Descrição do produto: ");
          String descricao = sc.nextLine();
          System.out.println("Categoria do produto: ");
          String categoria = sc.nextLine();
          System.out.println("Preço do produto: ");
          double preco = sc.nextDouble();
          sc.nextLine();
          System.out.println("Peso do produto: ");
          double peso = sc.nextDouble();
          sc.nextLine();
          System.out.println("Fabricante do produto: ");
          String fabricante = sc.nextLine();

          Produto produto = new Produto(id, nome, sku, codBarras, descricao, categoria, preco, peso, fabricante);
          produtos.add(produto);
          System.out.println("Produto inserido!");
          break;

        case 2:
          System.out.println("Id do produto a ser alterado: ");
          int idAltera = sc.nextInt();
          sc.nextLine();
          Produto produtoAlt;
          int retorno = 0;

          for (int i=0; i<produtos.size(); i++)
            {  
              produtoAlt = produtos.get(i);

              if (produtoAlt.getId() == idAltera)
              {
                System.out.println("Novo id: ");
                produtoAlt.setId(sc.nextInt());
                sc.nextLine();
                System.out.println("Novo nome: ");
                produtoAlt.setNome(sc.nextLine());
                System.out.println("Novo sku: ");
                produtoAlt.setSku(sc.nextLine());
                System.out.println("Novo código de barras: ");
                produtoAlt.setCodBarras(sc.nextLine());
                System.out.println("Nova descriçao: ");
                produtoAlt.setDescricao(sc.nextLine());
                System.out.println("Nova categoria: ");
                produtoAlt.setCategoria(sc.nextLine());
                System.out.println("Novo preço: ");
                produtoAlt.setPreco(sc.nextDouble());
                sc.nextLine();
                System.out.println("Novo peso: ");
                produtoAlt.setPeso(sc.nextDouble());
                sc.nextLine();
                System.out.println("Novo fabricante: ");
                produtoAlt.setFabricante(sc.nextLine());
                System.out.println("\n");
                System.out.println("Produto atualizado!");
                System.out.println("\n");
                retorno = 1;
              }
            }
          if (retorno == 0) {
            System.out.println("Produto não encontrado!");
            System.out.println("\n");    
          }
          break;

        case 3:
          System.out.println("Id do produto a ser exluído: ");
          int idExclui = sc.nextInt();
          sc.nextLine();
          Produto produtoRemov;
          int retorn=0;

          for(int i=0; i<produtos.size(); i++)
            {
              produtoRemov = produtos.get(i);
              if (idExclui == produtoRemov.getId())
              {
                produtos.remove(produtoRemov);
                retorn = 1;
              }
            }
          if (retorn == 0) {
            System.out.println("Produto não encontrado!");
            System.out.println("\n");    
          }   
          break;

        case 4:
          if (produtos.size() != 0)
          {
            Produto objeto;
            System.out.println("PRODUTOS: ");
            System.out.println("---------------");
            for(int i=0; i<produtos.size(); i++) 
              {
                objeto = produtos.get(i);
                System.out.println("Produto Id: "+ objeto.getId());
                System.out.println("Produto Nome: "+ objeto.getNome());    
                System.out.println("---------------");
              }
            System.out.println("\n");
          }
          else {
            System.out.println("Sem produtos cadastrados!");
            System.out.println("\n");
          }
          break;

        case 5:
          System.out.println("Id do produto a ser listado: ");
          Produto prodList;
          int retor = 0;
          int idList = sc.nextInt();
          sc.nextLine();

          for(int i=0; i<produtos.size(); i++) {
            prodList = produtos.get(i);
            if (idList == prodList.getId())
            {
              System.out.println("Produto Id: "+ prodList.getId());
              System.out.println("Produto Nome: "+ prodList.getNome());
              System.out.println("Produto Sku: "+ prodList.getSku());
              System.out.println("Produto Código de Barras: "+ prodList.getCodBarras());
              System.out.println("Produto Descrição: "+ prodList.getDescricao());
              System.out.println("Produto Categoria: "+ prodList.getCategoria());
              System.out.println("Produto Preço: "+ prodList.getPreco());
              System.out.println("Produto Peso: "+ prodList.getPeso());
              System.out.println("Produto Fabricante: "+ prodList.getFabricante());
              System.out.println("---------------");
              retor = 1;
            }          
          }
          if (retor == 0)
          {
            System.out.println("Produto não encontrado!");
            System.out.println("\n");
          }
          break;

        case 6:
          continua = false;
          break;

        default:
          System.out.println("Opção Inválida!");
          System.out.println("\n");
      }
    }
  }
}
