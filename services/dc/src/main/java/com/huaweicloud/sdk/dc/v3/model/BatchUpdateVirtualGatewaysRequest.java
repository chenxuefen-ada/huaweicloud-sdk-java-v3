package com.huaweicloud.sdk.dc.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualGatewayRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchUpdateVirtualGatewaysRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateVirtualGatewayRequestBody body = null;

    public BatchUpdateVirtualGatewaysRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchUpdateVirtualGatewaysRequest withBody(UpdateVirtualGatewayRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchUpdateVirtualGatewaysRequest withBody(Consumer<UpdateVirtualGatewayRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateVirtualGatewayRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateVirtualGatewayRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateVirtualGatewayRequestBody body) {
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
        BatchUpdateVirtualGatewaysRequest batchUpdateVirtualGatewaysRequest = (BatchUpdateVirtualGatewaysRequest) o;
        return Objects.equals(this.id, batchUpdateVirtualGatewaysRequest.id) &&
            Objects.equals(this.body, batchUpdateVirtualGatewaysRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateVirtualGatewaysRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

