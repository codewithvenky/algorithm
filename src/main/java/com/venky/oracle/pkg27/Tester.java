package com.venky.oracle.pkg27;

public class Tester {
    public static Person createPeople() {
        Person jane = new Person("Jane");
        Person john = new Person("John", jane);
        return jane;
    }
        public static Person createPerson(Person person)
    {
        person = new Person("Jack",person);
        return person;
    }

        public static void main (String[]args){
            Person person = createPeople();
             //. line 1 * /
            person = createPerson(person);
            // *line 2 /
            String name = person.toString();
            System.out.println(name);
        }
    }

    /* Option B is True
    */
