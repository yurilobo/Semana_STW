#language: pt

Funcionalidade: Comprar Produto
	#Fluxo de compra no site Petz
	#Envolve as p�ginas Home,Resultados da Consulta e Detalhes P�ginas
	
	Cenario: Compra a partir de uma busca
	Dado que acesso o site Petz 
	Quando busco por "coleira" e pressiono Enter
	Ent�o exibe uma lista de produtos relacionados com "coleira"
	Quando escolho "Coleira Petz Azul pra C�es"
	Entao exibe para o "Tamanho P" o preco de "RS 39,99" 
	