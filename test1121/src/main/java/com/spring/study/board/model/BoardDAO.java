package com.spring.study.board.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public List<Map<String, Object>> list(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("board.list", boardVO);
	}

	public void add(Map<String, Object> map) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.insert("board.add", map);
	}

	public BoardVO detail(int board_seq) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("board.detail", board_seq);
	}

	public void edit(Map<String, Object> map) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.update("board.update", map);
	}

	public void delete(Map<String, Object> map) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.delete("board.delete", map);
	}
	
	public void hits(int board_hits) {
		sqlSessionTemplate.update("board.hits", board_hits);
	}

	public int selectBoardListCnt(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("board.listCnt", boardVO);
	}

	public List<Map<String, Object>> search(BoardVO boardVO) {
		return sqlSessionTemplate.selectList("board.search", boardVO);
	}
}
