package Springboot_rest_webservices.restful_webservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import Springboot_rest_webservices.restful_webservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
