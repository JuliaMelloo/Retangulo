public class Main {
    public static void main(String[] args) {
        RetanguloComBordasArredondadas retangulo1 = new RetanguloComBordasArredondadas(10, 5, "Hello");
        RetanguloComLinhasDuplas retangulo2 = new RetanguloComLinhasDuplas(10, 5, "World");
        RetanguloComASCIIArt retangulo3 = new RetanguloComASCIIArt(10, 5, "Java");

        retangulo1.desenhar();
        retangulo2.desenhar();
        retangulo3.desenhar();
    }
}