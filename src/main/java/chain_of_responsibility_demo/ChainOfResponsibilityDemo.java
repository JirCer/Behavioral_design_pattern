package chain_of_responsibility_demo;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        // Create handlers
        CarHandler economyCar = new EconomyCar();
        CarHandler sportCar = new SportCar();
        CarHandler luxuryCar = new LuxuryCar();

        // Set up the chain
        economyCar.setNextHandler(sportCar);
        sportCar.setNextHandler(luxuryCar);

        // Make requests
        System.out.println(economyCar.handleRequest("basic features"));  // Handled by EconomyCar
        System.out.println(economyCar.handleRequest("speed features"));  // Handled by SportsCar
        System.out.println(economyCar.handleRequest("luxury features")); // Handled by LuxuryCar
        System.out.println(economyCar.handleRequest("off-road features")); // Not handled
    }
}
