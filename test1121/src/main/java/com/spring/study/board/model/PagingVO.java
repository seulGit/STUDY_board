package com.spring.study.board.model;

public class PagingVO {

	//paging
	private int totalCount;		//전체 게시글 수 
	private int currentPage = 1;	//현재 페이지
	private int currentRange = 1;	//현재 블럭
	private int totalPage;		//전체 페이지 수
	private int totalRange;		//전체 블럭 수
	
	//pagination
	private int displayPage = 5;	//한 블럭당 몇 개의 페이지
	private int displayRow = 10;	//한 페이지에 몇 개의 로우
	private int beginPage = 1;			//페이징 시작 페이지 수
	private int endPage = 1;			//페이징 종료 페이지 수 
	private int startIndex = 0;			//시작 index
	private int nextPage;			//다음 페이지
	private int prevPage;			//이전 페이지
	
	
	
	public PagingVO(int totalCount, int currentPage) {
		// TODO Auto-generated constructor stub
		//현재페이지
		setCurrentPage(currentPage);
		//총 게시물 수 
		setTotalCount(totalCount);
		
		//총 페이지 수 
		setTotalPage(totalPage);
		//총 블럭 수
		setTotalRange(totalPage);
		//블럭 세팅
		rangeSetting(currentPage);
		
		setStartIndex(currentPage);
	}
	
	private void rangeSetting(int currentPage) {
		// TODO Auto-generated method stub
		setCurrentRange(currentPage);
		this.beginPage = (currentRange - 1) * displayPage+1 ;
		this.endPage = beginPage + displayPage -1 ;
		
		if(endPage > totalPage) {
			this.endPage = totalPage;
		}
		
		this.prevPage = currentPage -1;
		this.nextPage = currentPage +1;
	}

	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getCurrentRange() {
		return currentRange;
	}
	public void setCurrentRange(int currentPage) {
		this.currentRange = (int)((currentPage-1)/displayPage) +1;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = (int) Math.ceil(totalCount*1.0/displayRow);
	}
	public int getTotalRange() {
		return totalRange;
	}
	public void setTotalRange(int totalPage) {
		this.totalRange = (int) Math.ceil(totalPage*1.0/displayPage);
	}
	public int getDisplayPage() {
		return displayPage;
	}
	public void setDisplayPage(int displayPage) {
		this.displayPage = displayPage;
	}
	public int getDisplayRow() {
		return displayRow;
	}
	public void setDisplayRow(int displayRow) {
		this.displayRow = displayRow;
	}
	public int getBeginPage() {
		return beginPage;
	}
	public void setBeginPage(int beginPage) {
		this.beginPage = beginPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int currentPage) {
		this.startIndex = (currentPage-1) * displayRow;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}
	
	@Override
	public String toString() {
		return "PagingVO [totalCount=" + totalCount + ", currentPage=" + currentPage + ", currentRange=" + currentRange
				+ ", totalPage=" + totalPage + ", totalRange=" + totalRange + ", displayPage=" + displayPage
				+ ", displayRow=" + displayRow + ", beginPage=" + beginPage + ", endPage=" + endPage + ", startIndex="
				+ startIndex + ", nextPage=" + nextPage + ", prevPage=" + prevPage + "]";
	}
	
	
	
	
}
