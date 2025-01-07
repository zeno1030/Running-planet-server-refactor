package clofi.runningplanet.rank.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * clofi.runningplanet.rank.dto.QPersonalRankResponse is a Querydsl Projection type for PersonalRankResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QPersonalRankResponse extends ConstructorExpression<PersonalRankResponse> {

    private static final long serialVersionUID = -394975838L;

    public QPersonalRankResponse(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> nickname, com.querydsl.core.types.Expression<Integer> planetCnt, com.querydsl.core.types.Expression<Integer> distance) {
        super(PersonalRankResponse.class, new Class<?>[]{long.class, String.class, int.class, int.class}, id, nickname, planetCnt, distance);
    }

}

