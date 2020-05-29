package com.example.demo;
import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class SpringSecurityAuditorAware implements AuditorAware<String>{

    @Override
    public Optional<String> getCurrentAuditor(){

        return  Optional.ofNullable("Muhaimie").filter(s->!s.isEmpty());
    }

}