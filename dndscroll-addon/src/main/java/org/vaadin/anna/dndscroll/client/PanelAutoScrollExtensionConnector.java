/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.vaadin.anna.dndscroll.client;

import com.google.gwt.dom.client.Element;
import com.vaadin.client.ui.VPanel;
import com.vaadin.shared.ui.Connect;

/**
 * Connector for PanelAutoScrollExtension.
 *
 * @author Teppo Kurki, Anna Koskinen / Vaadin Ltd.
 */
@Connect(org.vaadin.anna.dndscroll.PanelAutoScrollExtension.class)
public class PanelAutoScrollExtensionConnector extends
        AbstractAutoScrollExtensionConnector {

    @Override
    public Element getScrollTarget() {
        return ((VPanel) widget).contentNode;
    }
}