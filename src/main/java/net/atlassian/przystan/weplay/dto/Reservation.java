package net.atlassian.przystan.weplay.dto;

import java.sql.Date;

public record Reservation(Long id,
                          String title,
                          User userOwner,
                          ReservationDetails reservationDetails,
                          Date eventStartDate,
                          Date eventEndDate) {
}
