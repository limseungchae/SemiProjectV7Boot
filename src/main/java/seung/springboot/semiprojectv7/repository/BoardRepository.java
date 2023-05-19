package seung.springboot.semiprojectv7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import seung.springboot.semiprojectv7.model.Board;

import javax.transaction.Transactional;

public interface BoardRepository extends JpaRepository<Board, Long> {
    
    // JpaRepository 에서는 DML은 지원 X
    // 단, Modifying, Transactional등을 추가하면 사용가능
    @Modifying
    @Transactional
    @Query("update Board set views = views + 1 where bno = :bno")
    int countViewBoard(@Param("bno") long bno);

}