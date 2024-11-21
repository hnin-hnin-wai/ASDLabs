package edu.miu.cse.heartlink.dto.response;

import edu.miu.cse.heartlink.dto.request.ItemRequestedDto;
import edu.miu.cse.heartlink.dto.request.UserRequestDto;

public record ItemTransactionResponseDto(
        ItemRequestedDto itemRequestedDto,
        UserRequestDto donar,
        UserRequestDto receiver
) {
}
