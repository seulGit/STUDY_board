package com.spring.study.board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.study.board.model.BoardDAO;
import com.spring.study.board.model.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	public List<Map<String, Object>> list(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return boardDAO.list(boardVO);
	}

	public void add(Map<String, Object> map) {
		// TODO Auto-generated method stub
		boardDAO.add(map);
	}

	public BoardVO detail(int board_seq) {
		// TODO Auto-generated method stub
		return boardDAO.detail(board_seq);
	}

	public void edit(Map<String, Object> map) {
		// TODO Auto-generated method stub
		boardDAO.edit(map);
	}

	public void delete(Map<String, Object> map) {
		// TODO Auto-generated method stub
		boardDAO.delete(map);
	}
	
	public void hits(int board_hits) {
		boardDAO.hits(board_hits);
	}

	public int selectBoardListCnt(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return boardDAO.selectBoardListCnt(boardVO);
	}

	public List<Map<String, Object>> search(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return boardDAO.search(boardVO);
	}

}
