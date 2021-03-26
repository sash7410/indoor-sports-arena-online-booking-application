package com.booking.app.responseDTO;

import com.booking.app.model.enums.SlotStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SlotsDTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String timings;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private SlotStatus status;
}
