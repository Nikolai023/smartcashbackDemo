package com.adwolf.smartcashback;

import com.adwolf.smartcashback.dao.user.UserDao;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UserDaoUserDetailsService implements UserDetailsService {

    private final UserDao userDao;

    public UserDaoUserDetailsService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.getUserByLogin(username);
    }
}
