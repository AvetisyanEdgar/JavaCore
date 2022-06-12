package homework.braceChecker;

public class BraceChecker {
    // Stack class-ի օբյեկտը
    Stack stack = new Stack();
    boolean isCorrect = true;
    private final String text;
    int pop;

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

                    break;
                case ')':
                    pop = stack.pop();
                    if (pop != '(') {
                        // (th)-ն փակագծերով եմ գրել, քերականական մանրունքները անցնելու համար
                        System.err.println("Closed ) but opened " + (char) pop + " at " + (i + 1) + "(th) letter");
                        isCorrect = false;
                    }
                    break;

                case '}':

                    pop = stack.pop();
                    if (pop != '{') {
                        System.err.println("Closed } but opened " + (char) pop + " at " + (i + 1) + "(th) letter");
                        isCorrect = false;
                    }
                    break;

                case ']':

                    pop = stack.pop();
                    if (pop != '[') {
                        System.err.println("Closed ] but opened " + (char) pop + " at " + (i + 1) + "(th) letter");
                        isCorrect = false;
                    }
                    break;
            }
        }
        if (stack.index == -1 && isCorrect) System.out.println("All is correct");
        while (stack.index > -1) {

            System.err.println((char)stack.pop() + " was opened, but not closed  ");
        }
    }

}



