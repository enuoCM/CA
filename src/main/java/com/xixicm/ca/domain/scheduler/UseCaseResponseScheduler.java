/*
 * Copyright (C) 2016 mc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xixicm.ca.domain.scheduler;

/**
 * Interface for response schedulers
 *
 * @author mc
 */
public interface UseCaseResponseScheduler {
    /**
     * Causes the {@link Runnable} to be added to the message queue of the Main UI Thread
     * or any other thread.
     *
     * @param runnable {@link Runnable} to be executed.
     */
    void post(Runnable runnable);
}
