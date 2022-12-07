package it.unisa.school;

import org.junit.Assert;
import org.junit.Test;

public class ProfessorTest {

    @Test
    public void toStringTest() {
        Professor p = new Professor("Ruth", "Smith", 1985, "English", 1500);
        Assert.assertEquals("Nome='Ruth', Cognome='Smith', Anno di nascita=1985, Argomento='English', Stipendio=1500.0", p.toString());
    }
}