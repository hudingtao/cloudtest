package model.response;

import lombok.Data;

@Data
public class QueryResponseResult<T> extends ResponseResult {

    QueryResult<T> queryResult;

    public QueryResponseResult(ResultCode resultCode,QueryResult<T> queryResult){
        super(resultCode);
        this.queryResult = queryResult;
    }

}
