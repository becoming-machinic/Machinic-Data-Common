/*
 * Copyright (C) 2019 Becoming Machinic Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.becomingmachinic.kafka.collections;

import java.util.Collection;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public interface KMap<K, V> extends ConcurrentMap<K, V>, AutoCloseable {
	public boolean awaitWarmupComplete(long timeout, TimeUnit unit) throws InterruptedException;
	public boolean containsAll(Collection<K> c);
	public boolean isReadOnly();
}
