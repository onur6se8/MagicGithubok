package com.openclassrooms.magicgithub.base;

import com.openclassrooms.magicgithub.MagicGithubApplication;
import com.openclassrooms.magicgithub.repository.UserRepository;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {          // class fille  abstraite

    public UserRepository getUserRepository() {
        return ((MagicGithubApplication) getApplication()).getUserRepository();
    }
}
