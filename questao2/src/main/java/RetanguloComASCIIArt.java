class RetanguloComASCIIArt extends Retangulo {
    public RetanguloComASCIIArt(int largura, int altura, String texto) {
        super(largura, altura, texto);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando retângulo com ASCII art:");
    }
}