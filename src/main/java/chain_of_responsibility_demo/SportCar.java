package chain_of_responsibility_demo;

public class SportCar extends  CarHandler{
    @Override
    public String handleRequest(String request) {
        if ("speed features".equals(request)) {
            return "SportsCar: Handling request for speed features.";
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(request);
        }
        return "SportsCar: Request '" + request + "' could not be handled.";
    }
}
