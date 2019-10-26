package ee.praktika.springsecurity.demo.dao;

import ee.praktika.springsecurity.demo.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
