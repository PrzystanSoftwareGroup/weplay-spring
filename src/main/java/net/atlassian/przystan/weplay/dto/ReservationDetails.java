package net.atlassian.przystan.weplay.dto;

import net.atlassian.przystan.weplay.util.ReservationCategory;
import net.atlassian.przystan.weplay.util.ReservationType;

public record ReservationDetails(ReservationCategory reservationCategory,
                                 ReservationType reservationType) {
}
