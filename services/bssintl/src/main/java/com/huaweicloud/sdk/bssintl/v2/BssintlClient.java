package com.huaweicloud.sdk.bssintl.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.bssintl.v2.model.*;

public class BssintlClient {
    protected HcClient hcClient;

    public BssintlClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BssintlClient> newBuilder() {
        return new ClientBuilder<>(BssintlClient::new, "GlobalCredentials");
    }


    /**
     * 设置包年包月资源自动续费
     * 功能描述：设置包周期资源自动续费
     *
     * @param AutoRenewalResourcesRequest 请求对象
     * @return AutoRenewalResourcesResponse
    */
    public AutoRenewalResourcesResponse autoRenewalResources(AutoRenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.autoRenewalResources);
    }

    /**
     * 取消包年包月资源自动续费
     * 功能描述：取消包年/包月资源自动续费
     *
     * @param CancelAutoRenewalResourcesRequest 请求对象
     * @return CancelAutoRenewalResourcesResponse
    */
    public CancelAutoRenewalResourcesResponse cancelAutoRenewalResources(CancelAutoRenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.cancelAutoRenewalResources);
    }

    /**
     * 取消包周期订单
     * 功能描述：取消包周期订单
     *
     * @param CancelCustomerOrderRequest 请求对象
     * @return CancelCustomerOrderResponse
    */
    public CancelCustomerOrderResponse cancelCustomerOrder(CancelCustomerOrderRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.cancelCustomerOrder);
    }

    /**
     * 退订包周期资源
     * 功能描述：退订包周期资源
     *
     * @param CancelResourcesSubscriptionRequest 请求对象
     * @return CancelResourcesSubscriptionResponse
    */
    public CancelResourcesSubscriptionResponse cancelResourcesSubscription(CancelResourcesSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.cancelResourcesSubscription);
    }

    /**
     * 实名认证变更申请
     * 功能描述：实名认证变更申请
     *
     * @param ChangeEnterpriseRealnameAuthenticationRequest 请求对象
     * @return ChangeEnterpriseRealnameAuthenticationResponse
    */
    public ChangeEnterpriseRealnameAuthenticationResponse changeEnterpriseRealnameAuthentication(ChangeEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.changeEnterpriseRealnameAuthentication);
    }

    /**
     * 校验客户的注册信息
     * 功能描述：校验客户的注册信息
     *
     * @param CheckUserIdentityRequest 请求对象
     * @return CheckUserIdentityResponse
    */
    public CheckUserIdentityResponse checkUserIdentity(CheckUserIdentityRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.checkUserIdentity);
    }

    /**
     * 企业实名认证申请
     * 功能描述：企业实名认证申请V2
     *
     * @param CreateEnterpriseRealnameAuthenticationRequest 请求对象
     * @return CreateEnterpriseRealnameAuthenticationResponse
    */
    public CreateEnterpriseRealnameAuthenticationResponse createEnterpriseRealnameAuthentication(CreateEnterpriseRealnameAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.createEnterpriseRealnameAuthentication);
    }

    /**
     * 个人实名认证申请
     * 功能描述：个人实名认证申请
     *
     * @param CreatePersonalRealnameAuthRequest 请求对象
     * @return CreatePersonalRealnameAuthResponse
    */
    public CreatePersonalRealnameAuthResponse createPersonalRealnameAuth(CreatePersonalRealnameAuthRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.createPersonalRealnameAuth);
    }

    /**
     * 创建客户（V2）
     * 功能描述：在伙伴销售平台创建客户时同步创建华为云账号，并将客户在伙伴销售平台上的账号与华为云账号进行映射。同时，创建的华为云账号与伙伴账号关联绑定。
     *
     * @param CreateSubCustomerRequest 请求对象
     * @return CreateSubCustomerResponse
    */
    public CreateSubCustomerResponse createSubCustomer(CreateSubCustomerRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.createSubCustomer);
    }

    /**
     * 查询客户按需资源列表
     * 功能描述：查询客户按需资源列表
     *
     * @param ListCustomerOnDemandResourcesRequest 请求对象
     * @return ListCustomerOnDemandResourcesResponse
    */
    public ListCustomerOnDemandResourcesResponse listCustomerOnDemandResources(ListCustomerOnDemandResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listCustomerOnDemandResources);
    }

    /**
     * 查询订单列表V2
     * 功能描述：查询订单列表
     *
     * @param ListCustomerOrdersRequest 请求对象
     * @return ListCustomerOrdersResponse
    */
    public ListCustomerOrdersResponse listCustomerOrders(ListCustomerOrdersRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listCustomerOrders);
    }

    /**
     * 查询资源详单V2（客户）
     * 功能描述：客户在客户自建平台查询自己的资源详单，用于反映各类资源的消耗情况。资源详单数据有延迟，最大延迟24小时。
     *
     * @param ListCustomerselfResourceRecordDetailsRequest 请求对象
     * @return ListCustomerselfResourceRecordDetailsResponse
    */
    public ListCustomerselfResourceRecordDetailsResponse listCustomerselfResourceRecordDetails(ListCustomerselfResourceRecordDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listCustomerselfResourceRecordDetails);
    }

    /**
     * 查询资源消费记录（客户）
     * 功能描述：查询资源消费记录（客户）
     *
     * @param ListCustomerselfResourceRecordsRequest 请求对象
     * @return ListCustomerselfResourceRecordsResponse
    */
    public ListCustomerselfResourceRecordsResponse listCustomerselfResourceRecords(ListCustomerselfResourceRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listCustomerselfResourceRecords);
    }

    /**
     * 查询按需产品价格
     * 功能描述：按需资源询价
     *
     * @param ListOnDemandResourceRatingsRequest 请求对象
     * @return ListOnDemandResourceRatingsResponse
    */
    public ListOnDemandResourceRatingsResponse listOnDemandResourceRatings(ListOnDemandResourceRatingsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listOnDemandResourceRatings);
    }

    /**
     * 查询订单可用优惠券
     * 功能描述：查询订单详情
     *
     * @param ListOrderCouponsByOrderIdRequest 请求对象
     * @return ListOrderCouponsByOrderIdResponse
    */
    public ListOrderCouponsByOrderIdResponse listOrderCouponsByOrderId(ListOrderCouponsByOrderIdRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listOrderCouponsByOrderId);
    }

    /**
     * 查询客户包年包月资源列表
     * 功能描述：查询客户包年/包月资源列表
     *
     * @param ListPayPerUseCustomerResourcesRequest 请求对象
     * @return ListPayPerUseCustomerResourcesResponse
    */
    public ListPayPerUseCustomerResourcesResponse listPayPerUseCustomerResources(ListPayPerUseCustomerResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listPayPerUseCustomerResources);
    }

    /**
     * 包周期资源订购询价
     * 功能描述：包周期资源订购询价
     *
     * @param ListRateOnPeriodDetailRequest 请求对象
     * @return ListRateOnPeriodDetailResponse
    */
    public ListRateOnPeriodDetailResponse listRateOnPeriodDetail(ListRateOnPeriodDetailRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listRateOnPeriodDetail);
    }

    /**
     * 查询套餐内使用量
     * 功能描述：查询套餐内使用量
     *
     * @param ListResourceUsagesRequest 请求对象
     * @return ListResourceUsagesResponse
    */
    public ListResourceUsagesResponse listResourceUsages(ListResourceUsagesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listResourceUsages);
    }

    /**
     * 查询优惠券列表
     * 功能描述：查询优惠券列表
     *
     * @param ListSubCustomerCouponsRequest 请求对象
     * @return ListSubCustomerCouponsResponse
    */
    public ListSubCustomerCouponsResponse listSubCustomerCoupons(ListSubCustomerCouponsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listSubCustomerCoupons);
    }

    /**
     * 查询客户列表
     * 功能描述：查询客户列表
     *
     * @param ListSubCustomersRequest 请求对象
     * @return ListSubCustomersResponse
    */
    public ListSubCustomersResponse listSubCustomers(ListSubCustomersRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.listSubCustomers);
    }

    /**
     * 支付包周期订单
     * 功能描述：支付包周期订单
     *
     * @param PayOrdersRequest 请求对象
     * @return PayOrdersResponse
    */
    public PayOrdersResponse payOrders(PayOrdersRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.payOrders);
    }

    /**
     * 续订包周期资源
     * 功能描述：续订包周期资源
     *
     * @param RenewalResourcesRequest 请求对象
     * @return RenewalResourcesResponse
    */
    public RenewalResourcesResponse renewalResources(RenewalResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.renewalResources);
    }

    /**
     * 短信验证码
     * 功能描述：发送验证码
     *
     * @param SendVerificationMessageCodeRequest 请求对象
     * @return SendVerificationMessageCodeResponse
    */
    public SendVerificationMessageCodeResponse sendVerificationMessageCode(SendVerificationMessageCodeRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.sendVerificationMessageCode);
    }

    /**
     * 查询订单详情V2
     * 功能描述：查询订单详情
     *
     * @param ShowCustomerOrderDetailsRequest 请求对象
     * @return ShowCustomerOrderDetailsResponse
    */
    public ShowCustomerOrderDetailsResponse showCustomerOrderDetails(ShowCustomerOrderDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.showCustomerOrderDetails);
    }

    /**
     * 查询实名认证审核结果
     * 功能描述：查询实名认证审核结果
     *
     * @param ShowRealnameAuthenticationReviewResultRequest 请求对象
     * @return ShowRealnameAuthenticationReviewResultResponse
    */
    public ShowRealnameAuthenticationReviewResultResponse showRealnameAuthenticationReviewResult(ShowRealnameAuthenticationReviewResultRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.showRealnameAuthenticationReviewResult);
    }

    /**
     * 查询退款订单的金额详情V2
     * 功能描述：查询退款订单的金额详情
     *
     * @param ShowRefundOrderDetailsRequest 请求对象
     * @return ShowRefundOrderDetailsResponse
    */
    public ShowRefundOrderDetailsResponse showRefundOrderDetails(ShowRefundOrderDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BssintlMeta.showRefundOrderDetails);
    }

}