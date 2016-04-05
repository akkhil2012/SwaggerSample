package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Banner;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-05T20:25:02.561+05:30")
public class Impression   {
  
  private BigDecimal impid = null;
  private Banner bannerInstance = null;

  
  /**
   * Id given by the ad exchange
   **/
  
  @ApiModelProperty(value = "Id given by the ad exchange")
  @JsonProperty("impid")
  public BigDecimal getImpid() {
    return impid;
  }
  public void setImpid(BigDecimal impid) {
    this.impid = impid;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bannerInstance")
  public Banner getBannerInstance() {
    return bannerInstance;
  }
  public void setBannerInstance(Banner bannerInstance) {
    this.bannerInstance = bannerInstance;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Impression impression = (Impression) o;
    return Objects.equals(impid, impression.impid) &&
        Objects.equals(bannerInstance, impression.bannerInstance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impid, bannerInstance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Impression {\n");
    
    sb.append("    impid: ").append(toIndentedString(impid)).append("\n");
    sb.append("    bannerInstance: ").append(toIndentedString(bannerInstance)).append("\n");
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

