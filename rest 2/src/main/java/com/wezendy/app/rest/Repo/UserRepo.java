package com.wezendy.app.rest.Repo;

import com.wezendy.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository <User, Long> {
}
