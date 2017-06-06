package ru.kpfu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.model.Post;

/**
 * Created by Andrey on 05.06.2017.
 */
@Repository
public interface PostsRepository extends JpaRepository<Post, Integer> {
}
