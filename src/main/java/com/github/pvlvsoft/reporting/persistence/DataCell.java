package com.github.pvlvsoft.reporting.persistence;


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
 * <p>Interface of {@link DataCell} defines a basic set of signatures
 * of methods overridden by it's descendants.</p>
 *
 *
 * <p>The most basic and general data container.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-30
 */
public interface DataCell {

    /**
     * <p>Returns the name of the data cell.</p>
     *
     * @return  the name of the data cell.
     */
    public String getName();


    /**
     * <p>This method returns the content of the data cell.</p>
     *
     * @return  content of the data cell.
     */
    public Object getContent();
}
