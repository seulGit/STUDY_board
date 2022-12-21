package com.spring.study.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.study.board.model.BoardVO;
import com.spring.study.board.model.PagingVO;
import com.spring.study.board.service.BoardService;


@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	BoardVO boardVO;

	@GetMapping("/")
	public String main() {
		return "home";
	}
	
	@GetMapping("/list")
	public String boardList(Model model, 
							@ModelAttribute("boardVO") BoardVO boardVO,
							@RequestParam(defaultValue="1") int currentPage) {
		
		//페이징처리
		int totalCount = boardService.selectBoardListCnt(boardVO);	//전체게시물수
		
		PagingVO pagingVO = new PagingVO(totalCount, currentPage);
		
		boardVO.setStartIndex(pagingVO.getStartIndex()); //뭔지 모름..
		boardVO.setCntPerPage(pagingVO.getDisplayRow()); //한페이지에 게시물 수
		boardVO.setCurrentPage(pagingVO.getCurrentPage()); //현재페이지
		
		List<Map<String, Object>> list = boardService.list(boardVO); //전체목록조회
		
		model.addAttribute("board", list);
		model.addAttribute("totalCount", totalCount);
		
		model.addAttribute("search", boardVO.getSearch());
		model.addAttribute("searchType", boardVO.getSearchType());
		System.out.println(model);
		model.addAttribute("pagingVO", pagingVO);
		
		return "list";
	}
	
	@GetMapping("/detail/{board_seq}")
	public String detail(@PathVariable int board_seq, Model model) {

		//조회수 증가
		boardService.hits(board_seq); 
		//상세페이지조회
		boardVO = boardService.detail(board_seq);
		model.addAttribute("board", boardVO);

		return "detail";
	}
	
	@GetMapping("/new")
	public String addForm() {
		return "new";
	}
	
	@PostMapping("/new")
	public String add(@RequestParam Map<String, Object> map, RedirectAttributes redirectAttributes) {

		boardService.add(map);

		redirectAttributes.addAttribute("board_seq", map.get("board_seq"));
		redirectAttributes.addAttribute("status", true);
				
		return "redirect:/detail/{board_seq}";
	}
	
	@GetMapping("/edit/{board_seq}")
	public String editForm(@PathVariable int board_seq, Model model) {
		boardVO = boardService.detail(board_seq);
		model.addAttribute("board", boardVO);
		
		return "/edit";
	}
	
	@PostMapping("/edit/{board_seq}")
	public String edit(@PathVariable int board_seq, @RequestParam Map<String, Object> map, RedirectAttributes redirectAttributes) {
		boardService.edit(map);
		
		redirectAttributes.addAttribute("board_seq", map.get("board_seq"));
		redirectAttributes.addAttribute("status", true);
		
		return "redirect:/detail/{board_seq}";
	}

	@PostMapping("/delete")
	public String delete(@RequestParam Map<String, Object> map, RedirectAttributes redirectAttributes) {
		boardService.delete(map);
		
		redirectAttributes.addAttribute("board", map.get("board_seq"));
		
		return "redirect:/list";
	}	
	
	@GetMapping("/search")
	public String search(@ModelAttribute("boardVO")BoardVO boardVO, Model model) {
		int totalCount = boardService.selectBoardListCnt(boardVO);	//검색 결과 전체수

		List<Map<String, Object>> list = boardService.search(boardVO); //검색
		
		model.addAttribute("board", list);
		
		return "/list";
	}
}
