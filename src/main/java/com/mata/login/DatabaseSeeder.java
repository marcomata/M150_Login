package com.mata.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private UserRepository userRepository;

    @Autowired
    public DatabaseSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<User> userList = new ArrayList<>();

        userList.add(new User("marcomata","matapass", "Y"));
        userList.add(new User("hansmuster","musterpass", "Y"));
        userList.add(new User("locogrande","grandepass", "N"));
        userList.add(new User("ninjaboy","boypass", "N"));

        this.userRepository.saveAll(userList);

    }
}
