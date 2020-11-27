package com.github.pvlvsoft.reporting;


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
 * @version 2020-11-27
 */
public interface ReportBuilder {

    /**
     * <p>This {@link ReportBuilder} method is responsible for the {@link Report} creation.</p>
     *
     * @return  the newly created {@link Report}.
     */
    public Report build();
}
