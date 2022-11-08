package com.example.myapp1;

import com.example.myapp1.dao.RolesDao;
import com.example.myapp1.ds.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class MyApp1Application {

    @Autowired
    private RolesDao rolesDao;

    public static void main(String[] args) {
        SpringApplication.run(MyApp1Application.class, args);
    }

    @Bean @Profile("dev") @Transactional
    public ApplicationRunner runner(){
        return r ->{
            Roles admin=new Roles();
            admin.setRoleName("ROLE_ADMIN");
            Roles user=new Roles();
            user.setRoleName("ROLE_USER");
            rolesDao.save(admin);
            rolesDao.save(user);
        };
    }

}
