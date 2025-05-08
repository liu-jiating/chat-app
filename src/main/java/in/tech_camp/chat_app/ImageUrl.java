package in.tech_camp.chat_app;

import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Component
@NoArgsConstructor
public class ImageUrl {
  @Value("${image.url}")
  private String url;

  public String getImageUrl(){
    return url;
  }

}
