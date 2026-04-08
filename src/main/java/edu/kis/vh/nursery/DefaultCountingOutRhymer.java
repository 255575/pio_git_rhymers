package edu.kis.vh.nursery;

/**
 * Klasa reprezentująca domyślną wyliczankę działającą w oparciu o stos (LIFO).
 */
public class DefaultCountingOutRhymer {

    private static final int NUMBERS_SIZE = 12;
    private static final int EMPTY_ERROR = -1;
    private static final int FULL_CONST = 11;
    private static final int PEEKABOO_EMPTY = -1;
    private static final int COUNT_EMPTY = -1;

    private final int[] numbers = new int[NUMBERS_SIZE];

    private int total = EMPTY_ERROR;

    public int getTotal() {
        return total;
    }

    /**
     * Dodaje nową wartość do wyliczanki.
     *
     * @param in wartość do dodania
     */
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

    /**
     * Zwraca ostatnią wartość z wyliczanki bez jej usuwania.
     *
     * @return ostatnia wartość lub EMPTY jeśli struktura jest pusta
     */
    protected int peekaboo() {
        if (isEmpty())
            return PEEKABOO_EMPTY;
        return numbers[total];
    }

    /**
     * Zwraca i usuwa ostatnią wartość z wyliczanki.
     *
     * @return usunięta wartość lub EMPTY jeśli struktura jest pusta
     */
    public int countOut() {
        if (isEmpty())
            return COUNT_EMPTY;
        return numbers[total--];
    }

}