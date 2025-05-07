package in.tech_camp.chat_app.entity;

import lombok.Data;
import java.util.List;

@Data
public class UserEntity {
  private Integer id;
  private String name;
  private String email;
  private String password;

  private List<RoomUserEntity> roomUsers;
}
