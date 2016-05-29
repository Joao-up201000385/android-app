# Relatório

## Descrição do Projecto


A quantidade de informação com que hoje somos “bombardeados” e a constante falta de tempo para a ler no momento em que esta surge,
levou ao desenvolvimento de aplicações que salvam artigos e páginas web que despertam o nosso interesse, para posteriormente serem
lidos em forma de texto puro, transformando a sua interface numa espécie de jornal que pode ser lido em qualquer local. Embora muito
úteis, aplicações como o Pocket e o Instapaper que permitem salvar artigos e páginas web para uma leitura posterior, são pagas e nem
sempre acessíveis a todos os utilizadores.

Face a essa situação, foi desenvolvida uma aplicação open source a que chamaram de Wallabag e que pode ser utilizada sem restrições.


### Wallabag – O que é?


O Wallabag é uma aplicação que permite salvar artigos e páginas web para uma visualização posterior e em qualquer local. Portanto,
se  faz parte do grupo de pessoa que tem por hábito abrir muitos separadores e ao fim do dia, apercebe-se que não teve tempo para os
ler, então a aplicação Wallabag é fortemente recomendada,  salvando todos os separadores abertos e que por algum motivo não os
conseguiu ler.

### Wallabag – Instalação?

O utilizador faz o download da aplicação e procede a sua instalação tendo duas opções:

- instalar num servidor web próprio(caso tenha um) e criar um utilizador para poder utilizar o software

ou

- caso não tenhamos um servidor web próprio, nem façamos a pretensão de o criar, podemos sempre utilizar a informação fornecida pelo
site do projeto Wallabag onde consta a indicação de um serviço gratuito para usar o Wallabag que é o https://framabag.org/ e
que utiliza um host de terceiros para hospedar as páginas web que queremos guardar para mais tarde ler.


### Wallabag – Funcionamento?

O funcionamento da aplicação é muito simples e fácil:
o utilizador visualiza uma página da web que desperta o seu interesse e que por falta de tempo não a pode ler naquele momento, carrega
no ícone que aparece no canto superior direito do browser (representado por três quadrados pequenos). Surge uma janela com várias opções, sendo uma delas “Partilhar página” e na qual clicamos. Surge de novo, uma outra janela com várias opções para fazer a partilha, sendo a
nossa escolha a opção que tem o logótipo do Wallabag seguido da frase Bag it!. De imediato, é mostrado um pop up com a palavra Added,
confirmando que a página acabou de ser adicionada à nossa aplicação Wallabag. Portanto, sempre que abrirmos a aplicação Wallabag será
mostrado no separador UNREAD, toda a informação que foi selecionada para mais tarde ser lida.

Sempre que abrimos a aplicação Wallabag é mostrado no centro superior três separadores:

– UNREAD (guarda todas as páginas web e artigos que não foram lidos)

– FAVORITES (guarda as páginas ou artigos já lidas e etiquetadas pelo utilizador como favoritos)

– ARCHIVED (guarda os artigos e páginas web lidos e que achamos por bem arquivar para poderem ser consultados mais tarde se necessário)

### Use Case Diagram

