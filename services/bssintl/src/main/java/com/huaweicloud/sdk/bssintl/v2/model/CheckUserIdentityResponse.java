package com.huaweicloud.sdk.bssintl.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CheckUserIdentityResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="check_result")
    
    private String checkResult;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    private String errorCode = "CBC.0000";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    private String errorMsg = "success";

    public CheckUserIdentityResponse withCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    


    /**
     * |参数名称：是否可以继续注册| |参数的约束及描述：该参数非必填，且只允许字符串,available: 该登录名称/手机号/邮箱可以继续注册,used_by_user: 该登录名称/手机号/邮箱不可以继续注册|
     * @return checkResult
     */
    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public CheckUserIdentityResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * |参数名称：返回码| |参数的约束及描述：该参数必填，且只允许字符串|
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public CheckUserIdentityResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    


    /**
     * |参数名称：返回码描述| |参数的约束及描述：该参数必填，且只允许字符串|
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckUserIdentityResponse checkUserIdentityResponse = (CheckUserIdentityResponse) o;
        return Objects.equals(this.checkResult, checkUserIdentityResponse.checkResult) &&
            Objects.equals(this.errorCode, checkUserIdentityResponse.errorCode) &&
            Objects.equals(this.errorMsg, checkUserIdentityResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(checkResult, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckUserIdentityResponse {\n");
        sb.append("    checkResult: ").append(toIndentedString(checkResult)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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

