package Generics.model;


import view.AuthorizationView;
import view.View;

import java.util.List;

public class PersonRepository {
    private BD personBD;
    private View view;

    public PersonRepository(View view) {
        this.view = view;
    }

    public void setPersonBD(BD personBD) {
        this.personBD = personBD;
    }

    public void signIn(String login, String password) {
        Person person = new Person(login, password);
        if (check(person)){
            personBD.createPersonRow(person);
            view.answer("Регистрация прошла успешно");
        } else {
            view.answer("Не удалось зарегистрироваться");
        }
    }

    private boolean check(Person person) {
        if (personBD.getList().contains(person)) {
            return false;
        }
        return true;
    }

    public void signUp(String login, String password) {
        List<Person> list = personBD.getList();
        for (Person person: list){
            if (person.getLogin().equals(login) && person.getPassword().equals(password)){
                view.answer("Вход успешный");
                return;
            }
        }
        view.answer("Неверный логин или пароль");
    }
}