public class App {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");

        int anoDeLancamento = 2022;
        String nomeDoFilme = "Top Gun: Maverick";
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        System.out.println("Filme: " + nomeDoFilme);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Incluído no Plano: " + (incluidoNoPlano ? "Sim" : "Não"));
        System.out.println("Nota do Filme: " + notaDoFilme);

        // convertendo tipos com casting
        double notaDoFilmeDouble = 8.1;
        int notaDoFilmeInt = (int) notaDoFilmeDouble;
        System.out.println("Nota do Filme (int): " + notaDoFilmeInt);
    }
}
