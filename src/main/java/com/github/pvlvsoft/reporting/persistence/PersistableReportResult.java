package com.github.pvlvsoft.reporting.persistence;


import com.github.pvlvsoft.reporting.report.ReportResult;

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
 * <p>Interface of {@link PersistableReportResult} defines a basic set of signatures
 * of methods overridden by it's descendants.</p>
 *
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-30
 */
public interface PersistableReportResult extends ReportResult {

    /**
     * <p>This method returns all the persistable cells in the {@link ReportResult}.
     * These are used for storing data of the result while giving them the right
     * structure to be persisted.</p>
     *
     * @return  {@link List} of {@link DataCell}s, where these cells should
     *          represent the data of the result.
     */
    public List<DataCell> getPersistables();
}
