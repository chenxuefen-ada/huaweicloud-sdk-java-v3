package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.PeriodProductOfficialRatingResult;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * OfficialWebsiteRatingResult
 */
public class OfficialWebsiteRatingResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_website_amount")
    
    private BigDecimal officialWebsiteAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_rating_results")
    
    private List<PeriodProductOfficialRatingResult> productRatingResults = null;
    
    public OfficialWebsiteRatingResult withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：度量单位标识1：元|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public OfficialWebsiteRatingResult withOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
        return this;
    }

    


    /**
     * |参数名称：官网价| |参数约束及描述：官网价|
     * @return officialWebsiteAmount
     */
    public BigDecimal getOfficialWebsiteAmount() {
        return officialWebsiteAmount;
    }

    public void setOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
    }

    public OfficialWebsiteRatingResult withProductRatingResults(List<PeriodProductOfficialRatingResult> productRatingResults) {
        this.productRatingResults = productRatingResults;
        return this;
    }

    
    public OfficialWebsiteRatingResult addProductRatingResultsItem(PeriodProductOfficialRatingResult productRatingResultsItem) {
        if (this.productRatingResults == null) {
            this.productRatingResults = new ArrayList<>();
        }
        this.productRatingResults.add(productRatingResultsItem);
        return this;
    }

    public OfficialWebsiteRatingResult withProductRatingResults(Consumer<List<PeriodProductOfficialRatingResult>> productRatingResultsSetter) {
        if(this.productRatingResults == null ){
            this.productRatingResults = new ArrayList<>();
        }
        productRatingResultsSetter.accept(this.productRatingResults);
        return this;
    }

    /**
     * |参数名称：产品询价结果| |参数的约束及描述：产品询价结果|
     * @return productRatingResults
     */
    public List<PeriodProductOfficialRatingResult> getProductRatingResults() {
        return productRatingResults;
    }

    public void setProductRatingResults(List<PeriodProductOfficialRatingResult> productRatingResults) {
        this.productRatingResults = productRatingResults;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OfficialWebsiteRatingResult officialWebsiteRatingResult = (OfficialWebsiteRatingResult) o;
        return Objects.equals(this.measureId, officialWebsiteRatingResult.measureId) &&
            Objects.equals(this.officialWebsiteAmount, officialWebsiteRatingResult.officialWebsiteAmount) &&
            Objects.equals(this.productRatingResults, officialWebsiteRatingResult.productRatingResults);
    }
    @Override
    public int hashCode() {
        return Objects.hash(measureId, officialWebsiteAmount, productRatingResults);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfficialWebsiteRatingResult {\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    officialWebsiteAmount: ").append(toIndentedString(officialWebsiteAmount)).append("\n");
        sb.append("    productRatingResults: ").append(toIndentedString(productRatingResults)).append("\n");
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

