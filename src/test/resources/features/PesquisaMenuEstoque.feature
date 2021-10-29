#language: pt
Funcionalidade: pesquisa menu estoque

  Cenario: pesquisa do carro
    Dado que na pagina inicial clico no botao de ofertas
    Quando preencho o campo de marca
    E preencho o campo de modelo
    E preencho o campo de versao
    Entao o sistema mostra os veiculos

  Cenario: pesquisa do carro com marca invalida
    Dado que na pagina inicial clico no botao de ofertas
    Quando preencho o campo com uma marca invalida
    Entao o sistema mostra que nao ha resultados

  Cenario: pesquisa do carro com modelo invalido
    Dado que na pagina inicial clico no botao de ofertas
    Quando preencho o campo de marca
    E preencho o campo com um modelo invalido
    Entao o sistema mostra que nao ha resultados

  Cenario: pesquisa do carro com versao invalida
    Dado que na pagina inicial clico no botao de ofertas
    Quando preencho o campo de marca
    E preencho o campo de modelo
    E preencho o campo com uma versao invalida
    Entao o sistema mostra que nao ha resultados para essa versao
