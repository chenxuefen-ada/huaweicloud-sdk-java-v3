package com.huaweicloud.sdk.codehub.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codehub.v3.model.RepositoryMember;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RepositoryMemberList
 */
public class RepositoryMemberList  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    private List<RepositoryMember> users = null;
    
    public RepositoryMemberList withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 仓库成员总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public RepositoryMemberList withUsers(List<RepositoryMember> users) {
        this.users = users;
        return this;
    }

    
    public RepositoryMemberList addUsersItem(RepositoryMember usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public RepositoryMemberList withUsers(Consumer<List<RepositoryMember>> usersSetter) {
        if(this.users == null ){
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 仓库成员列表
     * @return users
     */
    public List<RepositoryMember> getUsers() {
        return users;
    }

    public void setUsers(List<RepositoryMember> users) {
        this.users = users;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryMemberList repositoryMemberList = (RepositoryMemberList) o;
        return Objects.equals(this.total, repositoryMemberList.total) &&
            Objects.equals(this.users, repositoryMemberList.users);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, users);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryMemberList {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

