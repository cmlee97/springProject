package kr.ezen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ezen.bbs.domain.BoardDTO;
import kr.ezen.bbs.domain.PageDTO;
import kr.ezen.bbs.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void register(BoardDTO dto) {
		mapper.insert(dto);
	}

	@Override
//	public List<BoardDTO> getList() {	
//		return mapper.getList();
//	}
	public List<BoardDTO> getList(PageDTO pDto) {
		int totalCnt = mapper.totalCnt();
		pDto.setValue(totalCnt, pDto.getCntPerPage());
		return mapper.getList(pDto);
	}

	@Override
	public BoardDTO view(int bid, String mode) {
		//조회수 증가
		if(mode.equals("v")) {
			mapper.hitAdd(bid);
		}
		return mapper.view(bid);
	}

	@Override
	public int modify(BoardDTO dto) {
		return mapper.update(dto);
	}

	@Override
	public int remove(int bid) {
		return mapper.delete(bid);
	}

	@Override
	public int totalCnt() {
		return mapper.totalCnt();
	}
	
	
}
