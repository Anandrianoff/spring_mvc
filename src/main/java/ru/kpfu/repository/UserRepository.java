package ru.kpfu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.model.User;

/**
 * Created by Andrey on 05.06.2017.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
