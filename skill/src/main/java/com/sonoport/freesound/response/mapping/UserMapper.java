/*
 * Copyright 2014 Sonoport (Asia) Pte Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sonoport.freesound.response.mapping;

import com.sonoport.freesound.response.User;

/**
 * Map the freesound.org JSON representation of an individual user instance to a {@link User} DTO.
 */
public class UserMapper extends AbstractUserMapper<User> {

	/**
	 * No-arg constructor.
	 */
	public UserMapper() {
		super(User.class);
	}

}
