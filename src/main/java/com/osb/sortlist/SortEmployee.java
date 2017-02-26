package com.osb.sortlist;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class SortEmployee implements Comparable<SortEmployee> {
    
    private String name;

    public SortEmployee( String name) {
        this.name = name;
    }

    @Override
    public int compareTo(SortEmployee employee1) {
        return this.name.compareToIgnoreCase(employee1.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
