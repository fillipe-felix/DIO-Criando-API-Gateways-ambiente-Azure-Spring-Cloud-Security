package com.api.dio.springbootjtw.service;

import com.api.dio.springbootjtw.entity.UserEntity;
import com.api.dio.springbootjtw.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserDetailServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        criarUsuario();

        UserEntity userEntity = userRepository.findById(username)
                .orElseThrow(() -> new UsernameNotFoundException(username));


        return new User(userEntity.getUserName(), userEntity.getPassword(), Collections.emptyList());
    }

    public List<UserEntity> listUser(){
        return userRepository.findAll();
    }



    public void criarUsuario(){

        UserEntity user = new UserEntity();
        user.setUserName("fillipe");
        user.setPassword(bCryptPasswordEncoder.encode("123"));

        userRepository.save(user);
    }
}