![Use cases diagram](https://github.com/Joao-up201000385/android-app/blob/master/ESOF-docs/Diagramas/UseCaseDiagram.png)
##### Diagrama Use Case do Wallabag



A principal funcionalidade do Wallabag é guardar páginas web para uma leitura posterior. O processo de guardar páginas web é tão simples como: abrir o browser do nosso dispositivo Android, navegar até à página que queremos guardar, clicar no botão de opções do nosso dispositivo, selecionar a opção "Partilhar página" e depois “Bag it”. Surge um novo pop-up com a frase "Added" indicando que o Wallabag processou a página web e guardou-a como um artigo optimizado para leitura.

Deste modo, passamos a ter artigos guardados e prontos a serem lidos. Abrimos a aplicação do Wallabag e automaticamente aparecem os nossos artigos listados. Clicando em cada um deles abre-se um leitor onde é possível, entre muitas opções, marcar o artigo como lido, marcar como favorito ou exportá-lo para outros formatos.

Finalmente, a partir da aplicação do Wallabag e com uma ligação à internet podemos também sincronizar os nossos artigos. Ao sincronizar os artigos, uma cópia deles é enviada para o nosso servidor remoto. Depois, podemos aceder ao Wallabag através de qualquer outro dispositivo compatível e sincronizar com a informação no nosso servidor, e continuar a ler os artigos que tínhamos guardado anteriormente sem preocupações.  

### Process View

![Process View diagram](https://github.com/Joao-up201000385/android-app/blob/master/ESOF-docs/Diagramas/ProcessView.png)
##### Diagrama Process View  do Wallabag

##### O pedido de armazenamento de uma página web no wallabag pode ser feito de duas formas:

Temos uma página web que suscitou o nosso interesse para uma leitura posterior, pretendemos guardá-la clicando no menu opções e em seguida
na opção "Bag It".Neste momento, é processado o conteúdo no sentido de analisar se tal página web pedida para ser salva pode ser armazenada
pela aplicação Wallabag. Caso o conteúdo do site ou artigo esteja de acordo com o que o wallabag permite  guardar, será salvo no separador
UNREAD numa lista onde se encontram artigos e páginas web guardadas.Caso a página web possua conteúdo impossível de armazenar pela
aplicação do wallabag, falha e voltamos á página web de onde foi feita a solicitação para salvar a página.

### Logical View

![Process View diagram](https://github.com/Joao-up201000385/android-app/blob/master/ESOF-docs/Diagramas/LogicalView.png)

##### Diagrama Logical View  do Wallabag

Wallabag utiliza um servidor especificado pelo utilizador para guardar as páginas web. Este servidor vai sincronizar com os vários dispositivos com as mesmas credenciais de log in. Qualquer operação sobre as páginas está dependente do servidor sendo necessário comunicar com este para fazer qualquer alteração tal como adicionar uma página, tendo de fazer sync para o servidor tornar a página que foi acabada de ser adicionada disponível para ser vista atravéz do Wallabag permanecendo lá para ser visualizada mais tarde mesmo sem uma conexão com o servidor em causa. Ao estabelecer de novo a ligação para o servidor este vai encarregar-se de manter os dados no Wallabag idênticos com os do servidor revertendo quaisqueres mudanças feitas depois da coneção ter sido desligada.

### Development View



![Development View Diagram](https://github.com/Joao-up201000385/android-app/blob/master/ESOF-docs/Diagramas/DevelopmentView.png)
##### Diagrama Development View do Wallabag

Wallabag é opensource e escrito em várias linguagens como Java, Javascript, PHP e XML. Está disponível em Android, iPhone, WindowsPhone, Windows 8, Windows 8.1, Windows 10 e Firefox OS com aplicações nos browsers Firefox e Google Chrome.

A aplicação necessita de acesso a um servidor para realizar diversas operações estando dependente deste, portanto, requer permissão de acesso â rede.

### Deployment View

![Deployment View Diagram](https://github.com/Joao-up201000385/android-app/blob/master/ESOF-docs/Diagramas/DeploymentPhysicalView.png "Deployment View Diagram")
###### Diagrama Deployment View do Wallabag  

A Deployment View demonstra a topologia dos componentes de um software. É baseada nos componentes da camada física, assim como as conexões entre esses componentes. A representação gráfica é composta da seguinte maneira: As caixas representam os nodos (componentes de hardware) e os rectângulos dentro das caixas representam os artefactos (componentes de software).

Para descrever o Wallabag, existem dois tipos de hardware envolvidos, o smartphone Android e o servidor de bases de dados. O smartphone Android deve ter instalado o aplicativo do Wallabag e um navegador de internet, já que o artigo salvo é compartilhado pelo navegador para o aplicativo, que o salva no servidor. Já o servidor deve ter uma base de dados instalada, para que o artigo seja salvo adequadamente. A base de dados pode ser de diferentes tipos, tais como MySQL, SQLite ou pgSQL. Utiliza-se apenas um servidor que pode ser acedido de diferentes maneiras, tal pelo aplicativo como também pelo próprio site.

### Auto-avaliações

Alexandra:

Ana:

André:

João:

Jonatan:

---

Trabalho realizado pelo grupo arqsoftdcc2016_ da FCUP, para a cadeira de Arquitetura de Software.
