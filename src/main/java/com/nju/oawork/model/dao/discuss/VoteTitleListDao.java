package com.nju.oawork.model.dao.discuss;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nju.oawork.model.entity.discuss.VoteList;
import com.nju.oawork.model.entity.discuss.VoteTitles;

public interface VoteTitleListDao extends JpaRepository<VoteTitles, Long>{
	
	//根据投票id来找所有投票标题的集合
	List<VoteTitles> findByVoteList(VoteList voteList);
}
