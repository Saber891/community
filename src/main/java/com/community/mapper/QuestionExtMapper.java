package com.community.mapper;

import com.community.model.Question;

import java.util.List;

public interface QuestionExtMapper {
    int incView(Question record);

    int inCommentCount(Question record);

    List<Question> selectRelated(Question question);
}