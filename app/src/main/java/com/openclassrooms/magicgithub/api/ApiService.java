package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;    // import
import java.util.List;
import androidx.annotation.Nullable;

// class
public interface ApiService {      // classe mère      une interface est une classe 100 % abstraite, il ne vous reste qu'à y ajouter des méthodes abstraites, mais sans le mot clé abstract
    List<User> getUsers();
    void generateRandomUser();           // fonction
    void deleteUser(User username);
}
