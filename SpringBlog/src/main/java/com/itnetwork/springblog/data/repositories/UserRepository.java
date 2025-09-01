package com.itnetwork.springblog.data.repositories;

import com.itnetwork.springblog.data.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long>{
    Optional<UserEntity> findByEmail(String email);
}
