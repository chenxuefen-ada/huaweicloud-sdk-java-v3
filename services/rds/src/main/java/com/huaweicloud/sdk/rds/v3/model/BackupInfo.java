package com.huaweicloud.sdk.rds.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.BackupDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 备份信息。
 */
public class BackupInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="databases")
    
    private List<BackupDatabase> databases = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_time")
    
    private String beginTime;
    /**
     * 备份状态，取值：  - BUILDING: 备份中。 - COMPLETED: 备份完成。 - FAILED：备份失败。 - DELETING：备份删除中。
     */
    public static class StatusEnum {

        
        /**
         * Enum BUILDING for value: "BUILDING"
         */
        public static final StatusEnum BUILDING = new StatusEnum("BUILDING");
        
        /**
         * Enum COMPLETED for value: "COMPLETED"
         */
        public static final StatusEnum COMPLETED = new StatusEnum("COMPLETED");
        
        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");
        
        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StatusEnum DELETING = new StatusEnum("DELETING");
        

        public static final Map<String, StatusEnum> staticFields = new HashMap<String, StatusEnum>() {
            { 
                put("BUILDING", BUILDING);
                put("COMPLETED", COMPLETED);
                put("FAILED", FAILED);
                put("DELETING", DELETING);
            }
        };

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new StatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;
    /**
     * 备份类型，取值：  - “auto”: 自动全量备份 - “manual”: 手动全量备份 - “fragment”: 差异全量备份 - “incremental”: 自动增量备份
     */
    public static class TypeEnum {

        
        /**
         * Enum AUTO for value: "auto"
         */
        public static final TypeEnum AUTO = new TypeEnum("auto");
        
        /**
         * Enum MANUAL for value: "manual"
         */
        public static final TypeEnum MANUAL = new TypeEnum("manual");
        
        /**
         * Enum FRAGMENT for value: "fragment"
         */
        public static final TypeEnum FRAGMENT = new TypeEnum("fragment");
        
        /**
         * Enum INCREMENTAL for value: "incremental"
         */
        public static final TypeEnum INCREMENTAL = new TypeEnum("incremental");
        

        public static final Map<String, TypeEnum> staticFields = new HashMap<String, TypeEnum>() {
            { 
                put("auto", AUTO);
                put("manual", MANUAL);
                put("fragment", FRAGMENT);
                put("incremental", INCREMENTAL);
            }
        };

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private TypeEnum type;

    public BackupInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 备份ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BackupInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BackupInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 备份名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BackupInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 备份描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BackupInfo withDatabases(List<BackupDatabase> databases) {
        this.databases = databases;
        return this;
    }

    
    public BackupInfo addDatabasesItem(BackupDatabase databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public BackupInfo withDatabases(Consumer<List<BackupDatabase>> databasesSetter) {
        if(this.databases == null ){
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 只支持Microsoft SQL Server，局部备份的用户自建数据库名列表，当有此参数时以局部备份为准。
     * @return databases
     */
    public List<BackupDatabase> getDatabases() {
        return databases;
    }

    public void setDatabases(List<BackupDatabase> databases) {
        this.databases = databases;
    }

    public BackupInfo withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 备份开始时间，格式为“yyyy-mm-ddThh:mm:ssZ”。  其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public BackupInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 备份状态，取值：  - BUILDING: 备份中。 - COMPLETED: 备份完成。 - FAILED：备份失败。 - DELETING：备份删除中。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public BackupInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 备份类型，取值：  - “auto”: 自动全量备份 - “manual”: 手动全量备份 - “fragment”: 差异全量备份 - “incremental”: 自动增量备份
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupInfo backupInfo = (BackupInfo) o;
        return Objects.equals(this.id, backupInfo.id) &&
            Objects.equals(this.instanceId, backupInfo.instanceId) &&
            Objects.equals(this.name, backupInfo.name) &&
            Objects.equals(this.description, backupInfo.description) &&
            Objects.equals(this.databases, backupInfo.databases) &&
            Objects.equals(this.beginTime, backupInfo.beginTime) &&
            Objects.equals(this.status, backupInfo.status) &&
            Objects.equals(this.type, backupInfo.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, instanceId, name, description, databases, beginTime, status, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
