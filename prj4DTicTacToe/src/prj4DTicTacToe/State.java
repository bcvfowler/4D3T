package prj4DTicTacToe;

public enum State {

    CROSSTURN {
        @Override
        State doSomething(String aParameter) {
            System.out.println("Doing Something in INITIAL state and jumping to NEXT_STEP, argument = " + aParameter);
            return this;
        }
    },
    CIRCLETURN {
        @Override
        State doSomething(String aParameter) {
            System.out.println("Doing Something in NEXT_STEP and jumping into FINAL, argument = " + aParameter);
            return this;
        }
    },
    CROSSBLOCKER {
        @Override
        State doSomething(String aParameter) {
            System.out.println("I am in FINAL state, argument = " + aParameter);
            return this;
        }
    },
    CIRCLEBLOCKER {
        @Override
        State doSomething(String aParameter) {
            System.out.println("I am in FINAL state, argument = " + aParameter);
            return this;
        }
    };

    abstract State doSomething(String aParameter);
}
