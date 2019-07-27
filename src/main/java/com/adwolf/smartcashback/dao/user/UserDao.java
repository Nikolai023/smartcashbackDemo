package com.adwolf.smartcashback.dao.user;

import com.adwolf.smartcashback.entity.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User getUserByLogin(String login);
}
