/*
 * File   : $Source: /alkacon/cvs/opencms/test/org/opencms/search/extractors/TestMsPowerPointExtraction.java,v $
 * Date   : $Date: 2005/03/23 19:08:22 $
 * Version: $Revision: 1.1 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Mananagement System
 *
 * Copyright (C) 2002 - 2005 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.search.extractors;

import java.io.InputStream;

import junit.framework.TestCase;

/**
 * Tests the text extraction form a Pdf file.<p>
 */
public class TestMsPowerPointExtraction extends TestCase {

    /**
     * Default JUnit constructor.<p>
     * 
     * @param arg0 JUnit parameters
     */
    public TestMsPowerPointExtraction(String arg0) {

        super(arg0);
    }

    /**
     * Tests the basic Pdf extraction.<p>
     *
     * @throws Exception if the test fails
     */
    public void testBasicPPtExtration() throws Exception {

        // open an input stream for the test file        
        InputStream in = getClass().getClassLoader().getResourceAsStream("org/opencms/search/extractors/test1.ppt");

        // extract the content
        I_CmsExtractionResult extractionResult = CmsExtractorMsPowerPoint.getExtractor().extractText(in);
        String result = extractionResult.getContent();
        
        System.out.println("---------------------------------------------------------------");
        System.out.println("Extracted from MS PowerPoint:");
        System.out.println(result);

        assertTrue(result.indexOf("Alkacon Software") > -1);
        assertTrue(result.indexOf("The OpenCms Experts") > -1);
        assertTrue(result.indexOf("Some content here.") > -1);
        assertTrue(result.indexOf("Some content there.") > -1);
        assertTrue(result.indexOf("Some content on a second sheet.") > -1);
        assertTrue(result.indexOf("Some content on the third sheet.") > -1);
        // NOTE: Euro symbol conversion fails - possible reason is that extration method class handles only ISO
        assertTrue(result.indexOf("�������") > -1);
    }
}