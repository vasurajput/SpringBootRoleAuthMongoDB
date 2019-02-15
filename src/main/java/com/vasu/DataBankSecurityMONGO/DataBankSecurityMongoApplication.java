package com.vasu.DataBankSecurityMONGO;

import com.vasu.DataBankSecurityMONGO.Model.Role;
import com.vasu.DataBankSecurityMONGO.Repositry.RoleRepositry;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataBankSecurityMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataBankSecurityMongoApplication.class, args);
    }

    @Bean
    CommandLineRunner init(RoleRepositry roleRepository) {

        return args -> {

            Role adminRole = roleRepository.findByRole("ADMIN");
            if (adminRole == null) {
                Role newAdminRole = new Role();
                newAdminRole.setRole("ADMIN");
                roleRepository.save(newAdminRole);
            }

            Role userRole = roleRepository.findByRole("USER");
            if (userRole == null) {
                Role newUserRole = new Role();
                newUserRole.setRole("USER");
                roleRepository.save(newUserRole);
            }
        };

    }

}
