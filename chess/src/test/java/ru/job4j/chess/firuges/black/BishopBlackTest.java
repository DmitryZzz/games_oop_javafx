package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        Cell expected = Cell.C1;
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell result = bb.position();
        assertThat(result, is(expected));
    }

    @Test
    public void way() {
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] result = bb.way(Cell.C1, Cell.G5);
        assertThat(result, is(expected));
    }

    @Test
    public void isDiagonal() {
        BishopBlack bb = new BishopBlack(Cell.C1);

        System.out.println(bb.isDiagonal(Cell.A2, Cell.C3));

    }

    @Test
    public void copy() {
        Cell expected = Cell.C2;
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell result = bb.copy(Cell.C2).position();
        assertThat(result, is(expected));
    }
}