# api-alticci
Foi solicitado uma api onde é realizado um cálculo onde:

- n=0 => a(0) = 0 
- n=1 => a(1) = 1 
- n=2 => a(2) = 1
- n>2 => a(n) = a(n-3) + a(n-2)

Foi realizado o desenvolvimento da aplicação de acordo com o solicitado

## ✔️ Técnicas e tecnologias utilizadas

- ``Java 8``
- ``Spring Framework``
- ``Maven``
- ``REST``
- ``Git``
- ``InteliJ IDEA``
- ``Paradigma de orientação a objetos``
- ``MacOS``

## 📁 Acesso ao projeto

A aplicação pode ser implementada em produção, caso não seja o acesso a ela após o start da mesma é http://localhost:8080/alticci/{n} .
Foi implementado {n} um número inteiro a url retorna uma List<BigInteger>.

Segue exemplo:

<img width="852" alt="Captura de Tela 2022-08-14 às 15 19 05" src="https://user-images.githubusercontent.com/46197486/184549822-00e118e0-8332-44f5-8503-e0d9753e7803.png">

Para realizar a requisição em post segue cUrl de exemplo:

curl --location --request GET 'http://localhost:8080/alticci/0' \
'

## :hammer: Executar o pacote

`Pré-requisitos`: instalação do Java 8 ou superior e instalação do maven, git.

`Passo um 1`: Realizar o clone no Git 

`Passo um 2`: Abrir o prompt de comando e realizar o mvn install -U para que realize o download das dependencias.

`Passo um 3`: Realizando o mvn install ele gera o pacote do .jar na pasta target.

`Passo um 4`: Crie uma pasta raiz onde copiara o pacote .jar e criar uma pasta config onde sera incluido a propertie.

`Passo um 5`: No prompt execute o comando java -jar api-alticci-0.0.1-SNAPSHOT.jar para executar no terminal aberto ou caso queira executar o comando
 nohup java java -jar api-alticci-0.0.1-SNAPSHOT.jar & para que fique startado independente do terminal.

