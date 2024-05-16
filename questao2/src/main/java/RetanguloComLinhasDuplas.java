class RetanguloComLinhasDuplas extends Retangulo {
    public RetanguloComLinhasDuplas(int largura, int altura, String texto) {
        super(largura, altura, texto);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando retângulo com linhas duplas:");
    }
}