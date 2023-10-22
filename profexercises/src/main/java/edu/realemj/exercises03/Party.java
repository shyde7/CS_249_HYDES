package edu.realemj.exercises03;

public class Party {
    private Person [] people;

    public Party(String [] names) {
        int cnt = names.length;
        people = new Person[cnt];
        for(int i = 0; i < cnt; i++) {
            people[i] = new Person(names[i]);
        }
    }

    public int getPartyCnt() {
        return people.length;
    }

    public void printParty() {
        System.out.println("** PARTY ***********");
        //for(int i = 0; i < people.length; i++) {
        //    System.out.println("\t* " + people[i].getName());
        //}
        for(Person p: people) {
            System.out.println("\t* " + p.getName());
        }
        System.out.println("********************");
    }

}
