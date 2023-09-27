package com.example.demo.store.repo;

import com.example.demo.store.entity.TaskEntity;
import com.example.demo.store.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, Long> {

    public UserEntity findByLogin(String login);

}
