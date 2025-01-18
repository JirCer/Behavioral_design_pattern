package chain_of_responsibility_demo;

public class EconomyCar extends CarHandler {
    @Override
    public String handleRequest(String request) {
        if ("basic features".equals(request)) {
            return "EconomyCar: Handling request for basic features.";
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(request);
        }
        return "EconomyCar: Request '" + request + "' could not be handled.";
    }
}
