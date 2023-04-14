package org.koreait.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.models.board.Board;
import org.koreait.models.board.BoardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
//@Transactional // 테스트에 한해서 데이터가 추가 되었다가 끝나면 삭제 (모의객체)
public class BoardDaoTest {
    @Autowired
    private BoardDao boardDao;

    @Test
    @DisplayName("게시글 추가 테스트")
    public void insertTest(){
        Board board = new Board();
        board.setSubject("제목");
        board.setContent("내용");

        boolean result = boardDao.insert(board);
        assertTrue(result);


    }

    @Test
    @DisplayName("게시글 조회 테스트")
    public void getTest(){
        Board board = boardDao.get(3L); // long값이라 3L
        System.out.println(board);
    }




}
