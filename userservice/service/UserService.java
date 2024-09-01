package org.squad.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.squad.userservice.entity.User;
import org.squad.userservice.exception.UserNotFoundException;
import org.squad.userservice.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers()
    {
        return userRepository.findAll();

    }

    public User createUser(User user)
    {
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id)
    {
        return userRepository.findById(id);
    }

    public User updateUser(Long id, User userDetails)
    {
        User user=userRepository.findById(id)
                .orElseThrow(()->new UserNotFoundException("User not found for this id::"+id));
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());

        return userRepository.save(user);

    }

    public void deleteUser(Long id)
    {
        userRepository.deleteById(id);
    }



}
