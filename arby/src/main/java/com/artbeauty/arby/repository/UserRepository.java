package com.artbeauty.arby.repository;

import com.artbeauty.arby.model.UserArby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserArby, Long> {
}
