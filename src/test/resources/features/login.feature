#language: pt
@Araujo
Funcionalidade: Validar Logar no Site
  Como um usuário
  Eu quero pesquisar ofertas e produtos
  Para que seja possível comprar com desconto

  Contexto:
    Dado que eu esteja no site da maxifrota

@automatizado
  Cenário: Logar na aplicação
  E verifico o acesso do usuário
  Quando acesso a tela de login
  E realizo o login
  Então deve exibir a tela de login

  Cenário: Login com sucesso GP MaxiFrota
  Dado que o usuário informou seu usuário e senha
  Quando clicar em "Entrar"
  Então deve ser direcionado para a home do sistema