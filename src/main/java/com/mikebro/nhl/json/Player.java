package com.mikebro.nhl.json;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class Player extends Name {

	@Override
	public String toString() {
		return super.toString();
	}
}
