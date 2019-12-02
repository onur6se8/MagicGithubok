package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;           // import
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {     // class   repertoire

    private final ApiService apiService;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {   // obtenir un utilisateur

        return apiService.getUsers();
    }

    public void generateRandomUser() {   //   générer des utilisateurs aléatoires

        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {   // supprimer un utilisateur


        apiService.deleteUser(user);
    }
}
                         // FAS appartient a la class mere  ApiService