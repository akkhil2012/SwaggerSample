package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-05T20:25:02.561+05:30")
public class Banner   {
  
  private String width = null;
  private BigDecimal id = null;
  private String height = null;
  private String position = null;

  
  /**
   * Width of the ad
   **/
  
  @ApiModelProperty(value = "Width of the ad")
  @JsonProperty("width")
  public String getWidth() {
    return width;
  }
  public void setWidth(String width) {
    this.width = width;
  }

  
  /**
   * Id given by the ad exchange
   **/
  
  @ApiModelProperty(value = "Id given by the ad exchange")
  @JsonProperty("id")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  
  /**
   * height of the ad
   **/
  
  @ApiModelProperty(value = "height of the ad")
  @JsonProperty("height")
  public String getHeight() {
    return height;
  }
  public void setHeight(String height) {
    this.height = height;
  }

  
  /**
   * position of the ad
   **/
  
  @ApiModelProperty(value = "position of the ad")
  @JsonProperty("position")
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Banner banner = (Banner) o;
    return Objects.equals(width, banner.width) &&
        Objects.equals(id, banner.id) &&
        Objects.equals(height, banner.height) &&
        Objects.equals(position, banner.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, id, height, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Banner {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

