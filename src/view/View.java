package view;

import Model.User;

public interface View<U extends User> {
    void print(U user);
}