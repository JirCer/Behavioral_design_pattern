package chain_of_responsibility_demo;

public class LuxuryCar extends CarHandler{
    @Override
    public String handleRequest(String request) {
        if ("luxury features".equals(request)) {
            return "LuxuryCar: Handling request for luxury features.";
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(request);
        }
        return "LuxuryCar: Request '" + request + "' could not be handled.";
    }
}
