package net.atlassian.przystan.weplay.dto;

public record Person (String firstname,
                      String surname,
                      PersonContact personContact) {
}
