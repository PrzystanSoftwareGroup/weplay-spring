package net.atlassian.przystan.weplay.dto;

import java.sql.Date;

public record User(Long userId,
                   String username,
                   Person person,
                   Date joinDate,
                   Date leaveDate) {
}
