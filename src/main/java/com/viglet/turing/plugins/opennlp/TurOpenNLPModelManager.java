/*
 * Copyright (C) 2016-2019 the original author or authors. 
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.viglet.turing.plugins.opennlp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import opennlp.tools.namefind.NameFinderME;

public class TurOpenNLPModelManager {

	private static TurOpenNLPModelManager instance;
	private static Object monitor = new Object();
	private Map<String, NameFinderME> cache = Collections.synchronizedMap(new HashMap<String, NameFinderME>());

	private TurOpenNLPModelManager() {
	}

	public void put(String modelPath, NameFinderME value) {
		cache.put(modelPath, value);
	}

	public NameFinderME get(String modelPath) {
		return cache.get(modelPath);
	}

	public void clear(String modelPath) {
		cache.put(modelPath, null);
	}

	public void clear() {
		cache.clear();
	}

	public boolean exists(String modelPath) {
		return cache.get(modelPath) != null;

	}

	public static TurOpenNLPModelManager getInstance() {
		if (instance == null) {
			synchronized (monitor) {
				if (instance == null) {
					instance = new TurOpenNLPModelManager();
				}
			}
		}
		return instance;
	}

}
