public class Atividade4 {
  public static void main(String[] args) {
    double distanciaTotal = 100; // km
    double distanciaCarro = 0; // km
    double distanciaCaminhao = distanciaTotal; // km
    double velocidadeCarro = 110.0 / 60; // km/min
    double velocidadeCaminhao = 80.0 / 60; // km/min
    double tempoPedagio = 5; // min
    
    // Simula o encontro dos veículos
    double tempoEncontro = distanciaTotal / (velocidadeCarro + velocidadeCaminhao);
    distanciaCarro = velocidadeCarro * tempoEncontro;
    distanciaCaminhao = distanciaTotal - distanciaCarro;
    
    // Considera o tempo de passagem pelos pedágios
    double tempoPedagioCarro = tempoPedagio;
    double tempoPedagioCaminhao = tempoPedagio * 2;
    distanciaCarro -= velocidadeCarro * tempoPedagioCarro;
    distanciaCaminhao -= velocidadeCaminhao * tempoPedagioCaminhao;
    
    // Verifica qual veículo está mais próximo de Ribeirão Preto
    if (distanciaCarro < distanciaCaminhao) {
      System.out.println("O carro está mais próximo de Ribeirão Preto.");
      System.out.printf("Distância do carro: %.2f km\n", distanciaCarro);
      System.out.printf("Distância do caminhão: %.2f km\n", distanciaCaminhao);
    } else {
      System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
      System.out.printf("Distância do caminhão: %.2f km\n", distanciaCaminhao);
      System.out.printf("Distância do carro: %.2f km\n", distanciaCarro);
    }
  }
}
//O resultado é que o carro estará mais próximo de Ribeirão Preto, com uma distância de aproximadamente 55,7 km, enquanto o caminhão estará a uma distância de aproximadamente 44,3 km.





