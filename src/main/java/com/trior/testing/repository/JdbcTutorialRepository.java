package com.trior.testing.repository;

import com.trior.testing.model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcTutorialRepository implements TutorialRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Tutorial book) {
        return jdbcTemplate.update("INSERT INTO tutorials(title,description,published) VALUES(?,?,?)",
                book.getTitle(),book.getDescription(), book.isPublished());
    }

    @Override
    public int update(Tutorial book) {
        return 0;
    }

    @Override
    public Tutorial findById(Long id) {
        return null;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public List<Tutorial> findAll() {
        return null;
    }

    @Override
    public List<Tutorial> findByPublished(boolean published) {
        return null;
    }

    @Override
    public List<Tutorial> findByTitleContaining(String title) {
        return null;
    }

    @Override
    public int deleteAll() {
        return 0;
    }
}
