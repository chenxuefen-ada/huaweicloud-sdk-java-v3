package com.huaweicloud.sdk.codehub.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codehub.v3.model.Error;
import com.huaweicloud.sdk.codehub.v3.model.RepoListInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class GetAllRepositoryByProjectIdResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error")
    
    private Error error = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private RepoListInfo result = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;

    public GetAllRepositoryByProjectIdResponse withError(Error error) {
        this.error = error;
        return this;
    }

    public GetAllRepositoryByProjectIdResponse withError(Consumer<Error> errorSetter) {
        if(this.error == null ){
            this.error = new Error();
            errorSetter.accept(this.error);
        }
        
        return this;
    }


    /**
     * Get error
     * @return error
     */
    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public GetAllRepositoryByProjectIdResponse withResult(RepoListInfo result) {
        this.result = result;
        return this;
    }

    public GetAllRepositoryByProjectIdResponse withResult(Consumer<RepoListInfo> resultSetter) {
        if(this.result == null ){
            this.result = new RepoListInfo();
            resultSetter.accept(this.result);
        }
        
        return this;
    }


    /**
     * Get result
     * @return result
     */
    public RepoListInfo getResult() {
        return result;
    }

    public void setResult(RepoListInfo result) {
        this.result = result;
    }

    public GetAllRepositoryByProjectIdResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 响应状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAllRepositoryByProjectIdResponse getAllRepositoryByProjectIdResponse = (GetAllRepositoryByProjectIdResponse) o;
        return Objects.equals(this.error, getAllRepositoryByProjectIdResponse.error) &&
            Objects.equals(this.result, getAllRepositoryByProjectIdResponse.result) &&
            Objects.equals(this.status, getAllRepositoryByProjectIdResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(error, result, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAllRepositoryByProjectIdResponse {\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

