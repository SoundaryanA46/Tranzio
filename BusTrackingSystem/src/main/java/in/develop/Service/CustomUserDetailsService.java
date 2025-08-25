package in.develop.Service;

import java.util.Collections;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import in.develop.Model.Admin;
import in.develop.Repo.AdminRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final AdminRepo repo;
    
    public CustomUserDetailsService(AdminRepo repo) {
    	this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = repo.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));

        return new User(
                admin.getUsername(),
                admin.getPassword(),
                Collections.emptyList() // No roles, just authentication
        );
    }
}
