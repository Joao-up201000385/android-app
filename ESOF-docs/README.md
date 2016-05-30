# Relatório

## Descrição do projecto

A quantidade de informação com que hoje somos “bombardeados” e a constante falta de tempo para a ler no momento em que esta surge, levou ao desenvolvimento de aplicações que salvam artigos e páginas web que despertam o nosso interesse, para posteriormente serem lidos em forma de texto puro, transformando a sua interface numa espécie de jornal que pode ser lido em qualquer local. Embora muito úteis, aplicações como o Pocket e o Instapaper que permitem salvar artigos e páginas web para uma leitura posterior, são pagas e nem sempre acessíveis a todos os utilizadores.

Face a essa situação, foi desenvolvida uma aplicação open source a que chamaram de Wallabag e que pode ser utilizada sem restrições.

### Wallabag – O que é?

O Wallabag é uma aplicação que permite salvar artigos e páginas web para uma visualização posterior e em qualquer local. Portanto, se faz parte do grupo de pessoa que tem por hábito abrir muitos separadores e ao fim do dia, apercebe-se que não teve tempo para os ler, então a aplicação Wallabag é fortemente recomendada,  salvando todos os separadores abertos e que por algum motivo não os
conseguiu ler.

### Wallabag – Instalação?

O utilizador faz o download da aplicação e procede a sua instalação tendo duas opções:

- Instalar num servidor web próprio e criar um utilizador para poder utilizar o software.

ou

- Caso não tenhamos um servidor web próprio, nem façamos a pretensão de o criar, podemos sempre utilizar a informação fornecida pelo site do projeto Wallabag onde consta a indicação de um serviço gratuito para usar o Wallabag que é o https://framabag.org/ e que utiliza um host de terceiros para hospedar as páginas web que queremos guardar para mais tarde ler.


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
##### Diagrama Process View do Wallabag

###### O pedido de armazenamento de uma página web no wallabag pode ser feito de duas formas:

Temos uma página web que suscitou o nosso interesse para uma leitura posterior, pretendemos guardá-la clicando no menu opções e em seguida
na opção "Bag It".Neste momento, é processado o conteúdo no sentido de analisar se tal página web pedida para ser salva pode ser armazenada
pela aplicação Wallabag. Caso o conteúdo do site ou artigo esteja de acordo com o que o wallabag permite  guardar, será salvo no separador
UNREAD numa lista onde se encontram artigos e páginas web guardadas.Caso a página web possua conteúdo impossível de armazenar pela
aplicação do wallabag, falha e voltamos á página web de onde foi feita a solicitação para salvar a página.

### Logical View

