/*
 * JarInfoTableHeadRend.java
 *
 * Copyright (C) 2004 Wayne Grant
 * waynedgrant@hotmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * (This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package net.sf.portecle.gui.jar;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;

/**
 * Custom cell renderer for the headers of the JAR Information table of DJarInfo.
 */
class JarInfoTableHeadRend extends DefaultTableCellRenderer
{
    /**
     * Returns the rendered header cell for the supplied value and column.
     *
     * @param jtJarInfo The JTable
     * @param value The value to assign to the cell
     * @param bIsSelected True if cell is selected
     * @param iRow The row of the cell to render
     * @param iCol The column of the cell to render
     * @param bHasFocus If true, render cell appropriately
     * @return The renderered cell
     */
    public Component getTableCellRendererComponent(JTable jtJarInfo, Object value,
                                                   boolean bIsSelected, boolean bHasFocus,
                                                   int iRow, int iCol)
    {
        // Get header renderer
        JLabel header = (JLabel)jtJarInfo.getColumnModel().getColumn(iCol).getHeaderRenderer();

        // The headers contain left-aligned text
        header.setText(value.toString());
        header.setHorizontalAlignment(LEFT);

        header.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED), new EmptyBorder(0, 5, 0, 5)));

        return header;
    }
}
