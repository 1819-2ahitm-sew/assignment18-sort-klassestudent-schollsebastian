package at.htl.klassestudent;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class KlasseStudentTest {
    @Test
    public void testA() {
        Student[] arrayToSort = {
                new Student("Philipp", "Edlinger"),
                new Student("Lukas", "Starka"),
                new Student("Sebastian", "Scholl"),
                new Student("Jonas", "Wiesinger"),
                new Student("Quirin", "Ecker"),
                new Student("Maximilian", "Fuchs"),
                new Student("Wilma", "Fuchs")
        };
        Student[] expected = arrayToSort.clone();

        Klasse klasse = new Klasse(0, arrayToSort);
        klasse.sortBubble();

        Arrays.sort(expected);

        assertThat(klasse.getStudents(), is(expected));
    }

    @Test
    public void testB() {
        Student[] arrayToSort = {
                new Student("Philipp", "Edlinger"),
                new Student("Lukas", "Starka"),
                new Student("Sebastian", "Scholl"),
                new Student("Jonas", "Wiesinger"),
                new Student("Quirin", "Ecker"),
                new Student("Maximilian", "Fuchs"),
                new Student("Wilma", "Fuchs")
        };
        Student[] expected = arrayToSort.clone();

        Klasse klasse = new Klasse(0, arrayToSort);
        klasse.sortInsertion();

        Arrays.sort(expected);

        assertThat(klasse.getStudents(), is(expected));
    }
}