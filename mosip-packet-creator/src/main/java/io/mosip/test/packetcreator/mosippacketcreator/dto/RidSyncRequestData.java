package io.mosip.test.packetcreator.mosippacketcreator.dto;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RidSyncRequestData {

	private String requestBody;
	private LocalDateTime timestamp;
}