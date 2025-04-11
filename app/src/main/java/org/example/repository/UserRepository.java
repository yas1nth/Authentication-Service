package org.example.repository;

import org.example.entities.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, Long> {
    public UserInfo findByUserName(String username);
    public UserInfo findByEmail(String email);
    public UserInfo findByPhoneNumber(String phoneNumber);
}
