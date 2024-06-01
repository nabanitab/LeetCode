package stack;

class BrowserHistoryStack {
    private int maxSize;
    private int top;
    private String[] historyStack;

    // Constructor
    public BrowserHistoryStack(int size) {
        maxSize = size;
        historyStack = new String[maxSize];
        top = -1;
    }

    // Visit a new URL
    public void visit(String url) {
        if (isFull()) {
            System.out.println("Browser history is full. Unable to visit " + url);
        } else {
            historyStack[++top] = url;
            System.out.println("Visited: " + url);
        }
    }

    // Go back to the previous URL
    public String back() {
        if (isEmpty()) {
            System.out.println("No previous URL. Unable to go back.");
            return null; // Indicates no URL to return
        } else {
            String previousUrl = historyStack[top--];
            System.out.println("Going back from: " + previousUrl);
            return previousUrl;
        }
    }

    // Peek the current URL
    public String currentUrl() {
        if (isEmpty()) {
            System.out.println("No current URL.");
            return null; // Indicates no URL
        } else {
            return historyStack[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Display the browser history
    public void displayHistory() {
        if (isEmpty()) {
            System.out.println("No browsing history.");
        } else {
            System.out.print("Browser history: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(historyStack[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the browser history stack
    public static void main(String[] args) {
        BrowserHistoryStack browserHistory = new BrowserHistoryStack(5); // History size of 5

        browserHistory.visit("https://example.com");
        browserHistory.visit("https://google.com");
        browserHistory.visit("https://openai.com");

        browserHistory.displayHistory();

        System.out.println("Current URL: " + browserHistory.currentUrl());
        System.out.println("Back: " + browserHistory.back());
        System.out.println("Current URL after back: " + browserHistory.currentUrl());

        browserHistory.displayHistory();

        browserHistory.visit("https://github.com"); // Visit another URL
        browserHistory.displayHistory();

        browserHistory.visit("https://stackoverflow.com"); // Attempt to visit more URLs
        browserHistory.visit("https://news.ycombinator.com"); // History is full
        browserHistory.displayHistory();
    }
}

