package com.app.person;

import com.jk.webstack.controllers.JKWebControllerWithOrmSupport;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named("controller")
@ViewScoped
public class Controller extends JKWebControllerWithOrmSupport<Model> {
}
