package com.github.pvlvsoft.reporting.report;


import com.github.pvlvsoft.reporting.persistence.ReportPersistor;

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
 * <p>Interface of {@link ReportBuilder} defines a basic set of signatures
 * of methods overridden by it's descendants.</p>
 *
 *
 * <p>The factory class for {@link Report} instances. The {@link ReportBuilder}
 * instance is responsible for the {@link Report} creation initiation and it should
 * be <i>Event-driven</i>.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-30
 */
public interface ReportBuilder {

    /**
     * <p>This {@link ReportBuilder} method is responsible for the {@link Report} creation.</p>
     *
     * <p>This method is kind of <i>Observer</i> design pattern implementation. Observer is
     * the {@link ReportPersistor} (the list of them), while {@code this} is the <i>publisher</i>.</p>
     *
     * @return  the newly created {@link Report}.
     */
    public Report build();

}
