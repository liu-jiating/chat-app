package in.tech_camp.chat_app.entity;

import java.security.Timestamp;

import lombok.Data;
import java.util.Date;

@Data
public class MessageEntity {
  private Integer id;
  private String content;
  private String image;
  private Date createdAt;
  private UserEntity user;
  private RoomEntity room; 
}
