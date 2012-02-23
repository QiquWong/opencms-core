/*
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (c) Alkacon Software GmbH (http://www.alkacon.com)
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

package org.opencms.workplace.tools.workplace.logging;

import org.opencms.workplace.list.CmsListItem;
import org.opencms.workplace.list.I_CmsListItemComparator;

import java.util.Comparator;
import java.util.Locale;

/**
 * Help function to select the comparator. <p>
 * Returns the comparator for the requested Column.<p>
 * 
 * */

public class CmsLogLevelListItemComparator implements I_CmsListItemComparator {

    /**
     * @see org.opencms.workplace.list.I_CmsListItemComparator#getComparator(java.lang.String, java.util.Locale)
     */
    public Comparator<CmsListItem> getComparator(String columnId, Locale locale) {

        Comparator<CmsListItem> compa = null;
        // returns the Comparator for the "DEBUG" column
        if (columnId.equals("chd")) {
            compa = new Comparator<CmsListItem>() {

                public int compare(CmsListItem o1, CmsListItem o2) {

                    int test = 0;
                    // returns 0 if both rows have the loglevel "Debug"
                    if (o1.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("DEBUG")
                        && o2.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("DEBUG")) {
                        test = 0;
                    } else
                    // returns < 0 if the first rows have the loglevel "Debug"
                    if (o1.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("DEBUG")) {
                        test = -2;
                    } else
                    // returns > 0 if the second rows have the loglevel "Debug"
                    if (o2.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("DEBUG")) {
                        test = 2;
                    }
                    return test;
                }

            };
        }
        // returns the Comparator for the "INFO" column
        if (columnId.equals("chi")) {
            compa = new Comparator<CmsListItem>() {

                public int compare(CmsListItem o1, CmsListItem o2) {

                    int test = 0;
                    // returns 0 if both rows have the loglevel "INFO"
                    if (o1.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("INFO")
                        && o2.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("INFO")) {
                        test = 0;
                    } else
                    // returns < 0 if the first rows have the loglevel "INFO"
                    if (o1.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("INFO")) {
                        test = -2;
                    } else
                    // returns > 0 if the second rows have the loglevel "INFO"
                    if (o2.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("INFO")) {
                        test = 2;
                    }
                    return test;
                }

            };
        }
        // returns the Comparator for the "WARN" column
        if (columnId.equals("chw")) {
            compa = new Comparator<CmsListItem>() {

                public int compare(CmsListItem o1, CmsListItem o2) {

                    int test = 0;
                    // returns 0 if both rows have the loglevel "WARN"
                    if (o1.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("WARN")
                        && o2.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("WARN")) {
                        test = 0;
                    } else
                    // returns < 0 if the first rows have the loglevel "WARN"
                    if (o1.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("WARN")) {
                        test = -2;
                    } else
                    // returns > 0 if the second rows have the loglevel "WARN"
                    if (o2.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("WARN")) {
                        test = 2;
                    }
                    return test;
                }

            };
        }
        // returns the Comparator for the "ERROR" column
        if (columnId.equals("che")) {
            compa = new Comparator<CmsListItem>() {

                public int compare(CmsListItem o1, CmsListItem o2) {

                    int test = 0;
                    // returns 0 if both rows have the loglevel "ERROR"
                    if (o1.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("ERROR")
                        && o2.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("ERROR")) {
                        test = 0;
                    } else
                    // returns < 0 if the first rows have the loglevel "ERROR"
                    if (o1.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("ERROR")) {
                        test = -2;
                    } else
                    // returns > 0 if the second rows have the loglevel "ERROR"
                    if (o2.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("ERROR")) {
                        test = 2;
                    }
                    return test;
                }

            };
        }
        // returns the Comparator for the "FATAL" column
        if (columnId.equals("chf")) {
            compa = new Comparator<CmsListItem>() {

                public int compare(CmsListItem o1, CmsListItem o2) {

                    int test = 0;
                    // returns 0 if both rows have the loglevel "FATAL"
                    if (o1.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("FATAL")
                        && o2.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("FATAL")) {
                        test = 0;
                    } else
                    // returns < 0 if the first rows have the loglevel "FATAL"
                    if (o1.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("FATAL")) {
                        test = -2;
                    } else
                    // returns > 0 if the second rows have the loglevel "FATAL"
                    if (o2.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("FATAL")) {
                        test = 2;
                    }
                    return test;
                }

            };
        }
        // returns the Comparator for the "OFF" column
        if (columnId.equals("cho")) {
            compa = new Comparator<CmsListItem>() {

                public int compare(CmsListItem o1, CmsListItem o2) {

                    int test = 0;
                    // returns 0 if both rows have the loglevel "OFF"
                    if (o1.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("OFF")
                        && o2.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("OFF")) {
                        test = 0;
                    } else
                    // returns < 0 if the first rows have the loglevel "OFF"
                    if (o1.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("OFF")) {
                        test = -2;
                    } else
                    // returns > 0 if the second rows have the loglevel "OFF"
                    if (o2.get(CmsLog4JAdminDialog.LIST_COLUMN_PARENT_LOGGER_LEVEL).equals("OFF")) {
                        test = 2;
                    }
                    return test;
                }

            };
        }

        return compa;
    }

}