package kr.ezen.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ezen.bbs.domain.BoardDTO;
import kr.ezen.bbs.domain.PageDTO;

@Mapper
public interface BoardMapper {
	//게시글 등록
	void insert(BoardDTO dto);
	//게시글 목록
//	List<BoardDTO> getList();
	List<BoardDTO> getList(PageDTO pDTO);
	//글 상세보기
	BoardDTO view(int bid);
	//글 수정하기
	int update(BoardDTO dto);
	//글 삭제하기
	int delete(int bid);
	//조회수
	void hitAdd(int bid);
	//전체 게시글 수
	int totalCnt();
}
