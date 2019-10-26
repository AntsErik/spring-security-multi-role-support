package ee.praktika.springsecurity.demo.service;

import ee.praktika.springsecurity.demo.entity.User;
import ee.praktika.springsecurity.demo.user.CrmUser;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    void save(CrmUser crmUser);
}
