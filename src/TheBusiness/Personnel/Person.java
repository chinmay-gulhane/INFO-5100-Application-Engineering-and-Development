/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.Personnel;

/**
 *
 * @author kal bugrara
 */
public class Person {

    String name;

    public Person(String name) {

        this.name = name;
    }

    public String getPersonName() {
        return name;
    }

    public boolean isMatch(String name) {
        if (getPersonName().equals(name)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getPersonName();
    }
}
