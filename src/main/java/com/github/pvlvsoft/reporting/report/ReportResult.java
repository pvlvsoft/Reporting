package com.github.pvlvsoft.reporting.report;


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
 * <p>Interface of {@link ReportResult} defines a basic set of signatures
 * of methods overridden by it's descendants.</p>
 *
 *
 * <p>These instances should represent the results of the {@link Report}s.
 * Result instance should be contained of the result itself and the reference
 * to the creating report.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-30
 */
public interface ReportResult {

    /**
     * <p>This method allows other entities to get the link of
     * the result to the {@link Report}.</p>
     *
     * @return  {@link Report} this result creation was initialized by
     */
    public Report getReport();
}
