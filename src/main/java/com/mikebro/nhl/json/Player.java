package com.mikebro.nhl.json;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @deprecated Consider whether these subclasses of Name are required.
 * Why not just use the Name class for properties that need it?
 * @author mikebro
 *
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class Player extends Name {

	@Override
	public String toString() {
		return super.toString();
	}
}
