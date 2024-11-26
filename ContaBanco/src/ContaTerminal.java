public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("/---------------------/");
        System.out.println("Seja bem vindo ao sistema de depósitos do banco Kaio Santana!");
        MetodosBanco metodosBanco = new MetodosBanco();

        metodosBanco.mostrarDadosBancarios();

    }
}
