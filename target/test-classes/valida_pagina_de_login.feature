#language:pt
#encoding:UTF-8
#Autor: Jhonata-Moreira


Funcionalidade: Valida pagina de login

  Cenario: Deve realizar login com dados validos
    Dado que o cliente acesse a pagina de login
    Quando realizar a login com dados validos
    Entao devera retornar a pagina logado

  Cenario: Nao deve realizar login com senha errada
    Dado que o cliente acesse a pagina de login
    Quando realizar login com senha errada
    Entao devera retornar a mensagem de senha errada

  Cenario: Nao deve realizar login com email e senha em branco
    Dado que o cliente acesse a pagina de login
    Quando realizar login com email e senha em branco
    Entao devera retornar a mensagem de erro email e senha em branco