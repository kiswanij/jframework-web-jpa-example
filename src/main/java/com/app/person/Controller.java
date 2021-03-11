package com.app.person;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.jk.webstack.controllers.JKManagedBeanWithOrmSupport;

@ManagedBean(name = "controller")
@ViewScoped
public class Controller extends JKManagedBeanWithOrmSupport<Model> {
}
