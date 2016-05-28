#Deployment View

![Deployment View Diagram](https://github.com/Joao-up201000385/android-app/blob/master/ESOF-docs/Diagramas/DeploymentPhysicalView.png "Deployment View Diagram")
######Diagrama Deployment View do Wallabag  

.

A Deployment View demonstra a topologia dos componentes de um software. É baseada nos componentes da camada física, assim como as conexões entre esses componentes. A representação gráfica é composta da seguinte maneira: As caixas representam os nodos (componentes de hardware) e os rectângulos dentro das caixas representam os artefactos (componentes de software).

Para descrever o Wallabag, existem dois tipos de hardware envolvidos, o smartphone Android e o servidor de bases de dados. O smartphone Android deve ter instalado o aplicativo do Wallabag e um navegador de internet, já que o artigo salvo é compartilhado pelo navegador para o aplicativo, que o salva no servidor. Já o servidor deve ter uma base de dados instalada, para que o artigo seja salvo adequadamente. A base de dados pode ser de diferentes tipos, tais como MySQL, SQLite ou pgSQL. Utiliza-se apenas um servidor que pode ser acedido de diferentes maneiras, tal pelo aplicativo como também pelo próprio site.
