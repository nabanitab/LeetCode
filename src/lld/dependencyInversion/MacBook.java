package lld.dependencyInversion;

public class MacBook {
    private final WiredKeyBoard keyBoard;

    private final WiredMouse wiredMouse;

    public MacBook(WiredKeyBoard keyBoard, WiredMouse wiredMouse) {
        this.keyBoard = keyBoard;
        this.wiredMouse = wiredMouse;
    }
}
