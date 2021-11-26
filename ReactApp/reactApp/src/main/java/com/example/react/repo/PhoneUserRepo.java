package com.example.react.repo;

import com.example.react.model.PhoneUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneUserRepo extends JpaRepository<PhoneUser,Long>
{
     PhoneUser findById(long id);
}
