/*
 * Copyright 2016 Teapot, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package co.teapot.tempest.graph

object GraphGenerator {
  def completeGraph(nodeCount: Int): DirectedGraph = {
    // For efficiency, a future version could represent the graph implicitly
    val edges = for (u <- 0 until nodeCount;
                     v <- 0 until nodeCount;
                     if u != v) yield (u, v)
    DirectedGraph(edges)
  }
}
