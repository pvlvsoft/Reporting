package com.github.pvlvsoft.reporting.persistence;


import com.github.pvlvsoft.reporting.report.Report;

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
 * <p>Interface of {@link PersistenceInvoker} defines a basic set of signatures
 * of methods overridden by it's descendants.</p>
 *
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-30
 */
public interface PersistenceInvoker {

    /**
     * <p>This method is responsible for persisting the given {@code report} to all the
     * persistence channels.</p>
     *
     * @param report        to be persisted.
     *
     * @throws PersistenceFailureException  When an error occurs while persisting.
     */
    public void persist(Report report) throws PersistenceFailureException;
}
