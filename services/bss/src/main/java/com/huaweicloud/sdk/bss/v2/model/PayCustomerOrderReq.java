package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.CouponSimpleInfoOrderPay;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PayCustomerOrderReq
 */
public class PayCustomerOrderReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_infos")
    
    private List<CouponSimpleInfoOrderPay> couponInfos = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;

    public PayCustomerOrderReq withCouponInfos(List<CouponSimpleInfoOrderPay> couponInfos) {
        this.couponInfos = couponInfos;
        return this;
    }

    
    public PayCustomerOrderReq addCouponInfosItem(CouponSimpleInfoOrderPay couponInfosItem) {
        if (this.couponInfos == null) {
            this.couponInfos = new ArrayList<>();
        }
        this.couponInfos.add(couponInfosItem);
        return this;
    }

    public PayCustomerOrderReq withCouponInfos(Consumer<List<CouponSimpleInfoOrderPay>> couponInfosSetter) {
        if(this.couponInfos == null ){
            this.couponInfos = new ArrayList<>();
        }
        couponInfosSetter.accept(this.couponInfos);
        return this;
    }

    /**
     * |参数名称：字段预留。优惠券列表，目前仅支持传递一个优惠券ID。请从“1.3-查询订单可用优惠券”接口的响应参数中获取。| |参数约束以及描述：字段预留。优惠券列表，目前仅支持传递一个优惠券ID。请从“1.3-查询订单可用优惠券”接口的响应参数中获取。|
     * @return couponInfos
     */
    public List<CouponSimpleInfoOrderPay> getCouponInfos() {
        return couponInfos;
    }

    public void setCouponInfos(List<CouponSimpleInfoOrderPay> couponInfos) {
        this.couponInfos = couponInfos;
    }

    public PayCustomerOrderReq withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * |参数名称：订单ID。| |参数约束及描述：订单ID。|
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PayCustomerOrderReq payCustomerOrderReq = (PayCustomerOrderReq) o;
        return Objects.equals(this.couponInfos, payCustomerOrderReq.couponInfos) &&
            Objects.equals(this.orderId, payCustomerOrderReq.orderId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(couponInfos, orderId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PayCustomerOrderReq {\n");
        sb.append("    couponInfos: ").append(toIndentedString(couponInfos)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

