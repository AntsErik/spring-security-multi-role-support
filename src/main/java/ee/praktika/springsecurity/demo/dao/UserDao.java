package ee.praktika.springsecurity.demo.dao;

import ee.praktika.springsecurity.demo.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    
    void save(User user);
    
}
