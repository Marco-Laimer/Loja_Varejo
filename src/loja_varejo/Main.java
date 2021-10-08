package loja_varejo;

public class Main {
	public static void main(String[] args) {
	
	Clientes Cliente1 = new Clientes();
	Fornecedores fornecedor1 = new Fornecedores();
	Produtos produto1 = new Produtos();
	Vendas venda1 = new Vendas();
	Vendedor vendedor1 = new Vendedor();
	Tranportadora transportadora1 = new Tranportadora();
	Estoque estoque1 = new Estoque();
	Cliente1.nomeDoCliente = "Maria de Lurdes Jose";
	vendedor1.nomeVendedor = "Matheus Perreira";
	fornecedor1.nomeDoFornecedores = "Mercado Livre";
	produto1.nomeDoProduto = "Fone de Ouvido";
	
	estoque1.quantidadeEstoque = 40;
	transportadora1.nome = "Sedex";
	venda1.data = "07/09/2021";
	venda1.hora = "14:50";
	
	System.out.printf("O(a) Sr(a) %s comprou um(a) %s vendido por %s que foi fornecido pela empresa %s, na data de %s às %s. Este produto foi transportado pela empresa %s e tinhamos %s desse produto em nosso estoque",Cliente1.nomeDoCliente,produto1.nomeDoProduto ,vendedor1.nomeVendedor, fornecedor1.nomeDoFornecedores, venda1.data, venda1.hora, transportadora1.nome, estoque1.quantidadeEstoque);	
	
	
}
}