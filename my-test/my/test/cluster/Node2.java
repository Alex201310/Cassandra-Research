/*
 * Copyright 2011 The Apache Software Foundation
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package my.test.cluster;

import org.apache.cassandra.service.CassandraDaemon;

public class Node2 {

    public static void main(String[] args) {
//        System.setProperty("cassandra.rpc_port", "9160");
//        System.setProperty("cassandra.start_native_transport", "true"); //启用native server，用于支持CQL
//        System.setProperty("cassandra.native_transport_port", "9042");

        System.setProperty("cassandra.config", "node2.yaml");

        System.setProperty("log4j.defaultInitOverride", "true");
        System.setProperty("log4j.configuration", "my-log4j-server.properties");

        //System.setProperty("cassandra.start_rpc", "false"); //不启用thrift server

        System.setProperty("cassandra-foreground", "true"); //打印输出到控制台

        CassandraDaemon.main(new String[] {});
    }

}
