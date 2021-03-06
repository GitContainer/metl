/**
 * Licensed to JumpMind Inc under one or more contributor
 * license agreements.  See the NOTICE file distributed
 * with this work for additional information regarding
 * copyright ownership.  JumpMind Inc licenses this file
 * to you under the GNU General Public License, version 3.0 (GPLv3)
 * (the "License"); you may not use this file except in compliance
 * with the License.
 *
 * You should have received a copy of the GNU General Public License,
 * version 3.0 (GPLv3) along with this library; if not, see
 * <http://www.gnu.org/licenses/>.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jumpmind.metl.ui.mapping;

import org.jumpmind.metl.core.model.Component;
import org.jumpmind.metl.core.model.HierarchicalModel;
import org.jumpmind.metl.core.model.RelationalModel;
import org.jumpmind.metl.core.runtime.component.Mapping;

import com.vaadin.shared.ui.JavaScriptComponentState;

public class MappingDiagramState extends JavaScriptComponentState {

    private static final long serialVersionUID = 1L;
    
    public String mapsToSchemaObjectName = Mapping.MODEL_OBJECT_MAPS_TO;

    public Component component;
    
    public RelationalModel relationalInputModel;
    
    public RelationalModel relationalOutputModel;
       
    public HierarchicalModel hierarchicalInputModel;

    public HierarchicalModel hierarchicalOutputModel;

}
