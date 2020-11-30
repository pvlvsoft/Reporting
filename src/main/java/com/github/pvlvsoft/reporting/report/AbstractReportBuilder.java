package com.github.pvlvsoft.reporting.report;


import com.github.pvlvsoft.reporting.persistence.PersistenceFailureException;
import com.github.pvlvsoft.reporting.persistence.PersistenceInvoker;
import com.github.pvlvsoft.reporting.persistence.ReportPersistor;

import java.util.ArrayList;
import java.util.Arrays;
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
 * <p>Class of {@link AbstractReportBuilder} is an abstract representation
 * and implementation of the instances belonging to this class.</p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-30
 */
public abstract class AbstractReportBuilder implements ReportBuilder, PersistenceInvoker {

    /* =========================================================== */
    /* ====== INSTANCE VARIABLES ================================= */

    private final List<ReportPersistor> reportPersistors = new ArrayList<>();


    /* =========================================================== */
    /* ====== STATIC VARIABLES =================================== */




    /* =========================================================== */
    /* ====== INSTANCE INIT BLOCKS =============================== */




    /* =========================================================== */
    /* ====== STATIC INIT BLOCKS ================================= */





    /* =========================================================== */
    /* ====== CONSTRUCTORS ======================================= */

    public AbstractReportBuilder() {

    }

    public AbstractReportBuilder(ReportPersistor... reportPersistors) {

        this.reportPersistors.addAll(Arrays.asList(reportPersistors));
    }


    public AbstractReportBuilder(List<ReportPersistor> reportPersistors) {

        this.reportPersistors.addAll(reportPersistors);
    }


    /* =========================================================== */
    /* ====== OVERRIDDEN METHODS ================================= */

    /**
     * <p>This method is responsible for persisting the given {@code report} to all the
     * persistence channels.</p>
     *
     * <p>This method is kind of <i>Observer</i> design pattern implementation. Observer is
     * the {@link ReportPersistor} (the list of them), while {@code this} is the <i>publisher</i>.</p>
     *
     * @param report to be persisted.
     *
     * @throws PersistenceFailureException When an error occurs while persisting.
     */
    @Override
    public void persist(Report report) throws PersistenceFailureException {

        for (ReportPersistor rp : this.reportPersistors) {

            rp.persist(report);
        }
    }



    /* =========================================================== */
    /* ====== INSTANCE METHODS =================================== */


    public void addReportPersistor(ReportPersistor reportPersistor) {

        this.reportPersistors.add(reportPersistor);
    }

    public void removeReportPersistor(ReportPersistor reportPersistor) {

        this.reportPersistors.remove(reportPersistor);
    }


    /* =========================================================== */
    /* ====== STATIC METHODS ===================================== */




    /* =========================================================== */
    /* ====== GETTERS AND SETTERS ================================ */



}
