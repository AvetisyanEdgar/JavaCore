package homework.braceChecker;

public class BraceChecker {
    // Stack class-ի օբյեկտը
    Stack stack = new Stack();
    boolean isCorrect = true;
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    stack.push(text.charAt(i));
            }
        }
        for (int i = text.length() - 1; i > 0; i--) {
            switch (text.charAt(i)) {
                case ')':
                    if (stack.array[stack.index] != '(') {
                        // (th)-ն փակագծերով եմ գրել, քերականական մանրունքները անցնելու համար
                        System.err.println("Closed ) but opened " + (char) stack.array[stack.index] + " at " + (i + 1) + "(th) letter");
                        isCorrect = false;
                    }
                    stack.pop();
                    break;

                case '}':
                    if (stack.array[stack.index] != '{') {
                        System.err.println("Closed } but opened " + (char) stack.array[stack.index] + " at " + (i + 1) + "(th) letter");
                        isCorrect = false;
                    }
                    stack.pop();
                    break;

                case ']':
                    if (stack.array[stack.index] != '[') {
                        System.err.println("Closed ] but opened " + (char) stack.array[stack.index] + " at " + (i + 1) + "(th) letter");
                        isCorrect = false;
                    }
                    stack.pop();
                    break;
            }

        }
        if (isCorrect) System.out.println("All is correct");
    }
}


