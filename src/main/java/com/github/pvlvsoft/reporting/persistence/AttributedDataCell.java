package com.github.pvlvsoft.reporting.persistence;


import java.util.List;


/**
 * <i>AUTHOR OF THIS PROJECT IS NOT RESPONSIBLE FOR ANY DAMAGE TO
 * THE USER'S DEVICE CAUSED BY USING THIS SOFTWARE, NO DATA LEAKS
 * OR DATA INTEGRITY DAMAGE.</i>
 *
 * <i>THIS PIECE OF SOFTWARE WAS MADE WITH NO GUARANTEE AND SHOULD
 * NOT BE USED FOR CRITICAL INFRASTRUCTURE OF YOUR APPS. THIS
 * PROJECT WAS CREATED JUST FOR FUN.</i>
 *
 *
 * <p>Interface of {@link AttributedDataCell} defines a basic set of signatures
 * of methods overridden by it's descendants.</p>
 *
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-30
 */
public interface AttributedDataCell extends DataCell {

    public List<String> getAllAttributes();


    public String getAttribute(int attributeIndex);


    public String getAttributeValue(String attributeName);


    public String getAttributeValue(int index);
}
