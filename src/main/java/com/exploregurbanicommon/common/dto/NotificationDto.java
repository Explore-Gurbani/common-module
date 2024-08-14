package com.exploregurbanicommon.common.dto;

import com.exploregurbanicommon.common.enums.NotificationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotificationDto {
    private String recipient;
    private String subject;
    private String body;
    private boolean isBodyHTML;
    private NotificationType type;

    public boolean getIsBodyHTML() {
        return this.isBodyHTML;
    }
}
