package com.example.fragment;

public class Person {
    String language;

    public String getLanguage(ListPerson listPerson) {
        switch (listPerson) {
            case VIETNAM:
                language = new Vietnamese().getLanguage(listPerson);
            case AMERICAN:
                language = new American().getLanguage(listPerson);
        }
        return language;
    }
}
