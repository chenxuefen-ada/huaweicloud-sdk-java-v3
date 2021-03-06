package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.IndirectPartnerInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListIndirectPartnersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partners")
    
    private List<IndirectPartnerInfo> indirectPartners = null;
    
    public ListIndirectPartnersResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * |参数名称：符合条件的记录个数，只有成功的时候出现| |参数的约束及描述：符合条件的记录个数，只有成功的时候出现|
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListIndirectPartnersResponse withIndirectPartners(List<IndirectPartnerInfo> indirectPartners) {
        this.indirectPartners = indirectPartners;
        return this;
    }

    
    public ListIndirectPartnersResponse addIndirectPartnersItem(IndirectPartnerInfo indirectPartnersItem) {
        if (this.indirectPartners == null) {
            this.indirectPartners = new ArrayList<>();
        }
        this.indirectPartners.add(indirectPartnersItem);
        return this;
    }

    public ListIndirectPartnersResponse withIndirectPartners(Consumer<List<IndirectPartnerInfo>> indirectPartnersSetter) {
        if(this.indirectPartners == null ){
            this.indirectPartners = new ArrayList<>();
        }
        indirectPartnersSetter.accept(this.indirectPartners);
        return this;
    }

    /**
     * |参数名称：二级渠道邀请记录列表| |参数约束以及描述：二级渠道邀请记录列表|
     * @return indirectPartners
     */
    public List<IndirectPartnerInfo> getIndirectPartners() {
        return indirectPartners;
    }

    public void setIndirectPartners(List<IndirectPartnerInfo> indirectPartners) {
        this.indirectPartners = indirectPartners;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIndirectPartnersResponse listIndirectPartnersResponse = (ListIndirectPartnersResponse) o;
        return Objects.equals(this.count, listIndirectPartnersResponse.count) &&
            Objects.equals(this.indirectPartners, listIndirectPartnersResponse.indirectPartners);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, indirectPartners);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIndirectPartnersResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    indirectPartners: ").append(toIndentedString(indirectPartners)).append("\n");
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

