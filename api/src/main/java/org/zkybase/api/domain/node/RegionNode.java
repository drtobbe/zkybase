/* 
 * Copyright 2011-2012 the original author or authors.
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
package org.zkybase.api.domain.node;

import java.util.Set;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@NodeEntity
@TypeAlias("Region")
public class RegionNode extends AbstractNode {
	private String name;
	
	// FIXME For now we'll just fetch this. Eventually we'll want to stop doing that.
	@Fetch
	@RelatedTo(type = "CONTAINS")
	private Set<DataCenterNode> dataCenters;
	
	public String getName() { return name; }
	
	public void setName(String name) { this.name = name; }
	
	public Set<DataCenterNode> getDataCenters() { return dataCenters; }
	
	public void setDataCenter(Set<DataCenterNode> dataCenters) { this.dataCenters = dataCenters; }
	
//	public String getDisplayName() { return name; }
}
