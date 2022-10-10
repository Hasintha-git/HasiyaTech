package com.hasiyatech.hasiyatechapplication;

import com.hasiyatech.hasiyatechapplication.model.User;
import com.hasiyatech.hasiyatechapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findAllByUserName(username);
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username ));
        return user.map(MyUserDetails::new).get();
//        return new MyUserDetails(username);
    }
}
