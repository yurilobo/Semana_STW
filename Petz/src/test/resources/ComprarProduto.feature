#language: pt

Funcionalidade: Comprar Produto
	#Fluxo de compra no site Petz
	#Envolve as páginas Home,Resultados da Consulta e Detalhes Paginas
	
	Cenario: Compra a partir de uma busca
	Dado que acesso o site Petz 
	Quando busco por "coleira" e pressiono Enter
	Entao exibe uma lista de produtos relacionados com "coleira"
	Quando escolho "Coleira Petz Azul pra Caes"
	Entao exibe para o "Tamanho P" o preco de "RS 39,99" 
	