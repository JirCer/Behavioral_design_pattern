package chain_of_responsibility_demo;

abstract class CarHandler {
    protected CarHandler nextHandler;

    // set the next handler in the chain
    public void setNextHandler(CarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Handles the request or passes it to the next handler
    public abstract String handleRequest(String request);
}
