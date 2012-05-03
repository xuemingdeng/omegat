/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2012 Alex Buloichik
               Home page: http://www.omegat.org/
               Support center: http://groups.yahoo.com/group/OmegaT/

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 **************************************************************************/

package org.omegat.core.data;

import java.util.TreeMap;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.omegat.core.Core;

/**
 * Tests for RealProject classs.
 * 
 * @author Alex Buloichik (alex73mail@gmail.com)
 */
public class RealProjectTest extends TestCase {
    @Before
    public void setUp() throws Exception {
        Core.initializeConsole(new TreeMap<String, String>());
    }

    @Test
    public void testImportTranslationsFromSources() throws Exception {
        ProjectProperties props = new ProjectProperties();
        RealProjectWithTMXAccess project = new RealProjectWithTMXAccess(props);

        project.importTranslationsFromSources();
    }

    protected static class RealProjectWithTMXAccess extends RealProject {
        public RealProjectWithTMXAccess(ProjectProperties props) {
            super(props);
        }

        public ProjectTMX getTMX() {
            return projectTMX;
        }
    }
}
