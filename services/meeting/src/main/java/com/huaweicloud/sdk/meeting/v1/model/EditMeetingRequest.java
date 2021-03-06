package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.RestScheduleConfDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class EditMeetingRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="conferenceID")
    
    private String conferenceID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userUUID")
    
    private String userUUID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Authorization-Type")
    
    private String xAuthorizationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site-Id")
    
    private String xSiteId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private RestScheduleConfDTO body = null;

    public EditMeetingRequest withConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
        return this;
    }

    


    /**
     * Get conferenceID
     * @return conferenceID
     */
    public String getConferenceID() {
        return conferenceID;
    }

    public void setConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
    }

    public EditMeetingRequest withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    


    /**
     * Get userUUID
     * @return userUUID
     */
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public EditMeetingRequest withXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
        return this;
    }

    


    /**
     * Get xAuthorizationType
     * @return xAuthorizationType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXAuthorizationType() {
        return xAuthorizationType;
    }

    public void setXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
    }

    public EditMeetingRequest withXSiteId(String xSiteId) {
        this.xSiteId = xSiteId;
        return this;
    }

    


    /**
     * Get xSiteId
     * @return xSiteId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXSiteId() {
        return xSiteId;
    }

    public void setXSiteId(String xSiteId) {
        this.xSiteId = xSiteId;
    }

    public EditMeetingRequest withBody(RestScheduleConfDTO body) {
        this.body = body;
        return this;
    }

    public EditMeetingRequest withBody(Consumer<RestScheduleConfDTO> bodySetter) {
        if(this.body == null ){
            this.body = new RestScheduleConfDTO();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public RestScheduleConfDTO getBody() {
        return body;
    }

    public void setBody(RestScheduleConfDTO body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EditMeetingRequest editMeetingRequest = (EditMeetingRequest) o;
        return Objects.equals(this.conferenceID, editMeetingRequest.conferenceID) &&
            Objects.equals(this.userUUID, editMeetingRequest.userUUID) &&
            Objects.equals(this.xAuthorizationType, editMeetingRequest.xAuthorizationType) &&
            Objects.equals(this.xSiteId, editMeetingRequest.xSiteId) &&
            Objects.equals(this.body, editMeetingRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(conferenceID, userUUID, xAuthorizationType, xSiteId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EditMeetingRequest {\n");
        sb.append("    conferenceID: ").append(toIndentedString(conferenceID)).append("\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    xAuthorizationType: ").append(toIndentedString(xAuthorizationType)).append("\n");
        sb.append("    xSiteId: ").append(toIndentedString(xSiteId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

