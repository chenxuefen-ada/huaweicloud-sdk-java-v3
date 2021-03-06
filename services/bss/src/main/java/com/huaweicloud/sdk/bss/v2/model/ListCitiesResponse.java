package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.City;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCitiesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cities")
    
    private List<City> cities = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;

    public ListCitiesResponse withCities(List<City> cities) {
        this.cities = cities;
        return this;
    }

    
    public ListCitiesResponse addCitiesItem(City citiesItem) {
        if (this.cities == null) {
            this.cities = new ArrayList<>();
        }
        this.cities.add(citiesItem);
        return this;
    }

    public ListCitiesResponse withCities(Consumer<List<City>> citiesSetter) {
        if(this.cities == null ){
            this.cities = new ArrayList<>();
        }
        citiesSetter.accept(this.cities);
        return this;
    }

    /**
     * |参数名称：城市信息列表，成功的时候返回| |参数约束以及描述：城市信息列表，成功的时候返回|
     * @return cities
     */
    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public ListCitiesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * |参数名称：查询个数，成功的时候返回| |参数的约束及描述：查询个数，成功的时候返回|
     * minimum: 0
     * maximum: 1000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCitiesResponse listCitiesResponse = (ListCitiesResponse) o;
        return Objects.equals(this.cities, listCitiesResponse.cities) &&
            Objects.equals(this.count, listCitiesResponse.count);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cities, count);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCitiesResponse {\n");
        sb.append("    cities: ").append(toIndentedString(cities)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

