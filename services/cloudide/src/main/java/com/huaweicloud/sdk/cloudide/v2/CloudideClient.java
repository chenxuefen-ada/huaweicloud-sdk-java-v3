package com.huaweicloud.sdk.cloudide.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.cloudide.v2.model.*;

public class CloudideClient {
    protected HcClient hcClient;

    public CloudideClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudideClient> newBuilder() {
        return new ClientBuilder<>(CloudideClient::new);
    }


    /**
     * 查询技术栈模板工程
     * 查询技术栈模板工程
     *
     * @param ListProjectTemplatesRequest 请求对象
     * @return ListProjectTemplatesResponse
    */
    public ListProjectTemplatesResponse listProjectTemplates(ListProjectTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.listProjectTemplates);
    }

    /**
     * 获取标签所有技术栈
     * 获取标签所有技术栈
     *
     * @param ListStacksByTagRequest 请求对象
     * @return ListStacksByTagResponse
    */
    public ListStacksByTagResponse listStacksByTag(ListStacksByTagRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.listStacksByTag);
    }

    /**
     * 获取技术栈计费信息
     * 获取技术栈计费信息
     *
     * @param ShowPriceRequest 请求对象
     * @return ShowPriceResponse
    */
    public ShowPriceResponse showPrice(ShowPriceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.showPrice);
    }

    /**
     * 查询IDE实例名是否重复
     * 查询IDE实例名是否重复
     *
     * @param CheckNameRequest 请求对象
     * @return CheckNameResponse
    */
    public CheckNameResponse checkName(CheckNameRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.checkName);
    }

    /**
     * 创建IDE实例
     * 创建IDE实例
     *
     * @param CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
    */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.createInstance);
    }

    /**
     * 外部第三方集成商创建IDE实例
     * 创建IDE实例
     *
     * @param CreateInstanceBy3rdRequest 请求对象
     * @return CreateInstanceBy3rdResponse
    */
    public CreateInstanceBy3rdResponse createInstanceBy3rd(CreateInstanceBy3rdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.createInstanceBy3rd);
    }

    /**
     * 删除IDE实例
     * 删除IDE实例（同时删除磁盘数据）
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
    */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.deleteInstance);
    }

    /**
     * 查询IDE实例列表
     * 查询IDE实例列表
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse
    */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.listInstances);
    }

    /**
     * 查询某个组织下的IDE实例列表
     * 查询某个组织下的IDE实例列表
     *
     * @param ListOrgInstancesRequest 请求对象
     * @return ListOrgInstancesResponse
    */
    public ListOrgInstancesResponse listOrgInstances(ListOrgInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.listOrgInstances);
    }

    /**
     * 查询某个IDE实例
     * 查询某个IDE实例
     *
     * @param ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
    */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.showInstance);
    }

    /**
     * 启动IDE实例
     * 启动IDE实例
     *
     * @param StartInstanceRequest 请求对象
     * @return StartInstanceResponse
    */
    public StartInstanceResponse startInstance(StartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.startInstance);
    }

    /**
     * 停止IDE实例
     * 停止IDE实例（不删除磁盘数据）
     *
     * @param StopInstanceRequest 请求对象
     * @return StopInstanceResponse
    */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.stopInstance);
    }

    /**
     * 修改IDE实例
     * 修改IDE实例
     *
     * @param UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
    */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudideMeta.updateInstance);
    }

}