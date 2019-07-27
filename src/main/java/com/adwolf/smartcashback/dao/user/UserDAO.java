package com.adwolf.smartcashback.dao.user;

import com.adwolf.smartcashback.entity.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User, Long> {

}
