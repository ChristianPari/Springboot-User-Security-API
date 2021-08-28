package com.christianpari.SpringbootApp.repository;

import com.christianpari.SpringbootApp.models.ERole;
import com.christianpari.SpringbootApp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
