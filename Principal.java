public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("Volkswagen");
        carro.setModelo("Gol");
        carro.setAno(2010);

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        System.out.println(carro.placa());

    }
    
}

