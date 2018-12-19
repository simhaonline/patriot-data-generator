/*
 * Copyright 2018 Patriot project
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.redhat.patriot.generator.events;

import com.redhat.patriot.generator.device.Device;

import java.util.Observable;

public class DataObserable extends Observable {

    public void notify(GenericData data) {
        setChanged();
        notifyObservers(data);
    }

    public void addDevice(Device device) {
        synchronized(this) {
            device.setDataObserable(this);
        }
    }

    public void removeDevice(Device device) {
        synchronized(this) {
            device.setDataObserable(null);
        }
    }

}
