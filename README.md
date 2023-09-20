<h1>PEQUENO GRANDE MEDO</h1>
<h3> Nome dos integrantes: Isabele Timotio e Lucas Chaves Wey - 3°JD </h3>
<h3> Link do vídeo do jogo: https://youtu.be/EC4yj3I7wmE?si=tFsKESvF167_GBYF</h3>
<br>
<h2>《《 DESCRIÇÃO - JOGO UNITY 》》</h2>
<h2>°• MENU •°</h2>
Para o menu, utilizamos um Canvas com elementos como o painel para definição de background, botões com funções para transitar entre as telas sendo elas para créditos, guia e iniciar o jogo. Foi aplicado também um script para linkar uma cena específica para tansitar a ela mesma.

![image](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/34ed8528-ebc8-4ca7-8112-a627c984dbe5)
![Azul Elementos Isométricos e Mockups Tecnologia na Educação Apresentação de Tecnologia_20230918_125424_0000](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/e2ab4ac7-2330-48b7-a1ef-2d8ce0171827)
![Azul Elementos Isométricos e Mockups Tecnologia na Educação Apresentação de Tecnologia_20230918_140353_0000](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/ed21a222-e6b6-4146-9a8b-851747809dcb)


<br>
<br>
<h2>°• CENÁRIO •°</h2>
O cenário foi feito no sistema de layers, colocando cada objeto em uma camada, para a sobreposição uns dos outros, utilizando-se também um tilemap collider para a colisão com os personagens.
para mudança de cena, é colocado um script com condição sobre um collider e o personagem, selecionando a cena pela ordem na build settings.

![image](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/ebb550b2-95e2-4c0a-9c87-897eb5976318)
![image](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/8d099b3c-ae8a-4968-9a33-1e366376251e)
![image](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/c5211038-7928-47e6-8f9c-20f4bf6f6e96)
![image](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/1e9668cb-0d21-415d-8382-a889b447e8d3)


<br>
<br>
<h2>°• MOVIMENTAÇÃO •°</h2>
A movimentação da personagem foi feita a partir das animações no animator, com um código de condição para cada botão, servido para ela se mover de forma horizontal e rodar a direção da personagem, fazendo ela andar de forma coerente com seu segmento, tendo condições em suas animações para identificar quando está pulando ou não. Contudo, temps dois objetos vazios nas extremidades da personagem para identificar o chão e objetos sólidos acima de sua cabeça.

![image](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/193f60a8-8031-44b9-b253-eb206819b1d3)
<br>
<br>
<h2>°• SISTEMA DE DIÁLOGO •°</h2>
O sistema de diálogo entre personagens foi feito a base de um canvas e elementos similares ao menu, com um script que usa uma condição para quando for apertado o botão "E", ativa na área do Collider um  "gatilho", sendo assim aberto o canvas na tela do jogador. Por fim, temos um botão do lado direito abaixo com a função de continuar o diálogo.

![image](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/0168ff90-d339-44c5-8175-fb6166121be0)
<br>
<BR>
<h2>°• SISTEMA DE COMBATE •°</h2>
O sistema de combate ocorre por meio das animações dos personagens, com condições, onde se define um valor de vida para o personagem, e o dano dos ataques, usando um collider e objeto vazio para identificar a colisão.

![image](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/b71588f5-3511-4801-86ec-1b19987bbd9e)
<br>
<br>
<br>
<BR>
<BR>

<h2>《《 DESCRIÇÃO MOBILE 》》</h2>
<h2>°• INTRODUÇÃO •°</h2>
<p> Criamos um aplicativo wiki baseado em nosso jogo do Unity chamado Pequeno grande medo, ambos solicitados pela professora Aline Brito das matéria de Mobile e Linguagem de programação.
Ele é semelhante a outros app como Netflix, banco digital, etc; contendo sete abas incluindo a de menu e três intent explícita levando a um site que será demonstrado nas próximas páginas. </p>
<CENTER>
  
![image](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/d0e4504d-872b-4315-b75d-a5b9895ff5ef)
</CENTER>
<br>
<br>

<h2>°• HISTÓRIA •°</h2>
<p> Nesta tela utilizamos textView para escrever o título e o enrendo da história. E nós fantasma abaixo temos buttons transparentes, para isso usamos o imageButton deixando os valores de cores e imagens vazios, sendo o de voltar para a tela de menu na esquerda e o de avançar na direita. </p>
<CENTER>
  
![image](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/4fe21fcf-7656-42e6-8710-2398c56bdb21)
</CENTER>
  <br>
<br>

<h2>°• PERSONAGENS •° </h2>
<p> Temos nesta tela dois imageView para os personagens e três textView para título e descrição das personagens. Os botões de fantasma funcionam exatamente como o de história o de voltar para a tela de menu sendo na esquerda e o de avançar na direita. </p>
<CENTER>
  
![image](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/282644f4-e396-49c6-b14e-0927f2c2c65c)
</CENTER>
<br>
<br>

<h2>°• BOSS •°</h2>
Temos aqui um imageView e dois textView para título e texto também, e os botões abaixo transparentes. 
<CENTER>
  
![image](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/20f07982-995d-4382-9aeb-fdabb136803d)
</CENTER>
<br>
<br>

<h2>°• PLAYLIST •°</h2>
<p> Nesta aba colamos uma intent explícita para enviar o usuário a outro aplicativo, sendo este uma playlist no Spotify, e como nas outras telas o textView e os botões transparentes. </p>
<CENTER>
  
![image](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/9824c01a-1a68-41f0-91a5-49c2a3580253)
</CENTER>
<br>
<br>

<h2>°• EASTER EGG •°</h2>
<p> Na penúltima tela temos a descrição de um easter egg do jogo juntamente do botão transparente abaixo que leva a tela de menu. </p>
<CENTER>
  
![image](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/62fb72c0-907e-4af3-a87d-3034df7c1498)
</CENTER>
<br>
<br>

<h2>°• REDES SOCIAIS •°</h2>
<p> Na última tela temos dois botões levando a gente para as redes sociais de nosso empresa, sendo como principal rede o Instagram e seu segundo aplicativo Threads. </p>
<CENTER>
  
![image](https://github.com/Isabele-Timotio/GAME-CASA-ABANDONADA/assets/101645908/5011d54f-0f73-4da0-af41-6ecd2bf26aa8)
</CENTER>
