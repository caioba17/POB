public class Produto {
  private int id;
  private String sku;
  private String codBarras;
  private String nome;
  private String descricao;
  private String caategoria;
  private double preco;
  private double peso;
  private String fabricante;

  public Produto(int id, String nome, String sku, String codBarras, String descricao, String categoria, double preco,
      double peso, String fabricante) {
    this.id = id;
    this.nome = nome;
    this.sku = sku;
    this.codBarras = codBarras;
    this.descricao = descricao;
    this.categoria = categoria;
    this.preco = preco;
    this.peso = peso;
    this.fabricante = fabricante;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public String getCodBarras() {
    return codBarras;
  }

  public void setCodBarras(String codBarras) {
    this.codBarras = codBarras;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public String getFabricante() {
    return fabricante;
  }

  public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
  }
}