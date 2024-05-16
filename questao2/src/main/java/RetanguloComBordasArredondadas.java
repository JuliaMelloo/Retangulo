class RetanguloComBordasArredondadas extends Retangulo {
    public RetanguloComBordasArredondadas(int largura, int altura, String texto) {
        super(largura, altura, texto);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando retângulo com bordas arredondadas:");
    }
}