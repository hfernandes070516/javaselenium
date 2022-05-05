#language: pt
@Araujo
Funcionalidade: Validar Site da Araujo
  Como um usuário
  Eu quero pesquisar ofertas e produtos
  Para que seja possível comprar com desconto

  Contexto:
    Dado que eu esteja no site da araujo

  @automatizado
  Cenário: Validar pesquisa
    #Exemplo com interação com texto
    Quando realizo uma pesquisa pelo termo "kitkat"
    Então devo visualizar lista de produtos com o termo "Chocolate Nestlé Kit Kat"

  @automatizado
  Cenário: Validar leve mais por menos
    #Exemplo com erro para visualizar o print no relatório
    Quando acesso a tela de leve mais por menos
    Então deve exibir os dados corretamente

  @automatizado
  Cenário: Validar Saldão
    #Exemplo de teste com cliques e validações
    Quando acesso a tela de saldão de desconto
    Então deve exibir a tela de saldão corretamente


  @automatizado
  Cenário: Validar pesquisa com produtp do banco de dados
    #Exemplo com interação com BD
    Quando realizo uma pesquisa usando dados do bd
    Então devo visualizar lista de produtos
