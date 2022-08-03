/*Para criar um pacote: 
 - Sempre letra minuscuça
 - Na IDE JAVA, usar NEW PACKAGE
 - Pacotes servem para organizar o código fonte do projeto;
 - Pacotes indicam onde determinado arquivo do projeto se encontra;
 - Os nomes de pacotes devem ser em letras minúsculas, sem espaço, sem caractere especial, sem acentuação
 - Por convenção, é utilizado nos nomes de pacotes, o domínio da empresa criadora do projeto, ao contrário
 sendo a última parte do nome o especificador do pacote; 
 
 PADRÃO DE PROJETO
 - MVC (MODE VIEW CONTROLLER)

    Existem somente 3 modificadores (private, protected e public), e com isso temos 4 níveis de visibilidade

    Os níveis são os que você disse: private, default, protected e public

    Private: A única classe que tem acesso ao atributo é a própria classe que o define, ou seja, se uma classe Pessoa declara um atributo privado chamado nome, somente a classe Pessoa terá acesso a ele.

    Default: Tem acesso a um atributo default (identificado pela ausência de modificadores) todas as classes que estiverem no mesmo pacote que a classe que possui o atributo.

    Protected: Esse é o que pega mais gente, ele é praticamente igual ao default, com a diferença de que se uma classe (mesmo que esteja fora do pacote) estende da classe com o atributo protected, ela terá acesso a ele. Então o acesso é por pacote e por herança.

    Public: Esse é fácil, todos tem acesso :)

*/