![Process View diagram](https://github.com/Joao-up201000385/android-app/blob/master/ESOF-docs/Diagramas/LogicalView.png)
##### Diagrama Logical View do Wallabag

Wallabag utiliza um servidor especificado pelo utilizador para guardar as páginas web. Este servidor vai sincronizar com os vários dispositivos com as mesmas credenciais de log in. Qualquer operação sobre as páginas está dependente do servidor sendo necessário comunicar com este para fazer qualquer alteração tal como adicionar uma página, tendo de fazer sync para o servidor tornar a página que foi acabada de ser adicionada disponível para ser vista atravéz do Wallabag permanecendo lá para ser visualizada mais tarde mesmo sem uma conexão com o servidor em causa. Ao estabelecer de novo a ligação para o servidor este vai encarregar-se de manter os dados no Wallabag idênticos com os do servidor revertendo quaisqueres mudanças feitas depois da coneção ter sido desligada.

### Development View

![Development View Diagram](https://github.com/Joao-up201000385/android-app/blob/master/ESOF-docs/Diagramas/DevelopmentView.png)
##### Diagrama Development View do Wallabag

Wallabag é opensource e escrito em várias linguagens como Java, Javascript, PHP e XML. Está disponível em Android, iPhone, WindowsPhone, Windows 8, Windows 8.1, Windows 10 e Firefox OS com aplicações nos browsers Firefox e Google Chrome.

A aplicação necessita de acesso a um servidor para realizar diversas operações estando dependente deste, portanto, requer permissão de acesso â rede.

### Deployment View

![Deployment View Diagram](https://github.com/Joao-up201000385/android-app/blob/master/ESOF-docs/Diagramas/DeploymentPhysicalView.png "Deployment View Diagram")
##### Diagrama Deployment View do Wallabag  

A Deployment View demonstra a topologia dos componentes de um software. É baseada nos componentes da camada física, assim como as conexões entre esses componentes. A representação gráfica é composta da seguinte maneira: As caixas representam os nodos (componentes de hardware) e os rectângulos dentro das caixas representam os artefactos (componentes de software).

Para descrever o Wallabag, existem dois tipos de hardware envolvidos, o smartphone Android e o servidor de bases de dados. O smartphone Android deve ter instalado o aplicativo do Wallabag e um navegador de internet, já que o artigo salvo é compartilhado pelo navegador para o aplicativo, que o salva no servidor. Já o servidor deve ter uma base de dados instalada, para que o artigo seja salvo adequadamente. A base de dados pode ser de diferentes tipos, tais como MySQL, SQLite ou pgSQL. Utiliza-se apenas um servidor que pode ser acedido de diferentes maneiras, tal pelo aplicativo como também pelo próprio site.

---
Relatório realizado pelo grupo Arqsoftdcc2016 da faculdade de Ciência de Computadores para a cadeira de Arquitetura de Software.

---
### Auto-avaliações

##### Alexandra:
O contributo que dei para o relatório sobre o Wallabag foi o seguinte:
Fiz o diagrama do UseCase e do ProcessView juntamente com o colega João para mostrar no  segundo checkpoint.
Fiz o texto para descrição do projecto, o texto do diagrama do UseCase e o texto do Process View que posteriormente sofreram algumas alterações que o colega João fez.
Na ultima aula prática fizemos o diagrama Deployment View e corrigimos o diagrama do Development View que o colega André enviou mas  que não se encontrava de acordo com as convenções UML.
Instalei o software adequado para correr aplicação wallbag como: BlueStack (emulador de Andoid) e o ArgoUML para o desenho dos diagramas.
Compareci aos dois checkpoints que houve.
Compareci a todas as aulas teóricas e práticas para o esclarecimento de dúvidas.
Todos os dias e horas combinados via Slack, compareci sendo que a maior parte das vezes só eu e o colega João comparecemos para trocar ideias e dar andamento ao relatório.

Por isso, numa escala de 0-5, acho que mereço um 4 ou 4.5. 

E concordo com tudo o que o colega Joao disse.

P.S:Sugiro aos Professores desta cadeira para fazerem o pull do histórico do GitHub e desta forma ver quem foram os elementos que contribuiram para o relatório antes do dia 27 e 28 de Maio. O colega André esqueceu-se de referir que estavamos a poucas horas de entregar o relatorio e nem sabia em que pastas os diagramas e textos se encontravam.

##### Ana:
Neste projecto, a grande parte do meu contributo terá sido durante algumas das aulas práticas, ao ajudar os colegas na realização dos diagramas, tendo sido pouco o meu trabalho em casa. Contribui também com o texto para um dos diagramas.
De 0 a 5, avalio o meu desempenho com 3.

##### André:
Cumpri sempre com o que me era pedido e esperado como também com os prazos que me davam.
Colaborei na primeira tentativa de fazer um logical view diagram (quando ainda estávamos a eleger e experimentar com ferramentas de modelagem de UML), contribuí para o diagrama da physical view e Use Case Scenarios. Fiz também as descrições tanto para a logical
como development views.
As duas vezes que não pude comparecer a aulas práticas (uma inevitavelmente e outra por não saber onde era a sala devido ao teste da cadeira de Estruturas Discretas que estava a decorrer nos laboratórios) estive presente no Slack a trabalhar para as views. Grande maior parte das contribuições foram dadas através do porta-voz. Contribuindo para 5/11 dos setores do nosso relatório (que resume basicamente o quanto contribuí) penso que estive aquém do que me era esperado sendo claramente mais importante que a nossa disponibilidade por aparecer num "chat" sabendo que sempre cumpri com prazos que me foram pedidos trabalhando por vezes quando mais ninguém estava nesse dito "chat" não me queixando (como alguns dos membros do grupo...) tendo, mesmo assim, aparecendo a grande parte desses encontros online. Deixo ao critério do professor. PS João: isto é uma auto avaliação. Não avaliação de grupo. Como tal não vou avaliar o que penso do resto do grupo. Isto para além de discordar fortemente das tuas opiniões especialmente no que toca a que apenas estive em metade das aulas práticas. Dizer que o Jonatan não compareceu no Slack e não trabalhou rigorosamente nada também me parece egoísta. Na minha opinião, claro. Adiciono ainda, se alguém tem queixa do quanto eu fiz gostava que admitissem o que deveria ter feito mais pois, como já disse, cumpri com tudo o que me foi pedido. Incluindo prazos. E tenho prova de tal e como trabalhei nessas 2 aulas que faltei postando no Slack (que levantaram tanto escândalo...).

##### João:
Como parece que houve que houve desentendimentos entre membros do grupo sobre as contribuições de cada um, e como representante do grupo, sinto que devo descrever o que penso não só da minha avaliação própria mas também dos outros elementos do grupo.  
***Eu/João***: Trabalhei para o projeto consistemente desde o inicio. Começei por ser o único a tomar iniciativa para estudar e perceber como correr a aplicação do projeto, e a única pessoa com preparação para o primeiro checkpoint do projeto. Compareci a todos os encontros no slack, compareci a todas as aulas práticas, esclareci dúvidas e adientei trabalho durante todas as aulas práticas, mostrei-me sempre disposto a ajudar colegas com dúvidas e os ajudei em bastantes ocasiões, completei todo o trabalho a que me comprometi e mais, e servi de mediador para esclarecer dúvidas que o grupo tinha com o projessor. Acho que mereço 4.5/5.  
***Alexandra***: Apesar de só ter começado a contribuir para o projeto a partir do primeiro checkpoint, foi bastante empenhada e no total acabou por fazer tanto trabalho ou possivelmente mais do que eu. Tomou iniciativa em tentar organizar o grupo, compareceu a todos os encontros marcados no slack e fez todo o trabalho proposto e mais, compareceu a todos as aulas práticas, e fez contribuições nas aulas práticas. Diria que mereçe uma nota de 4.5/5.  
***Ana***: Não tenho memoria de ter comparecido a algum encontro slack marcado, não realizou nenhum do trabalho acordado ou fez um único push no git excepto o comentário de auto-avaliação, e se bem me lembro apenas compareceu á primeira e última aula prática. Nota 0/5.  
***André***: Compareceu a cerca de metade das aulas práticas mas foi átivo nelas. Não foi pontual aos encontros slack mas cumpriu algumas das tarefas acordadas.  Nota 2.5/5.  
***Jonatan***: Compareceu a todas as aulas práticas. Não compareceu aos encontros slack marcados ou completou alguma das tarefas acordadas. Fez o primeiro push no fim-de-semana da entrega (28 Maio) com contribuíções mínimas. Nota 0.5/5.

##### Jonatan:
