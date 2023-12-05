package com.tencent.wxcloudrun.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserMessage {
    private String receiverUserId;
    // 1. FOLLOW
    // 2. REPLY
    // 3. SYSTEM
    private String messageType;
    private Boolean isMessageRead;
    private String commentingUserId;
    private String articleId;
    private User commentingUser;
    private Article article;

}
