package dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import dto.BoardDTO;
import dto.PageDTO;
import dto.cardPageDTO;

public class FreeBoardDaoImp implements BoardDAO {
	private SqlSessionTemplate sqlSession;

	public FreeBoardDaoImp() {

	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int count() {
		return sqlSession.selectOne("freeBoard.count");
	}

	
	@Override
	public int count(PageDTO pv) {
		return sqlSession.selectOne("freeBoard.count", pv);
	}
	
	@Override
	public int count(BoardDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}	

	@Override
	public int count(cardPageDTO rpdto) {
		return sqlSession.selectOne("freeBoard.count", rpdto);
	}	
	
	@Override
	public List<BoardDTO> list(PageDTO pv) {
		return sqlSession.selectList("freeBoard.list", pv);
	}

	@Override
	public List<BoardDTO> list(cardPageDTO rpv) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void readCount(int num) {
		sqlSession.update("freeBoard.readCount", num);

	}

	@Override
	public BoardDTO content(int num) {
		return sqlSession.selectOne("freeBoard.view", num);
	}

	@Override
	public void reStepCount(BoardDTO dto) {
		sqlSession.update("freeBoard.reStepCount", dto);
	}

	@Override
	public void save(BoardDTO dto) {
		sqlSession.insert("freeBoard.save", dto);
	}

	@Override
	public BoardDTO updateNum(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BoardDTO dto) {
		sqlSession.update("freeBoard.update", dto);
	}

	@Override
	public void delete(int num) {
		sqlSession.delete("freeBoard.delete", num);
	}

	@Override
	public String getFile(int num) {
		return sqlSession.selectOne("freeBoard.uploadFile", num);
	}

	
	@Override
	public List<BoardDTO> comment(int num) {
		return sqlSession.selectList("freeComment.list", num);
	}
	
	@Override
	public void reStepCountComment(BoardDTO dto) {
		sqlSession.update("freeComment.reStepCount", dto);
	}

	@Override
	public void saveComment(BoardDTO dto) {
		sqlSession.insert("freeComment.save", dto);
	}

	@Override
	public void deleteComment(int num) {
		sqlSession.delete("freeComment.delete", num);
	}

	@Override
	public void updateComment(BoardDTO dto) {
		sqlSession.update("freeComment.update", dto);
		
	}


}// end class
