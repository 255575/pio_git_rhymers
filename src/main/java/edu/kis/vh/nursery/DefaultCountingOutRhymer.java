package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_SIZE = 12;
    private static final int EMPTY_ERROR = -1;
    private static final int FULL_CONST = 11;
    private static final int PEEKABOO_EMPTY = -1;
    private static final int COUNT_EMPTY = -1;

    private final int[] numbers = new int[NUMBERS_SIZE];

    protected int total = EMPTY_ERROR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == EMPTY_ERROR;
    }

    public boolean isFull() {
        return total == FULL_CONST;
    }

    protected int peekaboo() {
        if (isEmpty())
            return PEEKABOO_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (isEmpty())
            return COUNT_EMPTY;
        return numbers[total--];
    }

}