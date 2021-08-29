package com.christianpari.SpringbootApp.service;

import com.christianpari.SpringbootApp.models.User;
import com.christianpari.SpringbootApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
  @Autowired
  UserRepository repo;

  // GET
  public List<User> getAllUsers() { return repo.findAll(); }

  public User getUserById(Long id) { return repo.findById(id).isPresent() ? repo.findById(id).get() : null; }

  public User getUserByUsername(String username) {
    return repo.findByUsername(username).isPresent() ?
      repo.findByUsername(username).get() : null;
  }

  // PUT
  public User updateUser(User updatedUser) {
    User user = getUserById(updatedUser.getId());
    User prevUser = getUserById(updatedUser.getId());
    user.setName(updatedUser.getName() == null ? prevUser.getName() : updatedUser.getName());
    user.setUsername(updatedUser.getUsername() == null ? prevUser.getUsername() : updatedUser.getUsername());
    user.setEmail(updatedUser.getEmail() == null ? prevUser.getEmail() : updatedUser.getEmail());
    user.setPassword(updatedUser.getPassword() == null ? prevUser.getPassword() : updatedUser.getPassword());
    repo.save(user);
    return user;
  }

  // DELETE
  public String deleteUser(Long id) {
    User user = getUserById(id);
    repo.delete(user);
    return String.format("Deleted User: %s, %s", user.getId(), user.getUsername());
  }
}
