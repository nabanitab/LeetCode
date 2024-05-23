package lld.wrongDependenceyInversion;

public class MacBook {

    private final WiredKeyBoard keyBoard;

    private final WiredMouse wiredMouse;

    public MacBook() {
       keyBoard = new WiredKeyBoard();
        wiredMouse = new WiredMouse();
    }
}
