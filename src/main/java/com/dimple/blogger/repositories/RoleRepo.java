package com.dimple.blogger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dimple.blogger.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
