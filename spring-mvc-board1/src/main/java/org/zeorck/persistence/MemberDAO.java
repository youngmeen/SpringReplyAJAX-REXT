package org.zeorck.persistence;

import org.zeorck.domain.MemberVO;

public interface MemberDAO {
	
	public String getTime();
	
	public void insertMember(MemberVO vo);
}
