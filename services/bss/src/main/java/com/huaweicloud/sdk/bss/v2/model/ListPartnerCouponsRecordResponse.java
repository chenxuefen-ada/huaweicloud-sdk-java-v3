package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.CouponRecordV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListPartnerCouponsRecordResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="records")
    
    private List<CouponRecordV2> records = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ListPartnerCouponsRecordResponse withRecords(List<CouponRecordV2> records) {
        this.records = records;
        return this;
    }

    
    public ListPartnerCouponsRecordResponse addRecordsItem(CouponRecordV2 recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListPartnerCouponsRecordResponse withRecords(Consumer<List<CouponRecordV2>> recordsSetter) {
        if(this.records == null ){
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * |参数名称：日志记录列表。具体请参见表2 CouponRecordV2。| |参数约束以及描述：日志记录列表。具体请参见表2 CouponRecordV2。|
     * @return records
     */
    public List<CouponRecordV2> getRecords() {
        return records;
    }

    public void setRecords(List<CouponRecordV2> records) {
        this.records = records;
    }

    public ListPartnerCouponsRecordResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * |参数名称：查询记录总数。| |参数的约束及描述：查询记录总数。|
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPartnerCouponsRecordResponse listPartnerCouponsRecordResponse = (ListPartnerCouponsRecordResponse) o;
        return Objects.equals(this.records, listPartnerCouponsRecordResponse.records) &&
            Objects.equals(this.totalCount, listPartnerCouponsRecordResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(records, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPartnerCouponsRecordResponse {\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

