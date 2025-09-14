public class Conditional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        if (anoDeLancamento >= 2022 && incluidoNoPlano && notaDoFilme >= 8.0) {
            System.out.println("Filme lançado em " + anoDeLancamento + ", incluído no plano e com ótima avaliação!");
        } else if (anoDeLancamento >= 2022 && incluidoNoPlano) {
            System.out.println("Filme lançado em " + anoDeLancamento + " e incluído no plano.");
        } else if (incluidoNoPlano && notaDoFilme >= 8.0) {
            System.out.println("Filme incluído no plano e com ótima avaliação!");
        } else {
            System.out.println("Filme não atende aos critérios especiais.");
        }
    }
}
