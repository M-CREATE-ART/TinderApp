package app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Message {
    private final int id;
    private final int senderId;
    private final int receiverId;
    private final String context;
    private final String messageDate;

}
