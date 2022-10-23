package Aulas.OPP;

/*21 DE OUT DE 2022: ATRIBUTOS E MÉTODOS ESTÁTICOS


Usado para não depender do objeto. A classe consegue funcionar sem o objeto.

Mais proximo de uma função global no Java, deixa ela estatica e consegue usar ela fora.
* */

public class Calculadora {

        // atributo estático
        public static final double PI = 3.14;
        // final = impede a alteração do valor de PI, não da pra redefirnir para outros valores. É como uma const de JS

        // Método estático
        // Não pertence ao objeto, mas sim a classe
    //sempre nessa ordem:
        public static double soma(double a, double b) {

            return a + b;
        }
        //Método estático = algo não pertece ao objeto, mas a classe. Não dependendo de um objeto
        public static double subtracao(double a, double b) {

            return a - b;
        }

        public static double multiplicacao(double a, double b) {

            return a * b;
        }

        public static double divisao(double a, double b) {

            return a / b;
        }

        // main = auto-executavel. Significado de (String[] args) = passa argumento, os argumentos armazenados
        public static void main(String[] args) { // com o método estático não se precisa criar um objeto para pode chamar o método
            //forma de chamar um método estático
            double resultadoSoma = Calculadora.soma(1, 2); //caraacterística de um método estatico: chama ela pela classe e não pelo objeto.
            double resultadoSub = Calculadora.subtracao(10, 5);
            double resultadoMult = Calculadora.multiplicacao(10, 2);
            double resultadoDiv = Calculadora.divisao(10, 5);

            System.out.println(Calculadora.PI); // 3.14 - Math.PI = ver valor de pi
            //Exemplos de static, essas estatic já foram criadas, assim vc não precisa fazer todo o sistemas dessas operações.
            System.out.println(Math.pow(2, 3)); //8.0 -Math.pow = 2³: retorna a base elevada ao expoente power, ou seja, baseexpoente
            System.out.println(Math.PI); //3.141592653589793
            System.out.println(Math.sqrt(144)); //12.0 -Math.sqrt = retorna a raiz quadrada de um valor numérico.
            System.out.println(Math.cbrt(8)); //2.0 -Math. cbrt() é usada para encontrar a raiz cúbica de um número

            //Não daria para acessar this. Ou criar objetos com static
        }
}
