/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.security.service;

import com.maxime.security.model.Role;
import com.maxime.security.model.User;
import com.maxime.security.repository.UserRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author maxla
 */
@Service
public class UserServiceImpl implements IUserService{

    private UserRepository userRepository;
    private BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        User adminUser = new User("admin", "admin", "admin@admin.com", "admin");
        adminUser.setRoles(Arrays.asList(new Role("ROLE_ADMIN")));
        adminUser.setPassword(passwordEncoder.encode(adminUser.getPassword()));
        userRepository.save(adminUser);
    }
    
    @Override
    public User findbyEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User save(User user) {
        // on hash le password
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        
        user.setRoles(Arrays.asList(new Role("Role_USER")));
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if(user == null){
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return user;
//        return new org.springframework.security.core.userdetails.User(user.getEmail(),
//                user.getPassword(), mapRolesAuthorities(user.getRoles()));
    }
//    private List<? extends GrantedAuthority> mapRolesAuthorities(List<Role> roles){
////       List<SimpleGrantedAuthority> authorities = new ArrayList<>();
////        for (Role r : roles) {
////            authorities.add(new SimpleGrantedAuthority(r.getName()));
////        }
////        return authorities;
//     return roles.stream()
//                .map(role -> new SimpleGrantedAuthority(role.getName()))
//                .collect(Collectors.toList());
//    }
}
