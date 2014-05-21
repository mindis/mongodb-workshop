/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mongodb.workshop;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import org.junit.BeforeClass;

import java.net.UnknownHostException;

public abstract class WorkshopTest {

    protected static DB db;

    @BeforeClass
    public static void setDB() {

        try {
            db = new MongoClient("localhost").getDB("comics");
        } catch (UnknownHostException e) {
            System.out.println("Cannot connect to the database, please check that mongod process is running");
            e.printStackTrace();
        }
    }


}
