package Generics;

import controller.MyController;
import model.PersonBD;
import model.PersonRepository;
import view.AuthorizationView;
import view.View;

public class Main {
    public static void main(String[] args) {
        View view = new AuthorizationView();
        PersonRepository repository = new PersonRepository(view);
        repository.setPersonBD(new PersonBD());
        MyController controller = new MyController(repository);
        view.setController(controller);

        view.init();
    }
}