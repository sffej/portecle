/*
 * JarInfoTableCellRend.java
 * This file is part of Portecle, a multipurpose keystore and certificate tool.
 *
 * Copyright © 2004 Wayne Grant, waynedgrant@hotmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package net.sf.portecle.gui.about;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Custom cell renderer for the cells of the System Properties table
 * of DSystemProperties.
 */
class SystemPropertiesTableCellRend extends DefaultTableCellRenderer
{
    /**
     * Returns the rendered cell for the supplied value and column.
     *
     * @param jtSystemProperties The JTable
     * @param value The value to assign to the cell
     * @param bIsSelected True if cell is selected
     * @param iRow The row of the cell to render
     * @param iCol The column of the cell to render
     * @param bHasFocus If true, render cell appropriately
     * @return The renderered cell
     */
    public Component getTableCellRendererComponent(
        JTable jtSystemProperties, Object value, boolean bIsSelected,
        boolean bHasFocus, int iRow, int iCol)
    {
        JLabel cell = (JLabel) super.getTableCellRendererComponent(
            jtSystemProperties, value, bIsSelected, bHasFocus, iRow, iCol);
        cell.setHorizontalAlignment(LEFT);       

        cell.setBorder(new EmptyBorder(0, 5, 0, 5));

        return cell;
    }
}
