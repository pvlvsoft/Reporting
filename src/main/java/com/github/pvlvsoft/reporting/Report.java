package com.github.pvlvsoft.reporting;


import java.time.LocalDate;


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
 * <p>Interface of {@link Report} defines a basic set of signatures
 * of methods overridden by it's descendants.</p>
 *
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-27
 */
public interface Report {


    /**
     * <p>This method allows getting date of creation of the report.</p>
     *
     * @return  {@link LocalDate} instance representing when the instance
     *          was created.
     */
    public LocalDate getDateOfCreation();


    /**
     * <p>This method is responsible for the {@link Report} description.</p>
     *
     * @return  {@link String}-formed description of the report. What instances of this
     *          report class gives reports about.
     */
    public String getReportDescription();
}
