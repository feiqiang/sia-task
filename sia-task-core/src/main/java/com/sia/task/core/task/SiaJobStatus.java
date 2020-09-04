/*-
 * <<
 * task
 * ==
 * Copyright (C) 2019 - 2020 sia
 * ==
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
 * >>
 */

package com.sia.task.core.task;

/**
 * 状态机
 *
 * @description
 * @see
 * @author maozhengwei
 * @data 2019-10-18 17:34
 * @version V1.0.0
 **/
public enum SiaJobStatus {

    /**
     * job stop status
     */
    STOP("stop"),

    /**
     * job ready status
     */
    READY("ready"),

    /**
     * job running status
     */
    RUNNING("running"),

    /**
     * job pause status
     * Deprecated
     */
    @Deprecated
    PAUSE("pause");

    private String status;

    SiaJobStatus(String value) {
        this.status = value;
    }

    public String getStatus(){
        return status;
    }

    @Override
    public String toString() {
        return status;
    }
}
