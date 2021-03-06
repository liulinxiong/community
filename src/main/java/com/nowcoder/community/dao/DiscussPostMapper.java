package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("DiscussPostMapper")
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPost(int userId,int offset,int limit);
    //@Param用于给参数取别名，如果只有一个参数，并且在动态sql语句中使用，必须取别名
    int selectDiscussPostRows(@Param("userId") int userId);
}
