/*
 * File   : $Source: /alkacon/cvs/opencms/src/com/opencms/db/Attic/I_CmsBackupDriver.java,v $
 * Date   : $Date: 2003/05/23 16:26:46 $
 * Version: $Revision: 1.1 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Mananagement System
 *
 * Copyright (C) 2002 - 2003 Alkacon Software (http://www.alkacon.com)
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

package com.opencms.db;

import com.opencms.core.CmsException;
import com.opencms.file.CmsBackupProject;
import com.opencms.file.CmsBackupResource;
import com.opencms.file.CmsProject;
import com.opencms.file.CmsResource;
import com.opencms.file.CmsUser;

import java.util.Map;
import java.util.Vector;

import source.org.apache.java.util.Configurations;

/**
 * Definitions of all required backup driver methods.
 * 
 * @author Thomas Weckert (t.weckert@alkacon.com)
 * @version $Revision: 1.1 $ $Date: 2003/05/23 16:26:46 $
 * @since 5.1.2
 */
public interface I_CmsBackupDriver {
    
    void backupProject(CmsProject project, int versionId, long publishDate, CmsUser currentUser) throws CmsException;
    void backupResource(int projectId, CmsResource resource, byte[] content, Map properties, int versionId, long publishDate) throws CmsException;
    int deleteBackups(long maxdate) throws CmsException;
    void destroy() throws Throwable;
    Vector getAllBackupProjects() throws CmsException;
    int getBackupVersionId();
    void init(Configurations config, String dbPoolUrl, CmsDriverManager driverManager);
    com.opencms.db.generic.CmsSqlManager initQueries(String dbPoolUrl);
    Vector readAllFileHeadersForHist(String resourceName) throws CmsException;
    CmsBackupProject readBackupProject(int versionId) throws CmsException;
    CmsBackupResource readFileForHist(int versionId, String filename) throws CmsException;
    CmsBackupResource readFileHeaderForHist(int versionId, String filename) throws CmsException;
    
}