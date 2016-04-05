package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Impression;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-05T20:25:02.561+05:30")
public class RTBDetails   {
  
  private Impression impression = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("impression")
  public Impression getImpression() {
    return impression;
  }
  public void setImpression(Impression impression) {
    this.impression = impression;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RTBDetails rTBDetails = (RTBDetails) o;
    return Objects.equals(impression, rTBDetails.impression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RTBDetails {\n");
    
    sb.append("    impression: ").append(toIndentedString(impression)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

