package com.spring.study.board.model;

import java.util.Date;

public class BoardVO {

	private int board_seq;
	private int board_re_ref;
	private int board_re_lev;
	private int board_re_seq;
	private String board_writer;
	private String board_subject;
	private String board_content;
	private int board_hits;
	private String del_yn;
	private String ins_user_id;
	private Date ins_date;
	private String upd_user_id;
	private Date upd_date;
	
	private int currentPage;
	
	private String searchType;
	private String search; 
	

	public String getSearchType() {
		return searchType;
	}


	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}


	public String getSearch() {
		return search;
	}


	public void setSearch(String search) {
		this.search = search;
	}


	public int getBoard_seq() {
		return board_seq;
	}


	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}


	public int getBoard_re_ref() {
		return board_re_ref;
	}


	public void setBoard_re_ref(int board_re_ref) {
		this.board_re_ref = board_re_ref;
	}


	public int getBoard_re_lev() {
		return board_re_lev;
	}


	public void setBoard_re_lev(int board_re_lev) {
		this.board_re_lev = board_re_lev;
	}


	public int getBoard_re_seq() {
		return board_re_seq;
	}


	public void setBoard_re_seq(int board_re_seq) {
		this.board_re_seq = board_re_seq;
	}


	public String getBoard_writer() {
		return board_writer;
	}


	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}


	public String getBoard_subject() {
		return board_subject;
	}


	public void setBoard_subject(String board_subject) {
		this.board_subject = board_subject;
	}


	public String getBoard_content() {
		return board_content;
	}


	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}


	public int getBoard_hits() {
		return board_hits;
	}


	public void setBoard_hits(int board_hits) {
		this.board_hits = board_hits;
	}


	public String getDel_yn() {
		return del_yn;
	}


	public void setDel_yn(String del_yn) {
		this.del_yn = del_yn;
	}


	public String getIns_user_id() {
		return ins_user_id;
	}


	public void setIns_user_id(String ins_user_id) {
		this.ins_user_id = ins_user_id;
	}


	public Date getIns_date() {
		return ins_date;
	}


	public void setIns_date(Date ins_date) {
		this.ins_date = ins_date;
	}


	public String getUpd_user_id() {
		return upd_user_id;
	}


	public void setUpd_user_id(String upd_user_id) {
		this.upd_user_id = upd_user_id;
	}


	public Date getUpd_date() {
		return upd_date;
	}


	public void setUpd_date(Date upd_date) {
		this.upd_date = upd_date;
	}


	public int getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(int currentPage) {
		this.currentPage =(currentPage-1)*10;
	}





	@Override
	public String toString() {
		return "BoardVO [board_seq=" + board_seq + ", board_re_ref=" + board_re_ref + ", board_re_lev=" + board_re_lev
				+ ", board_re_seq=" + board_re_seq + ", board_writer=" + board_writer + ", board_subject="
				+ board_subject + ", board_content=" + board_content + ", board_hits=" + board_hits + ", del_yn="
				+ del_yn + ", ins_user_id=" + ins_user_id + ", ins_date=" + ins_date + ", upd_user_id=" + upd_user_id
				+ ", upd_date=" + upd_date + ", currentPage=" + currentPage + ", searchType=" + searchType + ", search="
				+ search + "]";
	}


	public BoardVO() {
	}
	
	




	public BoardVO(int board_seq, int board_re_ref, int board_re_lev, int board_re_seq, String board_writer,
			String board_subject, String board_content, int board_hits, String del_yn, String ins_user_id,
			Date ins_date, String upd_user_id, Date upd_date, int currentPage, String searchType, String search) {
		super();
		this.board_seq = board_seq;
		this.board_re_ref = board_re_ref;
		this.board_re_lev = board_re_lev;
		this.board_re_seq = board_re_seq;
		this.board_writer = board_writer;
		this.board_subject = board_subject;
		this.board_content = board_content;
		this.board_hits = board_hits;
		this.del_yn = del_yn;
		this.ins_user_id = ins_user_id;
		this.ins_date = ins_date;
		this.upd_user_id = upd_user_id;
		this.upd_date = upd_date;
		this.currentPage = currentPage;
		this.searchType = searchType;
		this.search = search;
	}


	public void setStartIndex(int startIndex) {
		// TODO Auto-generated method stub
		
	}
	public void setCntPerPage(int displayRow) {
		// TODO Auto-generated method stub
		
	}
	
	
}
