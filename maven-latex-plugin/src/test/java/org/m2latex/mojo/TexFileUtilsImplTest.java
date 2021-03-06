/*
 * The akquinet maven-latex-plugin project
 *
 * Copyright (c) 2011 by akquinet tech@spree GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.m2latex.mojo;

import java.io.File;

import junit.framework.TestCase;

import org.apache.maven.plugin.logging.SystemStreamLog;

public class TexFileUtilsImplTest
    extends TestCase
{
    private TexFileUtilsImpl utils = new TexFileUtilsImpl( new SystemStreamLog() );

    public void testGetTargetDir()
        throws Exception
    {
        File expected = new File( "/dir2/subdir" );
        File actual = utils.getTargetDirectory( new File( "/dir1/subdir/file" ), new File( "/dir1" ),
                                                new File( "/dir2" ) );
        assertEquals( expected, actual );
    }
}
