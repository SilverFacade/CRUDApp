package com.csc340sp23.bookmanager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author luska
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
    
    
}
