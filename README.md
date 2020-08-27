PASSO 1: Crie um novo projeto no Android Studio, com linguagem Kotlin;
PASSO 2:  2.1 - Antes de começar o desenvolvimento da interface é necessário adicionar alguns recursos;
          2.2 - Entre no diretório "colors.xml" pelo caminho "res">"values">"colors.xml" e indique as cores que seram utilizadas na interface, exemplo: white, black e orange;
          2.3 - Entre no diretório "styles.xml" pelo caminho "res">"values">"styles.xml" e adicione os estilos "Numbers_Button" e "Operators_Button";
          2.4 - Faça o download de uma imagem backspace.png e cole no diretório "drawable";
PASSO 3:  3.1 - Para a interface do app, utilize um LinearLayout que cobrirá a tela inteira;
          3.2 - Volte ao "activity_main.xml" e crie dois TextViewers onde ficarão a expressão e o resultado;
          3.3 - Em seguida, crie 5 LinearLayouts, um abaixo do outro, onde ficaram enfileirados os numeros e operadores;
          3.4 - Coloque 4 TextViewers em cada LinearLayout e os configure, sendo que, para números, utilize o style "Numbers_Button" e para operadores, "Operators_Button"
          Obs.: No backspace é utilizado o ImageView ao invés do TextView, sendo necessário a imagem colada antes no diretório "drawable";
          3.5 - Para retirada do ActionBar é necessário digitar a linha de código: "supportActionBar!!.hide()" e em "styles.xml" mudar a cor de "colorPrimaryDark" para white;
PASSO 4:  4.1 - Antes de começar a configurar o aplicativo, é necessário sincronizar uma nova biblioteca;
          4.2 - Vá ao diretório "build.gradle(Module:app)" através do "Gradle Scripts" e adicione a seguinte biblioteca: "net.objecthunter:exp4j:0.4.8"
          4.3 - Clique em "Sync Now" para poderutilizá-la;
PASSO 5:  5.1 - Para iniciar a programação de seu aplicativo, você deve entrar no diretório "MainActivity.kt";
          5.2 - Crie o método "AcrescentarExpressao", ele irá imprimir todos os números ou operadores que forem apertados;
          5.3 - Codifique que, quando os TextViwers forem clicados, o programa chame o método "AcrescentarExpressao";
          5.4 - No caso do "limpar" ou "C" ao ser clicado, limpará expressao e resultado;
          5.5 - Já o "backspace" irá apenas limpar um número ou operador por vez;
          5.6 - No TextView do "igual" será onde utilizaremos nossa nova biblioteca, que fará todos os calculos matemáticos para o programa;
          5.7 - Utilizaremos a função "ExpressionBuilder" para tais calculos;
          
