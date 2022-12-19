package Generics.view;


import controller.MyController;

public interface View {
    void answer(String message);
    void setController(MyController controller);
    void init();
}
