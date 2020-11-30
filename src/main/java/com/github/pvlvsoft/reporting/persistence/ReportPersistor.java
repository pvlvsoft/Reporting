package com.github.pvlvsoft.reporting.persistence;


import com.github.pvlvsoft.reporting.report.Report;
import com.github.pvlvsoft.reporting.report.ReportResult;


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
 * <p>Interface of {@link ReportPersistor} defines a basic set of signatures
 * of methods overridden by it's descendants.</p>
 *
 *
 * <p>This interface defines basic tools for enabling the possibility of persistence
 * of the {@link ReportResult}s.</p>
 *
 * <p>This can be useful for saving the results of the {@link Report}s to the database,
 * to (various) files, sending via network or just printing to console
 * (non-persisting method).</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-30
 */
public interface ReportPersistor {

    /**
     * <p>Persists the {@link ReportResult} by the given rules defined in this method.</p>
     *
     * @param report to be persisted via this persistor.
     *
     * @throws PersistenceFailureException  When error occurs while persisting attempt.
     */
    public void persist(Report report) throws PersistenceFailureException;
}
