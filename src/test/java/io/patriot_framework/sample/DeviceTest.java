/*
 * Copyright 2019 Patriot project
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

package io.patriot_framework.sample;

import io.patriot_framework.generator.basicDevices.Hygrometer;
import io.patriot_framework.generator.dataFeed.DataFeed;
import io.patriot_framework.generator.dataFeed.NormalDistributionDataFeed;
import io.patriot_framework.generator.device.Sensor;
import org.junit.jupiter.api.BeforeEach;

class DeviceTest {

    private Sensor<Double> newDevice;

    @BeforeEach
    void setUp() {
        DataFeed<Double> dataFeed = new NormalDistributionDataFeed(0, 1);
        newDevice = new Hygrometer("TestHygrometer", dataFeed);
    }

//    @Test
//    void getValue() {
//        List<Double> data = newDevice.requestData();
//        assertTrue(data <= 2 );
//        assertTrue(data >= -2 );
//    }
//
//    @Test
//    void getValueWithoutDataFeed() {
//        newDevice.setDataFeed(null);
//
//        assertThrows(IllegalArgumentException.class, () -> newDevice.requestData());
//    }

}