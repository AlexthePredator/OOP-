package it.unisa.country;

import org.junit.Assert;
import org.junit.Test;

public class DataSetTest {
    @Test
    public void testMinimum() {
        Country usa = new Country("Stati Uniti", 9870000);
        Country cina = new Country("Cina", 9500000);
        Country canada = new Country("Canada", 9897000);
        DataSet dataSet = new DataSet();
        dataSet.add(usa);
        dataSet.add(cina);
        dataSet.add(canada);
        Assert.assertEquals("Cina", dataSet.getMinimum().getName());
    }

    @Test
    public void testMaximum() {
        Country usa = new Country("Stati Uniti", 9870000);
        Country cina = new Country("Cina", 9500000);
        Country canada = new Country("Canada", 9897000);
        DataSet dataSet = new DataSet();
        dataSet.add(usa);
        dataSet.add(cina);
        dataSet.add(canada);
        Assert.assertEquals("Canada", dataSet.getMaximum().getName());
    }
}