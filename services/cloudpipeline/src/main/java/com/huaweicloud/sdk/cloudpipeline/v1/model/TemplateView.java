package com.huaweicloud.sdk.cloudpipeline.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudpipeline.v1.model.FlowItem;
import com.huaweicloud.sdk.cloudpipeline.v1.model.StateItem;
import com.huaweicloud.sdk.cloudpipeline.v1.model.TemplateParam;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 流水线创建状态响应体
 */
public class TemplateView  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_id")
    
    private String templateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_name")
    
    private String templateName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_type")
    
    private String templateType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_url")
    
    private String templateUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_name")
    
    private String domainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_build_in")
    
    private Boolean isBuildIn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_name")
    
    private String projectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_watch")
    
    private Boolean isWatch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameter")
    
    private TemplateParam parameter = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flow")
    
    private FlowItem flow = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="states")
    
    private StateItem states = null;

    public TemplateView withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    


    /**
     * 模板ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public TemplateView withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    


    /**
     * 模板名字
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public TemplateView withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    


    /**
     * 模板类型
     * @return templateType
     */
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public TemplateView withTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
        return this;
    }

    


    /**
     * 模板编辑URL
     * @return templateUrl
     */
    public String getTemplateUrl() {
        return templateUrl;
    }

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    public TemplateView withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public TemplateView withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 用户名字
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public TemplateView withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public TemplateView withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    


    /**
     * 租户名字
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public TemplateView withIsBuildIn(Boolean isBuildIn) {
        this.isBuildIn = isBuildIn;
        return this;
    }

    


    /**
     * 是否内置模板
     * @return isBuildIn
     */
    public Boolean getIsBuildIn() {
        return isBuildIn;
    }

    public void setIsBuildIn(Boolean isBuildIn) {
        this.isBuildIn = isBuildIn;
    }

    public TemplateView withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public TemplateView withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TemplateView withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    


    /**
     * 项目名字
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public TemplateView withIsWatch(Boolean isWatch) {
        this.isWatch = isWatch;
        return this;
    }

    


    /**
     * 是否关注
     * @return isWatch
     */
    public Boolean getIsWatch() {
        return isWatch;
    }

    public void setIsWatch(Boolean isWatch) {
        this.isWatch = isWatch;
    }

    public TemplateView withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 模板描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateView withParameter(TemplateParam parameter) {
        this.parameter = parameter;
        return this;
    }

    public TemplateView withParameter(Consumer<TemplateParam> parameterSetter) {
        if(this.parameter == null ){
            this.parameter = new TemplateParam();
            parameterSetter.accept(this.parameter);
        }
        
        return this;
    }


    /**
     * Get parameter
     * @return parameter
     */
    public TemplateParam getParameter() {
        return parameter;
    }

    public void setParameter(TemplateParam parameter) {
        this.parameter = parameter;
    }

    public TemplateView withFlow(FlowItem flow) {
        this.flow = flow;
        return this;
    }

    public TemplateView withFlow(Consumer<FlowItem> flowSetter) {
        if(this.flow == null ){
            this.flow = new FlowItem();
            flowSetter.accept(this.flow);
        }
        
        return this;
    }


    /**
     * Get flow
     * @return flow
     */
    public FlowItem getFlow() {
        return flow;
    }

    public void setFlow(FlowItem flow) {
        this.flow = flow;
    }

    public TemplateView withStates(StateItem states) {
        this.states = states;
        return this;
    }

    public TemplateView withStates(Consumer<StateItem> statesSetter) {
        if(this.states == null ){
            this.states = new StateItem();
            statesSetter.accept(this.states);
        }
        
        return this;
    }


    /**
     * Get states
     * @return states
     */
    public StateItem getStates() {
        return states;
    }

    public void setStates(StateItem states) {
        this.states = states;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateView templateView = (TemplateView) o;
        return Objects.equals(this.templateId, templateView.templateId) &&
            Objects.equals(this.templateName, templateView.templateName) &&
            Objects.equals(this.templateType, templateView.templateType) &&
            Objects.equals(this.templateUrl, templateView.templateUrl) &&
            Objects.equals(this.userId, templateView.userId) &&
            Objects.equals(this.userName, templateView.userName) &&
            Objects.equals(this.domainId, templateView.domainId) &&
            Objects.equals(this.domainName, templateView.domainName) &&
            Objects.equals(this.isBuildIn, templateView.isBuildIn) &&
            Objects.equals(this.region, templateView.region) &&
            Objects.equals(this.projectId, templateView.projectId) &&
            Objects.equals(this.projectName, templateView.projectName) &&
            Objects.equals(this.isWatch, templateView.isWatch) &&
            Objects.equals(this.description, templateView.description) &&
            Objects.equals(this.parameter, templateView.parameter) &&
            Objects.equals(this.flow, templateView.flow) &&
            Objects.equals(this.states, templateView.states);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateId, templateName, templateType, templateUrl, userId, userName, domainId, domainName, isBuildIn, region, projectId, projectName, isWatch, description, parameter, flow, states);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateView {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    templateUrl: ").append(toIndentedString(templateUrl)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    isBuildIn: ").append(toIndentedString(isBuildIn)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    isWatch: ").append(toIndentedString(isWatch)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
        sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
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

